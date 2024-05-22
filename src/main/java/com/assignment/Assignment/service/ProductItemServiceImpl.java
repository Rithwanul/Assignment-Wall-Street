package com.assignment.Assignment.service;

import com.assignment.Assignment.entity.ProductItem;
import com.assignment.Assignment.repository.ProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
