package com.assignment.Assignment.service;

import com.assignment.Assignment.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;

    @Test
    public void getAllCustomerTest() {
        List<Customer> customers = customerService.GetAllCustomer();
        System.out.println(customers);
    }
}
