package program;

import java.util.Scanner;

public class Character {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character to check for digit or vowel or consonent");
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);
		}
		public static void identifyCharacter(char ch)
		{
		if(Character.isDigit(ch))
		{
		System.out.println("Entered Character "+ch+" Is Digit...");
		}
		else if(!Character.isLetter(ch))
		{
		System.out.println("Entered Character "+ch+" Is Special Character");
		}
		else
		{
		switch (Character.toLowerCase(ch)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		if(Character.toLowerCase(ch))
		{
		System.out.println("Entered Character "+ch+" Is Lower Case Vowel");
		}
		else
		{
		System.out.println("Entered Character "+ch+"Is Upper Case Vowel");
		}
		break;
		default:
		if(Character.toLowerCase(ch))
		{
		System.out.println("Entered Character "+ch+" Is Lower Case Consonent");
		}
		else
		{
		System.out.println("Entered Character "+ch+" is Upper case Consonent");
		}
		}
		}
		}
		private static int toLowerCase(char ch) {
			// TODO Auto-generated method stub
			return 0;
		}
		private static boolean isLetter(char ch) {
			// TODO Auto-generated method stub
			return false;
		}
		private static boolean isDigit(char ch) {
			// TODO Auto-generated method stub
			return false;
		}
}
