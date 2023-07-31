package Programs;

import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number is divisible by 3");
		int n=scan.nextInt();
		divisibleBy5(n);
	}

	public static void divisibleBy5(int n) {
		for(int i=0;i<=n;i++)
		{
			if(i%3==0)
			System.out.println(i);
		}
}
}
