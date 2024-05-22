package com.assignment.Assignment.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.ZonedDateTime;


@Getter
@Setter
@Entity
@Table(name = "tbl_product")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
    private Integer id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "created_at")
    ZonedDateTime createdAt;

    @Column(name = "updated_at")
    ZonedDateTime updatedAt;

    @NotNull
    @Column(name = "base_amount", nullable = false)
    private BigDecimal baseAmount;

    @NotNull
    @Column(name = "sell_amount", nullable = false)
    private BigDecimal sellAmount;
}
