package com.zipcoin.controller;

import com.zipcoin.model.Wallet;
import com.zipcoin.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("api/v1/")
@CrossOrigin(origins = {"http://localhost:8100"})
public class WalletController {

    private WalletService walletService;

    @Autowired
    public WalletController(WalletService walletService){
        this.walletService = walletService;
    }

    @PostMapping(path = "wallets")
    public Wallet createWallet(@RequestBody Wallet wallet){
        return walletService.createWallet(wallet);
    }

    @GetMapping(path = "wallets")
    public Collection<Wallet> getAllWallets() {
        return walletService.getAllWallets();
    }

    @GetMapping(path = "wallets/{publicKey}")
    public Wallet getWalletByPublicKey(@PathVariable String publicKey){
        return walletService.getWalletByPublicKey(publicKey);
    }

    @GetMapping(value = "wallets/publicKeys")
    public Collection<String> getAllPublicKeys(){
        return walletService.getAllPublicKeys();
    }

}
