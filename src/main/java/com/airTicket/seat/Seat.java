package com.airTicket.seat;

import com.airTicket.airplane.Airplane;
import com.airTicket.core.BaseEntity;
import com.airTicket.ticket.Ticket;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "seats")
public class Seat extends BaseEntity {
    private SeatClass seatClass;
    private int number;
    private SeatStatus seatStatus;

    @OneToOne
    @JoinColumn(name = "airplane_id")
    private Airplane airplane;

    @OneToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    public Seat() {
        super();
    }

    public Seat(SeatClass seatClass, int number, SeatStatus seatStatus) {
        this.seatClass = seatClass;
        this.number = number;
        this.seatStatus = seatStatus;
    }

    public SeatClass getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(SeatClass seatClass) {
        this.seatClass = seatClass;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
