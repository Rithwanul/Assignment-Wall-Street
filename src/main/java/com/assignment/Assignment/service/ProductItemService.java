package com.assignment.Assignment.service;

import com.assignment.Assignment.entity.ProductItem;

import java.util.List;

public interface ProductItemService {
    List<ProductItem> getAllProduct();

    List<ProductItem> getTopFiveProductItemOfAllTime();

}
