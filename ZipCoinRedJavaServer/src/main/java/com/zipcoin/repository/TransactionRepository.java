package com.zipcoin.repository;

import com.zipcoin.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
//simport org.springframework.data.rest.core.annotation.RepositoryRestResource;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;



@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    Collection<Transaction> findTransactionBySenderPublicKeyOrRecipientPublicKey(String senderPublicKey, String recipientPublicKey);
}
