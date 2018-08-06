package com.zipcoin.repository;

import com.zipcoin.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
    Wallet findWalletByPublicKey(String publicKey);

//    @Query(value = "SELECT publicKey FROM Wallet", nativeQuery = true)
//    Collection<Object[]> findAllPublicKey();
}
