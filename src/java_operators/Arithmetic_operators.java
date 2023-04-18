package java_operators;

public class Arithmetic_operators {
	public static void main(String args[])
	{
		int a =10;
		int b =25;
		
		System.out.println("Adds together two values :" + (a+b));                  // + Addition
		System.out.println("Subtracts one value from another :" + (a-b));          // - Subtraction
		System.out.println("Multiplies two values :" + (a*b));                     // * Multiplication
		System.out.println("Divides one value by another :" + (a/b));              // / Division
		System.out.println("Returns the division remainder :" + (a%b));            // % Modulus
		System.out.println("Increases the value of a variable by 1 :" + (a++));    // ++ Increment
		System.out.println("Decreases the value of a variable by 1 :" + (b--));    // -- Decrement
	}
}
