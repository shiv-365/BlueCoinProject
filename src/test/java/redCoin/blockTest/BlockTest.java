package redCoin.blockTest;

import block.Block;
import block.Transaction;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class BlockTest {

    @Test
    public void constructBlockTest(){
        Integer expectedBlockNumber = 1;
        String expectedPreviousHash = "1@a!23jk";
        Block block = new Block(expectedBlockNumber, expectedPreviousHash);
        Integer actualBlockNumber = block.getBlockNumber();
        String actualPreviousHash = block.getPreviousHash();
        assertEquals(expectedBlockNumber,actualBlockNumber);
        assertEquals(expectedPreviousHash, actualPreviousHash);
    }

    @Test
    public void iterateNonceTest(){
        Block block = new Block(1, "1@a!23jk");
        Integer nonce = 100;
        block.setNonce(nonce);
        block.iterateNonce();
        Integer expected = 101;
        Integer actual = block.getNonce();
        assertEquals(expected,actual);
    }

    @Test
    public void setGetNonceTest(){
        Block block = new Block(1, "1@a!23jk");
        Integer expected = 100;
        block.setNonce(expected);
        Integer actual = block.getNonce();
        assertEquals(expected,actual);
    }

    @Test
    public void updateGetCurrentHashTest(){
        Block block = new Block(1, "1@a!23jk");
        String expected = "FF86A94CDA5B17B79A755433D51F50195E4962AE43A59CFDFFBA08E479986DAD";
        block.updateCurrentHash();
        String actual = block.getCurrentHash();
        assertEquals(expected,actual);
    }

    @Test
    public void addGetTransactionTest(){
        Block block = new Block(1, "1@a!23jk");
        Transaction expected = new Transaction();
        block.addTransaction(expected);
        List<Transaction> transactions = block.getTransactions();
        Transaction actual = transactions.get(0);
        assertTrue(expected.equals(actual));
    }

}
