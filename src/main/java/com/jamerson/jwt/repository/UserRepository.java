package com.jamerson.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jamerson.jwt.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

	User findByEmail(String email);

}
