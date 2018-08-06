package com.zipcoin.controller;

import com.zipcoin.model.Transaction;
import com.zipcoin.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

import static com.zipcoin.config.TransactionApis.BASE_TRANSACTION_URL;
import static com.zipcoin.config.TransactionApis.GET_TRANSACTIONS_BY_PUBLIC_KEY;

@RestController
@CrossOrigin(origins = {"http://localhost:8100"})
public class TransactionController {

    private TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService){
        this.transactionService = transactionService;
    }

    @PostMapping(path = BASE_TRANSACTION_URL)
    public Transaction createTransaction(@RequestBody Transaction transaction){
        return transactionService.createTransaction(transaction);
    }

    @GetMapping(path = BASE_TRANSACTION_URL)
    public Collection<Transaction> getAllTransactions(){
        return transactionService.getAllTransactions();
    }

    @GetMapping(path = GET_TRANSACTIONS_BY_PUBLIC_KEY)
    public Collection<Transaction> getTransactionByPublicKey(@PathVariable String publicKey){
        return transactionService.getTransactionsByPublicKey(publicKey);
    }

}