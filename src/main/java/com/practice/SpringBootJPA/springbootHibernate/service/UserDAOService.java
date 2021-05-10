package com.practice.SpringBootJPA.springbootHibernate.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.practice.SpringBootJPA.springbootHibernate.entity.User;

@Repository
@Transactional // it says all method of the class are performs db transactions ie. Open transaction -> make a change -> close transaction
public class UserDAOService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}

}
