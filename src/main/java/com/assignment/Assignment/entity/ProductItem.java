package com.assignment.Assignment.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;


@Getter
@Setter
@Entity
@Table(name = "tbl_product_item")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_item_id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "product_item_name", nullable = false)
    private String productItemName;


    @NotNull
    @Column(name = "base_amount", nullable = false, precision = 38, scale = 2)
    private BigDecimal baseAmount;

    @NotNull
    @Column(name = "sell_amount", nullable = false, precision = 38, scale = 2)
    private BigDecimal sellAmount;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;


}
