package Methods;

public class Non_Main_Method_Calling_Other_Methods {
	public static void main(String args[]) {
		System.out.println("in side the main method");
		
		methodOne();
	}

	public static void methodOne() {
		System.out.println("in side the methodONE");
		
		methodTwo();
	}
	
	public static void methodTwo() {
		System.out.println("in side the methodTWO");
		
		methodThree();
	}
	
	public static void methodThree() {
		System.out.println("in side the methodTHREE");
		
		methodFour();
	}
	
	public static void methodFour() {
		System.out.println("in side the methodFOUR");
	}
	

}
