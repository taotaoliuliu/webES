package com.aebiz.vo;

public class KeyWordType {

	
	
	public static final String TYPE="keyWordType";

	
	private String uuid;
	
	private String keyWordUuid;
	
	private String frontCategoryUuid;
	
	
	private String frontCategoryName;
	
	private int click;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getKeyWordUuid() {
		return keyWordUuid;
	}

	public void setKeyWordUuid(String keyWordUuid) {
		this.keyWordUuid = keyWordUuid;
	}



	public String getFrontCategoryUuid() {
		return frontCategoryUuid;
	}

	public void setFrontCategoryUuid(String frontCategoryUuid) {
		this.frontCategoryUuid = frontCategoryUuid;
	}

	public String getFrontCategoryName() {
		return frontCategoryName;
	}

	public void setFrontCategoryName(String frontCategoryName) {
		this.frontCategoryName = frontCategoryName;
	}

	public int getClick() {
		return click;
	}

	public void setClick(int click) {
		this.click = click;
	}
	
	
	
	
	
	
}
