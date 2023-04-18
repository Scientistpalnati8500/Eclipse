package Methods;

public class Multiple_Parameterised_Method {
	public static void main(String args[]) {
		
	int a,b,c;
		add(a= 23, b= 54, c= 64);
		add(a= 235, b= 574, c= 364);
		add(a= 283, b= 564, c= 604);
		add(a= 6623, b= 8754, c= 9864);
	}
	
	public static void add(int a,int b,int c) {
		int sum;
		sum = a+b+c;
		
		System.out.println("sum of the "+a+" and "+b+" and "+c+" is: "+sum);
	}

}
