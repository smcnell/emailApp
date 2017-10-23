package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity;
	private int defaultPasswordLength = 6;
	private String alternateEmail;
	private String companySuffix = "comcast.com";
	
	//Constructor to receive first and last name;
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println("EMAIL: " + this.firstName + this.lastName);
		
		//Call a method asking for department
		this.department = setDepartment();
		System.out.println("Department: " + department);

		
		//return password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Password: " + this.password);

		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Email: " + this.email);

		
	}
	//Ask for the department
	private String setDepartment() {
		System.out.print("Enter  the department: 1 for Sales, 2 for Development, 3 for Aaccounting, 0 for none");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {
			return "sales";
		} else if (depChoice ==2) {
			return "dev";
		} else if (depChoice == 3) {
			return "acct";
		} else {
			return "";
		}
		
		
	}
	//Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456#";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String (password);
		
	}
	

	
	//Set the mailbox capacity
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	
	//Set the alternate email
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	//Change the password
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
}
