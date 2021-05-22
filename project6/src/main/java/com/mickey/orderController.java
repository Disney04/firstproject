package com.mickey;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class orderController {

	@Autowired
	private jpaRepository22 jpa22;
	@Autowired
	private repository22 jpa;
	
	@RequestMapping("/order")
	public String order(Model model)
	{
	
		Sort sort = Sort.by("total").descending();
		Pageable page = PageRequest.of(0, 10,sort);
		Page pagedata = jpa22.findAll(page);
		List<packege> list2 = pagedata.toList();
		
		System.out.println("check list2"+list2);
		model.addAttribute("sorting", list2);
		
		return "order";
		
	}
}
