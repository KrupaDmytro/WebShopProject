package com.shop.controller;

import com.google.gson.Gson;
import com.shop.dao.ProductDao;
import com.shop.dto.ProductDto;
import com.shop.entity.Product;
import com.shop.mapper.GenericMapper;
import com.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dima- on 12.10.2016.
 */
@Controller
@ComponentScan("com.example.service")
public class ListWithProducts {
    @Autowired
    private ProductService productService;

    @Autowired
    private GenericMapper<Product, ProductDto> genericMapper;

    @RequestMapping(value = "/all-products")
    public String showAllProduct() {
        return "all-products";
    }

    @RequestMapping(value = "get-product/{pageNum}/{pageSize}", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String getProduct(@PathVariable int pageNum, @PathVariable int pageSize) {
        return new Gson().toJson(genericMapper.toDto(productService.getProductByPage(pageNum, pageSize)));
    }
}
