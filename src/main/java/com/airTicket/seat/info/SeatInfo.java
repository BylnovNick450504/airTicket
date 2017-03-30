package com.airTicket.seat.info;

public class SeatInfo {
    private int count;
    private Long seatClassId;

    public SeatInfo() {
    }

    public SeatInfo(int count, Long seatClassId) {
        this.count = count;
        this.seatClassId = seatClassId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Long getSeatClassId() {
        return seatClassId;
    }

    public void setSeatClassId(Long seatClassId) {
        this.seatClassId = seatClassId;
    }
}
