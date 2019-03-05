package com.wf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wf.mapper.CategoryMapper;
import com.wf.pojo.Category;
import com.wf.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryMapper categoryMapper;

	public List<Category> list() {
		// TODO Auto-generated method stub
		return categoryMapper.list();
	}

}
