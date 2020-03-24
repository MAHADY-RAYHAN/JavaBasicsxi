package com.syntax.class11;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
//	Accept username, password and confirm password from a user and check following requirements:
//
//	Username and Password cannot be  empty, if so→ message=“Username and Password cannot be empty”.
//	Password should be minimum 8 characters, if less → message=“Password is too short”.
//	Password cannot contain username if so, → message=“Password cannot contain username”.
//	Password should match confirmed password, if not  → message=“Passwords do not match”.
//
//	Only after all requirements met → message “Your username and password has been created”

		Scanner scan=new Scanner(System.in);
		String userName;
		String userPass;
		String message;
		String confirmedPass;
		
		System.out.println("Please enter username");
		userName=scan.nextLine();
		System.out.println("Please enter user password");
		userPass=scan.nextLine();

		if(!(userName.isEmpty()||userPass.isEmpty())) {
			message="user id and password matched";
			if(userPass.length()>=8) {
				message="valid password";
				if(!(userPass.contains(userName))) {
					System.out.println("please confirm password");
					confirmedPass=scan.nextLine();
				if(userPass.equals(confirmedPass)) {
					message="Your username and password has been created";
				}else {
					message="Passwords do not match";
				}
				}else {
					message="password cannot contain username";
				}
			}else {
				message="Password is too short";
			}
			
		}else {
			message="Username and Password cannot be empty";
		}
		System.out.println(message);
	}

}
