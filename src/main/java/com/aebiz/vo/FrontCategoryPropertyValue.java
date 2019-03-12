package com.aebiz.vo;

public class FrontCategoryPropertyValue {

	
	public static final String TYPE="frontCategoryPropertyValue";

	private String frontCategoryPropertyValueUuid;
	
	private String frontCategoryPropertyTemplateUuid;
	
	private String categoryPropertyTypeUuid;
	
	private String categoryPropertyTypeName;//品牌 网络
	
	private String categoryPropertyTypeField;//brand network 
	
	private String[] fieldValue;

	public String getFrontCategoryPropertyValueUuid() {
		return frontCategoryPropertyValueUuid;
	}

	public void setFrontCategoryPropertyValueUuid(String frontCategoryPropertyValueUuid) {
		this.frontCategoryPropertyValueUuid = frontCategoryPropertyValueUuid;
	}

	public String getFrontCategoryPropertyTemplateUuid() {
		return frontCategoryPropertyTemplateUuid;
	}

	public void setFrontCategoryPropertyTemplateUuid(String frontCategoryPropertyTemplateUuid) {
		this.frontCategoryPropertyTemplateUuid = frontCategoryPropertyTemplateUuid;
	}

	public String getCategoryPropertyTypeUuid() {
		return categoryPropertyTypeUuid;
	}

	public void setCategoryPropertyTypeUuid(String categoryPropertyTypeUuid) {
		this.categoryPropertyTypeUuid = categoryPropertyTypeUuid;
	}

	public String getCategoryPropertyTypeName() {
		return categoryPropertyTypeName;
	}

	public void setCategoryPropertyTypeName(String categoryPropertyTypeName) {
		this.categoryPropertyTypeName = categoryPropertyTypeName;
	}

	public String getCategoryPropertyTypeField() {
		return categoryPropertyTypeField;
	}

	public void setCategoryPropertyTypeField(String categoryPropertyTypeField) {
		this.categoryPropertyTypeField = categoryPropertyTypeField;
	}

	public String[] getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String[] fieldValue) {
		this.fieldValue = fieldValue;
	}
	
	
	
	
	
	
}
