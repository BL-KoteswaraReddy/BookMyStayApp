package com.bookmystayapp;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        RoomInventoryService roomInventoryService = new RoomInventoryService();

        //add rooms
        roomInventoryService.addRoom("single", 2, 2000);
        roomInventoryService.addRoom("double", 2, 3000);
        roomInventoryService.addRoom("suite", 2, 4000);

        //add room amenities
        roomInventoryService.addRoomAmenities("single", Arrays.asList("Cooler", "Fridge", "Ac"));
        roomInventoryService.addRoomAmenities("double", Arrays.asList("Fan", "Cooler", "cart", "AC"));
        roomInventoryService.addRoomAmenities("suite", Arrays.asList("AC", "Double cart", "TWO ACS"));


        //Display Room inventory
        System.out.println("======Display Room Inventory======");
        for (String roomType : roomInventoryService.roomInventory.keySet()) {
            System.out.println("Room type : " + roomType + ", price : " + roomInventoryService.roomInventory.get(roomType) +
                    ", count : " + roomInventoryService.roomPrices.get(roomType));
        }

        //update room counts
        roomInventoryService.updateRoomCount("double", 3);
        roomInventoryService.updateRoomCount("single", 5);

        //update room prices
        roomInventoryService.updatePrice("suite", 5000);
        roomInventoryService.updatePrice("single", 3000);

        //After update Display Room inventory
        System.out.println("======After update Display Room Inventory======");
        for (String roomType : roomInventoryService.roomInventory.keySet()) {
            System.out.println("Room type : " + roomType + ", price : " + roomInventoryService.roomInventory.get(roomType) +
                    ", count : " + roomInventoryService.roomPrices.get(roomType));
        }

        //Displaying Room amenites
        System.out.println("Room amenities");
        for (String amenite : roomInventoryService.roomAmentiesMap.keySet()) {
            System.out.println("Room type : " + amenite + " " + roomInventoryService.roomAmentiesMap.get(amenite));
        }

        //Display available rooms
        roomInventoryService.searchRoom("single");
        roomInventoryService.searchRoom("double");
        roomInventoryService.displayAvailableRooms();


        //rooms booking
        ReportingService reportingService = new ReportingService();
        BookingQueueService service = new BookingQueueService(reportingService);
        service.bookRoom(new Reservation("S1", "single", "koti"));
        service.bookRoom(new Reservation("D1", "double", "Nivrutti"));
        service.bookRoom(new Reservation("SU1", "suite", "sahil"));
        service.bookRoom(new Reservation("S1", "single", "vishal"));

        service.processNextBooking();
        //display booking rooms
        System.out.println("Displaying booking rooms");
        service.displayBooking();

        //Reservation
        service.confirmReservation();

        //Service selection
        Services services = new Services();
        Services breakFast = new Services("Breakfast", 150);
        Services spa = new Services("Spa", 2000);
        Services pickup = new Services("Airport Pickup", 1500);

        ServiceManagementModule serviceManagementModule = new ServiceManagementModule();
        serviceManagementModule.addService("S1", breakFast );
        serviceManagementModule.addService("D2", spa);
        serviceManagementModule.addService("S1", pickup);

        //calculate total service cost
        System.out.println("Total service cost ₹:"+serviceManagementModule.calculateTotalServiceCost("S1"));

        //Booking History
        System.out.println(reportingService.bookingHistory.size());
        reportingService.displayBookingHistory();

        //reservations
        service.confirmReservation();
        service.confirmReservation();
        service.confirmReservation();
        reportingService.cancelReservation("D1");

        //generate report
        reportingService.generateReport();
    }
}