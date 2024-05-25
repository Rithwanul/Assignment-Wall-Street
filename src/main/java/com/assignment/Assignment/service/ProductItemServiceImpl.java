package com.assignment.Assignment.service;

import com.assignment.Assignment.entity.ProductItem;
import com.assignment.Assignment.repository.ProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductItemServiceImpl implements ProductItemService {

    private final ProductItemRepository productItemRepository;

    @Autowired
    public ProductItemServiceImpl(ProductItemRepository productItemRepository) {
        this.productItemRepository = productItemRepository;
    }

    @Override
    public List<ProductItem> getAllProduct() {
        return productItemRepository.findAll();
    }

    @Override
    public List<ProductItem> getTopFiveProductItemOfAllTime() {
        return productItemRepository.getTopFiveProductItemOfAllTime();
    }

    @Override
    public List<ProductItem> getTopFiveProductItemOfAllTimeByQuantity(LocalDateTime fromDate, LocalDateTime toDate) {
        System.out.println(fromDate.toString());
        System.out.println(toDate.toString());
        return productItemRepository.getTopFiveProductItemOfAllTimeByQuantity(fromDate, toDate);
    }
}
