package com.achrzanowski.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.achrzanowski.springmvc.entity.Smartphone;;

@Repository
public class SmartphoneDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<Smartphone> getSmartphone() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Smartphone> theQuery = currentSession.createQuery("from Smartphone", Smartphone.class);
		
		List<Smartphone> smartphones = theQuery.getResultList();
		
		return smartphones;
	}

}