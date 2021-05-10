package com.practice.SpringBootJPA.springbootHibernate.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.SpringBootJPA.springbootHibernate.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
