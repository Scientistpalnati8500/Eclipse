package Methods;

public class Main_Method_Calling_Other_Methods {
	public static void main(String args[]) {
		System.out.println("in side the main method");
		
		methodOne();
		methodTwo();
		methodThree();
		methodFour();
	}

	public static void methodOne() {
		System.out.println("in side the methodONE");
	}
	
	public static void methodTwo() {
		System.out.println("in side the methodTWO");
	}
	
	public static void methodThree() {
		System.out.println("in side the methodTHREE");
	}
	
	public static void methodFour() {
		System.out.println("in side the methodFOUR");
	}
}
