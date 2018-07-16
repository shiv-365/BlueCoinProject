package com.zipcoin.model;

import org.apache.commons.codec.digest.DigestUtils;

public class Miner {

    boolean hashCodeCheck = false;

    public void mine(Block block) {
        while (hashCodeCheck == false) {
            if (block.getCurrentHash().startsWith("0000") == false) {
                block.iterateNonce();
            } else {
                hashCodeCheck = true;
            }
        }
    }

    public void setHashCodeCheck(boolean hashCodeCheck) {
        this.hashCodeCheck = hashCodeCheck;
    }

}