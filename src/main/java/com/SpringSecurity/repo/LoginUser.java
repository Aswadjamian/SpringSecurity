 package com.SpringSecurity.repo;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.SpringSecurity.entity.User;

public class LoginUser implements UserDetails {

	private final User u;
	public LoginUser(User u){
		this.u=u;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return List.of(()->"read");
	}

	@Override
	public String getPassword() {
		return u.getPassword();
		// TODO Auto-generated method stub
	
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return u.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
