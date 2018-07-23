package com.zipcoin.Wallet;

import java.security.*;

public class StringUtil {

    public static Signature applyECDSASig(PrivateKey privateKey, String input) throws  NoSuchAlgorithmException, InvalidKeyException {

        Signature signature=Signature.getInstance("DSA");
        signature.initSign(privateKey);

        return signature;
    }

    //Verifies a String signature
    public static boolean verifyECDSASig(PublicKey publicKey, String data, byte[] signature) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        try {
            Signature ecdsaVerify = Signature.getInstance("sha256withrsa");
            ecdsaVerify.initVerify(publicKey);
            ecdsaVerify.update(data.getBytes());
            return ecdsaVerify.verify(signature);
        }catch(Exception e) {
            //e.printStackTrace();
            throw new RuntimeException(e);

        }
        /*Signature signature1=Signature.getInstance("DSA");
        signature1.initVerify(publicKey);
        signature1.update(data.getBytes());
        return signature1.verify(signature);*/
    }


    public static String getStringFromKey(PublicKey input) {
        return input.toString();
    }
}