package com.zipcoin.model;

import com.zipcoin.utilities.StringUtil;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.security.*;
import java.util.Random;

@Entity
@Getter @Setter
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String publicKey;
    private Double amount;

    public Wallet() {
        generateKeyPair();
    }

    public Wallet(String name, String publicKey, Double amount) {
        this.name=name;
        this.publicKey=publicKey;
        this.amount=amount;
    }

    public String getPublicKey(){
        return publicKey;
    }

    public Double getAmount(){
        return amount;
    }

    public void setAmount(Double amount){
        this.amount = amount;
    }

    public void generateKeyPair() {
        Random random =new SecureRandom();
        Integer random10digit= random.nextInt(10);
        publicKey=random10digit.toString();
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
    }

}