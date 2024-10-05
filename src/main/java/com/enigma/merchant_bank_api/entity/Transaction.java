package com.enigma.merchant_bank_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column
    private String from;
    @Column
    private String to;
    @Column
    private double amount;
    @Column
    private LocalDateTime timestamp;

    public Transaction(String from, String to, double amount, LocalDateTime timestamp) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.timestamp = timestamp;
    }
}
