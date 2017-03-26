package com.airTicket.seat;

public enum SeatStatus {
    FREE(0),BOOKED(1),SALES(2);
    private int status;
    SeatStatus(int status) {
        this.status = status;
    }
    public int getStatus() {
        return status;
    }
}
