package com.aebiz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aebiz.service.KeyWordService;
import com.aebiz.service.ProductService;
import com.aebiz.vo.FrontCategoryPropertyValue;
import com.aebiz.vo.Product;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("product")
public class ProductController {

	@Resource
	private ProductService productService;

	@RequestMapping("listProduct")
	public String listProduct(Model model, HttpServletRequest request) {

		List<Product> list = productService.getAllProduct();

		model.addAttribute("list", list);

		return "listProduct";
	}
		
	
	@RequestMapping("editProductUI")
	public String editProductUI(Model model, String id) {

		Product product = productService.getByID(id);

		model.addAttribute("product", product);

		return "editProductUI";
	}

	@RequestMapping("editProduct")
	public String editProduct(Product product) {

		productService.update(product);

		return "redirect:/product/listProduct";
	}

}
