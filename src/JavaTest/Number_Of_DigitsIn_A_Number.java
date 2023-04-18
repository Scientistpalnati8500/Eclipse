package JavaTest;


import java.util.Scanner;
public class Number_Of_DigitsIn_A_Number {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the some number :");
		int num = sc.nextInt();
		
		int count = 0;
		while(num>0) {
			num=num/10;
			count++;
			
		}
		
		System.out.println("this is the number of digits in a you entered number : " + count);
	}

}
