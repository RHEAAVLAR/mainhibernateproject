package com.niit.test;

import static org.junit.Assert.assertNotEquals;

import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;

import com.niit.daoimpl.ShoesDAOImpl;
import com.niit.model.Shoes;

public class ShoesTest 
{
	ShoesDAOImpl sdi=new ShoesDAOImpl();
	
	@Test
	public void addShoes()
	{
		Shoes s=new Shoes();
		s.setShoestypes("Sneakers");
		s.setBrands("Nike");
		s.setPrice((float)1200.00);
		s.setLink(null);
		sdi.addShoes(s);
	}
		
		
	
	@Test
	@Ignore
	public void deleteShoes()
	{
		sdi.deleteShoes(1);
	}
	
	@Test
	@Ignore
	public void updateShoes()
	{
		Shoes s=sdi.displayShoesById(2);
		s.setShoestypes("sneakers");
	     sdi.updateShoes(s);
	}
	
	@Test
	@Ignore
	public void displayShoesById()
	{
		assertNotEquals(null, sdi.displayShoesById(5));
	}
	
	@Test
	@Ignore
	public void displayShoes()
	{
		assertNotEquals(null, sdi.displayShoes());
	}
	
	
	
}
