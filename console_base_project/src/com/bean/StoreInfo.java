package com.bean;

public class StoreInfo {
	private int product_id;
	private String product_name;
	private ProductType product_type;
	private int product_price;

	public StoreInfo(int pd, String pname, ProductType productType, int price) {
		this.product_id = pd;
		this.product_name = pname;
		this.product_type = productType;
		this.product_price = price;
	}

	public StoreInfo() {

	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public ProductType getProduct_type() {
		return product_type;
	}

	public void setProduct_type(ProductType product_type) {
		this.product_type = product_type;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	@Override
	public String toString() {
		return "StoreInfo [product_id=" + product_id + ", product_name=" + product_name + ", product_type="
				+ product_type + ", product_price=" + product_price + "]";
	}

}
