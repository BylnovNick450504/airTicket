package com.airTicket.town;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TownRepository extends CrudRepository<Town, Long> {
    Town findById(Long id);
}
