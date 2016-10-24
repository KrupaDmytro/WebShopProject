package com.shop.service.impl;

import com.shop.dao.ProductDao;
import com.shop.dto.ProductDto;
import com.shop.entity.Product;
import com.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by dima- on 12.10.2016.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;

    public void addNewProduct(Product product){
        productDao.create(product);
    }

    public Product getProductById(Long id) {
        return productDao.findById(id);
    }

    @Override
    public List<Product> getProductByPage(int pageNum, int pageSize) {
        return productDao.getProductForPagination(pageNum,pageSize);
    }
}
