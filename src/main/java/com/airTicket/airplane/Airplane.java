package com.airTicket.airplane;

import com.airTicket.core.BaseEntity;
import com.airTicket.seat.Seat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "airplanes")
public class Airplane extends BaseEntity {

    private String name;
    private String type;
    private int status;
    private int speed;

    @OneToMany(mappedBy = "airplane", cascade = CascadeType.ALL)
    private List<Seat> seats = new ArrayList<>();

    public Airplane() {
        super();
    }

    public Airplane(String name, String type, int status, int speed) {
        this();
        this.name = name;
        this.type = type;
        this.status = status;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

}
