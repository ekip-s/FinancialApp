package ru.finansicli.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.finansicli.exception.NotFoundException;
import ru.finansicli.models.Category;
import ru.finansicli.repositories.CategoryRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    @Transactional
    public Category createCategory(Category category) {
        return categoryRepository.save(category.setParameters());
    }

    @Override
    public Category getCategoryById(long id) {
        return categoryRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Такой категории нет!"));
    }

    @Override
    public List<Category> getCategoryList() {
        return categoryRepository.findAll(); // нужно будет добавить пагинацию и фильтрацию
    }

    @Override
    @Transactional
    public Category setCategoryName(String name, long id) {
        return categoryRepository
                .save(getCategoryById(id).setCategoryName(name));
    }

    @Override
    @Transactional
    public void deleteCategory(long id) {
        categoryRepository.deleteById(id);
    }
}
