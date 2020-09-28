package com.brigdelabz.pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class User_registration {
	public boolean checkPattern(String value) {
		   boolean result = false;
		   String pattern = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[^A-z0-9]).{8,}";
		  
		   Pattern r = Pattern.compile(pattern);

		   Matcher m = r.matcher(value);
		   if (m.find())
			   	result = true;
		   else 
			   result = false;
		   
		   return result;
	   }
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration System ");
		Scanner sc = new Scanner(System.in);
	    User_registration obj = new User_registration();
	    System.out.println("Enter passowrd");   
	    String value = sc.nextLine();
	    Boolean ans = obj.checkPattern(value);
	    if(ans==true)
	    	System.out.println("Valid");
	    else
	    	System.out.println("Not valid");
	}
}
