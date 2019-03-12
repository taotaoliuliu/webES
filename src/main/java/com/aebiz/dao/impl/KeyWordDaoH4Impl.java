package com.aebiz.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.NestedQueryBuilder;
import org.elasticsearch.index.query.PrefixQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.elasticsearch.index.query.functionscore.FunctionScoreQueryBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilders;
import org.elasticsearch.script.Script;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.aebiz.Utils.ESHelper;
import com.aebiz.Utils.PinYinUtils;
import com.aebiz.dao.KeyWordDao;
import com.aebiz.vo.KeyWord;
import com.alibaba.fastjson.JSON;

@Repository
public class KeyWordDaoH4Impl implements KeyWordDao{
	
	private static String INDEX_MY="lsl_keyword_index";
	
	private static String TYPE_MY="keyword";

	@Override
	public void addData(KeyWord keyWord) {
		//ESHelper.getESClient().
		//先查询  如果存在则加+1
		
		String jsonString = JSON.toJSONString(keyWord);
		
		IndexRequestBuilder prepareIndex = ESHelper.getESClient().prepareIndex(INDEX_MY, TYPE_MY);
		
		
		prepareIndex.setSource(jsonString);
		
		
		IndexResponse actionGet = prepareIndex.execute().actionGet();
	
	}

	@Override
	public SearchHit[] getListKeyword(String key) {
		
	String pinYinHeadChar = PinYinUtils.getPinYinHeadChar(key);
		
		String pingYin = PinYinUtils.getPingYin(key);		
SearchRequestBuilder prepareSearch = ESHelper.getESClient().prepareSearch();
		
		prepareSearch.setIndices(INDEX_MY);
		
		prepareSearch.setTypes(TYPE_MY);
		
		prepareSearch.addSort("click", SortOrder.DESC);
		
		prepareSearch.setFrom(0);
		
		prepareSearch.setSize(10);
		
		PrefixQueryBuilder prefixQuery = QueryBuilders.prefixQuery("fullName", pingYin);		
		
		PrefixQueryBuilder prefixQuery2 = QueryBuilders.prefixQuery("simpleName", pinYinHeadChar);
				
		
		PrefixQueryBuilder prefixQuery3 = QueryBuilders.prefixQuery("chineseName", key);
		
		BoolQueryBuilder bool = QueryBuilders.boolQuery().should(prefixQuery).should(prefixQuery2).should(prefixQuery3);
		
		
		prepareSearch.setQuery(bool);		
		SearchResponse actionGet = prepareSearch.execute().actionGet();
		
		SearchHit[] hits = actionGet.getHits().getHits();

		return hits;
	}

	@Override
	public String getDataBykey(String key) {
		
		
		
		SearchRequestBuilder prepareSearch = ESHelper.getESClient().prepareSearch();

		TermQueryBuilder termQuery = QueryBuilders.termQuery("chineseNameNoAnalayze", key);
		prepareSearch.setQuery(termQuery);
		
		SearchResponse actionGet = prepareSearch.execute().actionGet();
		
		SearchHit[] hits = actionGet.getHits().getHits();
		
		if(hits!=null&&hits.length>0){
		
			
			
			
			return	hits[0].getId()+"###"+hits[0].getSource().get("click");
			
				
			
			
		}
		else {
			
			return "";
		}
		
		
		
		
	}

	@Override
	public void updateData(String id) {
		UpdateRequest updatevalue =new UpdateRequest();
		updatevalue.index(INDEX_MY);
		
		updatevalue.type(TYPE_MY);
		
		updatevalue.id(id.split("###")[0]);
		KeyWord keyword=new KeyWord();
		
		int count =Integer.parseInt(id.split("###")[1])+1;
		
		
		keyword.setClick(count);
		
		
		String jsonString = JSON.toJSONString(keyword);
		
	
		updatevalue.doc(jsonString)	;	
		
		 
		ESHelper.getESClient().update(updatevalue);
	}
	
	
	
	
	
	public SearchHit[] searchProduct(String key,Map<String, String[]> map) {
		
		
		boolean ishave=false;
				
		String brandValue="";
		
		
		BoolQueryBuilder boolQuery = QueryBuilders.boolQuery();
		
		
		NestedQueryBuilder nestedQuery = QueryBuilders.nestedQuery("productExtend", boolQuery);
		
	Iterator<String> iterator = map.keySet().iterator();
		
		
		while(iterator.hasNext()){   
			
			String next = iterator.next();
			
			if(!"key".equals(next.trim())){
				
				if(next.trim().equals("brand")){
					
					String[] strings = map.get(next.trim());

					brandValue=strings[0].trim();
					
					
				}
				
				else {
					
					if(next.trim().equals("memory")){
						
						
						String mykey="productExtend."+next.trim();
						
						String[] strings = map.get(next.trim());
						
						boolQuery.must(QueryBuilders.matchQuery(mykey, strings[0].trim().replace("G", "")));
						
					}
					else {
						
						ishave=true;
						
						String mykey="productExtend."+next.trim();
						
						String[] strings = map.get(next.trim());
						
						boolQuery.must(QueryBuilders.matchQuery(mykey, strings[0].trim()));
						
					}
				}
			}
		}   
	
		
		SearchRequestBuilder prepareSearch = ESHelper.getESClient().prepareSearch();
		prepareSearch.setIndices("lsl_product");
		prepareSearch.setTypes("newProduct");
		MatchQueryBuilder matchQuery = QueryBuilders.matchQuery("name", key);
		MatchQueryBuilder matchQuery2 = QueryBuilders.matchQuery("description", key);
		BoolQueryBuilder should ;
		if(ishave){
			
			if(!StringUtils.isEmpty(brandValue)){
				MatchQueryBuilder matchQuery3 = QueryBuilders.matchQuery("brand", brandValue);
		should= QueryBuilders.boolQuery().must(QueryBuilders.boolQuery().should(matchQuery).should(matchQuery2)).must(matchQuery3).must(nestedQuery);

			}
			
			else {
				should= QueryBuilders.boolQuery().must(QueryBuilders.boolQuery().should(matchQuery).should(matchQuery2)).must(nestedQuery);	
			}
			
			
		}
		else {
			if(!StringUtils.isEmpty(brandValue)){
				MatchQueryBuilder matchQuery3 = QueryBuilders.matchQuery("brand", brandValue);

				should= QueryBuilders.boolQuery().must(QueryBuilders.boolQuery().should(matchQuery).should(matchQuery2)).must(matchQuery3);

			}
			else {
				should= QueryBuilders.boolQuery().must(QueryBuilders.boolQuery().should(matchQuery).should(matchQuery2));

			}
		}
		//函数得分##############
				Script script =new Script("doc['myscore2'].value");
				
				
				ScoreFunctionBuilder scoreFunctionBuilder = ScoreFunctionBuilders.scriptFunction(script).setWeight(0.006f);
				
				
				FunctionScoreQueryBuilder functionScoreQuery = QueryBuilders.functionScoreQuery(should).add(scoreFunctionBuilder);
				
				functionScoreQuery.boostMode("sum");
				
				functionScoreQuery.setMinScore(0.000001f);
				
				//函数得分##############
	
		prepareSearch.setQuery(functionScoreQuery);
		
		System.out.println(functionScoreQuery);

		
		SearchResponse actionGet = prepareSearch.execute().actionGet();
		
		SearchHit[] hits = actionGet.getHits().getHits();
		
		
		return hits;
		
		
		
		
	}
	
	
	public SearchHit[] searchFrontCategoryPropertyTemplate(String key) {
		
		
		SearchRequestBuilder prepareSearch = ESHelper.getESClient().prepareSearch();
			
		prepareSearch.setIndices("lsl_keyword_index");
		
		prepareSearch.setTypes("frontCategoryPropertyTemplate");
		
		MatchQueryBuilder matchQuery = QueryBuilders.matchQuery("name", key);
		
		prepareSearch.setQuery(matchQuery);
		
		SearchResponse actionGet = prepareSearch.execute().actionGet();
		
		SearchHit[] hits = actionGet.getHits().getHits();
		
		if(hits!=null&&hits.length>0){
			
			Object object = hits[0].getSource().get("frontCategoryPropertyTemplateUuid");
			
			
			TermQueryBuilder termQuery = QueryBuilders.termQuery("frontCategoryPropertyTemplateUuid", object);

			SearchRequestBuilder prepareSearch2 = ESHelper.getESClient().prepareSearch();
			
			prepareSearch2.setIndices("lsl_keyword_index");
			
			prepareSearch2.setTypes("frontCategoryPropertyValue");
			
			prepareSearch2.setQuery(termQuery);
			
			
			SearchResponse actionGet2 = prepareSearch2.execute().actionGet();
			
			SearchHit[] hits2 = actionGet2.getHits().getHits();
			
			
			return hits2;
			
		}
		
		
		return null;
		
	}

	@Override
	public SearchHit[] searchFrontCategoryPropertyTemplate2(String categoryUuid) {
		
		System.out.println("###############"+categoryUuid);
		
		
		SearchRequestBuilder prepareSearch = ESHelper.getESClient().prepareSearch();
		
		prepareSearch.setIndices("lsl_keyword_index");
		
		prepareSearch.setTypes("frontCategoryPropertyTemplate");
		
		
		TermQueryBuilder termQuery2 = QueryBuilders.termQuery("categoryUuid", categoryUuid);

	
		prepareSearch.setQuery(termQuery2);
		
		SearchResponse actionGet = prepareSearch.execute().actionGet();
		
		SearchHit[] hits = actionGet.getHits().getHits();
		
		if(hits!=null&&hits.length>0){
			
			System.out.println( hits[0].getSource());
			
			Object object = hits[0].getSource().get("frontCategoryPropertyTemplateUuid");
			
			
			TermQueryBuilder termQuery = QueryBuilders.termQuery("frontCategoryPropertyTemplateUuid", object);

			SearchRequestBuilder prepareSearch2 = ESHelper.getESClient().prepareSearch();
			
			prepareSearch2.setIndices("lsl_keyword_index");
			
			prepareSearch2.setTypes("frontCategoryPropertyValue");
			
			prepareSearch2.setQuery(termQuery);
			
			
			SearchResponse actionGet2 = prepareSearch2.execute().actionGet();
			
			SearchHit[] hits2 = actionGet2.getHits().getHits();
			
			
			return hits2;
			
		}
		
		
		return null;
	}
	
	
	

}
