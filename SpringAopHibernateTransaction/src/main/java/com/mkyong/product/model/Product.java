package com.mkyong.product.model;

public class Product implements java.io.Serializable {

	private Long productId;
	private String productCode;
	private String productDesc;

	public Product() {
	}

	public Product(String productCode, String productDesc) {
		this.productCode = productCode;
		this.productDesc = productDesc;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDesc() {
		return this.productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
}
