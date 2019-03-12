package com.aebiz;

import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.elasticsearch.search.SearchHit;

import com.aebiz.Utils.ESHelper;

import sun.applet.Main;

public class Test2 {

	
	public static void main(String[] args) {
		
		
		
		
SearchRequestBuilder prepareSearch = ESHelper.getESClient().prepareSearch();
		
		prepareSearch.setIndices("lsl_keyword_index");
		
		prepareSearch.setTypes("frontCategoryPropertyTemplate");
		
		
		TermQueryBuilder termQuery2 = QueryBuilders.termQuery("categoryUuid", "de7861d4-7e03-4395-9203-ddd0c7096c91");

	
		prepareSearch.setQuery(termQuery2);
		
		SearchResponse actionGet = prepareSearch.execute().actionGet();
		
		SearchHit[] hits = actionGet.getHits().getHits();
		
		if(hits!=null&&hits.length>0){
			
			System.out.println(hits[0].getSource());
			
			
			
		}
	}
}
