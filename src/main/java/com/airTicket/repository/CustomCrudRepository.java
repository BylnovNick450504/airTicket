package com.airTicket.repository;

import com.airTicket.core.BaseEntity;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

@Repository
public interface CustomCrudRepository<T extends BaseEntity, ID extends Serializable> extends org.springframework.data.repository.Repository<T, ID>{
    T save(T s);
}
