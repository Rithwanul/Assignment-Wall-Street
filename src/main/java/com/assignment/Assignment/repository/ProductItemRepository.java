package com.assignment.Assignment.repository;

import com.assignment.Assignment.entity.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductItemRepository extends JpaRepository<ProductItem, Integer> {

    @Query(
            value = """
                select DISTINCT * from tbl_product_item tpi order by tpi.sell_amount  DESC limit 0, 5;
            """,
            nativeQuery = true
    )
    List<ProductItem> getTopFiveProductItemOfAllTime();
}
