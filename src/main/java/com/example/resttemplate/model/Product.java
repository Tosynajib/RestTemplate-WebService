package com.example.resttemplate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String id;
    private String title;
    private String description;
    private BigDecimal price;
    private String discountPercentage;
    private BigDecimal rating;
    private Integer stock;
    private String brand;
    private String category;
    private String thumbnail;
    private List<String> images;

}