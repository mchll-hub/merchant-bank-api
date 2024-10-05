package com.enigma.merchant_bank_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class LogoutController {
    @PostMapping("/logout")
    public ResponseEntity <String> logout(){
        return ResponseEntity.ok("Logout Successful");
    }
}
