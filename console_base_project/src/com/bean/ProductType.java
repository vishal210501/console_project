package com.bean;

public class ProductType {

	private int p_typeid;
	private String p_typename;

	public ProductType(int tid, String tname) {
		this.p_typeid = tid;
		this.p_typename = tname;
	}

	public ProductType() {

	}

	@Override
	public String toString() {
		return "ProductType [p_typeid=" + p_typeid + ", p_typename=" + p_typename + "]";
	}

	public int getP_typeid() {
		return p_typeid;
	}

	public void setP_typeid(int p_typeid) {
		this.p_typeid = p_typeid;
	}

	public String getP_typename() {
		return p_typename;
	}

	public void setP_typename(String p_typename) {
		this.p_typename = p_typename;
	}

}
