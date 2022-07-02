package com.session.six;

import java.io.Serializable;

public class UserDetails implements Serializable{
  private static final long serialVersionUID = 1L;
  private String firstName;
  private String lastName;
  private String userId;
  private String password;
  
public UserDetails(String firstName, String lastName, String userId, String password) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.userId = userId;
	this.password = password;
}

public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

public String getUserId() {
	return userId;
}

public String getPassword() {
	return password;
}

@Override
public String toString() {
	return "UserDetails [firstName=" + firstName + ", lastName=" + lastName + ", userId=" + userId + ", password="
			+ password + "]";
}
  
 
  
}
