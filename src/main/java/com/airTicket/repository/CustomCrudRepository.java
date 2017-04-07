package com.airTicket.repository;

import com.airTicket.core.BaseEntity;
import org.springframework.stereotype.Repository;
import java.io.Serializable;
import java.util.List;

@Repository
public interface CustomCrudRepository<T extends BaseEntity, ID extends Serializable> extends org.springframework.data.repository.Repository<T, ID>{
    T save(T s);
    T findOne(ID id);
    List<T> findAll();
}
