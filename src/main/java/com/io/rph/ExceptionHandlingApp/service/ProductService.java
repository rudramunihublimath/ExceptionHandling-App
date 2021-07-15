package com.io.rph.ExceptionHandlingApp.service;

import com.io.rph.ExceptionHandlingApp.entity.Product;
import org.springframework.stereotype.Service;


public interface ProductService {
    public Product findProductById(Integer id);

}
