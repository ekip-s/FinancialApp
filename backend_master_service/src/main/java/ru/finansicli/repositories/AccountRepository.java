package ru.finansicli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.finansicli.models.Account;

@Repository
public interface AccountRepository extends JpaRepository <Account, Long> {
}
