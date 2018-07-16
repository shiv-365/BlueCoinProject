package redCoin;

import block.Block;
import chain.Chain;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class chainTest {
    Block block = new Block(0);
    Chain chain = new Chain();
    //Miner miner = new Miner();

    ArrayList<Block> blockchain = new ArrayList<Block>();

    @Test
    public void testAdd_Block_To_Blockchain(){

        int x = blockchain.size();


        Assert.assertTrue(x == 0);
    }

}
