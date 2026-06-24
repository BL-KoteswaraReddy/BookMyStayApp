package com.bookmystayapp;
import java.util.*;

public class BookingQueueService {

    Queue<Reservation> bookingQueue = new LinkedList<>();

    Set<String> bookedRoomIds = new HashSet<>();
    HashMap<String, Set<String>> roomAllocations = new HashMap<>();

    ReportingService reportingService;

    public BookingQueueService(ReportingService reportingService) {
        this.reportingService = reportingService;
    }
    public BookingQueueService()
    {

    }

    public void confirmReservation()
    {
        if(bookingQueue.isEmpty())
        {
            System.out.println("No pending reservations");
            return;
        }

        Reservation reservation = bookingQueue.poll();
        String roomType = reservation.getRoomType();

        if(!RoomInventoryService.roomInventory.containsKey(roomType) || RoomInventoryService.roomInventory.get(roomType)<=0)
        {
            System.out.println("Rooms are not available");
            return;
        }

        String roomId = generateRoomID(roomType);
        reservation.setAllocatedRoomId(roomId);
        reservation.setStatus("Confirmed");

        System.out.println("Booking confirmed");
        reportingService.bookingHistory.add(reservation);
        System.out.println(reservation);
    }

    private String generateRoomID(String roomType) {
        int next = bookedRoomIds.size()+1;

        if(roomType.equalsIgnoreCase("Single"))
            return "S"+next;
        if(roomType.equalsIgnoreCase("Double"))
            return "D"+next;
        return "SU"+next;
    }


    public void bookRoom(Reservation reservation)
    {
        bookingQueue.offer(reservation);
    }

    public void processNextBooking()
    {
        if(bookingQueue.isEmpty())
        {
            System.out.println("No requests are available for booking");
        }

        Reservation reservation = bookingQueue.poll();
        System.out.println("Processing booking "+reservation);

    }

    public void displayBooking()
    {
        for (Reservation reservation: bookingQueue)
        {
            System.out.println(reservation);
        }
    }

}
