package com.airTicket.route;

import com.airTicket.core.ResponseStatus;
import com.airTicket.town.Town;
import com.airTicket.town.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteServiceImpl implements RouteService {

    private final RouteRepository routeRepository;
    private final TownRepository townRepository;

    @Autowired
    public RouteServiceImpl(RouteRepository routeRepository, TownRepository townRepository) {
        this.routeRepository = routeRepository;
        this.townRepository = townRepository;
    }

    @Override
    public ResponseStatus addTown(Long id, CustomRouteRequest customRouteRequest) {
        Route route = routeRepository.findById(id);
        Town source = townRepository.findById(customRouteRequest.getSrcId());
        Town destination = townRepository.findById(customRouteRequest.getDestId());
        if(route == null || source == null || destination == null) {
            return new ResponseStatus();
        }
        route.setSource(source);
        route.setDestination(destination);
        routeRepository.save(route);
        return new ResponseStatus(true);
    }
}
