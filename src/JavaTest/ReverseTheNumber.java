package JavaTest;

import java.util.Scanner;

public class ReverseTheNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the some number :");
		long num = sc.nextInt();
		
		StringBuffer sbr = new StringBuffer(String.valueOf(num));
		StringBuffer reverse = sbr.reverse();
		
		System.out.println("this is the reverse number of you entered number :" + reverse);
	}

}
