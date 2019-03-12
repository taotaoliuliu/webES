package com.aebiz.vo;

import java.util.List;
import java.util.Map;

public class Product {
	
	
	public static final String TYPE="newProduct";

	
	private String name;
	
	private String categoryUuid; //类别
		
	private String frontCategoryPropertyTemplateUuid;//所属前台模板
	
	private String createtime;
	
	private String description;
	
	private String brand;
	
	private double productPrice;
	
	
	private String id;
	
	
	private double myscore2;
	
	
	
	
	
	
	
	

	public double getMyscore2() {
		return myscore2;
	}


	public void setMyscore2(double myscore2) {
		this.myscore2 = myscore2;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	private List<Map<String,Object>> productExtend; //商品的其他属性

	
	
	

	public double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


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


	public String getCreatetime() {
		return createtime;
	}


	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public List<Map<String, Object>> getProductExtend() {
		return productExtend;
	}


	public void setProductExtend(List<Map<String, Object>> productExtend) {
		this.productExtend = productExtend;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", categoryUuid=" + categoryUuid + ", frontCategoryPropertyTemplateUuid="
				+ frontCategoryPropertyTemplateUuid + ", createtime=" + createtime + ", description=" + description
				+ ", brand=" + brand + ", productPrice=" + productPrice + ", id=" + id + ", myscore2=" + myscore2
				+ ", productExtend=" + productExtend + "]";
	}



	
	
	
	
	
	
	
	
	

}
