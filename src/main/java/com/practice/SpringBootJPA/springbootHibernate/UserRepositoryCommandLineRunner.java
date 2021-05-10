package com.practice.SpringBootJPA.springbootHibernate;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practice.SpringBootJPA.springbootHibernate.entity.User;
import com.practice.SpringBootJPA.springbootHibernate.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger logger =
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User("Jill","Supervisor");
		userRepository.save(user);
		
		User user3 = new User("Kunal","Owner");
		userRepository.save(user3);
		
		//New user is created : User [id=1, name=Jill, role=Supervisor]
		logger.info("New user is created : {}",user);
		
		Optional<User> userId1 = userRepository.findById(1L);
		logger.info("User with id 1 : {}",userId1);
		
		List<User> allUsers = userRepository.findAll();
		logger.info("All Users : {}",allUsers);
		
		logger.info("All Users count: {}",userRepository.count());
		userRepository.deleteById(2L);
		logger.info("All Users : {}",userRepository.findAll());
		
	}

}
