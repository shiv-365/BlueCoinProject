package com.zipcoin.model;

import com.zipcoin.utilities.StringUtil;
import org.apache.commons.codec.digest.DigestUtils;

import javax.persistence.*;

import java.security.*;
import java.util.List;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String transactionId;
    private PublicKey sender;
    private PublicKey reciepient;
    private float amount;

    //@OneToMany
  /*  private List<Integer> coins;*/



    //public Signature signature;
    public Transaction()
    {

    }

    public Transaction(PublicKey from, PublicKey to, float amount/*List<Integer> coins*/) {
        this.sender = from;
        this.reciepient = to;
        this.amount = amount;
        //this.coins=coins;

    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public PublicKey getSender() {
        return sender;
    }

    public void setSender(PublicKey sender) {
        this.sender = sender;
    }

    public PublicKey getReciepient() {
        return reciepient;
    }

    public void setReciepient(PublicKey reciepient) {
        this.reciepient = reciepient;
    }

    public float getAmount() { return amount; }

    public void setAmount(float amount) { this.amount = amount; }

    /*public List<Integer> getCoins() { return coins; }

    public void setCoins(List<Integer> coins) { this.coins = coins; }*/

    private String calulateHash() {

        return DigestUtils.sha256Hex(
                StringUtil.getStringFromKey(sender) +
                        StringUtil.getStringFromKey(reciepient) +
                        Float.toString(amount)
        );
    }
//    public void generateSignature(PrivateKey privateKey) throws NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException {
//        String data = StringUtil.getStringFromKey(sender) + StringUtil.getStringFromKey(reciepient) + Float.toString(value)    ;
//        signature = StringUtil.applyECDSASig(privateKey,data);
//        System.out.println(signature);
//    }
    //Verifies the data we signed hasnt been tampered with
    //public boolean verifiySignature() {
    // String data = StringUtil.getStringFromKey(sender) + StringUtil.getStringFromKey(reciepient) + Float.toString(value)    ;
    // return StringUtil.verifyECDSASig(sender, data, this.signature);
    //}
}