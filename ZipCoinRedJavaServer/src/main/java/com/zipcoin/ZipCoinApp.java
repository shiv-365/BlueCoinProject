package com.zipcoin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZipCoinApp {

    public static void main(String[] args){
        SpringApplication.run(ZipCoinApp.class, args);
    }

}



/*
*
*
*
* figure out how to send serialized coins
* tabbed interface
* :payment,wallet, transaction
* :blocks - show all blocks on chain
* LocalDate for transactions, /wallet/getID
* coin ONLY, coin objects, hashcoded. talk to yauheni about this.
* List<Coin> of coins
*
*
*
* springboot run on hiroku ************
*
*
*
* @return coin with serialized number
*
* */