package basics_of_java;

public class Java_Type_Casting {
	public static void main(String args[])
	{
		System.out.println("Widening Casting (automatically) - converting a smaller type to a larger type"
				+ " sizebyte -> short -> char -> int -> long -> float -> double");
		
		byte b =12;
		short s = b;
		int i = s;
		long l = i;
		char c = 'C';
        int st =c;
		float f =42.354f;
		double d =f;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(c);
		System.out.println(st);
		System.out.println(f);
		System.out.println(d);
		
		
		
	}
	
}
