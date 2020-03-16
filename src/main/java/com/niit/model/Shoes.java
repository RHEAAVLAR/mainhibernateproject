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
		
		@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "Shoes")
		//private List<CartItem> cartItems;
		
		public String getLink() {
			return link;
		}
		public void setLink(String link) {
			this.link = link;
		}
		
		public int getShoesid() {
			return Shoesid;
		}
		public void setShoesid(int Shoesid) {
			Shoesid = Shoesid;
		}
		public String getShoestypes() {
			return Shoestypes;
		}
		public void set(String Shoestypes) {
			Shoestypes = Shoestypes;
		}
		public String getBrands() {
			return Brands;
		}
		public void setBrands(String Brands) {
			Brands = Brands;
		}
		public Float getPrice() {
			return price;
		}
		public void setPrice(Float price) {
			this.price = price;
		}
		
		
		
	}

