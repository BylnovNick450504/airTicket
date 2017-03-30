package com.airTicket.airplane;


import com.airTicket.core.ResponseStatus;
import com.airTicket.route.CustomRouteRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AirplaneController {

    AirplaneService airplaneService;

    @Autowired
    public AirplaneController(AirplaneService airplaneService) {
        this.airplaneService = airplaneService;
    }

    @RequestMapping(value = "/airplanes/{id}/init", method = RequestMethod.POST)
    public ResponseStatus initAirplane(@PathVariable Long id, @RequestBody AirplaneInfo airInfo)  {
        return airplaneService.initAirplane(id, airInfo);
    }
}
