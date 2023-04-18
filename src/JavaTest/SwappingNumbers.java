package JavaTest;

import java.util.Scanner; 
public class SwappingNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the 'a' value :");
		int a = sc.nextInt();
		
		System.out.println("enter the 'b' value");
		int b =sc.nextInt();
		
		int c = b;b=a;a=c;
		
		System.out.println("AFTER SWAPPING THE VALUS 'A' IS :-" + a +" AND 'B' IS :-" + b);
		
		
	}

}
