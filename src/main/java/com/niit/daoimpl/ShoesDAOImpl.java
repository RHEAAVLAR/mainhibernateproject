package com.niit.daoimpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.niit.dao.ShoesDAO;
import com.niit.dbconfig.HibernateUtil;
import com.niit.model.Shoes;

public class ShoesDAOImpl implements ShoesDAO
{

	public boolean addShoes(Shoes Shoes)
	{
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.save(Shoes);
		tx.commit();
		return true;
	}

	public boolean deleteShoes(int Shoesid) 
	{
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		Shoes Shoes=new Shoes();
		Shoes.setShoesid(Shoesid);
		session.delete(Shoes);
		tx.commit();
		return true;
	}

	public boolean updateShoes(Shoes Shoes) 
	{
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.update(Shoes);
		tx.commit();
		return true;
	}

	public List<Shoes> displayShoes()
	{
		Session session=HibernateUtil.getSession();
		return session.createQuery("from com.niit.model.Shoes").list();
	}

	public Shoes displayShoesById(int Shoesid) 
	{
		Session session=HibernateUtil.getSession();
		Query query=session.createQuery("from com.niit.model.Shoes where Shoesid= :sid");
		query.setParameter("sid", Shoesid);
		return (Shoes)query.getResultList().get(0);
	}
	
	public List<Shoes> displayShoesBytype(String name)
	{
		Session session=HibernateUtil.getSession();
		Query query=session.createQuery("from com.niit.model.Shoes where Shoestype like :type");
		query.setParameter("type", "%"+name+"%");
		return query.getResultList();
	}
	
	public List<Shoes> displayShoesByPriceHighToLow() 
	{
		Session session=HibernateUtil.getSession();
		return session.createQuery("from com.niit.model.Shoes order by price desc").getResultList();
	}

	public List<Shoes> displayShoesByPriceLowToHigh() 
	{
		Session session=HibernateUtil.getSession();
		return session.createQuery("from com.niit.model.Shoes order by price asc").getResultList();
	}

	public List<Shoes> displayShoesBytypes(String Shoestypes) {
		// TODO Auto-generated method stub
		return null;
	}

}