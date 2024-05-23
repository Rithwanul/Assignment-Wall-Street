package com.assignment.Assignment.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Getter
@Setter
@Entity
@Table(name = "tbl_product_item_origin")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductItemOrigin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_item_origin_id", nullable = false)
    private Integer id;

    @Column(name = "product_item_origin_name")
    private String productName;

    @Column(name = "created_at")
    LocalDateTime createdAt;

    @Column(name = "updated_at")
    LocalDateTime updatedAt;

    @NotNull
    @Column(name = "base_amount", nullable = false)
    private BigDecimal baseAmount;

    @NotNull
    @Column(name = "sell_amount", nullable = false)
    private BigDecimal sellAmount;
}
