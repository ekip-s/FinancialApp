package ru.finansicli.services;

import org.springframework.stereotype.Service;
import ru.finansicli.models.Category;

import java.util.List;

@Service
public interface CategoryService {

    Category createCategory(Category category);
    Category getCategoryById(long id);
    List<Category> getCategoryList();
    Category setCategoryName(String name, long id);
    void deleteCategory(long id);
}
