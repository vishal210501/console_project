package com.controller;

import java.util.*;
import com.bean.*;

public class StoreImplementation implements StoreDetails {

	ArrayList<StoreInfo> al = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	StoreInfo si = new StoreInfo();
	ProductType pt = new ProductType();
	Storeitem sit = new Storeitem();

	@Override
	public StoreInfo add_new_product(StoreInfo si) {

		System.out.println("Enter number of products");
		int product = sc.nextInt();
		for (int i = 1; i <= product; i++) {
			System.out.println("Enter Product Id: ");
			int pd = sc.nextInt();
			System.out.println("Enter Product Name: ");
			String pname = sc.next();
			System.out.println("Enter Quantity of product");
			int qunty = sc.nextInt();
			System.out.println("Enter Product type Id: ");
			int tid = sc.nextInt();
			System.out.println("Enter Type of Product ");
			String tname = sc.next();
			System.out.println("Enter Price of product:");
			int price = sc.nextInt();
			StoreInfo sio = new StoreInfo(pd, pname, new ProductType(tid, tname), price);
			Storeitem z = new Storeitem(sio, qunty);
			al.add(sio);
			System.out.println(al + " " + z);
		}

		return si;
	}

	@Override
	public int remove_product(int product_id) {
		System.out.println("Enter Product id to romove product");
		int ids = sc.nextInt();
		if (al.isEmpty()) {
			throw new NullPointerException();
		} else {

			for (int i = 0; i < al.size(); i++) {
				if (ids == al.get(i).getProduct_id()) {
					al.remove(i);
					System.out.println("Removed Sucessfully");
				}

				else {
					throw new NullPointerException();
				}
			}

			return 0;
		}
	}

	@Override
	public int update_product_stock(int product_id) {
		System.out.println("Enter Product Id to update Price:");
		int uid = sc.nextInt();
		System.out.println("enter old price");
		int opri = sc.nextInt();
		System.out.println("Enter new product price: ");
		int pri = sc.nextInt();
		if (al.isEmpty()) {
			throw new NullPointerException();
		} else {

			for (int i = 0; i < al.size(); i++) {
				if (uid == al.get(i).getProduct_id()) {
					opri = pri;
					// pri==al.get(i).getProduct_price();
					System.out.println("price updated");
					System.out.println(al.get(i).getProduct_id() + " " + al.get(i).getProduct_name() + " " + pri);
				}

			}
		}

		return pri;

	}

	@Override
	public void Display_allproduct_list() {
		System.out.println("Display Product list");
		try {
			if (al.isEmpty()) {
				throw new NullPointerException();
			}
		} catch (NullPointerException n) {
			System.out.println(n.getLocalizedMessage());
		}
		for (int i = 0; i < al.size(); i++) {
			System.out.println("Product Details: " + al.get(i).getProduct_id() + " " + al.get(i).getProduct_name() + " "
					+ al.get(i).getProduct_type() + " " + al.get(i).getProduct_type() + " "
					+ al.get(i).getProduct_price());
		}

	}

	@Override
	public int display_total_valueof_product(int product_id, int quantity) {
		System.out.println("enter the product_id");
		int tid = sc.nextInt();
		System.out.println("enter the quantity of product");
		int trp = sc.nextInt();
		int total = 0;
		if (al.isEmpty()) {
			throw new NullPointerException();
		} else {

			for (int i = 0; i < al.size(); i++) {
				if (tid == al.get(i).getProduct_id()) {
					total = trp * al.get(i).getProduct_price();
					System.out.println("product name :" + al.get(i).getProduct_name() + " " + "quantity :" + quantity
							+ "your total bill :" + total + "only /-");

				}
			}
			return total;

		}
	}

	@Override
	public String search_product(String product_name) {
		System.out.println("Enter product name for search");
		product_name = sc.next();
		if (al.isEmpty()) {
			throw new NullPointerException();
		}
		boolean pnamepresent = false;
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).getProduct_name().equalsIgnoreCase(product_name)) {
				pnamepresent = true;
				break;
			}
		}
		if (pnamepresent == true) {
			for (int j = 0; j < al.size(); j++) {
				if (al.get(j).getProduct_name().equalsIgnoreCase(product_name)) {
					System.out.println("your product : " + al.get(j).getProduct_id() + " " + al.get(j).getProduct_name()
							+ " " + al.get(j).getProduct_type().getP_typeid() + " "
							+ al.get(j).getProduct_type().getP_typename() + " " + al.get(j).getProduct_price());
				}
			}
		} else {
			throw new NullPointerException();
		}
		return product_name;

	}

	@Override
	public String search_by_type(String p_typename) {

		System.out.println("which type of product you want: ");
		p_typename = sc.next();
		if (al.isEmpty()) {
			throw new NullPointerException();
		}
		boolean ispresent = true;
		for (StoreInfo so : al) {
			if (p_typename.equalsIgnoreCase(so.getProduct_type().getP_typename())) {
				ispresent = true;

			}

		}
		if (ispresent == true) {
			for (StoreInfo so : al) {
				if (p_typename.equalsIgnoreCase(so.getProduct_type().getP_typename())) {
					System.out.println("The Category of Product is: " + so.getProduct_id() + " " + so.getProduct_name()
							+ " " + so.getProduct_type().getP_typeid() + " " + so.getProduct_type().getP_typename()
							+ " " + so.getProduct_price());
				}
			}
		} else {
			throw new NullPointerException();
		}
		return p_typename;

	}

}