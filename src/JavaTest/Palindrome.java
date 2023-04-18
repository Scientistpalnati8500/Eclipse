package JavaTest;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the string :");
		String str = sc.nextLine();
		
		String reverse = new StringBuilder(str).reverse().toString();
		
		System.out.println("you entered string " + str + " reverse is " + reverse);
		
		if(str.equals(reverse)) {
			System.out.println("you entered string " + str + " is a Palindrome");
		}else {
			System.out.println("you entered string " + str + " is not a Palindrome");
		}
		
	}

}
