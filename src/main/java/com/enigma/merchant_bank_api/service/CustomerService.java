package com.enigma.merchant_bank_api.service;

public interface CustomerService {
    boolean login(String username, String password);
    boolean isCustomerRegistered(String username);
}
