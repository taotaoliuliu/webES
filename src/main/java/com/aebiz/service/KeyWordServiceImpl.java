package com.aebiz.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.elasticsearch.search.SearchHit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.aebiz.Utils.PinYinUtils;
import com.aebiz.dao.KeyWordDao;
import com.aebiz.vo.FrontCategoryPropertyValue;
import com.aebiz.vo.KeyWord;
import com.aebiz.vo.Product;

@Service
public class KeyWordServiceImpl implements KeyWordService{
	
	
	@Autowired
	private KeyWordDao keyWordDao;

	@Override
	public void addData(String key) {
		
		
		
		
	String ishave=	keyWordDao.getDataBykey(key);
	
	System.out.println(ishave);
	
	//存在时候修改
	if(ishave!=null&&ishave.length()>0)
	{
		
		keyWordDao.updateData(ishave);
		
	}
	
	else {
		
		KeyWord keyWord =new KeyWord();
		
		keyWord.setUuid(keyWord.genUuid());
		
		keyWord.setChineseName(key);
		
		keyWord.setSimpleName(PinYinUtils.getPinYinHeadChar(key));
		
		
		keyWord.setFullName(PinYinUtils.getPingYin(key));
		
		keyWord.setClick(1);
		
		keyWord.setChineseNameNoAnalayze(key);
		
		
		keyWordDao.addData(keyWord);
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
	}

	@Override
	public void updateData(String key) {
		
	}

	@Override
	public String getHH() {
		return "HHA";
	}

	@Override
	public ArrayList<Map<String, String>> getListKeyword(String key) {
		
		
		ArrayList<Map<String, String>> list =new ArrayList<>();		
		SearchHit[] listKeyword = keyWordDao.getListKeyword(key);
		
		
		for(SearchHit hit :listKeyword){
			
			Map<String,String> map =new HashMap<>();

			Map<String, Object> source = hit.getSource();
			
			
			map.put("title",source.get("chineseName").toString()+"                                       "+source.get("click"));
			
			
			
			list.add(map);
			
		}
		return list;
	}

	public List<Product> searchProduct(String key,Map<String, String[]> map) {
		
		List<Product> list =new ArrayList<>();

		SearchHit[] searchProduct = keyWordDao.searchProduct(key,map);
				
		
for(SearchHit hit :searchProduct){
	
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
			
			list.add(product);	
			
}
		
		return list;
	}
	
	
	
	
	public List<FrontCategoryPropertyValue> searchFrontCategoryPropertyTemplate(String key) {
		
		
		List<FrontCategoryPropertyValue> list =new ArrayList<>();
	
		
SearchHit[] searchFrontCategoryPropertyTemplate = keyWordDao.searchFrontCategoryPropertyTemplate(key);


if(searchFrontCategoryPropertyTemplate!=null&&searchFrontCategoryPropertyTemplate.length>0){
	

		
		
		for(SearchHit hit:searchFrontCategoryPropertyTemplate){
			
			FrontCategoryPropertyValue frontCategoryPropertyValue =new FrontCategoryPropertyValue();
			
			
			
			String name = hit.getSource().get("categoryPropertyTypeName").toString();
			String field = hit.getSource().get("categoryPropertyTypeField").toString();
			
			String object = hit.getSource().get("fieldValue").toString();
			
			String[] split = object.replace("[", "").replace("]", "").split(",");
			
			frontCategoryPropertyValue.setFieldValue(split);
			
			frontCategoryPropertyValue.setCategoryPropertyTypeName(name);
			
			
			frontCategoryPropertyValue.setCategoryPropertyTypeField(field);
			
			list.add(frontCategoryPropertyValue);
			

			
			
		}
		
}
		
		return list;
		
		
		
	}

	@Override
	public List<FrontCategoryPropertyValue> searchFrontCategoryPropertyTemplate2(Product product) {
		
		
		String categoryUuid = product.getCategoryUuid();
		
		List<FrontCategoryPropertyValue> list =new ArrayList<>();
	
		
SearchHit[] searchFrontCategoryPropertyTemplate = keyWordDao.searchFrontCategoryPropertyTemplate2(categoryUuid);


if(searchFrontCategoryPropertyTemplate!=null&&searchFrontCategoryPropertyTemplate.length>0){
	
		for(SearchHit hit:searchFrontCategoryPropertyTemplate){
			
			FrontCategoryPropertyValue frontCategoryPropertyValue =new FrontCategoryPropertyValue();
			
			
			
			String name = hit.getSource().get("categoryPropertyTypeName").toString();
			String field = hit.getSource().get("categoryPropertyTypeField").toString();
			
			String object = hit.getSource().get("fieldValue").toString();
			
			String[] split = object.replace("[", "").replace("]", "").split(",");
			
			frontCategoryPropertyValue.setFieldValue(split);
			
			frontCategoryPropertyValue.setCategoryPropertyTypeName(name);
			
			
			frontCategoryPropertyValue.setCategoryPropertyTypeField(field);
			
			list.add(frontCategoryPropertyValue);
			

			
			
		}
		
}
		
		return list;
		
	}

	
	
	
	
	
	
	
}
