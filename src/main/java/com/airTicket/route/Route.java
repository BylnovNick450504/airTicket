package com.airTicket.route;

import com.airTicket.core.BaseEntity;
import com.airTicket.town.Town;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "routes")
public class Route extends BaseEntity {
    private String name;
    private int status;

    @OneToOne(cascade= CascadeType.ALL)
    private Town source;

    @OneToOne(cascade=CascadeType.ALL)
    private Town destination;

    public Route() {
        super();
    }

    public Route(String name, int status) {
        super();
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Town getSource() {
        return source;
    }

    public void setSource(Town source) {
        this.source = source;
    }

    public Town getDestination() {
        return destination;
    }

    public void setDestination(Town destination) {
        this.destination = destination;
    }

}
