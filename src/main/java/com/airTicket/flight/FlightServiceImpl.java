package com.airTicket.flight;

import com.airTicket.airplane.Airplane;
import com.airTicket.airplane.AirplaneRepository;
import com.airTicket.core.CustomSoloRequest;
import com.airTicket.core.ResponseStatus;
import com.airTicket.route.Route;
import com.airTicket.route.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImpl implements FlightService{

    private final FlightRepository flightRepository;
    private final RouteRepository routeRepository;
    private final AirplaneRepository airplaneRepository;

    @Autowired
    public FlightServiceImpl(FlightRepository flightRepository, RouteRepository routeRepository, AirplaneRepository airplaneRepository) {
        this.flightRepository = flightRepository;
        this.routeRepository = routeRepository;
        this.airplaneRepository = airplaneRepository;
    }

    @Override
    public ResponseStatus addAirplane(Long id, CustomSoloRequest customSoloRequest) {
        Airplane airplane = airplaneRepository.findOne(customSoloRequest.getId());
        Flight flight = flightRepository.findOne(id);
        if (airplane == null || flight == null) {
            return new ResponseStatus();
        }
        flight.setAirplane(airplane);
        flightRepository.save(flight);
        return new ResponseStatus(true);

    }

    @Override
    public ResponseStatus addRoute(Long id, CustomSoloRequest customSoloRequest) {
        Route route = routeRepository.findOne(customSoloRequest.getId());
        Flight flight = flightRepository.findOne(id);
        if (route == null || flight == null) {
            return new ResponseStatus();
        }
        flight.setRoute(route);
        flightRepository.save(flight);
        return new ResponseStatus(true);
    }
}
