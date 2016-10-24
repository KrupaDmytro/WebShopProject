package com.shop.dao;

import com.shop.entity.Product;

import java.util.List;

/**
 * Created by dima- on 06.10.2016.
 */
public interface ProductDao extends BaseDao<Product> {
    List<Product> getProductForPagination(Integer pageNumber, Integer pageSize);

    Long getNumberOfProducts();
}
