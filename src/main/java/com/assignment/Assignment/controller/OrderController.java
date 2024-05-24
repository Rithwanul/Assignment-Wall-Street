package com.assignment.Assignment.controller;

import com.assignment.Assignment.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/v1/api/order")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
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
}
