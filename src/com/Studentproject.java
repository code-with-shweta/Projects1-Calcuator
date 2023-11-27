package com;

import java.util.Scanner;

public class Studentproject {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println("enter choice:");
			int choice=s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("hiiiiii");
				break;
			case 2:
				System.out.println("byyyyyy");
				break;
			case 3:
				System.out.println("END");
				System.exit(0); //----------system is a class and exit is method and it is static(how it is static means if any method access with class if it is static-----
				default:
			    System.out.println("invalid choice");
				System.out.println("------------------");
				
			}
		}

	}

}
 