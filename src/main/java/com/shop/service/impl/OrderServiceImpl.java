package com.shop.service.impl;

import com.shop.dao.OrderDao;
import com.shop.dao.OrdersDetailDao;
import com.shop.entity.Order;
import com.shop.entity.OrdersDetail;
import com.shop.entity.Product;
import com.shop.entity.User;
import com.shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by dima- on 23.10.2016.
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Autowired
    private OrdersDetailDao ordersDetailDao;

    public void addNewProductToOrder(User user, Product product, int numberOfProducts){
        Order order = orderDao.getUnpaidOrder(user);

        OrdersDetail ordersDetail = new OrdersDetail();
        ordersDetail.setOrder(order);
        ordersDetail.setNumberOfProducts(numberOfProducts);
        ordersDetail.setProduct(product);

        order.getOrdersDetails().add(ordersDetail);

        ordersDetailDao.create(ordersDetail);
        orderDao.update(order);
    }

    @Override
    public void payOrder(User user) {
        Order order = orderDao.getUnpaidOrder(user);
        order.setPaid(true);

        orderDao.update(order);

        Order newOrder = new Order();

        newOrder.setPaid(false);
        newOrder.setUser(user);
        newOrder.setOrdersDetails(new ArrayList<>());

        orderDao.create(newOrder);
    }
}
