package block;

import java.util.LinkedList;
import java.util.List;

public class Block {

    private Integer blockNumber;
    private String previousHash;
    private Integer nonce;
    private String currentHash;
    private List<Transaction> transactionList;

    public Block(Integer blockNumber, String previousHash){
        this.blockNumber = blockNumber;
        this.previousHash = previousHash;
        transactionList = new LinkedList<Transaction>();
        nonce = 1;
    }

    public Integer getBlockNumber() {
        return blockNumber;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setNonce(Integer nonce) {
        this.nonce = nonce;
    }

    public void iterateNonce() {
        nonce ++;
    }

    public Integer getNonce() {
        return nonce;
    }

    public void updateCurrentHash() {

    }

    public String getCurrentHash() {
        return currentHash;
    }

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return transactionList;
    }
}
