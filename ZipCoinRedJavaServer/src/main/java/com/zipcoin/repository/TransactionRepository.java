package com.zipcoin.repository;

import com.zipcoin.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
//simport org.springframework.data.rest.core.annotation.RepositoryRestResource;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
//@RepositoryRestResource(collectionResourceRel = "transactions", path = "transactions")
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

//    @Query("SELECT t FROM transaction t WHERE t.sender = :publicKey OR t.recipient = :publicKey")
//    List<Transaction> findAllTransactionsWithPubKey(@Param("publicKey") String publicKey);

}
