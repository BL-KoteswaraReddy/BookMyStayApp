package com.bookmystayapp;

import java.util.HashMap;
import java.util.List;

public class RoomInventoryService {
    HashMap<String, Integer> roomInventory = new HashMap<>();
    HashMap<String, Double> roomPrices = new HashMap<>();

    HashMap<String, List<String>> roomAmentiesMap = new HashMap<>();

    public void addRoom(String roomType, int roomCount, double prices) {
        roomInventory.put(roomType, roomCount);
        roomPrices.put(roomType, prices);
    }

    public void updateRoomCount(String roomType, int roomCount) {
        if (roomInventory.containsKey(roomType)) {
            roomInventory.put(roomType, roomCount);
        } else {
            System.out.println(roomType + "Room type not found");
        }
    }

    public void updatePrice(String roomType, double price) {
        if (roomInventory.containsKey(roomType))
            roomPrices.put(roomType, price);
        else {
            System.out.println(roomType + "Root type not found");
        }
    }

    public void addRoomAmenities(String roomType, List<String> amenites) {
        if (checkAvailability(roomType)) {
            roomAmentiesMap.put(roomType, amenites);
        } else {
            System.out.println(roomType + " not found");
        }
    }

    public boolean checkAvailability(String roomType) {
        if (roomInventory.get(roomType) > 0)
            return true;
        return false;
    }

    public void displayAvailableRooms() {

        System.out.println("===== Available Rooms =====");

        for (String roomType : roomInventory.keySet()) {
            if (roomInventory.get(roomType) > 0) {
                System.out.println("room type: " + roomType);
                System.out.println("room price: " + roomPrices.get(roomType));
                System.out.println("Available count: " + roomInventory.get(roomType));
                System.out.println("Room amenities: " + roomAmentiesMap.get(roomType));
            }
        }
    }

    //search specific room
    public void searchRoom(String roomType) {
        if (!roomInventory.containsKey(roomType)) {
            System.out.println("Room not found " + roomType);
            return;
        }

        System.out.println("Room Type : " + roomType);
        System.out.println("Available Count : " + roomInventory.get(roomType));
        System.out.println("Price : " + roomPrices.get(roomType));
        System.out.println("Amenities : " + roomAmentiesMap.get(roomType));

        if (roomInventory.get(roomType) > 0) {
            System.out.println("Room :" + roomType + " is available");
        } else {
            System.out.println("Status : Not available");
        }
    }
}