package com.shop.service;

import com.shop.entity.User;

/**
 * Created by dima- on 25.10.2016.
 */
public interface CartService {
    void deleteFromCart (User user, long deleteId);
}
