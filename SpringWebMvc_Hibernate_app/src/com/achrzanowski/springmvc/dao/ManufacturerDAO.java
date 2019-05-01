package com.achrzanowski.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.achrzanowski.springmvc.entity.Manufacturer;

@Repository
public class ManufacturerDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<Manufacturer> getManufacturer() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Manufacturer> theQuery = currentSession.createQuery("from Manufacturer", Manufacturer.class);
		
		List<Manufacturer> manufacturers = theQuery.getResultList();
		
		return manufacturers;
	}
	
	@Transactional
	public void saveManufacturer(Manufacturer theManufacturer) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.save(theManufacturer);
		
	}

}
