package com.zipcoin.redCoin.chain.test;

import com.zipcoin.model.Block;
import com.zipcoin.model.Chain;
import com.zipcoin.utilities.Miner;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class chainTest {
    Block block = new Block(0);
    Chain chain = new Chain();
    Miner miner = new Miner();

    @Test
    public void testAdd_Block_To_Blockchain(){

        int x = chain.blockchain.size();
        miner.mine(block);
        chain.addBlock(block);
        int y = chain.blockchain.size();

        Assert.assertTrue(x == 0);
        Assert.assertTrue(y == 1);
    }

}
