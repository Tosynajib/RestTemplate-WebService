package com.example.resttemplate.controller;


import com.example.resttemplate.serviceImp.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/template/products/")
public class ConsumeWebService {

    ProductService productService;

    @Autowired
    public ConsumeWebService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/{id}")
    public String getProductList(@PathVariable Long id) {
      return productService.getProductList(id);
    }

}
