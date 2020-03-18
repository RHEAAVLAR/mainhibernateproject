package com.niit.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Shoes")
public class Shoes
{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int Shoesid;
		@Column
		private String Shoestypes;
		private String Brands;
		private Float price;
		private String link;
		
		@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "shoes")
		private List<CartItem> cartItems;

		public int getShoesid() {
			return Shoesid;
		}

		public void setShoesid(int shoesid) {
			Shoesid = shoesid;
		}

		public String getShoestypes() {
			return Shoestypes;
		}

		public void setShoestypes(String shoestypes) {
			Shoestypes = shoestypes;
		}

		public String getBrands() {
			return Brands;
		}

		public void setBrands(String brands) {
			Brands = brands;
		}

		public Float getPrice() {
			return price;
		}

		public void setPrice(Float price) {
			this.price = price;
		}

		public String getLink() {
			return link;
		}

		public void setLink(String link) {
			this.link = link;
		}

		public List<CartItem> getCartItems() {
			return cartItems;
		}

		public void setCartItems(List<CartItem> cartItems) {
			this.cartItems = cartItems;
		}
		
		
	}

