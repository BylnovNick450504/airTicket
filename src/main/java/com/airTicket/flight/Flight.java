package com.airTicket.flight;

import com.airTicket.airplane.Airplane;
import com.airTicket.core.BaseEntity;
import com.airTicket.route.Route;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "flights")
public class Flight extends BaseEntity {
    private String name;
    private Date departureTime;

    @OneToOne(cascade= CascadeType.ALL)
    private Airplane airplane;

    @OneToOne(cascade= CascadeType.ALL)
    private Route route;

    public Flight() {
        super();
    }

    public Flight(String name, Date departureTime) {
        super();
        this.name = name;
        this.departureTime = departureTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
