package com.assignment.Assignment.service;


import java.time.LocalDateTime;

public interface OrderService {
    Double getTotalSaleOfADay(LocalDateTime fromDate, LocalDateTime toDate);
}
