package com.aebiz;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.elasticsearch.action.admin.indices.create.CreateIndexRequestBuilder;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.action.admin.indices.mapping.put.PutMappingRequest;
import org.elasticsearch.action.admin.indices.mapping.put.PutMappingResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.Requests;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.indices.IndexAlreadyExistsException;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class createIndexAndDynamicIndex {

	private static Client client;
	
	
	
	public static void main(String[] args) throws IOException {
		
		//index : "not_analyzed"
		
		getClient("elasticsearch", "192.168.137.87", "9300");
		createDynamicIndex();
		
	}
	
	public void createIndex() throws IOException{
		
		createIndexOnly("qmt");

		XContentBuilder builder=XContentFactory.jsonBuilder()
		.startObject()
		//.startObject(indices)
		.startObject("properties")
		.startObject("uuid").field("type", "string").field("store", "yes").field("index", "not_analyzed").endObject()
		.startObject("title").field("type", "string").field("store", "yes").field("index", "not_analyzed").endObject()
		.startObject("content").field("type", "string").field("store", "yes").endObject()
		.startObject("createtime").field("type", "long").field("store", "yes").field("index", "not_analyzed").endObject()
		.endObject()
		.endObject();
		PutMappingRequest mapping = Requests.putMappingRequest("qmt").type("article").source(builder);
		PutMappingResponse res = client.admin().indices().putMapping(mapping).actionGet();
			if (res.isAcknowledged()) {
			System.out.println("创建成功！");
		}
		client.close();
	}
	
	
	private static Client getClient(String esClusterName, String esIp, String esPort) {
		if (client != null) {
			return client;
		}

		String clusterName = esClusterName;
		String ip = esIp;
		Integer port = Integer.valueOf(esPort);

		Settings settings = Settings.settingsBuilder().put("cluster.name", clusterName)
				.put("client.transport.sniff", true) // 自动探测集群中机器
				.build();
		try {
			client = TransportClient.builder().settings(settings).build()
					.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(ip), port));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return client;
	}
	
	
	/**
	 * BackupEsSearch.java拷贝这里
	 * 这里修改，BackupEsSearch.java也要修改
	 */
	private static void createIndexOnly(String indexName) {
		CreateIndexResponse res = null;
		try {
			res = client.admin().indices().prepareCreate(indexName).execute().actionGet();
		} catch(IndexAlreadyExistsException e) {
			e.printStackTrace();
			return;
		}

		if (res.isAcknowledged()) {
				
			System.out.println("sucess!!");
		}
		
	}
	
	
	
	
	/**
	 * 初始化动态模版
	 * BackupEsData.java拷贝了这里，这里改了，BackupEsData也要改
	 */
	private static  Map<String,Object> initSettings(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("type", "string");
		map.put("index", "not_analyzed");
		Map<String,Object> enMap = new HashMap<String,Object>();
		enMap.put("match", "*");
		enMap.put("match_mapping_type", "string");
		enMap.put("mapping", map);
		Map<String,Object> tmpMap = new HashMap<String,Object>();
		tmpMap.put("en", enMap);
		Map<String,Object> defMap = new HashMap<String,Object>();
		List<Object> list = new ArrayList<Object>();
		list.add(tmpMap);
		defMap.put("dynamic_templates", list);
		defMap.put("date_detection", false);
		Map<String,Object> mappingsMap = new HashMap<String,Object>();
		mappingsMap.put("_default_", defMap);
		
		Map<String,Object> rootmap = new HashMap<String,Object>();
		rootmap.put("mappings", mappingsMap);
		return rootmap;
	}
	
	
	public static void createDynamicIndex(){
		CreateIndexRequestBuilder createIndexRequestBuilder = client.admin().indices().prepareCreate("qmt2");
		createIndexRequestBuilder.setSource(JSON.toJSONString(initSettings()));
		createIndexRequestBuilder.execute().actionGet().isAcknowledged();
		JSONObject json= new JSONObject();
		json.put("name", "zs");
		json.put("age", "12");
		json.put("createtime", new Date());
		
		
		  IndexResponse response = client.prepareIndex("qmt2", "address")  
	               //必须为对象单独指定ID  
	               .setId("1")  
	               .setSource(json)  
	               .execute()  
	               .actionGet();  
		  System.out.println("aaaaaaaa");
		
	}
	
	
	
	
}
