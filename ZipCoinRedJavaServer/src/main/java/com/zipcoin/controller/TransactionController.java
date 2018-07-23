package com.zipcoin.controller;

import com.zipcoin.model.Transaction;
import com.zipcoin.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
@CrossOrigin(origins = {"http://localhost:8100"})
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    //CREATE A TRANSACTION
    @RequestMapping(value = "transactions", method = RequestMethod.POST)
    public Transaction create(@RequestBody Transaction transaction){
        return transactionRepository.saveAndFlush(transaction);
    }

    //READ-ALL TRANSACTIONS
    @RequestMapping(value = "transactions", method = RequestMethod.GET)
    public List<Transaction> get(){
        return transactionRepository.findAll();
    }

    //READ TRANSACTIONS TO OR FROM A PUBLIC KEY
    @RequestMapping(value = "transactions{publicKey}", method = RequestMethod.GET)
    public List<Transaction> get(@PathVariable String publicKey){
        return transactionRepository.findAllTransactionsWithPubKey(publicKey);
    }

    //DELETE A TRANSACTION
    @RequestMapping(value = "transactions/{id}", method = RequestMethod.DELETE)
    public Transaction delete(@PathVariable Long id){
        Transaction transactionToDelete = transactionRepository.findOne(id);
        transactionRepository.delete(transactionToDelete);
        return transactionToDelete;
    }

}
