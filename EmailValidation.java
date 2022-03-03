package com.example.regex;
import java.util.regex.Pattern;
public class EmailValidation {
	public static void main (String[] args){
	     String email1="info@infybuzz.com";
	      String email2="infoinfybuzz.com";
	System.out.println(validateEmail(email1));
	System.out.println(validateEmail(email2));
	}
	public static String validateEmail(String email){
	if(email==null||email.isEmpty()){
	return "Invalid";
	}
	String emailRegex="^[a-zA-Z0-9_+&*-]+(?:\\\\.[a-zA-Z0-9_+&*-]"+")*@(?:[a-zA-Z0-9-]+\\\\.)"+"[a-zA-Z]{2,7}$";
	Pattern pattern=Pattern.compile(emailRegex);
	if(pattern.matcher(email).matches()){
	return"Valid";
	}
	else{
	return"Invalid";
	}
	}
}
