package com.pratyush;

public class userValidationService {

	
	public boolean isValid(String user , String password) {
		if(user.equals(password))
				return true;
				return false;
	}
}
