package com.example.elasticsearch.controller;

import com.example.elasticsearch.dto.UserDTO;

public interface UserController {

	UserDTO findUser(String userId);
	
}
