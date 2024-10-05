package com.enigma.merchant_bank_api.controller;

import com.enigma.merchant_bank_api.dto.request.LoginRequest;
import com.enigma.merchant_bank_api.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class LoginController {
    private final CustomerService customerService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest){
        if (customerService.login(loginRequest.getUsername(), loginRequest.getPassword())){
            return ResponseEntity.ok("Login Successful");
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credential");
    }

}
