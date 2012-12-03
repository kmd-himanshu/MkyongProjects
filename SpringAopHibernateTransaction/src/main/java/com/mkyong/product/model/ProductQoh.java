package com.mkyong.product.model;

public class ProductQoh implements java.io.Serializable {

	private Long qohId;
	private long productId;
	private int qty;

	public ProductQoh() {
	}

	public ProductQoh(long productId, int qty) {
		this.productId = productId;
		this.qty = qty;
	}

	public Long getQohId() {
		return this.qohId;
	}

	public void setQohId(Long qohId) {
		this.qohId = qohId;
	}

	public long getProductId() {
		return this.productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
