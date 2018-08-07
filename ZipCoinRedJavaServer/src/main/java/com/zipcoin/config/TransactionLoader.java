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
              new Transaction("shivam", "khalil", (double) 10f),
              new Transaction("eric", "shivam", (double) 100.34f),
              new Transaction("khalil", "eric", (double) 30.000),
              new Transaction("aleena", "navya", (double) 43.32),
              new Transaction("shivam", "ken", (double) 1f)
      };

      for(Transaction t : transactions){
          this.repo.save(t);
      }
  }
}
