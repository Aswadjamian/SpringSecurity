package com.SpringSecurity.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringSecurity.entity.User;

public interface UserRepository  extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String uname);
}
    