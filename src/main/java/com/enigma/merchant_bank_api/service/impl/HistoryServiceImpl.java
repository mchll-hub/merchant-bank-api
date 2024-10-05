package com.enigma.merchant_bank_api.service.impl;

import com.enigma.merchant_bank_api.entity.Transaction;
import com.enigma.merchant_bank_api.service.HistoryService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class HistoryServiceImpl implements HistoryService {
    private List<Transaction> transactionHistory = new ArrayList<>();

    @Override
    public void logTransaction(String from, String to, double amount) {
        Transaction transaction = new Transaction(from, to, amount, LocalDateTime.now());
        transactionHistory.add(transaction);
        writeHistoryToFile();
    }

    private void writeHistoryToFile(){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("src/main/resources/history.json"), transactionHistory);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
