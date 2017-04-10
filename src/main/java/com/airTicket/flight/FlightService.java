package com.airTicket.flight;

import com.airTicket.core.CustomSoloRequest;
import com.airTicket.core.ResponseStatus;

public interface FlightService {
    ResponseStatus addAirplane(Long id, CustomSoloRequest customSoloRequest);
    ResponseStatus addRoute(Long id, CustomSoloRequest customSoloRequest);
}
