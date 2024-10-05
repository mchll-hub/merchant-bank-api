package com.enigma.merchant_bank_api.service;

public interface HistoryService {
    void logTransaction(String from, String to, double amount);
}
