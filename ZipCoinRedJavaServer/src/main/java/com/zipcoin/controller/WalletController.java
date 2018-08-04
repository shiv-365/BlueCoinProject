package com.zipcoin.controller;

import com.zipcoin.model.Wallet;
import com.zipcoin.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

import static com.zipcoin.config.WalletApis.BASE_WALLET_URL;
import static com.zipcoin.config.WalletApis.GET_ALL_WALLET_PUBLIC_KEYS;
import static com.zipcoin.config.WalletApis.GET_WALLET_BY_PUBLIC_KEY;

@RestController
@CrossOrigin(origins = {"http://localhost:8100"})
public class WalletController {

    private WalletService walletService;

    @Autowired
    public WalletController(WalletService walletService){
        this.walletService = walletService;
    }

    @PostMapping(path = BASE_WALLET_URL)
    public Wallet createWallet(@RequestBody Wallet wallet){
        return walletService.createWallet(wallet);
    }

    @GetMapping(path = BASE_WALLET_URL)
    public Collection<Wallet> getAllWallets() {
        return walletService.getAllWallets();
    }

    @GetMapping(path = GET_WALLET_BY_PUBLIC_KEY)
    public Wallet getWalletByPublicKey(@PathVariable String publicKey){
        return walletService.getWalletByPublicKey(publicKey);
    }

//    @GetMapping(path = GET_ALL_WALLET_PUBLIC_KEYS)
//    public Collection<Object[]> getAllPublicKeys(){
//        return walletService.getAllPublicKeys();
//    }

}
