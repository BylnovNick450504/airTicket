package com.airTicket.flight;

import com.airTicket.core.CustomSoloRequest;
import com.airTicket.core.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FlightController {
    private final FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @RequestMapping(value = "/flights/{id}/bind/route", method = RequestMethod.POST)
    public ResponseStatus addRoute(@PathVariable Long id, @RequestBody CustomSoloRequest customSoloRequest)  {
        return flightService.addRoute(id, customSoloRequest);
    }

    @RequestMapping(value = "/flights/{id}/bind/airplane", method = RequestMethod.POST)
    public ResponseStatus addAirplane(@PathVariable Long id, @RequestBody CustomSoloRequest customSoloRequest)  {
        return flightService.addAirplane(id, customSoloRequest);
    }
}
