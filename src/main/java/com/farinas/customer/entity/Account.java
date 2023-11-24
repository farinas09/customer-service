package com.farinas.customer.repository.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name="account_number")
    private String accountNumber;
    private String type;
    @Column(name="initial_balance")
    private BigDecimal initialBalance = BigDecimal.ZERO;
    private String status;

    // Getters y setters
}