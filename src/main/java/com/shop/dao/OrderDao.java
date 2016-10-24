package com.shop.dao;

import com.shop.entity.Order;
import com.shop.entity.User;

/**
 * Created by dima- on 06.10.2016.
 */
public interface OrderDao extends BaseDao<Order>{
    Order getUnpaidOrder (User user);
}
