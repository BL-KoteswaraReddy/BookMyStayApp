package com.bookmystayapp;

public class Reservation {
    private String reservationID;
    private String roomType;
    private String guestName;

    private String status = "pending";
    private String allocatedRoomId = "NOT_Assigned";

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getAllocatedRoomId() {
        return allocatedRoomId;
    }

    public void setAllocatedRoomId(String allocatedRoomId) {
        this.allocatedRoomId = allocatedRoomId;
    }

    public Reservation(String reservationID, String roomType, String guestName) {
        this.reservationID = reservationID;
        this.roomType = roomType;
        this.guestName = guestName;
    }

    public String getReservationID() {
        return reservationID;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationID=" + reservationID +
                ", roomType='" + roomType + '\'' +
                ", guestName='" + guestName + '\'' +
                ", status='" + status + '\'' +
                ", allocatedRoomId='" + allocatedRoomId + '\'' +
                '}';
    }
}