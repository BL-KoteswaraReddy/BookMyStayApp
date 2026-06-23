package com.bookmystayapp;

import java.util.HashMap;

public class RoomInventoryService
{

    HashMap<String, Integer> roomInventory = new HashMap<>();
    HashMap<String, Double>  roomPrices = new HashMap<>();

    public void addRoom(String roomType, int roomCount, double prices)
    {
            roomInventory.put(roomType, roomCount);
            roomPrices.put(roomType,prices);
    }

   public void updateRoomCount(String roomType, int roomCount)
    {
       if(roomInventory.containsKey(roomType))
       {
           roomInventory.put(roomType, roomCount);
       }
       else
       {
           System.out.println(roomType+ "Room type not found");
       }
    }

    public void updatePrice(String roomType, double price)
    {
        if(roomInventory.containsKey(roomType))
            roomPrices.put(roomType, price);
        else
        {
            System.out.println(roomType+ "Root type not found");
        }
    }


}
