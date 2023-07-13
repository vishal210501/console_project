package com.controller;

import com.bean.*;

public interface StoreDetails {

	public StoreInfo add_new_product(StoreInfo si);

	public int remove_product(int product_id);

	public int update_product_stock(int product_id);

	public void Display_allproduct_list();

	public int display_total_valueof_product(int product_id, int quantity);

	public String search_product(String p_typename);

	public String search_by_type(String product_name);
}
