package com.zipcoin.config;

import com.zipcoin.model.Wallet;
import com.zipcoin.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class WalletLoader implements ApplicationRunner {

    private WalletRepository walletRepository;

    @Autowired
    public WalletLoader(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        Wallet[] wallets = new Wallet[]{
                new Wallet("ann","34",80.45),
                new Wallet("sen","3564",8.8)
        };
        for(Wallet wallet :wallets) {
            this.walletRepository.save(wallet);
        }
    }

}

