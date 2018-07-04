package com.kshrd.service.category;

import java.util.List;

import com.kshrd.model.Category;
import com.kshrd.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepo;
	
	public List<Category> findAll() {
		return categoryRepo.findAll();
	}
	
	public Category findOne(int id) {
		return categoryRepo.findOne(id);
	}
	
}
