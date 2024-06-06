package com.example.elasticsearch.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.elasticsearch.dto.UserDTO;
import com.example.elasticsearch.entity.User;
import com.example.elasticsearch.repository.UserElasticRepository;

@Service
public class UserServiceImpl implements UserService {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	
	private final UserElasticRepository userElasticRepository;
	
	public UserServiceImpl(UserElasticRepository userElasticRepository) {
		this.userElasticRepository = userElasticRepository;
	}

	@Override
	public UserDTO findUser(String userId) {
		User user = userElasticRepository.findById(userId);
		
		return null;
	}
}
