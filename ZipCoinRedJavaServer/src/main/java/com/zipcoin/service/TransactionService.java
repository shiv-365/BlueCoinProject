package com.zipcoin.service;

import com.zipcoin.model.Transaction;
import com.zipcoin.model.Wallet;
import com.zipcoin.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TransactionService {

    private TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository){
        this.transactionRepository = transactionRepository;
    }

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.saveAndFlush(transaction);
    }

    public Collection<Transaction> getAllTransactions(){
        return transactionRepository.findAll();
    }

    public Collection<Transaction> getTransactionsByPublicKey(String publicKey) {
        return transactionRepository.findTransactionBySenderOrRecipient(publicKey, publicKey);
    }
}
