package com.zipcoin.model;

import org.apache.commons.codec.digest.DigestUtils;

import javax.persistence.*;

@Entity
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BLOCK_ID")
    private Long id;
    private Integer blockNumber;
    private String previousHash;
    private Integer nonce;
    private String currentHash;
    String transactionList;

    public Block(Integer blockNumber, String previousHash){
        this.blockNumber = blockNumber;
        this.previousHash = previousHash;
        transactionList = "";
        nonce = 0;
    }

    public Block(Integer blockNumber){
        this.blockNumber = blockNumber;
        transactionList = "";
        nonce=0;
    }

    public Long getId() {
        return id;
    }

    public void setBlockNumber(Integer blockNumber) {
        this.blockNumber = blockNumber;
    }

    public Integer getBlockNumber() {
        return blockNumber;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setNonce(Integer nonce) {
        this.nonce = nonce;
    }

    public void iterateNonce() {
        this.nonce ++;
    }

    public Integer getNonce() {
        return nonce;
    }

    private void updateCurrentHash() {
//        String transactionListString = transactionList.replace("[","").replace("]","");
//        String text = (blockNumber.toString() + nonce.toString() + transactionListString + previousHash);
        String text = (blockNumber.toString() + nonce.toString() + transactionList + previousHash);
        currentHash = DigestUtils.sha256Hex(text).toUpperCase();
    }

    public String getCurrentHash() {
        updateCurrentHash();
        return currentHash;
    }

    public String getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(String transactionList) {
        this.transactionList = transactionList;
    }

    //    public void addTransaction(Transaction transaction) {
//        transactionList.add(transaction);
//    }
//
//    public List<Transaction> getTransactions() {
//        if(transactionList.size()==0){
//            return null;
//        }
//        return transactionList;
//    }
}
