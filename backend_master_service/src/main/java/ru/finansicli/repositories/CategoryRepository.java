package ru.finansicli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.finansicli.models.Category;


@Repository
public interface CategoryRepository extends JpaRepository <Category, Long> {
}
