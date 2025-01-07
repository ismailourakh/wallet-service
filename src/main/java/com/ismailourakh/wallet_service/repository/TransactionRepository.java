package com.ismailourakh.wallet_service.repository;

import com.ismailourakh.wallet_service.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
    List<Transaction> findByWalletId(UUID walletId);
}
