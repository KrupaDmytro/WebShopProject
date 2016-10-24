package com.shop.service;

import com.shop.entity.Product;
import com.shop.entity.User;

/**
 * Created by dima- on 23.10.2016.
 */
public interface OrderService {
    void addNewProductToOrder(User user, Product product, int numberOfProducts);

    void payOrder(User user);
}
