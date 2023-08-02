package com.giomascitelli.restfulservice.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Product {
    
    private final String id;
    private final String description;
    private final BigDecimal price;

}
