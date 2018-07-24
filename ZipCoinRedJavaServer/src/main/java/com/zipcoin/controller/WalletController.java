package com.zipcoin.controller;

import com.zipcoin.model.Wallet;
import com.zipcoin.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
@CrossOrigin(origins = {"http://localhost:8100"})
public class WalletController {

    @Autowired
    private WalletRepository walletRepository;

    //CREATE A WALLET
    @RequestMapping(value = "wallets", method = RequestMethod.POST)
    public Wallet create(@RequestBody Wallet wallet){
        return walletRepository.saveAndFlush(wallet);
    }

//    //READ A WALLET FROM PUBLIC KEY
//    @RequestMapping(value = "wallets/{publicKey}", method = RequestMethod.GET)
//    public Wallet get(@PathVariable String publicKey){
//        return walletRepository.findWalletFromPubKey(publicKey);
//    }
//
//    //READ PUBLIC KEYS FROM ALL WALLETS
//    @RequestMapping(value = "wallets/publicKeys", method = RequestMethod.GET)
//    public List<String> get(){
//        return walletRepository.findAllPublicKeys();
//    }

    //DELETE A WALLET
    @RequestMapping(value = "wallets/{id}", method = RequestMethod.DELETE)
    public Wallet delete(@PathVariable Long id){
        Wallet walletToDelete = walletRepository.findOne(id);
        walletRepository.delete(walletToDelete);
        return walletToDelete;
    }

}
