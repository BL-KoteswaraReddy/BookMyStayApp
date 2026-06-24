package com.bookmystayapp;

import java.util.ArrayList;
import java.util.List;

public class ReportingService
{

    List<Reservation> bookingHistory = new ArrayList<>();

    public void displayBookingHistory()
    {
        System.out.println("=====Displaying Booking History=====");
        for(Reservation reservation: bookingHistory)
            System.out.println(reservation);
    }

    public Reservation findReservation(String reservationId)
    {
        for(Reservation reservation: bookingHistory)
        {
            if(reservation.getReservationID() == reservationId)
            {
                return reservation;
            }
        }
        return null;
    }

    public void cancelReservation(String reservationId) {
        Reservation reservation = findReservation(reservationId);
        if(reservation != null)
        {
            reservation.setStatus("Cancelled");
        }
    }


    public void generateReport() {
        System.out.println("Total reservations :"+bookingHistory.size());

        long confirmed = bookingHistory.stream().filter(r-> r.getStatus().equalsIgnoreCase("Confirmed")).count();

        long cancelled = bookingHistory.stream().filter(r ->r.getStatus().equalsIgnoreCase("Cancelled")).count();

        System.out.println("Confirmed :"+confirmed);
        System.out.println("Cancelled :"+cancelled);
    }
}