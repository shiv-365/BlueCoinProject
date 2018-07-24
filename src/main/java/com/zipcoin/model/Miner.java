package com.zipcoin.model;


public class Miner {
    boolean hashCodeCheck = false;
    Chain chain = new Chain();

    public void setHashCodeCheck(boolean hashCodeCheck) {
        this.hashCodeCheck = hashCodeCheck;
    }

    public boolean getHashCodeCheck() {
        return hashCodeCheck;
    }


    public void mine(Block block) {

        while (hashCodeCheck == false) {
            if (block.getCurrentHash().startsWith("0000") == false) {
                block.iterateNonce();
            } else {
                hashCodeCheck = true;
                //chain.addBlock(block);    Why doesn't this line of code work?
            }
        }
    }

}