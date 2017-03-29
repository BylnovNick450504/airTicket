package com.airTicket.route;

import com.airTicket.core.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RouteController {

    private final RouteService routeService;

    @Autowired
    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @RequestMapping(value = "/routes/{id}/bind/town", method = RequestMethod.POST)
    public ResponseStatus addTown(@PathVariable Long id, @RequestBody CustomRouteRequest customRouteRequest)  {
        return routeService.addTown(id, customRouteRequest);
    }

}
