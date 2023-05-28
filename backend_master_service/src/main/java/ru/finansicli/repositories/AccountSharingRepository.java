package ru.finansicli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.finansicli.models.AccountSharing;


@Repository
public interface AccountSharingRepository extends JpaRepository <AccountSharing, Long> {
}
