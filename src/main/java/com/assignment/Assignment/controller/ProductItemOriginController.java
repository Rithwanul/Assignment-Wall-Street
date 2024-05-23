package com.assignment.Assignment.controller;

import com.assignment.Assignment.entity.ProductItemOrigin;
import com.assignment.Assignment.service.ProductItemOriginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/product-item-origin")
public class ProductItemOriginController {

    private final ProductItemOriginService productItemOriginService;

    @Autowired
    public ProductItemOriginController(ProductItemOriginService productItemOriginService) {
        this.productItemOriginService = productItemOriginService;
    }

    @GetMapping
    public ResponseEntity<List<ProductItemOrigin>> getAll() {
        List<ProductItemOrigin> productItemOrigins = productItemOriginService.getAllProductItemOrigin();
        if (productItemOrigins != null)
            return new ResponseEntity<>(productItemOrigins, HttpStatus.OK);
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }
}
