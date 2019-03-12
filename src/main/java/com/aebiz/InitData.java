package com.aebiz;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import com.aebiz.vo.Category;
import com.aebiz.vo.CategoryPropertyType;
import com.aebiz.vo.CategoryPropertyTypeValue;
import com.aebiz.vo.CategoryTemplate;
import com.aebiz.vo.FrontCategoryPropertyTemplate;
import com.aebiz.vo.FrontCategoryPropertyValue;
import com.aebiz.vo.Product;
import com.alibaba.fastjson.JSON;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class InitData {

	private static Client client;

	private static String INDEX = "lsl_keyword_index";

	public static void main(String[] args) {

		try {
			client = TransportClient.builder().build()
					.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("192.168.137.87"), 9300));

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//initCategory();

		//initCategoryTemplate();

			//initCategoryPropertyType();
	//initCategoryPropertyTypeValue();
	
	//initFrontTemplate();
	
	//initFrontCategoryPropertyValue();
		
		//initFrontCategoryPropertyValue();
		
		//initProduct();
		
		//initProduct2();
		
			
			UpdateRequest updatevalue =new UpdateRequest();
			updatevalue.index(INDEX);
			
			updatevalue.type("frontCategoryPropertyTemplate");
			
			updatevalue.id("AVhxPhNn3AjQU7gqv4fs");
			
			
			
			FrontCategoryPropertyTemplate cpt =new FrontCategoryPropertyTemplate();
			
			cpt.setCategoryUuid("de7861d4-7e03-4395-9203-ddd0c7096c91");			
					
			
			
			String jsonString = JSON.toJSONString(cpt);
			
		
			updatevalue.doc(jsonString)	;	
			
			 
		client.update(updatevalue);
	
	
	
	/*DeleteRequest aa =new DeleteRequest();
	aa.index(INDEX);
	aa.type("frontCategoryPropertyValue");
	
	aa.id("AVhxSGAE3AjQU7gqv4fw");
			
	
	
	client.delete(aa);
			*/
			
			
			
			
			
			
			
			
			
			

	}
	
	
	private static void initProduct2() {
		
		
	SimpleDateFormat ff =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Product product =new Product();
		
		product.setBrand("魅族");
		
		product.setCategoryUuid("97294b8a-4b79-4c84-8b80-730216a3a8fa");
		
		product.setCreatetime(ff.format(new Date()));
		
		product.setName("魅族 魅蓝3 移动定制版 16GB 白色 移动联通4G");
		
		product.setDescription("魅族 魅蓝3 移动定制版 16GB 白色 移动联通4G手机 双卡双待");
		
		product.setProductPrice(599);
		
		product.setFrontCategoryPropertyTemplateUuid("a4e69be0-f940-4026-ab04-3f125d878d1c");
		
		List<Map<String,Object>> list =new ArrayList<>();
		
		HashMap<String,Object> map =new HashMap<>();
		
		
		//brand：“华为”，network：“联通”，size：“3.5”，os：“ios”，memory：“16”，pixel：“1860”，color：“蓝色”，model：“2016-010”｝
		map.put("os", "ios");
		
		map.put("network", "电信");
		
		map.put("size", "4.0");
		
		map.put("memory", "8G");
		
		map.put("color", "白色");
		
		map.put("pixel", "500");
		
		list.add(map);
		
		product.setProductExtend(list);
		
		
		
		BulkRequestBuilder bulkRequest = client.prepareBulk();
		
		
		String jsonString = JSON.toJSONString(product);
	
				
		bulkRequest.add(client.prepareIndex("lsl_product", "newProduct").setSource(jsonString));
                                                   
BulkResponse actionGet = bulkRequest.execute().actionGet();
		
		
		
		
		
	}

	private static void initProduct() {
		

		SimpleDateFormat ff =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Product product =new Product();
		
		product.setBrand("华为");
		
		product.setCategoryUuid("97294b8a-4b79-4c84-8b80-730216a3a8fa");
		
		product.setCreatetime(ff.format(new Date()));
		
		product.setName("荣耀 畅玩5X 3GB内存版 落日金 移动联通电信4G手机 双卡双待");
		
		product.setDescription("荣耀 畅玩5X 3GB内存版 落日金 移动联通电信4G手机 双卡双待");
		
		product.setProductPrice(1099);
		
		product.setFrontCategoryPropertyTemplateUuid("a4e69be0-f940-4026-ab04-3f125d878d1c");
		
		List<Map<String,Object>> list =new ArrayList<>();
		
		HashMap<String,Object> map =new HashMap<>();
		
		
		//brand：“华为”，network：“联通”，size：“3.5”，os：“ios”，memory：“16”，pixel：“1860”，color：“蓝色”，model：“2016-010”｝
		map.put("os", "andriod");
		
		map.put("network", "联通");
		
		map.put("size", "3.5");
		
		map.put("memory", "16G");
		
		map.put("color", "银白色");
		
		map.put("pixel", "500");
		
		list.add(map);
		
		product.setProductExtend(list);
		
		
		
		
		
		
Product product2 =new Product();
		
		product2.setBrand("iPhone6s");
		
		product2.setCategoryUuid("97294b8a-4b79-4c84-8b80-730216a3a8fa");
		
		product2.setCreatetime(ff.format(new Date()));
		
		product2.setName("Apple iPhone 6s (A1700) 32G 银色 移动联通电信4G手机");
		
		product2.setDescription("Apple iPhone 6s (A1700) 32G 银色 移动联通电信4G手机");
		
		product2.setProductPrice(5555);
		
		product2.setFrontCategoryPropertyTemplateUuid("a4e69be0-f940-4026-ab04-3f125d878d1c");
		
		List<Map<String,Object>> list2 =new ArrayList<>();
		
		HashMap<String,Object> map2 =new HashMap<>();
		
		
		//brand：“华为”，network：“联通”，size：“3.5”，os：“ios”，memory：“16”，pixel：“1860”，color：“蓝色”，model：“2016-010”｝
		map2.put("os", "ios");
		
		map2.put("network", "移动");
		map2.put("size", "5.5");
		
		map2.put("memory", "64G");
		
		map2.put("color", "金色");
		
		map2.put("pixel", "1200");
		
		list2.add(map2);
		
		product2.setProductExtend(list2);
		
		
		
		
		
		
		
Product product3 =new Product();
		
		product3.setBrand("小米");
		
		product3.setCategoryUuid("97294b8a-4b79-4c84-8b80-730216a3a8fa");
		
		product3.setCreatetime(ff.format(new Date()));
		
		product3.setName("小米 红米 3S 全网通 2GB内存 16GB ROM 经典金色 移动联通电信4G手机 双卡双待");
		
		product3.setDescription("小米 红米 3S 全网通 2GB内存 16GB ROM 经典金色 移动联通电信4G手机 双卡双待");
		
		product3.setProductPrice(550);
		
		product3.setFrontCategoryPropertyTemplateUuid("a4e69be0-f940-4026-ab04-3f125d878d1c");
		
		List<Map<String,Object>> list3 =new ArrayList<>();
		
		HashMap<String,Object> map3 =new HashMap<>();
		
		
		//brand：“华为”，network：“联通”，size：“3.5”，os：“ios”，memory：“16”，pixel：“1860”，color：“蓝色”，model：“2016-010”｝
		map3.put("os", "andriod");
		
		map3.put("network", "电信");
		map3.put("size", "5.0");
		
		map3.put("memory", "8G");
		
		map3.put("color", "粉色");
		
		map3.put("pixel", "1800");
		
		list3.add(map3);
		
		product3.setProductExtend(list3);
		
		
		
Product fzproduct =new Product();
		
fzproduct.setBrand("海澜之家");
		
fzproduct.setCategoryUuid("de7861d4-7e03-4395-9203-ddd0c7096c91");
		
fzproduct.setCreatetime(ff.format(new Date()));
		
fzproduct.setName("海澜之家/Heilan Home2016秋季新品男装条纹夹克外套HWJAJ3N118A 湖蓝(D9) 175/92A");
		
fzproduct.setDescription("海澜之家/Heilan Home2016秋季新品男装条纹夹克外套HWJAJ3N118A 湖蓝(D9) 175/92A");
		
fzproduct.setProductPrice(598);
		
fzproduct.setFrontCategoryPropertyTemplateUuid("9587490e-4cf5-4751-b546-dce61ef2dfe1");
		
		List<Map<String,Object>> fzlist =new ArrayList<>();
		
		HashMap<String,Object> fzmap =new HashMap<>();
		
		
		//brand：“华为”，network：“联通”，size：“3.5”，os：“ios”，memory：“16”，pixel：“1860”，color：“蓝色”，model：“2016-010”｝
		fzmap.put("type", "夹克");
		
		fzmap.put("size", "31");
		
		fzmap.put("people", "中年");
		
		fzmap.put("color", "蓝色");
				
		fzlist.add(fzmap);
		
		fzproduct.setProductExtend(fzlist);
		
		
		
		
		
		
		
		Product fzproduct2 =new Product();
		
		fzproduct2.setBrand("七匹狼");
				
		fzproduct2.setCategoryUuid("de7861d4-7e03-4395-9203-ddd0c7096c91");
				
		fzproduct2.setCreatetime(ff.format(new Date()));
				
		fzproduct2.setName("七匹狼夹克男士外套薄款修身商务休闲春秋男装上衣 101藏青色 175/92A/xl(偏小一码)");
				
		fzproduct2.setDescription("七匹狼夹克男士外套薄款修身商务休闲春秋男装上衣 101藏青色 175/92A/xl(偏小一码)");
				
		fzproduct2.setProductPrice(298);
				
		fzproduct2.setFrontCategoryPropertyTemplateUuid("9587490e-4cf5-4751-b546-dce61ef2dfe1");
				
				List<Map<String,Object>> fzlist2 =new ArrayList<>();
				
				HashMap<String,Object> fzmap2 =new HashMap<>();
				
				
				//brand：“华为”，network：“联通”，size：“3.5”，os：“ios”，memory：“16”，pixel：“1860”，color：“蓝色”，model：“2016-010”｝
				fzmap2.put("type", "羽绒服");
				
				fzmap2.put("size", "33");
				
				fzmap2.put("people", "青年");
				
				fzmap2.put("color", "黑色");
						
				fzlist2.add(fzmap);
				
				fzproduct2.setProductExtend(fzlist2);
				
				
				
				Product fzproduct3 =new Product();
				
				fzproduct3.setBrand("森马");
						
				fzproduct3.setCategoryUuid("de7861d4-7e03-4395-9203-ddd0c7096c91");
						
				fzproduct3.setCreatetime(ff.format(new Date()));
						
				fzproduct3.setName("森马夹克 2016秋装新款 男士字母印花绣章净色休闲连帽夹克外套潮 宝蓝8710 L");
						
				fzproduct3.setDescription("森马夹克 2016秋装新款 男士字母印花绣章净色休闲连帽夹克外套潮 宝蓝8710 L");
						
				fzproduct3.setProductPrice(120);
						
				fzproduct.setFrontCategoryPropertyTemplateUuid("9587490e-4cf5-4751-b546-dce61ef2dfe1");
						
						List<Map<String,Object>> fzlist3 =new ArrayList<>();
						
						HashMap<String,Object> fzmap3 =new HashMap<>();
						
						
						//brand：“华为”，network：“联通”，size：“3.5”，os：“ios”，memory：“16”，pixel：“1860”，color：“蓝色”，model：“2016-010”｝
						fzmap3.put("type", "夹克");
						
						fzmap3.put("size", "32");
						
						fzmap3.put("people", "老年");
						
						fzmap3.put("color", "卡其色");
								
						fzlist3.add(fzmap3);
						
						fzproduct3.setProductExtend(fzlist3);
		
		
		
		
		
		
		
		
		
		BulkRequestBuilder bulkRequest = client.prepareBulk();
		
			
			String jsonString = JSON.toJSONString(product);
			String jsonString2 = JSON.toJSONString(product2);
			String jsonString3 = JSON.toJSONString(product3);
			String jsonString4 = JSON.toJSONString(fzproduct);
			String jsonString5 = JSON.toJSONString(fzproduct2);
			String jsonString6= JSON.toJSONString(fzproduct3);
					
			bulkRequest.add(client.prepareIndex("lsl_product", "newProduct").setSource(jsonString));
			bulkRequest.add(client.prepareIndex("lsl_product", "newProduct").setSource(jsonString2));
			bulkRequest.add(client.prepareIndex("lsl_product", "newProduct").setSource(jsonString3));
			bulkRequest.add(client.prepareIndex("lsl_product", "newProduct").setSource(jsonString4));
			bulkRequest.add(client.prepareIndex("lsl_product", "newProduct").setSource(jsonString5));
			bulkRequest.add(client.prepareIndex("lsl_product", "newProduct").setSource(jsonString6));

	
	                                                           
	BulkResponse actionGet = bulkRequest.execute().actionGet();

	System.out.println(actionGet);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void initFrontCategoryPropertyValue() {
		
		
		List<FrontCategoryPropertyValue> list =new ArrayList<>();
		
		
		String[] fieldValue={"华为","iphone","小米","魅族","三星"};
		
		FrontCategoryPropertyValue fpp=setFrontCategoryPropertyValue("a4e69be0-f940-4026-ab04-3f125d878d1c",
				"2f3df767-0e84-4bb4-aac6-64fe64e886dc","brand","品牌",fieldValue);
		
		String[] fieldValue2={"android","ios"};
		
		FrontCategoryPropertyValue fpp2=setFrontCategoryPropertyValue("a4e69be0-f940-4026-ab04-3f125d878d1c",
				"25803e27-4e8e-48c4-9073-aef2e75a4e7a","os","操作系统",fieldValue2);
		
		
String[] fieldValue3={"4.0","5.0","5.5"};
		
		FrontCategoryPropertyValue fpp3=setFrontCategoryPropertyValue("a4e69be0-f940-4026-ab04-3f125d878d1c",
				"5208b89c-5b2b-482b-91bb-8b962daad764","size","屏幕尺寸",fieldValue3);
		
String[] fieldValue4={"联通","移动","电信"};
		
		FrontCategoryPropertyValue fpp4=setFrontCategoryPropertyValue("a4e69be0-f940-4026-ab04-3f125d878d1c",
				"16861216-e154-4ff4-9714-13c771410f40","network","网络类型",fieldValue4);
		
String[] fieldValue5={"8G","16G","32G","64G"};
		
		FrontCategoryPropertyValue fpp5=setFrontCategoryPropertyValue("a4e69be0-f940-4026-ab04-3f125d878d1c",
				"1fbd1016-a90e-4146-8400-1fde153749f1","memory","机身内存",fieldValue5);
		
String[] fieldValue6={"金色","银色"};
		
		FrontCategoryPropertyValue fpp6=setFrontCategoryPropertyValue("a4e69be0-f940-4026-ab04-3f125d878d1c",
				"8b8dc151-8a75-4195-957e-d8f64215c686","color","颜色",fieldValue6);
		
		list.add(fpp);
		list.add(fpp2);
		list.add(fpp3);
		list.add(fpp4);
		list.add(fpp5);
		list.add(fpp6);

		
String[] nzfieldValue={"海澜之家","七匹狼","森马"};
		
		FrontCategoryPropertyValue nzfpp=setFrontCategoryPropertyValue("9587490e-4cf5-4751-b546-dce61ef2dfe1",
				"8415ed26-c41a-4a83-9244-628383bec750","brand","品牌",nzfieldValue);
	
		
String[] nzfieldValue2={"夹克","羽绒服","T恤"};
		
		FrontCategoryPropertyValue nzfpp2=setFrontCategoryPropertyValue("9587490e-4cf5-4751-b546-dce61ef2dfe1",
				"d4aa44d0-60fb-4ba5-b34d-91068ff0a135","type","男装类型",nzfieldValue2);
		
	
String[] nzfieldValue3={"31","32","33"};
		
		FrontCategoryPropertyValue nzfpp3=setFrontCategoryPropertyValue("9587490e-4cf5-4751-b546-dce61ef2dfe1",
				"c819b360-8b65-46d6-be48-6e6d105fbd38","size","尺码",nzfieldValue3);
		
		
		
String[] nzfieldValue4={"青年","中年","老年"};
		
		FrontCategoryPropertyValue nzfpp4=setFrontCategoryPropertyValue("9587490e-4cf5-4751-b546-dce61ef2dfe1",
				"f45f93c3-50ee-46a9-ab8b-61185784d0bc","people","人群",nzfieldValue4);
		
		
		list.add(nzfpp);
		list.add(nzfpp2);
		list.add(nzfpp3);
		list.add(nzfpp4);
		
		
		
		
		
		BulkRequestBuilder bulkRequest = client.prepareBulk();
		
		for(FrontCategoryPropertyValue nzf:list){
			
			String jsonString = JSON.toJSONString(nzf);
			
			bulkRequest.add(client.prepareIndex(INDEX, nzfpp4.TYPE).setSource(jsonString));

			
		}

		

	                                                           
	BulkResponse actionGet = bulkRequest.execute().actionGet();

	System.out.println(actionGet);
		
		
		
		
	}

	private static FrontCategoryPropertyValue setFrontCategoryPropertyValue(String tmpuuid,String typeUuid, String field,
			String name, String[] fieldValue) {
		
		FrontCategoryPropertyValue fp =new FrontCategoryPropertyValue();

		fp.setFrontCategoryPropertyValueUuid(UUID.randomUUID().toString());
		
		fp.setFrontCategoryPropertyTemplateUuid(tmpuuid);
		
		fp.setCategoryPropertyTypeField(field);
		
		fp.setCategoryPropertyTypeName(name);
		
		fp.setCategoryPropertyTypeUuid(typeUuid);
		
		
		fp.setFieldValue(fieldValue);
		return fp;
	}

	private static void initFrontTemplate() {
		FrontCategoryPropertyTemplate tt =new FrontCategoryPropertyTemplate();
		
		
		tt.setFrontCategoryPropertyTemplateUuid(UUID.randomUUID().toString());
		
		tt.setCategoryTemplateUuid("08881824-2d4b-4a7b-b1dd-8d2a1caa68f1");
		
		tt.setName("前台男装模板");
		
		BulkRequestBuilder bulkRequest = client.prepareBulk();

			String jsonString = JSON.toJSONString(tt);
			
			bulkRequest.add(client.prepareIndex(INDEX, tt.TYPE).setSource(jsonString));

	
		                                                           
		BulkResponse actionGet = bulkRequest.execute().actionGet();

		System.out.println(actionGet);
		
		
		
	}

	private static void initCategoryPropertyTypeValue() {
		
		List<CategoryPropertyTypeValue> xxx =new ArrayList<>();

		
	CategoryPropertyTypeValue shoujiBrand=	setCategoryPropertyTypeValue("2f3df767-0e84-4bb4-aac6-64fe64e886dc","华为");
	CategoryPropertyTypeValue shoujiBrand2=	setCategoryPropertyTypeValue("2f3df767-0e84-4bb4-aac6-64fe64e886dc","iphone");
	CategoryPropertyTypeValue shoujiBrand3=	setCategoryPropertyTypeValue("2f3df767-0e84-4bb4-aac6-64fe64e886dc","小米");
	
	CategoryPropertyTypeValue shoujiOs=	setCategoryPropertyTypeValue("25803e27-4e8e-48c4-9073-aef2e75a4e7a","Android");
	CategoryPropertyTypeValue shoujiOs2=	setCategoryPropertyTypeValue("25803e27-4e8e-48c4-9073-aef2e75a4e7a","ios");
	
	
	CategoryPropertyTypeValue shoujiMemory=	setCategoryPropertyTypeValue("1fbd1016-a90e-4146-8400-1fde153749f1","16G");
	CategoryPropertyTypeValue shoujiMemory2=setCategoryPropertyTypeValue("1fbd1016-a90e-4146-8400-1fde153749f1","32G");
	CategoryPropertyTypeValue shoujiMemory3=setCategoryPropertyTypeValue("1fbd1016-a90e-4146-8400-1fde153749f1","64G");

	CategoryPropertyTypeValue shoujinetWork=setCategoryPropertyTypeValue("16861216-e154-4ff4-9714-13c771410f40","移动");
	CategoryPropertyTypeValue shoujinetWork2=setCategoryPropertyTypeValue("16861216-e154-4ff4-9714-13c771410f40","联通");
	CategoryPropertyTypeValue shoujinetWork3=setCategoryPropertyTypeValue("16861216-e154-4ff4-9714-13c771410f40","电信");
	
	CategoryPropertyTypeValue shoujiColor=setCategoryPropertyTypeValue("8b8dc151-8a75-4195-957e-d8f64215c686","亮黑色");
	CategoryPropertyTypeValue shoujiColor2=setCategoryPropertyTypeValue("8b8dc151-8a75-4195-957e-d8f64215c686","粉红色");
	CategoryPropertyTypeValue shoujiColor3=setCategoryPropertyTypeValue("8b8dc151-8a75-4195-957e-d8f64215c686","银白色");
	
	
	CategoryPropertyTypeValue shoujiPx=setCategoryPropertyTypeValue("4b84d412-7b5f-44c5-bbfa-e62419a79af6","1600");
	CategoryPropertyTypeValue shoujiPx2=setCategoryPropertyTypeValue("4b84d412-7b5f-44c5-bbfa-e62419a79af6","2200");
	CategoryPropertyTypeValue shoujiPx3=setCategoryPropertyTypeValue("4b84d412-7b5f-44c5-bbfa-e62419a79af6","800");

	
	CategoryPropertyTypeValue shoujiSize=setCategoryPropertyTypeValue("5208b89c-5b2b-482b-91bb-8b962daad764","4.5");
	CategoryPropertyTypeValue shoujiSize2=setCategoryPropertyTypeValue("5208b89c-5b2b-482b-91bb-8b962daad764","5.5");
	CategoryPropertyTypeValue shoujiSize3=setCategoryPropertyTypeValue("5208b89c-5b2b-482b-91bb-8b962daad764","6.0");
	

	CategoryPropertyTypeValue shoujiBattery=setCategoryPropertyTypeValue("e81ab6c2-29db-494e-8f7b-0c2c16254ce1","4100毫安");
	CategoryPropertyTypeValue shoujiBattery2=setCategoryPropertyTypeValue("e81ab6c2-29db-494e-8f7b-0c2c16254ce1","3500毫安");
	
	
	CategoryPropertyTypeValue nanzhuangBrand=setCategoryPropertyTypeValue("8415ed26-c41a-4a83-9244-628383bec750","海澜之家");
	CategoryPropertyTypeValue nanzhuangBrand2=setCategoryPropertyTypeValue("8415ed26-c41a-4a83-9244-628383bec750","七匹狼");
	CategoryPropertyTypeValue nanzhuangBrand3=setCategoryPropertyTypeValue("8415ed26-c41a-4a83-9244-628383bec750","森马");

	CategoryPropertyTypeValue nanzhuangpeople=setCategoryPropertyTypeValue("6f631002-c6de-4704-bd04-439691793dc3","秋季");	
	CategoryPropertyTypeValue nanzhuangpeople2=setCategoryPropertyTypeValue("6f631002-c6de-4704-bd04-439691793dc3","夏季");	
	CategoryPropertyTypeValue nanzhuangpeople3=setCategoryPropertyTypeValue("6f631002-c6de-4704-bd04-439691793dc3","冬季");

	CategoryPropertyTypeValue nanzhuangSize=setCategoryPropertyTypeValue("c819b360-8b65-46d6-be48-6e6d105fbd38","31");	
	CategoryPropertyTypeValue nanzhuangSize2=setCategoryPropertyTypeValue("c819b360-8b65-46d6-be48-6e6d105fbd38","32");	
	CategoryPropertyTypeValue nanzhuangSize3=setCategoryPropertyTypeValue("c819b360-8b65-46d6-be48-6e6d105fbd38","33");	
	
	CategoryPropertyTypeValue nanzhuangCaizhi=setCategoryPropertyTypeValue("e9239ba3-103d-49da-b946-b8411c9fc173","羊毛");	
	CategoryPropertyTypeValue nanzhuangCaizhi2=setCategoryPropertyTypeValue("e9239ba3-103d-49da-b946-b8411c9fc173","面");	
	CategoryPropertyTypeValue nanzhuangCaizhi3=setCategoryPropertyTypeValue("e9239ba3-103d-49da-b946-b8411c9fc173","麻");
	
	CategoryPropertyTypeValue nanzhuangType=setCategoryPropertyTypeValue("d4aa44d0-60fb-4ba5-b34d-91068ff0a135","夹克");	
	CategoryPropertyTypeValue nanzhuangType2=setCategoryPropertyTypeValue("d4aa44d0-60fb-4ba5-b34d-91068ff0a135","羽绒服");	
	CategoryPropertyTypeValue nanzhuangType3=setCategoryPropertyTypeValue("d4aa44d0-60fb-4ba5-b34d-91068ff0a135","衬衫");	
	
	CategoryPropertyTypeValue nanzhuangPattn=setCategoryPropertyTypeValue("853d3266-701b-41c9-b4a1-e67be2ab3b5f","商务休闲");	
	CategoryPropertyTypeValue nanzhuangPattn2=setCategoryPropertyTypeValue("853d3266-701b-41c9-b4a1-e67be2ab3b5f","青春休闲");	
	
	xxx.add(nanzhuangPattn);
	xxx.add(nanzhuangPattn2);
	xxx.add(nanzhuangType);
	xxx.add(nanzhuangType2);
	xxx.add(nanzhuangType3);
	xxx.add(shoujiBrand);
	xxx.add(shoujiBrand2);
	xxx.add(shoujiBrand3);
	xxx.add(shoujiOs);
	xxx.add(shoujiOs2);
	xxx.add(shoujiColor);
	xxx.add(shoujiColor2);
	xxx.add(shoujiColor3);
	xxx.add(shoujiPx);
	xxx.add(shoujiPx2);
	xxx.add(shoujiPx3);
	
	xxx.add(nanzhuangBrand);
	xxx.add(nanzhuangBrand2);
	xxx.add(nanzhuangBrand3);
	
	xxx.add(nanzhuangCaizhi);
	xxx.add(nanzhuangCaizhi2);
	xxx.add(nanzhuangCaizhi3);
	
	xxx.add(shoujiMemory);
	xxx.add(shoujiMemory2);
	xxx.add(shoujiMemory3);
	
	xxx.add(shoujinetWork);
	xxx.add(shoujinetWork2);
	xxx.add(shoujinetWork3);
	
	xxx.add(shoujiSize);
	xxx.add(shoujiSize2);
	xxx.add(shoujiSize3);
	xxx.add(shoujiBattery);
	xxx.add(shoujiBattery2);

	xxx.add(nanzhuangpeople);
	xxx.add(nanzhuangpeople2);
	xxx.add(nanzhuangpeople3);
	
	xxx.add(nanzhuangSize);
	xxx.add(nanzhuangSize2);
	xxx.add(nanzhuangSize3);

	BulkRequestBuilder bulkRequest = client.prepareBulk();

	
	for(CategoryPropertyTypeValue cpttt: xxx){
		
		String jsonString = JSON.toJSONString(cpttt);
		
		bulkRequest.add(client.prepareIndex(INDEX, nanzhuangPattn.TYPE).setSource(jsonString));

	}
	                                                           
	BulkResponse actionGet = bulkRequest.execute().actionGet();

	System.out.println(actionGet);
	
	

		
		
		
		
		
		
		
	}

	private static CategoryPropertyTypeValue setCategoryPropertyTypeValue(String uuid, String value) {
		
		CategoryPropertyTypeValue cpty =new CategoryPropertyTypeValue();
		
		cpty.setCategoryPropertyTypeUuid(uuid);//品牌
		
		cpty.setCategoryPropertyTypeValueUuid(UUID.randomUUID().toString());
		
		cpty.setValue(value);
		return cpty;
	}

	private static void initCategoryPropertyType() {
		
		List<CategoryPropertyType> shouji =new ArrayList<>();
		List<CategoryPropertyType> nanzhuang =new ArrayList<>();
		
		
	/*	CategoryPropertyType ct= setCategoryPropertyType("30051d04-53f9-4d04-9af6-b48d362a0e4b","brand","品牌");
		CategoryPropertyType ct2= setCategoryPropertyType("30051d04-53f9-4d04-9af6-b48d362a0e4b","network","网络");
		CategoryPropertyType ct3= setCategoryPropertyType("30051d04-53f9-4d04-9af6-b48d362a0e4b","size","屏幕尺寸");
		CategoryPropertyType ct4= setCategoryPropertyType("30051d04-53f9-4d04-9af6-b48d362a0e4b","os","操作系统");
		CategoryPropertyType ct5= setCategoryPropertyType("30051d04-53f9-4d04-9af6-b48d362a0e4b","memory","机身内存");
		CategoryPropertyType ct6= setCategoryPropertyType("30051d04-53f9-4d04-9af6-b48d362a0e4b","pixel","像素");
		CategoryPropertyType ct7= setCategoryPropertyType("30051d04-53f9-4d04-9af6-b48d362a0e4b","color","颜色");
		CategoryPropertyType ct8= setCategoryPropertyType("30051d04-53f9-4d04-9af6-b48d362a0e4b"," battery","电池容量");
		
		shouji.add(ct);
		shouji.add(ct2);
		shouji.add(ct3);
		shouji.add(ct4);
		shouji.add(ct5);
		shouji.add(ct6);
		shouji.add(ct7);
		shouji.add(ct8);*/
		
	/*	CategoryPropertyType nanzhuangct= setCategoryPropertyType("08881824-2d4b-4a7b-b1dd-8d2a1caa68f1	","brand","品牌");
		CategoryPropertyType nanzhuangct2= setCategoryPropertyType("08881824-2d4b-4a7b-b1dd-8d2a1caa68f1","size","尺码");
		CategoryPropertyType nanzhuangct3= setCategoryPropertyType("08881824-2d4b-4a7b-b1dd-8d2a1caa68f1","people","适合人群");
		CategoryPropertyType nanzhuangct4= setCategoryPropertyType("08881824-2d4b-4a7b-b1dd-8d2a1caa68f1","material","材质");
		CategoryPropertyType nanzhuangct5= setCategoryPropertyType("08881824-2d4b-4a7b-b1dd-8d2a1caa68f1","season","季节");
		CategoryPropertyType nanzhuangct6= setCategoryPropertyType("08881824-2d4b-4a7b-b1dd-8d2a1caa68f1","patten","服装版型");
		CategoryPropertyType nanzhuangct7= setCategoryPropertyType("08881824-2d4b-4a7b-b1dd-8d2a1caa68f1","color","颜色");
		
		nanzhuang.add(nanzhuangct);
		nanzhuang.add(nanzhuangct2);
		nanzhuang.add(nanzhuangct3);
		nanzhuang.add(nanzhuangct4);
		nanzhuang.add(nanzhuangct5);
		nanzhuang.add(nanzhuangct6);
		nanzhuang.add(nanzhuangct7);*/
		
		
		CategoryPropertyType nanzhuangct8= setCategoryPropertyType("08881824-2d4b-4a7b-b1dd-8d2a1caa68f1","type","类型");
		nanzhuang.add(nanzhuangct8);
		
		
		BulkRequestBuilder bulkRequest = client.prepareBulk();

		
		for(CategoryPropertyType cpttt: shouji){
			
			String jsonString = JSON.toJSONString(cpttt);
			
			bulkRequest.add(client.prepareIndex(INDEX, nanzhuangct8.TYPE).setSource(jsonString));
	
		}
		
		for(CategoryPropertyType cpttt: nanzhuang){
			
			String jsonString = JSON.toJSONString(cpttt);
			
			bulkRequest.add(client.prepareIndex(INDEX, nanzhuangct8.TYPE).setSource(jsonString));
	
		}
		                                                           
		BulkResponse actionGet = bulkRequest.execute().actionGet();

		System.out.println(actionGet);

	}

	private static CategoryPropertyType setCategoryPropertyType(String uuid, String feild, String name) {
		
		CategoryPropertyType cpt =new CategoryPropertyType();
		
		cpt.setCategoryPropertyTypeUuid(UUID.randomUUID().toString());
		
		cpt.setCategoryTemplateUuid(uuid);//手机模板
		
		cpt.setField(feild);
		
		cpt.setName(name);
		return cpt;
	}

	private static void initCategoryTemplate() {
		
		
		CategoryTemplate ct =new CategoryTemplate();
		
		ct.setCategoryTemplateUuid(UUID.randomUUID().toString());
		ct.setCategoryUuid("97294b8a-4b79-4c84-8b80-730216a3a8fa");
		ct.setName("手机模板");
		
		
		CategoryTemplate ct2 =new CategoryTemplate();
		
		ct2.setCategoryTemplateUuid(UUID.randomUUID().toString());
		ct2.setCategoryUuid("de7861d4-7e03-4395-9203-ddd0c7096c91");
		ct2.setName("男装模板");
		
	

		String jsonString = JSON.toJSONString(ct);
		String jsonString2 = JSON.toJSONString(ct2);

		BulkRequestBuilder bulkRequest = client.prepareBulk();

		bulkRequest.add(client.prepareIndex(INDEX, ct.TYPE).setSource(jsonString));

		bulkRequest.add(client.prepareIndex(INDEX, ct2.TYPE).setSource(jsonString2));

		BulkResponse actionGet = bulkRequest.execute().actionGet();

		System.out.println(actionGet);
		

	}

	private static void initCategory() {

		String uuid = UUID.randomUUID().toString();

		String cuuid = UUID.randomUUID().toString();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

		Category category = new Category();

		category.setCategoryUuid(uuid);

		category.setName("手机");

		category.setCatuuid(cuuid);

		Category category2 = new Category();
		category2.setCategoryUuid(UUID.randomUUID().toString());

		category2.setName("男装");

		category2.setCatuuid(UUID.randomUUID().toString());

		String jsonString = JSON.toJSONString(category);
		String jsonString2 = JSON.toJSONString(category2);

		BulkRequestBuilder bulkRequest = client.prepareBulk();

		bulkRequest.add(client.prepareIndex(INDEX, category.TYPE).setSource(jsonString));

		bulkRequest.add(client.prepareIndex(INDEX, category.TYPE).setSource(jsonString2));

		BulkResponse actionGet = bulkRequest.execute().actionGet();

		System.out.println(actionGet);

	}

}
