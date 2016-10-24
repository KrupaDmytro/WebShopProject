package com.shop.mapper;

import java.util.List;

/**
 * Created by dima- on 07.05.2016.
 */
public interface GenericMapper<T, V> {

    V toDto(T entity);

    T toEntity(V dto);

    List<V> toDto(List<T> entityList);

    List<T> toEntity(List<V> dtoList);
}
