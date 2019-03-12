package com.aebiz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.elasticsearch.action.get.GetRequestBuilder;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.index.query.MatchAllQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.aebiz.Utils.ESHelper;
import com.aebiz.vo.Product;
import com.alibaba.fastjson.JSON;

@Service
public class ProductServiceImpl implements ProductService{

	@Override
	public List<Product> getAllProduct() {
		
		List<Product> list =new ArrayList<>();
		
	SearchRequestBuilder prepareSearch = ESHelper.getESClient().prepareSearch();
		
		prepareSearch.setIndices("lsl_product");
		
		prepareSearch.setTypes("newProduct");
		
		MatchAllQueryBuilder matchAllQuery = QueryBuilders.matchAllQuery();
		
		
		SearchResponse actionGet = prepareSearch.setQuery(matchAllQuery).execute().actionGet();	
		
		SearchHit[] hits = actionGet.getHits().getHits();
		
		for(SearchHit hit :hits){
	
			Product product =new Product();
			Map<String, Object> source = hit.getSource();
			
			String name = source.get("name").toString();
			String description = source.get("description").toString();
			
			String productPrice = source.get("productPrice").toString();
			
			
			String categoryUuid = source.get("categoryUuid").toString();
			
			double productPrice2 = Double.parseDouble(productPrice);
			
			product.setName(name);
			
			product.setCategoryUuid(categoryUuid);
			
			product.setProductPrice(productPrice2);
			
			product.setDescription(description);
			
			product.setId(hit.getId());
			
			if(!StringUtils.isEmpty(source.get("myscore2"))){
				String myscore = source.get("myscore2").toString();

				
				double myscore2 = Double.parseDouble(myscore);

				product.setMyscore2(myscore2);
			}
			else {
				
				product.setMyscore2(0);

				
			}
			
			
			list.add(product);	
			
}
		
		return list;
	}

	@Override
	public Product getByID(String id) {
		Product product =new Product();
		
GetRequestBuilder prepareGet = ESHelper.getESClient().prepareGet("lsl_product", "newProduct", id);
		
		
		GetResponse actionGet = prepareGet.execute().actionGet();
		
		Map<String, Object> source = actionGet.getSource();
		
		
		String name = source.get("name").toString();
		String description = source.get("description").toString();
		
		String productPrice = source.get("productPrice").toString();
		
		
		if(!StringUtils.isEmpty(source.get("myscore2"))){
			String myscore = source.get("myscore2").toString();

			
			double myscore2 = Double.parseDouble(myscore);

			product.setMyscore2(myscore2);
		}
		else {
			
			product.setMyscore2(0);

			
		}
		
		
		
		
		double productPrice2 = Double.parseDouble(productPrice);

		
		product.setName(name);
		
		
		product.setProductPrice(productPrice2);
		
		product.setDescription(description);
		
		product.setId(actionGet.getId());
		
		
		
		
	
		return product;
	}

	@Override
	public void update(Product product) {
		
		
		UpdateRequest updatevalue =new UpdateRequest();
		updatevalue.index("lsl_product");
		
		updatevalue.type("newProduct");
		
		updatevalue.id(product.getId());
	
		
		
		
		

		
		String jsonString = JSON.toJSONString(product);
		
		System.out.println(jsonString);

	
		updatevalue.doc(jsonString)	;	
		
		 
		ESHelper.getESClient().update(updatevalue);
		
		
	}
	
	
}
