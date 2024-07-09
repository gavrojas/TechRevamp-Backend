package com.techrevamp.models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
//@Data engloba todo lo que necesitamos en un models
@Data
@Entity
@Table(name = "shopping_carts")
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User userId;

    @Column(name = "creation_date", nullable = false)
    private Timestamp creationDate;
}