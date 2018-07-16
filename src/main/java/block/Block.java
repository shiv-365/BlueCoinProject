package block;

import org.apache.commons.codec.digest.DigestUtils;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

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
    private List<Transaction> transactionList;

    public Block(Integer blockNumber, String previousHash){
        this.blockNumber = blockNumber;
        this.previousHash = previousHash;
        transactionList = new LinkedList<Transaction>();
        nonce = 0;
    }

    public Block(Integer blockNumber){
        this.blockNumber = blockNumber;
        transactionList = new LinkedList<Transaction>();
        nonce=0;
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
        String transactionListString = transactionList.toString().replace("[","").replace("]","");
        String text = (blockNumber.toString() + nonce.toString() + transactionListString + previousHash);
        currentHash = DigestUtils.sha256Hex(text).toUpperCase();
    }

    public String getCurrentHash() {
        updateCurrentHash();
        return currentHash;
    }

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    public List<Transaction> getTransactions() {
        if(transactionList.size()==0){
            return null;
        }
        return transactionList;
    }
}
