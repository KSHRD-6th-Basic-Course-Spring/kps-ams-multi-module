package com.kshrd.repository;

import java.util.List;

import com.kshrd.model.Category;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository {
	
	@Select("SELECT * FROM tb_categories")
	@Results({
		@Result(property="category", column="name")
	})
	public List<Category> findAll();
	
	@Select("SELECT * FROM tb_categories WHERE id=#{id}")
	@Results({
		@Result(property="category", column="name")
	})
	public Category findOne(int id);
	
}
