package com.airTicket.seat.classification;

import com.airTicket.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "seat_class")
public class SeatClass extends BaseEntity {
    private String seatClass;

    public SeatClass() {
        super();
    }

    public SeatClass(String seatClass) {
        super();
        this.seatClass = seatClass;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }
}
