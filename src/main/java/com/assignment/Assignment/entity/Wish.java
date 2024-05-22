package com.assignment.Assignment.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "tbl_wish")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Wish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wish_id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "amount", nullable = false, precision = 38, scale = 2)
    private BigDecimal amount;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @Size(max = 100)
    @Column(name = "product_item_id", length = 100)
    private Integer productItemId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_wish_id", referencedColumnName = "wish_id")
    @ToString.Exclude
    @Builder.Default
    private List<ProductItem> productItems = new ArrayList<>();

}
