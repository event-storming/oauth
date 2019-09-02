package com.example.template.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Entity
@Table(name = "user")
public class User implements UserDetails{

	@Id
	@Getter@Setter
	private Long id;
	
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
