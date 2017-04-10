package com.airTicket.core;

import com.airTicket.flight.Flight;
import com.airTicket.flight.FlightRepository;
import com.airTicket.seat.status.SeatStatus;
import com.airTicket.seat.classification.SeatClass;
import com.airTicket.seat.classification.SeatClassRepository;
import com.airTicket.seat.status.SeatStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DatabaseLoader implements ApplicationRunner {

    private final SeatStatusRepository seatStatusRepository;
    private final SeatClassRepository seatClassRepository;
    private final FlightRepository flightRepository;

    @Autowired
    public DatabaseLoader(SeatStatusRepository seatStatusRepository, SeatClassRepository seatClassRepository, FlightRepository flightRepository) {
        this.seatStatusRepository = seatStatusRepository;
        this.seatClassRepository = seatClassRepository;
        this.flightRepository = flightRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        SeatClass sc1 = new SeatClass("ECONOMY");
        SeatClass sc2 = new SeatClass("COMFORT");
        SeatClass sc3 = new SeatClass("BUSINESS");
        seatClassRepository.save(sc1);
        seatClassRepository.save(sc2);
        seatClassRepository.save(sc3);

        SeatStatus st1 = new SeatStatus("FREE");
        SeatStatus st2 = new SeatStatus("BOOKED");
        SeatStatus st3 = new SeatStatus("SOLD");

        seatStatusRepository.save(st1);
        seatStatusRepository.save(st2);
        seatStatusRepository.save(st3);

        Date date = new Date(2017, 6, 100, 13, 59, 00);
        Flight flight1 = new Flight("YS-102", date);
        Flight flight2 = new Flight("YS-103", date);
        Flight flight3 = new Flight("YS-104", date);

        flightRepository.save(flight1);
        flightRepository.save(flight2);
        flightRepository.save(flight3);
    }
}
