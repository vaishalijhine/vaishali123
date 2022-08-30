package Automation;

public class Try_catch {
	
	public void mathematicalOperation(int a,int b)
	{
		System.out.println(a*b);
		
		try {
			System.out.println(a/b);
		    }
		catch(Exception v)
		{
			System.out.println("invalid input");
			v.printStackTrace();   //which type of exception ...print there
		}
		
		System.out.println("Thank!");
	}
	
	public static void main(String[] args) {
		Try_catch obj= new Try_catch();
		obj.mathematicalOperation(7, 7);
		obj.mathematicalOperation(8, 0);
	}
}
