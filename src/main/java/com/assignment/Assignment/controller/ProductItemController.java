package com.assignment.Assignment.controller;

import com.assignment.Assignment.entity.ProductItem;
import com.assignment.Assignment.service.ProductItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/product_item")
public class ProductItemController {

    private final ProductItemService productItemService;

    @Autowired
    public ProductItemController(ProductItemService productItemService) {
        this.productItemService = productItemService;
    }

    @GetMapping
    public ResponseEntity<List<ProductItem>> getAllProductItems() {
        List<ProductItem> productItems = productItemService.getAllProduct();
        if (productItems != null)
            return new ResponseEntity<>(productItems, HttpStatus.OK);
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }
}
