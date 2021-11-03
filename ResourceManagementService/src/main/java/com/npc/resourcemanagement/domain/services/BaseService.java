package com.cmcglobal.resourcemanagement.domain.services;

import java.util.List;

public interface BaseService<T> {

    void save(T object);

    T getById(Long id);

    List<T> findAll();


}
