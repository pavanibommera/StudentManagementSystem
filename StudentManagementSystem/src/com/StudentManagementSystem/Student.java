package com.StudentManagementSystem;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String StudentID;
	private String courses;
	private int tuitionBalance;
	public char[] toString;
	private static int costofCourse = 500;
	private static int id = 1999;
	
	//constructor prompt user to enter students's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - sophmore\n3 - junior\n4 - senior\nEnter student class level");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		
		
	}
	//Generate ID
	private void setStudentID() {
		//Grade level = ID
		id++;
        this.StudentID = gradeYear + "" +id;
	}
	
	//Enroll in courses
	public void enroll() {
		//Get inside a loop, user hits 0
		do {
		System.out.print("Enter course to enroll(Q to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(!course.equals ("Q")) {
			courses = courses + "\n " + course;
			tuitionBalance = tuitionBalance + costofCourse;
		}
		else {
			
			break;
			}
	 }while(1 !=0); 
		
		
	}
	
	//view balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	//pay Tuition
	public void paytuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance + payment;
		System.out.println("Thank you for ur payment of $" + payment);
		viewBalance();
	}
	
	//show status
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: " + gradeYear +
                "\nStudent ID: " + StudentID +
	            "\nCourses Enrolled:" + courses +
	            "\nBalance:$" + tuitionBalance;
	
}
	public void paytuition(int i) {
		// TODO Auto-generated method stub
		
	}public static void main(String[] args) {

	       //Ask how many new students we want to add
	        System.out.println("Enter number of new students to enroll");
	        Scanner in = new Scanner(System.in);
	        int numofstudents = in.nextInt();
	        Student[] students=new Student[numofstudents];
	        
	        //create a number of new students
	        for(int n=0;n<numofstudents;n++) {
	        	Student stu1 = new Student();
				stu1.enroll();
				stu1.paytuition();
				
				
				for(int n1=0;n1<numofstudents;n1++) {
					System.out.println(students[n1].toString());
				}
	        }
		}
}


