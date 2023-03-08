package com.raiyan.blog.services;

import java.util.List;

import com.raiyan.blog.payloads.UserDto;

public interface UserService {
	
		UserDto createUser(UserDto user);
		UserDto updateUser(UserDto user, Integer id);
		UserDto getUserById(Integer userId);
		List<UserDto> getAllUsers();
		void deleteUser(UserDto userId);
}

