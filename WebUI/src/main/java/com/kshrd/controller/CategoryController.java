package com.kshrd.controller;

import com.kshrd.model.Category;
import com.kshrd.repository.CategoryRepository;
import com.kshrd.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    @ResponseBody
    public List<Category> categories() {
        return categoryService.findAll();
    }

}
