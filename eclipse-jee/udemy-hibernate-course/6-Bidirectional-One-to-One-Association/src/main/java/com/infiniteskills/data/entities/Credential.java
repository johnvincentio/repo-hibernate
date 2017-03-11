package com.infiniteskills.data.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CREDENTIAL")
public class Credential {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CREDENTIAL_ID")
	public Long credentialId;

	/*
	 * if user primary key is different, then use name="USER_ID", referencedColumnName=""
	 */
	@OneToOne(cascade=CascadeType.ALL)	// persist credential and user at the same time
	@JoinColumn(name="USER_ID")			// user_id is primary key in user.
	public User user;					// target entity
	
	@Column(name="USERNAME")
	private String username;

	@Column(name="PASSWORD")
	private String password;

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getCredentialId() {
		return credentialId;
	}

	public void setCredentialId(Long credentialId) {
		this.credentialId = credentialId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
