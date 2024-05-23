package com.assignment.Assignment.repository;


import com.assignment.Assignment.entity.Customer;
import com.assignment.Assignment.entity.Wish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
