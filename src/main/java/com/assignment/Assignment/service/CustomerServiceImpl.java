package com.assignment.Assignment.service;

import com.assignment.Assignment.entity.Customer;
import com.assignment.Assignment.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> GetAllCustomer() {
        return customerRepository.findAll();
    }
}
