package com.assignment.Assignment.repository;

import com.assignment.Assignment.entity.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ProductItemRepository extends JpaRepository<ProductItem, Integer> {

    @Query(
            value = """
                select * from tbl_product_item tpi order by tpi.sell_amount  DESC limit 0, 5;
            """,
            nativeQuery = true
    )
    List<ProductItem> getTopFiveProductItemOfAllTime();

    @Query(
            value = """
                        select * from tbl_product_item tpi  where tpi.created_at BETWEEN :fromDate AND :toDate  order by tpi.quantity  DESC limit 0, 5;   
                    """,
            nativeQuery = true
    )
    List<ProductItem> getTopFiveProductItemOfAllTimeByQuantity(@Param("fromDate") LocalDateTime fromDate, @Param("toDate")LocalDateTime toDate);
}
