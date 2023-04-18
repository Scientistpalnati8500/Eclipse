package java_Control_Statements;

public class Java_nested_if {
	public static void main(String args[])
	{
int time = 11;
		
           //  if(condition){    
           //code to be executed    
           //  if(condition){  
           //code to be executed 
           //	}

		if(time < 12)
		{
			System.out.println("its morning time");                       
		}
		if(time <=12)
		{
			System.out.println("its afternoon time");
		}
		if(time <= 18)
		{
			System.out.println("its evening time");
		}
		else
		{
			System.out.println("its good night time");
		}
	}

}
