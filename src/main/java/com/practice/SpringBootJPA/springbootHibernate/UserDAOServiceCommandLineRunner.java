package com.practice.SpringBootJPA.springbootHibernate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practice.SpringBootJPA.springbootHibernate.entity.User;
import com.practice.SpringBootJPA.springbootHibernate.service.UserDAOService;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

	private static final Logger logger =
			LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDAOService;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User("Jack","Admin");
		long insert = userDAOService.insert(user);
		
		//New user is created : User [id=1, name=Jack, role=Admin]
		logger.info("New user is created : {}",user);
		
	}

}
