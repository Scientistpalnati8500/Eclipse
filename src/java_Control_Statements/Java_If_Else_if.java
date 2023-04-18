package java_Control_Statements;

public class Java_If_Else_if {
	public static void main(String args[])
	{
		int time = 19;
		
	/*  
	 	if(condition1){  
			    code to be executed if condition1 is true  
			}else if(condition2){  
			    code to be executed if condition2 is true  
			}  
			else if(condition3){  
			    code to be executed if condition3 is true  
			}  
			...  
			else{  
			    code to be executed if all the conditions are false  
			}      
	  */
		
		if(time < 12)
		{
			System.out.println("its morning time");
		}
		else if(time <=12)
		{
			System.out.println("its afternoon time");
		}
		else if(time <= 18)
		{
			System.out.println("its evening time");
		}
		else
		{
			System.out.println("its good night time");
		}
	}

}
