package com.airTicket.seat;

public enum SeatClass {
    ECONOMY(0), COMFORT(1), BUSINESS(2);
    private int status;

    SeatClass(int status) {
        this.status = status;
    }
    public int getStatus() {
        return status;
    }
}
