package com.shop.service.impl;

import com.shop.dao.OrderDao;
import com.shop.dao.OrdersDetailDao;
import com.shop.entity.Order;
import com.shop.entity.OrdersDetail;
import com.shop.entity.User;
import com.shop.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dima- on 25.10.2016.
 */
@Service
public class CartServiceImpl implements CartService{
    @Autowired
    private OrderDao orderDao;

    @Autowired
    private OrdersDetailDao ordersDetailDao;

    @Override
    public void deleteFromCart(User user, long deleteId) {
        Order order = orderDao.getUnpaidOrder(user);

        List<OrdersDetail> list = order.getOrdersDetails();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == deleteId) {
                OrdersDetail ordersDetail = list.get(i);
                order.getOrdersDetails().remove(i);

                ordersDetailDao.delete(ordersDetail);

                break;
            }
        }
    }
}
