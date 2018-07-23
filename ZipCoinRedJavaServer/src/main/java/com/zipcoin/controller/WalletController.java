package com.zipcoin.controller;

import com.zipcoin.model.Wallet;
import com.zipcoin.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
@CrossOrigin(origins = {"http://localhost:8100"})
public class WalletController {

    @Autowired
    private WalletRepository walletRepository;

    //CREATE
    @RequestMapping(value = "wallets", method = RequestMethod.POST)
    public Wallet create(@RequestBody Wallet wallet){
        return walletRepository.saveAndFlush(wallet);
    }

    //READ
    @RequestMapping(value = "wallets/{id}", method = RequestMethod.GET)
    public Wallet get(@PathVariable Long id){
        return walletRepository.findOne(id);
    }

    //DELETE
    @RequestMapping(value = "wallets/{id}", method = RequestMethod.DELETE)
    public Wallet delete(@PathVariable Long id){
        Wallet walletToDelete = walletRepository.findOne(id);
        walletRepository.delete(walletToDelete);
        return walletToDelete;
    }

}
