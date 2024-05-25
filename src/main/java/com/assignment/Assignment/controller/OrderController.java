package com.assignment.Assignment.controller;

import com.assignment.Assignment.entity.ProductItem;
import com.assignment.Assignment.service.OrderService;
import com.assignment.Assignment.service.ProductItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/v1/api/order")
public class OrderController {

    private final OrderService orderService;

    private final ProductItemService productItemService;

    @Autowired
    public OrderController(OrderService orderService, ProductItemService productItemService) {
        this.orderService = orderService;
        this.productItemService = productItemService;
    }

    @GetMapping("total-sell-today")
    public ResponseEntity<Double> getAllOrders(@RequestParam("fromDate") LocalDateTime fromDate,
                                               @RequestParam("toDate") LocalDateTime toDate) {
        Double totalSaleOfADay = orderService.getTotalSaleOfADay(fromDate, toDate);
        if (totalSaleOfADay != null) {
            return new ResponseEntity<>(totalSaleOfADay, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }

    @GetMapping("get-top-five-product-item-of-all-time")
    public ResponseEntity<?> getTopFiveProductItemOfAllTime() {
        List<ProductItem> topFiveProductItemOfAllTime =
                productItemService.getTopFiveProductItemOfAllTime();

        if (topFiveProductItemOfAllTime != null) {
            return new ResponseEntity<>(topFiveProductItemOfAllTime, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }
}
