package com.aebiz.dao;

import java.util.List;
import java.util.Map;

import org.elasticsearch.search.SearchHit;

import com.aebiz.vo.KeyWord;

public interface KeyWordDao {

	void addData(KeyWord keyWord);
	
	SearchHit[] getListKeyword(String key);

	String getDataBykey(String key);

	void updateData(String key);
	
	public SearchHit[] searchProduct(String key,Map<String, String[]> map);	
	
	public SearchHit[] searchFrontCategoryPropertyTemplate(String key);

	SearchHit[] searchFrontCategoryPropertyTemplate2(String categoryUuid);


}
