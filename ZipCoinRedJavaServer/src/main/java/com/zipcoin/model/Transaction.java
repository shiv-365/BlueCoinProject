package com.zipcoin.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.codec.digest.DigestUtils;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionId;
    private String senderPublicKey;
    private String recipientPublicKey;
    private String transactionHash;
    private Double amount;
    //@OneToMany
    //private List<Integer> coins;
    //public Signature signature;

    public Transaction(){

    }

    public Transaction(String senderPublicKey, String recipientPublicKey, Double amount){
        this.senderPublicKey = senderPublicKey;
        this.recipientPublicKey = recipientPublicKey;
        this.amount = amount;

    }

    public String getSenderPublicKey() {
        return senderPublicKey;
    }

    public String getRecipientPublicKey() {
        return recipientPublicKey;
    }

    public Double getAmount() {
        return amount;
    }

    public void calculateAndSetHash() {
        String transactionHash = DigestUtils.sha256Hex(senderPublicKey + recipientPublicKey + Double.toString(amount));
        setTransactionHash(transactionHash);
    }

    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
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