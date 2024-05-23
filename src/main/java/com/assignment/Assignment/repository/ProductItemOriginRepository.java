package com.assignment.Assignment.repository;


import com.assignment.Assignment.entity.ProductItemOrigin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductItemOriginRepository extends JpaRepository<ProductItemOrigin, Integer> {
}
