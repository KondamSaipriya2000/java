package Programs;

import java.util.Scanner;

public class Solution4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number is divisible by 2 and 5");
		int n=scan.nextInt();
		divisibleBy5and2(n);
	}

	public static void divisibleBy5and2(int n) {
		for(int i=0;i<=n;i++)
		{
			if(i%5==0 && i%2==0)
			System.out.println(i);
		}
}
}
