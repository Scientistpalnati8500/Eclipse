package java_operators;

public class Bitwis_operators {
	public static void main(String args[])
	{
		int x = 12;
		int y = 23;
		
		System.out.println(x > y  &  x < y);      //   &   bitwise AND
		System.out.println(x < y  ^  x < y);      //   ^   bitwise exclusive OR
		System.out.println(x > y  |  x < y);      //   |   bitwise inclusive OR
	}

}
