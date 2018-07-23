package com.zipcoin.model;

public class Miner {

    boolean hashCodeCheck = false;

    public Block mine(Block block) {
        while (hashCodeCheck == false) {
            if (block.getCurrentHash().startsWith("0000") == false) {
                block.iterateNonce();
            } else {
                hashCodeCheck = true;
            }
        }
        return block;
    }

    public void setHashCodeCheck(boolean hashCodeCheck) {
        this.hashCodeCheck = hashCodeCheck;
    }

}