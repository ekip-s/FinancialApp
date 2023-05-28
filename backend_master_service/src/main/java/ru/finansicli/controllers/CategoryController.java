package ru.finansicli.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.finansicli.models.Category;
import ru.finansicli.services.CategoryService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    @GetMapping
    public Category getCategoryById(@RequestParam Long id) {
        return categoryService.getCategoryById(id);
    }

    @GetMapping("/list")
    public List<Category> getCategoryList() {
        return categoryService.getCategoryList();
    }

    @PatchMapping
    public Category setCategoryName(@RequestParam String name, @RequestParam Long id) {
        return categoryService.setCategoryName(name, id);
    }

    @DeleteMapping
    public void deleteCategory(@RequestParam Long id) {
        categoryService.deleteCategory(id);
    }
}
