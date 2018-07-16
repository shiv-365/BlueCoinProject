package redCoin;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class testMain {

    @Test
    public void hash(){
        Main main = new Main();
        String stringToHash = "this is a test hash";
        String expected = DigestUtils.sha256Hex(stringToHash);

        String actual = main.hash(stringToHash);
        assertEquals(expected,actual);
    }

    @Test
    public void testMineBoolean(){
        Main main = new Main();
        String previousHash = "hash1";
        String block = "block1";
        String dataToCrypt = "shivam -> eric 200, eric -> khalil 203";

        String toHash = main.hash(previousHash+block+dataToCrypt);


    }



}
