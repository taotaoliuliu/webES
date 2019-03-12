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
import com.aebiz.vo.FrontCategoryPropertyValue;
import com.aebiz.vo.Product;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("keyword")
public class KeyWordController {
	
	@Resource
	private KeyWordService keyWordService;
	
	
	

	@RequestMapping("getListKeyword")
	@ResponseBody
	public String getListKeyword(String keyword){
		
		System.out.println(keyword+"key");
		
		JSONObject json =new JSONObject();
	
	ArrayList<Map<String,String>> list=	keyWordService.getListKeyword(keyword);
	
	System.out.println(list);
	
	json.put("data",list);
	
	
	System.out.println(json);
	
		
		return json.toJSONString();
	}
	
	@RequestMapping("addKeyWord")
	@ResponseBody
	public String addKeyWord(String key){
		JSONObject json =new JSONObject();

		
		keyWordService.addData(key);
		
		json.put("ret", 1);
		
		return json.toJSONString();
	}
	
	@RequestMapping("updateKeyWord")
	public String updateKeyWord(String key){
		
		keyWordService.updateData(key);
		
		return null;
		
		
	}
	
	
	
	@RequestMapping("search")
	public String searchProduct(String key,Model model,HttpServletRequest request){
		
		System.out.println(key);
		
			Map<String, String[]> map = request.getParameterMap();
			
	
		
		
		List<Product> list=	keyWordService.searchProduct(key,map);
	
		List<FrontCategoryPropertyValue> listF = keyWordService.searchFrontCategoryPropertyTemplate(key);
		
		if(listF==null||listF.size()==0){
			
			if(list!=null&&list.size()>0){
				listF =	keyWordService.searchFrontCategoryPropertyTemplate2(list.get(0));
				
			}	
			
		}
		
	
	
	model.addAttribute("list", list);
		
	model.addAttribute("listF", listF);
	model.addAttribute("key", key);
	
		
		
		return "search";
		
		
	}
	
	
	public String listProduct(){
		
		
		return "listProduct";
	}
	
	
	
public String editProductUI(){
		
		
		return "editProductUI";
	}


public String editProduct(){
	
	
	return "redirect:/search/listProduct";
}
	
	
	
	
	
}
