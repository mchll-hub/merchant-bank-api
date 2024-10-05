package com.enigma.merchant_bank_api.controller;

import com.enigma.merchant_bank_api.dto.request.PaymentRequest;
import com.enigma.merchant_bank_api.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;

    @PostMapping("/payment")
    public ResponseEntity<String> makePayment(@RequestBody PaymentRequest paymentRequest){
        String result = paymentService.processPayment(
                paymentRequest.getFromUsername(),
                paymentRequest.getToUsername(),
                paymentRequest.getAmount()
        );
        if (result.equals("Payment Successful")) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }
}
