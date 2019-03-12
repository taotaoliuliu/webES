package com.aebiz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.elasticsearch.search.SearchHit;

import com.aebiz.vo.FrontCategoryPropertyValue;
import com.aebiz.vo.Product;

public interface KeyWordService {

	void addData(String key);

	void updateData(String key);

	String getHH();

	ArrayList<Map<String, String>> getListKeyword(String key);

	List<Product> searchProduct(String key,Map<String, String[]> map);
	
	List<FrontCategoryPropertyValue> searchFrontCategoryPropertyTemplate(String key);

	List<FrontCategoryPropertyValue> searchFrontCategoryPropertyTemplate2(Product product);	
	
	

	
	
	
	
}
