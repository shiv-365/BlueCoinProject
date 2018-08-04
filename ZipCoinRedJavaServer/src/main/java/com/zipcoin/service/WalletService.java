package com.zipcoin.service;

import com.zipcoin.model.Wallet;
import com.zipcoin.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class WalletService {

    private WalletRepository walletRepository;

    @Autowired
    public WalletService(WalletRepository walletRepository){
        this.walletRepository = walletRepository;
    }

    public Wallet createWallet(Wallet wallet) {
        return walletRepository.saveAndFlush(wallet);
    }

    public Collection<Wallet> getAllWallets() {
        return walletRepository.findAll();
    }

    public Wallet getWalletByPublicKey(String publicKey) {
        return walletRepository.findWalletByPublicKey(publicKey);
    }

    public Collection<String> getAllPublicKeys() {
        return walletRepository.findAllPublicKeys();
    }

}
