package com.jamerson.jwt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.jamerson.jwt.entity.User;
import com.jamerson.jwt.repository.UserRepository;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public User findByEmail(String email) {
		return this.userRepository.findByEmail(email);
	}

	public User createOrUpdate(User user) {
		return this.userRepository.save(user);
	}

	public Optional<User> findById(String id) {
		return this.userRepository.findById(id);
	}

	public void delete(String id) {
		this.userRepository.deleteById(id);
	}

	public Page<User> findAll(int page, int count) {
		return this.userRepository.findAll(PageRequest.of(page, count));
	}

}
