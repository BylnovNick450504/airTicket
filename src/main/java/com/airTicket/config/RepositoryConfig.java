package com.airTicket.config;

import com.airTicket.airplane.Airplane;
import com.airTicket.flight.Flight;
import com.airTicket.passenger.Passenger;
import com.airTicket.route.Route;
import com.airTicket.seat.Seat;
import com.airTicket.ticket.Ticket;
import com.airTicket.town.Town;
import com.airTicket.user.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(
                Seat.class,
                Town.class,
                Route.class,
                Airplane.class,
                Passenger.class,
                Flight.class,
                User.class,
                Ticket.class
        );
    }
}
