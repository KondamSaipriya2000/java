package Programs;

import java.util.Scanner;

public class Solution7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n");
		int n=scan.nextInt();
		printEvenDivisibleBy3(n);
	}

	public static void printEvenDivisibleBy3(int n) {
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				if(i%3==0)
				{
					System.out.println(i);	
				}
			}
		}
		
	}
}
