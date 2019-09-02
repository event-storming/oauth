package com.example.template.entity;

import java.util.Collection;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Entity
@Table(name = "users")
public class User implements UserDetails{

	@Id
	@Getter@Setter
	private String username;
	
	@Column(length=400)
	@Getter@Setter
	private String password;
	
	@Column
	@Getter@Setter
	private String role;
	
	@Transient
	@Getter@Setter
	private Collection<? extends GrantedAuthority> authorities;
	
	@Getter@Setter
	private boolean accountNonExpired = true;
	
	@Getter@Setter
	private boolean accountNonLocked = true;

	@Getter@Setter
	private boolean credentialsNonExpired = true;
	
	@Getter@Setter
	private boolean enabled = true;


}
