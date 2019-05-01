package com.achrzanowski.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.achrzanowski.springmvc.entity.Notebook;;

@Repository
public class NotebookDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<Notebook> getNotebook() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Notebook> theQuery = currentSession.createQuery("from Notebook", Notebook.class);
		
		List<Notebook> notebooks = theQuery.getResultList();
		
		return notebooks;
	}

}