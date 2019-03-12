package com.aebiz.vo;

import java.util.UUID;

public class KeyWord {

	
	private String uuid;
	
	private String chineseName;
	
	private String chineseNameNoAnalayze;
	
	
	private String fullName;
	
	private String simpleName;
	
	
	private int click;
	
	
	
	public String genUuid(){
		
		String uuid = UUID.randomUUID().toString();
		
		return uuid;
		
	}


	public String getUuid() {
		return uuid;
	}


	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


	public String getChineseName() {
		return chineseName;
	}


	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getSimpleName() {
		return simpleName;
	}


	public void setSimpleName(String simpleName) {
		this.simpleName = simpleName;
	}


	public int getClick() {
		return click;
	}


	public void setClick(int click) {
		this.click = click;
	}


	public String getChineseNameNoAnalayze() {
		return chineseNameNoAnalayze;
	}


	public void setChineseNameNoAnalayze(String chineseNameNoAnalayze) {
		this.chineseNameNoAnalayze = chineseNameNoAnalayze;
	}


	
	
	
	
	
	
}
