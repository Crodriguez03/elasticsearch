package com.example.elasticsearch.service;

import com.example.elasticsearch.dto.UserDTO;

public interface UserService {

	UserDTO findUser(String userId);
}
