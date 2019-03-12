package com.aebiz.Utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

public class ESHelper {
	
	private static  Client client;

	
	
	public static Client getESClient(){
		

		
		try {
			if(client==null){
				
				client = TransportClient.builder().build()
				         .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("192.168.137.87"), 9300));
			
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		return client;
		
	}
	
}
