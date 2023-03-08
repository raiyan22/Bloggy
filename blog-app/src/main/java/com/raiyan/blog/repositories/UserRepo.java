package com.raiyan.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raiyan.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	

}
