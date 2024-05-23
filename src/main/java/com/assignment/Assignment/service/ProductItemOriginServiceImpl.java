package com.assignment.Assignment.service;

import com.assignment.Assignment.entity.ProductItemOrigin;
import com.assignment.Assignment.repository.ProductItemOriginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductItemOriginServiceImpl implements ProductItemOriginService{

    private final ProductItemOriginRepository productItemOriginRepository;

    @Autowired
    public ProductItemOriginServiceImpl(ProductItemOriginRepository productItemOriginRepository) {
        this.productItemOriginRepository = productItemOriginRepository;
    }

    @Override
    public List<ProductItemOrigin> getAllProductItemOrigin() {
        return productItemOriginRepository.findAll();
    }
}
