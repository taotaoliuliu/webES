package com.aebiz.vo;

public class CategoryPropertyType {
	
	
		
	public static final String TYPE="categoryPropertyType";

	
	
	private String categoryPropertyTypeUuid;//  pt001 pt002  pt003     
	
	
	private String categoryTemplateUuid; // 属于哪个模板
	
	private String name;//机身内存   颜色  品牌
	
	private String field ;// size  color  brand  



	public String getCategoryPropertyTypeUuid() {
		return categoryPropertyTypeUuid;
	}

	public void setCategoryPropertyTypeUuid(String categoryPropertyTypeUuid) {
		this.categoryPropertyTypeUuid = categoryPropertyTypeUuid;
	}

	public String getCategoryTemplateUuid() {
		return categoryTemplateUuid;
	}

	public void setCategoryTemplateUuid(String categoryTemplateUuid) {
		this.categoryTemplateUuid = categoryTemplateUuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
