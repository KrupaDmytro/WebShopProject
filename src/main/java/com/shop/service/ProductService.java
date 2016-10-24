package com.shop.service;

import com.shop.dto.ProductDto;
import com.shop.entity.Product;

import java.util.List;

/**
 * Created by dima- on 12.10.2016.
 */
public interface ProductService {
    void addNewProduct(Product product);

    Product getProductById(Long id);

    List<Product> getProductByPage(int pageNum, int pageSize);
}
