package com.zipcoin.service;

import com.zipcoin.model.Transaction;
import com.zipcoin.model.Wallet;
import com.zipcoin.repository.TransactionRepository;
import com.zipcoin.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TransactionService {

    private TransactionRepository transactionRepository;
    private WalletRepository walletRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository, WalletRepository walletRepository){
        this.transactionRepository = transactionRepository;
        this.walletRepository = walletRepository;
    }

    public Transaction createTransaction(Transaction transaction) {
        Wallet sending = walletRepository.findWalletByPublicKey(transaction.getSenderPublicKey());
        Wallet receiving = walletRepository.findWalletByPublicKey(transaction.getRecipientPublicKey());

        sending.setAmount(sending.getAmount() - transaction.getAmount());
        receiving.setAmount(receiving.getAmount() + transaction.getAmount());

        walletRepository.save(sending);
        walletRepository.save(receiving);

        transaction.calculateAndSetHash();
        return transactionRepository.save(transaction);
    }

    public Collection<Transaction> getAllTransactions(){
        return transactionRepository.findAll();
    }

    public Collection<Transaction> getTransactionsByPublicKey(String publicKey) {
        return transactionRepository.findTransactionBySenderPublicKeyOrRecipientPublicKey(publicKey, publicKey);
    }



}
