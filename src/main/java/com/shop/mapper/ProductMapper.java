package com.shop.mapper;

import com.shop.dto.ProductDto;
import com.shop.entity.Product;

import org.springframework.security.access.method.P;
import org.springframework.stereotype.Component;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


/**
 * Created by dima- on 07.05.2016.
 */
@Component
public class ProductMapper implements GenericMapper<Product, ProductDto> {
    @Override
    public final Product toEntity(final ProductDto productDto) {
        Product product = new Product();

        if (productDto.getId() != null)
            product.setId(productDto.getId());

        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setDescription(productDto.getDescription());
        product.setUnitOfMeasurement(productDto.getUnitOfMeasurement());

        return product;
    }

    @Override
    public final ProductDto toDto(final Product product) {
        ProductDto productDto = new ProductDto();

        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setPrice(product.getPrice());
        productDto.setDescription(product.getDescription());
        productDto.setUnitOfMeasurement(product.getUnitOfMeasurement());

        return productDto;
    }

    @Override
    public List<ProductDto> toDto(List<Product> entityList) {
        List<ProductDto> productDtoList = new ArrayList<>(entityList.size());

        for(Product product: entityList){
            productDtoList.add(toDto(product));
        }

        return productDtoList;
    }

    @Override
    public List<Product> toEntity(List<ProductDto> dtoList) {
        List<Product> productList = new ArrayList<>(dtoList.size());

        for(ProductDto productDto: dtoList){
            productList.add(toEntity(productDto));
        }

        return productList;
    }
}
