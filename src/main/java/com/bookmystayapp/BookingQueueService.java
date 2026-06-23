package com.bookmystayapp;

import java.util.LinkedList;
import java.util.Queue;

public class BookingQueueService {

    Queue<Reservation> bookingQueue = new LinkedList<>();


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
