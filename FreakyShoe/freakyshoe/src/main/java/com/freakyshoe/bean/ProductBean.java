package com.freakyshoe.bean;

public class ProductBean {
	long productId;
	int quantity;
	String productName;
	double price;

	public ProductBean(long productId, int quantity, String productName, double price) {
		super();
		this.productId = productId;
		this.quantity = quantity;
		this.productName = productName;
		this.price = price;
	}

	public ProductBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", quantity=" + quantity + ", productName=" + productName
				+ ", price=" + price + "]";
	}

}
