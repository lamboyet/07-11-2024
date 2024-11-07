package com.sebi.gogu.service;

import com.sebi.gogu.entity.Category;
import com.sebi.gogu.repository.CategoryRepository;

import java.util.List;

public class CategoryService {
    private CategoryRepository categoryRepository;

    public List<Category> findAll()
    {
        return categoryRepository.findAll();
    }

    public Category findCategoryById(Long id)
    {
        Category category = categoryRepository.findById(id).orElseThrow(()-> new RuntimeException("Category not found"));
        return category;
    }

    public void createCategory(Category category)
    {
        categoryRepository.save(category);
    }

    public void updateCategory(Category category)
    {
        categoryRepository.save(category);
    }

    public void deleteCategory(Long id)
    {
        Category category = categoryRepository.findById(id).orElseThrow(()-> new RuntimeException("Category not found"));
        categoryRepository.deleteById(category.getId());
    }

}
