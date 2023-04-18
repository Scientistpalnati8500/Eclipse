package Methods;

public class Method_Calling_Methods_Multiple_Times {
	public static void main(String args[]) {
	
	System.out.println("in side the main method");
	
	methodOne();
	methodOne();
	methodOne();
	methodOne();
	methodOne();
	}

public static void methodOne() {
	System.out.println("in side the methodONE");

	}
}
