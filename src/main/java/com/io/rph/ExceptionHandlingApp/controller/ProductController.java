package com.io.rph.ExceptionHandlingApp.controller;

import com.io.rph.ExceptionHandlingApp.entity.Product;
import com.io.rph.ExceptionHandlingApp.service.ProductService;
import com.io.rph.ExceptionHandlingApp.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/getProduct",produces = {"application/json"})
    public Product getProductById(@RequestParam("pid") String pid){
        Product product = productService.findProductById(Integer.valueOf(pid));
        return product;
    }

}
