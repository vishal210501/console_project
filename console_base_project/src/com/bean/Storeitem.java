package com.bean;

public class Storeitem {

	private StoreInfo sti;
	private int quantity;

	public Storeitem(StoreInfo sio, int qunty) {
		this.sti = sio;
		this.quantity = qunty;
	}

	public Storeitem() {

	}

	@Override
	public String toString() {
		return " Storeitem [sti=" + sti + ", quantity=" + quantity + "]";
	}

	public StoreInfo getsti() {
		return sti;
	}

	public void setPr(StoreInfo sti) {
		this.sti = sti;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
