package com.zipcoin.model;

import com.zipcoin.utilities.StringUtil;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.security.*;
import java.util.Random;

@Entity
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublickey() {
        return publickey;
    }

    public void setPublickey(String publickey) {
        this.publickey = publickey;
    }

    private String name;
    private String publickey;
    private Double amount;

    public Wallet()
    {
        generateKeyPair();

    }
    public Wallet(String name,String publickey,double amount)
    {
        this.name=name;
        this.publickey=publickey;
        this.amount=amount;
    }

    public Double getAmount()
    {
        return amount;
    }

    public void setAmount(Double amount)
    {
        this.amount = amount;
    }


    public String getPublicKey()
    {
        return publickey;
    }


    public void generateKeyPair() {
//        try {
//
//            KeyPairGenerator keyGen = KeyPairGenerator.getInstance( "DSA","SUN");
//
//            SecureRandom random = SecureRandom.getInstance("SHA1PRNG","SUN");
//
//            // Initialize the key generator and generate a KeyPair
//            keyGen.initialize(1024, random);   //256 bytes provides an acceptable security level
//            KeyPair keyPair = keyGen.generateKeyPair();
//            // Set the public and private keys from the keyPair
//            privateKey = keyPair.getPrivate();
//            publicKey = keyPair.getPublic();
//
//
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        Random random =new SecureRandom();
        Integer random10digit= random.nextInt(10);
        publickey=random10digit.toString();
    }

}
