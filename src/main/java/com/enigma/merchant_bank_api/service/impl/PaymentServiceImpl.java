package com.enigma.merchant_bank_api.service.impl;

import com.enigma.merchant_bank_api.entity.Customer;
import com.enigma.merchant_bank_api.repository.CustomerRepository;
import com.enigma.merchant_bank_api.service.CustomerService;
import com.enigma.merchant_bank_api.service.HistoryService;
import com.enigma.merchant_bank_api.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private final CustomerService customerService;
    private final HistoryService historyService;

    @Override
    public String processPayment(String fromUsername, String toUsername, double amount) {
        if (!customerService.isCustomerRegistered(toUsername)){
            return "Recipient customer not registered";
        }

        historyService.logTransaction(fromUsername, toUsername, amount);
        return "Payment successful";
    }
}
