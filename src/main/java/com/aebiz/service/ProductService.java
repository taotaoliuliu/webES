package com.aebiz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.elasticsearch.search.SearchHit;

import com.aebiz.vo.FrontCategoryPropertyValue;
import com.aebiz.vo.Product;

public interface ProductService {

	List<Product> getAllProduct();

	Product getByID(String id);

	void update(Product product);



	
	
	
	
}
