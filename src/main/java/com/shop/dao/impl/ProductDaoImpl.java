package com.shop.dao.impl;

import com.shop.dao.ProductDao;
import com.shop.entity.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by dima- on 06.10.2016.
 */
@Repository
public class ProductDaoImpl extends BaseDaoImpl<Product> implements ProductDao {

    @PersistenceContext
    EntityManager entityManager;

    public List<Product> getProductForPagination(Integer pageNumber, Integer pageSize){
        Query query = entityManager.createQuery("From Product");

        query.setFirstResult((pageNumber-1) * pageSize);
        query.setMaxResults(pageSize);
        List <Product> productList = query.getResultList();

        return productList;
    }

    @Override
    public Long getNumberOfProducts() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Long> criteriaQuery = criteriaBuilder.createQuery(Long.class);
        Root<Product> root = criteriaQuery.from(Product.class);

        criteriaQuery.select(criteriaBuilder.count(root.get("name")));

        return  entityManager.createQuery(criteriaQuery).getSingleResult();
    }
}
