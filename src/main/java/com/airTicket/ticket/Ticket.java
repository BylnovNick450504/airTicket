package com.airTicket.ticket;

import com.airTicket.core.BaseEntity;
import com.airTicket.flight.Flight;
import com.airTicket.passenger.Passenger;
import com.airTicket.seat.Seat;
import com.airTicket.user.User;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    private Passenger passenger;

    @OneToOne
    private Flight flight;

    @OneToOne(mappedBy = "ticket", cascade = CascadeType.ALL)
    private Seat seat;

    public Ticket(){
        super();
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
