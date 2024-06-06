package com.example.elasticsearch.repository;

import com.example.elasticsearch.entity.User;

public interface UserElasticRepository {

	User index(User user);

	User findById(String id);

}
