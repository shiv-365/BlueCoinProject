package com.zipcoin.model;

import java.security.*;

public class Wallet {

    private PrivateKey privateKey;
    private PublicKey publicKey;

    public PrivateKey getPrivateKey() {
        return privateKey;
    }


    public PublicKey getPublicKey() {
        return publicKey;
    }



    public Wallet() {
        generateKeyPair();
    }

    public void generateKeyPair() {
        try {
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance( "DSA","SUN");

            SecureRandom random = SecureRandom.getInstance("SHA1PRNG","SUN");

            // Initialize the key generator and generate a KeyPair
            keyGen.initialize(1024, random);   //256 bytes provides an acceptable security level
            KeyPair keyPair = keyGen.generateKeyPair();
            // Set the public and private keys from the keyPair
            privateKey = keyPair.getPrivate();
            publicKey = keyPair.getPublic();



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
