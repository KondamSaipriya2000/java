package Programs;

import java.util.Scanner;

public class Solution5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number is divisible by 3 comes in table of 5");
		int n=scan.nextInt();
		divisibleBy3and5(n);
	}

	public static void divisibleBy3and5(int n) {
		for(int i=0;i<=n;i++)
		{
			if(i%5==0 && i%3==0)
			System.out.println(i);
		}
}
}
