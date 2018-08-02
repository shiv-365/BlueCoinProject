package com.zipcoin.config;

import com.zipcoin.model.Transaction;
import com.zipcoin.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TransactionLoader implements ApplicationRunner {

  private TransactionRepository repo;

  @Autowired
  public TransactionLoader(TransactionRepository repo){
      this.repo = repo;
  }


    @Override
    public void run(ApplicationArguments applicationArguments){

        Transaction[] transactions = new Transaction[]{

                new Transaction("shivam", "khalil", 10),
                new Transaction("eric", "shivam", 100),
                new Transaction("khalil", "eric", (float)30.22),
                new Transaction("aleena", "navya", (float)43.32),
                new Transaction("shivam", "ken", 1)
        };




        for(Transaction t : transactions){
            this.repo.save(t);
        }



    }
}
