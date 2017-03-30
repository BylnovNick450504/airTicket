package com.airTicket.seat;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends CrudRepository<Seat, Long> {
    Seat findByTicket(Long id);
    List<Seat> findByAirplaneId(Long id);
}
