package com.farinas.customer.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Movement")
public class Movement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime date;
    private String type;
    private Double amount;
    private Double balance;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    // Getters y setters

}