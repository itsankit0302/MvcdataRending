package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Product;

@Controller
public class DataRenderingController {
	@GetMapping("/report")
	public String showReportData(Map<String, Object> map) {
		// create List of Model class objs as the model attribute
		List<Product> list = List.of();
		map.put("prodList", list);
		// rerturn lvn
		return "show_report";
	}
}
