package com.enigma.merchant_bank_api.service;

public interface PaymentService {
    String processPayment(String fromUsername, String toUsername, double amount);
}
