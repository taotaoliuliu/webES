package com.aebiz.vo;

public class FrontCategoryPropertyTemplate {


	public static final String TYPE="frontCategoryPropertyTemplate";

	
	private String frontCategoryPropertyTemplateUuid;
	
	private String name; //前台手机模板
	
	private String categoryTemplateUuid;//后台手机模板的uuid
	
	private String categoryUuid;
	
	
	
	
	

	

	public String getCategoryUuid() {
		return categoryUuid;
	}

	public void setCategoryUuid(String categoryUuid) {
		this.categoryUuid = categoryUuid;
	}

	public String getFrontCategoryPropertyTemplateUuid() {
		return frontCategoryPropertyTemplateUuid;
	}

	public void setFrontCategoryPropertyTemplateUuid(String frontCategoryPropertyTemplateUuid) {
		this.frontCategoryPropertyTemplateUuid = frontCategoryPropertyTemplateUuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategoryTemplateUuid() {
		return categoryTemplateUuid;
	}

	public void setCategoryTemplateUuid(String categoryTemplateUuid) {
		this.categoryTemplateUuid = categoryTemplateUuid;
	}
	
	
	
	
	
	
	
	
	
}
