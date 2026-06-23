package com.bookmystayapp;
import java.util.Arrays;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args)
        {

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
            for(String roomType: roomInventoryService.roomInventory.keySet()) {
                System.out.println("Room type : "+roomType+ ", price : "+roomInventoryService.roomInventory.get(roomType)+
                        ", count : "+roomInventoryService.roomPrices.get(roomType));
            }

            //update room counts
            roomInventoryService.updateRoomCount("double", 3);
            roomInventoryService.updateRoomCount("single", 5);

            //update room prices
            roomInventoryService.updatePrice("suite",5000);
            roomInventoryService.updatePrice("single", 3000);

            //After update Display Room inventory
            System.out.println("======After update Display Room Inventory======");
            for(String roomType: roomInventoryService.roomInventory.keySet()) {
                System.out.println("Room type : "+roomType+ ", price : "+roomInventoryService.roomInventory.get(roomType)+
                        ", count : "+roomInventoryService.roomPrices.get(roomType));
            }

            //Displaying Room amenites
            System.out.println("Room amenities");
            for(String amenite: roomInventoryService.roomAmentiesMap.keySet())
            {
                System.out.println("Room type : "+amenite+" "+roomInventoryService.roomAmentiesMap.get(amenite));
            }

            //Display available rooms
             roomInventoryService.searchRoom("single");
             roomInventoryService.searchRoom("double");
             roomInventoryService.displayAvailableRooms();

        }
}