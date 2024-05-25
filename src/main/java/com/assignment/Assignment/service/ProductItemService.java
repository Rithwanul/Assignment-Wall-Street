package com.assignment.Assignment.service;

import com.assignment.Assignment.entity.ProductItem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ProductItemService {
    List<ProductItem> getAllProduct();

    List<ProductItem> getTopFiveProductItemOfAllTime();

    List<ProductItem> getTopFiveProductItemOfAllTimeByQuantity(LocalDateTime fromDate, LocalDateTime toDate);

}
