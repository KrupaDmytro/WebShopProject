package com.shop.service;

import com.shop.entity.User;

/**
 * Created by dima- on 23.10.2016.
 */
public interface UserService {
    User getUserByEmail(String email);
}
