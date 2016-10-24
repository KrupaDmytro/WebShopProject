package com.shop.dao;

import com.shop.entity.User;

/**
 * Created by dima- on 06.10.2016.
 */
public interface UserDao extends BaseDao<User> {
    User getUserByEmail(String login);
}
