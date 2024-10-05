package com.enigma.merchant_bank_api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequest {
    private String fromUsername;
    private String toUsername;
    private double amount;
}
