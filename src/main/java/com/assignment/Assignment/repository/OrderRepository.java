package com.assignment.Assignment.repository;

import com.assignment.Assignment.dto.TotalSaleDto;
import com.assignment.Assignment.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    @Query(value = """
        select sum(total_amount) as total from tbl_order tbo 
        WHERE tbo.created_at  BETWEEN :fromDate AND :toDate
        """, nativeQuery = true)
    TotalSaleDto getAllOrder(@Param("fromDate") LocalDateTime fromDate, @Param("toDate") LocalDateTime toDate);
}
