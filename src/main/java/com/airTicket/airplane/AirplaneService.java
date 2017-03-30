package com.airTicket.airplane;


import com.airTicket.core.ResponseStatus;

public interface AirplaneService {
    ResponseStatus initAirplane(Long id, AirplaneInfo airInfo);
}
