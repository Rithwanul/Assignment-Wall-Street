package com.assignment.Assignment.service;

import com.assignment.Assignment.dto.TotalSaleDto;
import com.assignment.Assignment.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Double getTotalSaleOfADay(LocalDateTime fromDate, LocalDateTime toDate) {
        TotalSaleDto totalSaleDto = orderRepository.getAllOrder(fromDate, toDate);
        if (totalSaleDto != null) {
            return totalSaleDto.getTotal();
        }
        return 0.00;
    }
}
