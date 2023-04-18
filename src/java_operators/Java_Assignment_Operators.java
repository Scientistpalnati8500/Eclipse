package java_operators;

public class Java_Assignment_Operators {
	public static void main(String args[])
	{
		int x =85;
		int y =58;
		
		System.out.println(x = y);       // x = y
		System.out.println(x += 3);      // x = x + 3
		System.out.println(x -= 3);      // x = x - 3
		System.out.println(x *= 3);      // x = x * 3
		System.out.println(x /= 3);      // x = x / 3
		System.out.println(x %= 3);      // x = x % 3
		System.out.println(x &= 3);      // x = x & 3
		System.out.println(x |= 3);      // x = x | 3
		System.out.println(x ^= 3);      // x = x ^ 3
		System.out.println(x <<= 3);     // x = x >> 3
		System.out.println(x >>= 3);     // x = x << 3
		
	}
}
