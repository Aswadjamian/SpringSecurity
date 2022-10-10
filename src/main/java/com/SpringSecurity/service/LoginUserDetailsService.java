package com.SpringSecurity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.SpringSecurity.entity.User;
import com.SpringSecurity.repo.LoginUser;
import com.SpringSecurity.repo.UserRepository;

public class LoginUserDetailsService implements UserDetailsService{

	@Autowired 
	UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		// TODO Auto-generated method stub
		Optional<User>user=repo.findByUsername(username);
		System.out.println(user);
		User u= user.orElseThrow(()->new UsernameNotFoundException("UserName Not Found"));
		return new LoginUser(u);
	}

}
