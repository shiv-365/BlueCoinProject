package redCoin.Miner;

import block.Block;
import org.apache.commons.codec.digest.DigestUtils;

public class Miner {

    boolean hashCodeCheck = false;
    Block x = new Block(0);


    public Miner() {

    }

    public static void main(String[] args) {

    }

    public String hash(String stringToHash) {
        String hashedString = DigestUtils.sha256Hex(stringToHash);
        return hashedString;
    }

    public void mine(Block block/* ,  String data    */) {
        x = block;


        while (hashCodeCheck == false) {
            if (x.getCurrentHash().startsWith("0000") == false) {
                x.setNonce(x.getNonce() + 1);
            }
        }
    }
}
