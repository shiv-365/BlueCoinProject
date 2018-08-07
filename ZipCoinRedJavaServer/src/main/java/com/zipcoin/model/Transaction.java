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
    // private String transactionId;
    private Wallet sender;
    private Wallet recipient;
    private int transactionHash;
    //    private String sender;
//    private String recipient;
    private Float amount;
    //@OneToMany
    //private List<Integer> coins;
    //public Signature signature;

//    public Transaction(String from, String to, float amount/*,List<Integer> coins*/) {
//        this.sender = from;
//        this.recipient = to;
//        this.amount = amount;
//        //this.coins=coins;
//    }

    public Transaction(){

    }

    public Transaction(Wallet sender, Wallet recipient, Float amount){
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
        this.transactionHash = (sender.toString() + recipient.toString() + amount.toString()).hashCode();

    }

    public void transact(Wallet sender, Wallet recipient, Float amount){
        new Transaction(sender, recipient, amount);

        sender.setAmount(sender.getAmount() - amount);
        recipient.setAmount(recipient.getAmount() + amount);
    }


































//
//    private String calculateHash() {
//        return DigestUtils.sha256Hex(sender + recipient + Float.toString(amount));
//    }

    //Above commented out by Ken

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