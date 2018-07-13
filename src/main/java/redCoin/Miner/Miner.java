package redCoin.Miner;

import org.apache.commons.codec.digest.DigestUtils;

public class Miner {

    private Integer nonce = 0;

    public Miner(){

    }

    public String hash(String stringToHash) {
        String hashedString = DigestUtils.sha256Hex(stringToHash);
        return hashedString;
    }

    public Integer getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    public Integer mine(String block, String previousHash, String data){
        boolean hashCodeCheck = false;

        while(hashCodeCheck == false){
            String newHash = hash(block + previousHash + data);

            if(newHash.startsWith("0000")){
                hashCodeCheck = true;
            } else{
            nonce++;

            }
        }
        System.out.println(nonce);
        return nonce;
    }
}
