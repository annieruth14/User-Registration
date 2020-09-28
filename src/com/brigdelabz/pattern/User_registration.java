package com.brigdelabz.pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class User_registration {
	public boolean checkPattern(String first_name) {
		   boolean result = false;
		   String pattern = "^[A-Z][A-Za-z]{2,}$";
		   
		   Pattern r = Pattern.compile(pattern);

		   Matcher m = r.matcher(first_name);
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
	    System.out.println("Enter first name");   
	    String value = sc.nextLine();
	    Boolean ans = obj.checkPattern(value);
	    if(ans==true)
	    	System.out.println("Valid");
	    else
	    	System.out.println("Not valid");
	}
}
