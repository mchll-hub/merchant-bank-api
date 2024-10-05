package com.enigma.merchant_bank_api.service.impl;

import com.enigma.merchant_bank_api.entity.Customer;
import com.enigma.merchant_bank_api.repository.CustomerRepository;
import com.enigma.merchant_bank_api.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public boolean login(String username, String password) {
        Optional<Customer> customer = customerRepository.findByUsername(username);
        return customer.isPresent() && customer.get().getPassword().equals(password);
    }

    @Override
    public boolean isCustomerRegistered(String username) {
        return customerRepository.findByUsername(username).isPresent();
    }
}
