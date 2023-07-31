package com.kodnest.arrayprograms.level2;

import java.util.Scanner;

public class PrintPositive {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int []arr=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements to store in array");
		for(int i=0;i<=arr.length-1;i++)
		{
		arr[i]=scan.nextInt();
		}
		for( int x:arr)
		if(x>=0)	
		{
		System.out.print(x+" ");
		}
	}
}
