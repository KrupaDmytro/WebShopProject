package com.shop.controller;

import com.shop.dto.ProductDto;
import com.shop.entity.Product;
import com.shop.mapper.GenericMapper;
import com.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dima- on 25.10.2016.
 */
@Controller
@ComponentScan("com.example.service")
public class ModifyProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private GenericMapper<Product, ProductDto> genericMapper;

    @RequestMapping(value = "modify-product")
    public String modifyPage() {
        return "modify-product";
    }

    @RequestMapping(value = "add-product", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String addNewProduct(@RequestBody ProductDto productDto) {
        Product product = genericMapper.toEntity(productDto);
        productService.addNewProduct(product);

        return "success";
    }
}
