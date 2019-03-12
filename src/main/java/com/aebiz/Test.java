package com.aebiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.NestedQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aebiz.Utils.ESHelper;
import com.aebiz.dao.KeyWordDao;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor;

public class Test {

	public static void main(String[] args) {
		
		
		
		 ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
					"applicationContext.xml");
		 
		 
		 
		 
		 
		 KeyWordDao bean = ctx.getBean(KeyWordDao.class);
		 
		/* 
		 SearchHit[] hits = bean.searchFrontCategoryPropertyTemplate("手机");*/
		 
		 Map<String, String[]> map =new HashMap<>();
		 
		 String[] s={"16"};
		 
		 map.put("memory", s);
		 
		 String key ="手机";
		 
		 
		 
			BoolQueryBuilder boolQuery = QueryBuilders.boolQuery();
			
			
			NestedQueryBuilder nestedQuery = QueryBuilders.nestedQuery("productExtend", boolQuery);
			
		Iterator<String> iterator = map.keySet().iterator();
			
			
			while(iterator.hasNext()){   
				
				String next = iterator.next();
				
				String mykey="productExtend."+next.trim();
				
				String[] strings = map.get(next.trim());
				
				boolQuery.must(QueryBuilders.matchQuery(mykey, strings[0].trim()));
				
					
			}   
				
	
			
	SearchRequestBuilder prepareSearch = ESHelper.getESClient().prepareSearch();
			
			prepareSearch.setIndices("lsl_product");
			
			prepareSearch.setTypes("newProduct");
			
			MatchQueryBuilder matchQuery = QueryBuilders.matchQuery("name", key);
			MatchQueryBuilder matchQuery2 = QueryBuilders.matchQuery("description", key);
			
			BoolQueryBuilder should = QueryBuilders.boolQuery().should(matchQuery).should(matchQuery2).must(nestedQuery);

			
			System.out.println(should);
			
			prepareSearch.setQuery(should);
			
			SearchResponse actionGet = prepareSearch.execute().actionGet();
			
			SearchHit[] hits = actionGet.getHits().getHits();
		 
		 
			for(SearchHit hit:hits){
				
				String id = hit.getId();
				
				System.out.println(id);
				
			System.out.println(hit.getSource());
				
				
			}
			
		 
		 

		
	}
	
}
