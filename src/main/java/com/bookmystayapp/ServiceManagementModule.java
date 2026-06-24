package com.bookmystayapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ServiceManagementModule
{
    HashMap<String, List<Services>> reservationServices = new HashMap<>();

    public void addService(String reservationId, Services services)
    {
       if(!reservationServices.containsKey(reservationId))
       {
           reservationServices.put(reservationId, new ArrayList<>());
       }
       reservationServices.get(reservationId).add(services);

        System.out.println(
                services.getServiceName()
                        + " added to "
                        + reservationId);

    }

    public void displayServices(String reservationID)
    {
        List<Services> services = reservationServices.get(reservationID);

        if(services == null || services.isEmpty())
        {
            System.out.println("No services selected");
            return;
        }

        System.out.println(" Services for reservation "+reservationID);
        for (Services services1: services)
        {
            System.out.println(services1);
        }
    }

    public double calculateTotalServiceCost(String reservationId)
    {
        List<Services>  services = reservationServices.get(reservationId);

        if(services == null )
            return 0;

        double total = 0;
        for(Services services1: services)
        {
            total+=services1.getServiceCost();
        }
        return total;
    }


}