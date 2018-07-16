package redCoin.Miner;

import jdk.nashorn.internal.ir.Block;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Assert;
import org.junit.Test;
import redCoin.Miner.Miner;

public class minerTest {

    //Block block = new Block();
    Miner miner = new Miner();

    @Test
    public void testGetSetNonce(){

        miner.setNonce(0);
        Integer actual = miner.getNonce();
        Integer expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hash(){
        Miner mine = new Miner();
        String stringToHash = "this is a test hash";
        String expected = DigestUtils.sha256Hex(stringToHash);
        String actual = mine.hash(stringToHash);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCompare_Hash_False(){
        miner.setNonce(0);

        String actual = miner.hash("FedEx867 is great!");

        Assert.assertFalse(miner.hash(miner.getNonce().toString()).startsWith("0000"));
    }

    @Test
    public void testCompare_Hash_True(){
        miner.setNonce(0);

        String actual = miner.hash("FedEx867 is great!");

        Assert.assertTrue(miner.hash(miner.getNonce().toString()).startsWith("0000"));
    }

    @Test
    public void testMine(){

    }

}
