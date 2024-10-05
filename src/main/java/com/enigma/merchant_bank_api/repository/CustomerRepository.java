package com.enigma.merchant_bank_api.repository;

import com.enigma.merchant_bank_api.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, String> {
    Optional<Customer> findByUsername(String username);
}
