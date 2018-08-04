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
    private String sender;
    private String recipient;
    private float amount;
    //@OneToMany
    //private List<Integer> coins;
    //public Signature signature;

    public Transaction() {

    }

    public Transaction(String from, String to, float amount/*,List<Integer> coins*/) {
        this.sender = from;
        this.recipient = to;
        this.amount = amount;
        //this.coins=coins;
    }

    private String calculateHash() {
        return DigestUtils.sha256Hex(sender + recipient + Float.toString(amount));
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