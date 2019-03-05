package com.wf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wf.pojo.Category;
import com.wf.service.CategoryService;

@Controller
@RequestMapping("")
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("listCategory")
	public ModelAndView listCategory() {
		ModelAndView mav =new ModelAndView();
		List<Category> cs = categoryService.list();
		
		mav.addObject("cs",cs);
		mav.setViewName("listCategory");
		return mav;
	}

}
