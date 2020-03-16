package com.niit.dao;

import java.util.List;

import com.niit.model.Shoes;

public interface ShoesDAO 
{
	public boolean addShoes(Shoes Shoes);
	public boolean deleteShoes(int Shoesid);
	public boolean updateShoes(Shoes Shoes);
	public List<Shoes> displayShoes();
	public Shoes displayShoesById(int Shoesid);
	public List<Shoes> displayShoesBytypes(String Shoestypes);
	public List<Shoes> displayShoesByPriceHighToLow();
	public List<Shoes> displayShoesByPriceLowToHigh();
}