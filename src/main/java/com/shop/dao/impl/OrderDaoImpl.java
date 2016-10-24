package com.shop.dao.impl;

import com.shop.dao.OrderDao;
import com.shop.entity.Order;
import com.shop.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * Created by dima- on 06.10.2016.
 */
@Repository
public class OrderDaoImpl extends BaseDaoImpl<Order> implements OrderDao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Order getUnpaidOrder(User user) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Order> criteriaQuery = criteriaBuilder.createQuery(Order.class);
        Root<Order> root = criteriaQuery.from(Order.class);
        criteriaQuery.where(criteriaBuilder.and(criteriaBuilder.equal(root.get("user"), user.getUser_id())),
                (criteriaBuilder.equal(root.get("paid"), false)));

        return entityManager.createQuery(criteriaQuery).getSingleResult();
    }
}
