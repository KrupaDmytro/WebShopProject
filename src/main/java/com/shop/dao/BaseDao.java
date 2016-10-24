package com.shop.dao;

import javax.persistence.EntityManager;
import java.util.List;

public interface BaseDao<T> {
    EntityManager getEntityManager();

    List<T> findAll();

    void create(T entity);

    T findById(Object id);

    void delete(T entity);

    void deleteAll();

    T update(T entity);
}
