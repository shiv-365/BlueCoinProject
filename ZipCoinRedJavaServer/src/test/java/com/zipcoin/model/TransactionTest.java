package com.zipcoin.model;

import com.zipcoin.repository.TransactionRepository;
import com.zipcoin.utilities.MerkelTreeRoot;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class TransactionTest {

    @Resource
    TransactionRepository repo;

    @Test
    public void getTransactionId() {
    }

    @Test
    public void setTransactionId() {
    }

    @Test
    public void getSender() {
    }

    @Test
    public void setSender() {
    }

    @Test
    public void getRecipient() {
    }

    @Test
    public void setRecipient() {
    }

    @Test
    public void getAmount() {
    }

    @Test
    public void setAmount() {
    }

    @Test
    public void testHashing() {

        Iterable<Transaction> listOfTs = repo.findAll();
        for (Transaction t : listOfTs) {
            System.out.println(t.toString());
        }
    }
}