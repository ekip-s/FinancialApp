package ru.finansicli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.finansicli.models.Transaction;


@Repository
public interface TransactionRepository extends JpaRepository <Transaction, Long> {
}
