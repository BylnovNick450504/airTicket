package com.airTicket.route;

import com.airTicket.core.ResponseStatus;

public interface RouteService {
    ResponseStatus addTown(Long id, CustomRouteRequest towns);
}
