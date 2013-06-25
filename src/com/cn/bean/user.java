package com.cn.bean;

public class user {
	/**
	 * ÓÃ»§Ãû
	 */
	private String username;

	
	/**
	 * ÃÜÂë
	 */
	private String passwrod;


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPasswrod() {
		return passwrod;
	}


	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}


	@Override
	public String toString() {
		return "user [username=" + username + ", passwrod=" + passwrod + "]";
	}


	public user() {
		super();
		// TODO Auto-generated constructor stub
	}


	public user(String username, String passwrod) {
		super();
		this.username = username;
		this.passwrod = passwrod;
	}
	
	
}
