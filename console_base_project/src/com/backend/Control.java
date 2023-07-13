package com.backend;

import com.bean.*;
import com.bean.Not_Found_Exception.NotFoundException;
import com.bean.Not_Found_Exception.NotFoundException;
import com.controller.*;

public class Control {

	StoreImplementation sin=new StoreImplementation();
	
	public void Operation(int option)
	{
		String name=null;
		switch(option)
		{
		case 1: StoreInfo s=null;
		sin.add_new_product(s);
		break;
		case 2: try {
			sin.remove_product(option);
		}
		catch(NotFoundException a)
		{
			a.getLocalizedMessage();
		}
		break;
		case 3: try {
			sin.update_product_stock(option);
		}
		catch(NotFoundException b)
		{
			b.getLocalizedMessage();
		}
		break;
		case 4: try
		{
			sin.search_product(name);
		}
		catch(NotFoundException c)
		{
			c.getLocalizedMessage();
		}
		break;
		case 5: try {
			sin.Display_allproduct_list();
		}
		catch(NullPointerException d)
		{
			d.getLocalizedMessage();
		}
		break;
		case 6: try
		{
			sin.search_by_type(name);
		}
		catch(NotFoundException e)
		{
			e.getLocalizedMessage();
		}
		break;
		case 7: try {
			sin.display_total_valueof_product(option, option);
		}
		catch(NotFoundException f)
		{
			f.getLocalizedMessage();
		}
		break;
		default :System.out.println("Invalid Choice");
		
			
		}
		
	}

	
}
