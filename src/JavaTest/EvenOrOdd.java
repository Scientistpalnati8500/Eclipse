package JavaTest;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the some number :");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("you entered number is even number :" + num);
		}else {
			System.out.println("you entered number is odd number :" + num);
		}
	}
	

}
