package com;

import java.util.Scanner;

public class Solution {
private static final int result = 0;

public static void main(String[] args) {
Scanner s=new Scanner(System.in);
Calculator c=new Calculatorimp();//--- step4 upcasting-----
while(true) {
System.out.println("1:addition\n2:substraction\n3:multiplication");
System.out.println("4:Division\n5:Exit:\nEnter choice:");
int choice=s.nextInt();
int a=0;
int b=0;
if(choice>=1 && choice<=4) {
	System.out.println("enter 2 numbers:");
	a=s.nextInt();
	a=s.nextInt();
	
}
switch(choice) {
case 1:
	System.out.println("sum of "+a+" & "+b+" is "+c.add(a, b));
	break;

case 2:
	System.out.println("Difference of "+a+" & "+b+" is "+c.sub(a, b));
	break;

case 3:
	System.out.println("product of "+a+" & "+b+" is "+c.mul(a, b));
	break;

case 4:
	int result=c.div(a, b);
	if(result!=-1) {
	//System.out.println("Division of "+a+" & "+b+" is "+c.div(a, b));
	System.out.println("Division of "+a+" & "+b+" is "+result);
	}
	else {
	System.out.println("cannot perform division");
	}
	break;
case 5:
	System.out.println("thank you");
	System.exit(0); //----------system is a class and exit is method and it is static(how it is static means if any method access with class if it is static-----
	
    //System.out.println("invalid choice");
	//System.out.println("------------------");
	
	
}
}
}

}




