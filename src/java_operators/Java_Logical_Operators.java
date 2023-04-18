package java_operators;

public class Java_Logical_Operators {
	public static void main (String args[])
	{
		int x = 23;
		
		System.out.println(x > 5 &&  x < 30);     //  && 	(Logical and)  	Returns true if both statements are true
		System.out.println(x > 5 ||  x < 30);     //  || 	(Logical or)  	Returns true if one of the statements is true
		System.out.println(!(x > 5 && x < 30));   //   !    (Logical not)	    Reverse the result, returns false if the result is true
	}
}
