package com.airTicket.seat.classification;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatClassRepository extends CrudRepository<SeatClass, Long> {
}
