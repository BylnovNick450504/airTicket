//package com.airTicket.airplane;
//
//import com.airTicket.core.BaseEntity;
//
//import javax.persistence.*;
//import java.util.HashMap;
//import java.util.Map;
//
//@Entity
//@Table(name = "airplanes")
//public class Airplane extends BaseEntity {
//
//
//    private Map<SeatClass, Integer> seats = new HashMap<>();
//    private String name;
//    private String type;
//    private int status;
//    private int speed;
//
//    public Airplane() {
//        super();
//        seats.put(SeatClass.ECONOMY, 0);
//        seats.put(SeatClass.COMFORT, 0);
//        seats.put(SeatClass.BUSINESS, 0);
//    }
//
//    public Airplane(String name, String type, int status, int speed) {
//        this();
//        this.name = name;
//        this.type = type;
//        this.status = status;
//        this.speed = speed;
//    }
//
//    public Map<SeatClass, Integer> getSeats() {
//        return seats;
//    }
//
//    public void setSeats(Map<SeatClass, Integer> seats) {
//        this.seats = seats;
//    }
//
//    public void setSeats(SeatClass seatClass, int seats) {
//        this.seats.put(seatClass, seats);
//    }
//
//    public int getSeatsByClass(SeatClass seatClass) {
//        return seats.get(seatClass);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public int getStatus() {
//        return status;
//    }
//
//    public void setStatus(int status) {
//        this.status = status;
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
//
//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }
//
//}
