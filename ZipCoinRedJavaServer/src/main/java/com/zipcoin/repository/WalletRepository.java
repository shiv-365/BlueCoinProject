package com.zipcoin.repository;

import com.zipcoin.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WalletRepository extends JpaRepository<Wallet, Long> {

//    @Query("SELECT w FROM wallet w WHERE w.publicKey = :publicKey")
//    Wallet findWalletFromPubKey(@Param("publicKey") String publicKey);
//
//    @Query("SELECT w.publicKey FROM wallet")
//    List<String> findAllPublicKeys();

}
