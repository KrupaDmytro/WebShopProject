package com.shop.controller;



import com.shop.dto.ProductDto;
import com.shop.entity.*;
import com.shop.mapper.GenericMapper;
import com.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by dima- on 06.09.2016.
 */
@Controller
@ComponentScan("com.example.service")
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private GenericMapper<Product, ProductDto> genericMapper;

    @RequestMapping(value = "/")
    public String hi() {
        return "all-products";
    }


    @RequestMapping(value = "/product")
    public ModelAndView showProduct(@RequestParam("id") int id) {
        ModelAndView model = new ModelAndView();

        model.setViewName("product");
        model.getModelMap().addAttribute("product", genericMapper.toDto(productService.getProductById(new Long(id))));

        return model;
    }
}


