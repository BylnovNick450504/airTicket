package com.airTicket.airplane;

import com.airTicket.seat.info.SeatInfo;

import java.util.List;

public class AirplaneInfo {
    private List<SeatInfo> airInfo;

    public AirplaneInfo() {

    }

    public AirplaneInfo(List<SeatInfo> airInfo) {
        this.airInfo = airInfo;
    }

    public List<SeatInfo> getAirInfo() {
        return airInfo;
    }

    public void setAirInfo(List<SeatInfo> airInfo) {
        this.airInfo = airInfo;
    }
}
