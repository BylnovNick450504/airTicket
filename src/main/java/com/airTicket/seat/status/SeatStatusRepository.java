package com.airTicket.seat.status;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatStatusRepository extends CrudRepository<SeatStatus, Long> {
}
