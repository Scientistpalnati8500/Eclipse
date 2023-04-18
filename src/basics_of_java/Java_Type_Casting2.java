package basics_of_java;

public class Java_Type_Casting2 {
	public static void main(String args[])
	{
		System.out.println("Narrowing Casting (manually) - converting a larger type to a smaller size type\r\n"
				+ "double -> float -> long -> int -> char -> short -> byte");
		
		long l = 44;
		int i = (int)l;
		short s = (short)i;
		byte b =(byte) s;
		char c = 'C';
        int st =c;
        double d =42.354;
        float f =(float)d;
		
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
