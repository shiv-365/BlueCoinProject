package com.zipcoin.model;

import java.util.ArrayList;

public class Chain {

    Block block = new Block(0);
    public ArrayList<Block> blockchain = new ArrayList<Block>();

    public Chain(){

    }

    public void addBlock(Block block){
        blockchain.add(block);
    }

    public void hasBeenMined(Block block){
        if (block.getCurrentHash().startsWith("0000")){
            addBlock(block);
        }
    }

}
