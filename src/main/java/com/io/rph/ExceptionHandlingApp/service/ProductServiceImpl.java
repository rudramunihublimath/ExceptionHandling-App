package com.io.rph.ExceptionHandlingApp.service;

import com.io.rph.ExceptionHandlingApp.entity.Product;
import com.io.rph.ExceptionHandlingApp.exception.NoProductFoundException;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements  ProductService{
    @Override
    public Product findProductById(Integer id) {
        if(id==101)
            return new Product(101,"LAPTOP",2000.00 );
        else
            throw new NoProductFoundException("No Product found exception");
    }
}
