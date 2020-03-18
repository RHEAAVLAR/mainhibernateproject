package com.niit.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.niit.daoimpl.ShoesDAOImpl;
import com.niit.daoimpl.CartDAOImpl;
import com.niit.daoimpl.UserDAOImpl;
import com.niit.model.Shoes;
import com.niit.model.CartItem;
import com.niit.model.User;

public class CartTest
{
	CartDAOImpl cdi=new CartDAOImpl();
	UserDAOImpl udi=new UserDAOImpl();
	ShoesDAOImpl sdi=new ShoesDAOImpl();
	
	@Test
	public void addCartItem()
	{
		CartItem c=new CartItem();
		
		User u=udi.displayUserById(1);
		Shoes s=sdi.displayShoesById(2);
		
		c.setUser(u);
		c.setShoes(s);
		cdi.addCartItem(c);
	}
	
	@Test
	public void displayCartItemsByName()
	{
		List<CartItem> cartItems=cdi.displayCartItems("Govind123");
		
		for(CartItem c:cartItems)
		{
			System.out.println(c.getCartitemid());
			System.out.println(c.getShoes().getShoesid());
			System.out.println(c.getShoes().getShoestypes());
			System.out.println(c.getShoes().getBrands());
		}
	}
	
	
}