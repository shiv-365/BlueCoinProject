package redCoin;

import org.apache.commons.codec.digest.DigestUtils;

public class Main {


    public static void main(String[] args) {

        Main test = new Main();
        Thread t1 = new Thread();
        Thread t2 = new Thread();

        //System.out.println(test.hash("i"));
        t1.start();
        t2.start();
        System.out.println(test.mine("109875890","shivameindslnadgckgvkvskJNf","ken -> shiv9999999999 3030"));

    }

    private Integer nonce = 0;


    public String hash(String stringToHash) {
        String hashedString = DigestUtils.sha256Hex(stringToHash);

        return hashedString;
    }

    public Integer mine(String block, String previousHash, String data){
        boolean hashCodeCheck = false;


        while(hashCodeCheck == false){
            String newHash = hash(block + previousHash + data + nonce.toString());
            System.out.println(newHash);
            if(newHash.startsWith("000012f")){

                hashCodeCheck = true;
            } else{

                nonce++;

            }
        }
        System.out.println(nonce);
        return nonce;
    }


}
