package com.shop.dao.impl;

import com.shop.dao.UserDao;
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
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public User getUserByEmail(String email) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<User> q = cb.createQuery(User.class);
        Root<User> root = q.from(User.class);
        q.where(cb.equal(root.get("email"), email));

        User user = entityManager.createQuery(q).getSingleResult();

        return user;
    }
}
