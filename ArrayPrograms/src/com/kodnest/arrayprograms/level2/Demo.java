package com.kodnest.arrayprograms.level2;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	int a=scan.nextInt();
	int b=scan.nextInt();
	System.out.println("Before swaping"  +a+  "and"  +b);
	int help=0;
	a = help;
	b = a;
	help = b;
	System.out.println("After swaping"  +a+  "and"  +b);
}
}
