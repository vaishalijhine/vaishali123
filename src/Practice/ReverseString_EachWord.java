package Practice;

public class ReverseString_EachWord {
	
	public static void main(String[] args) {
		
	
	String s="Java Concept of the Day";
	String [] arr=s.split(" ");
	
	String revstring="";
	
	for(String a:arr)
	{
		 String revereseword ="";  //a
		 
		 for(int i=a.length()-1;i>=0;i--)
		 {
			 revereseword=revereseword+a.charAt(i);  //av
		 }
		 revstring=revstring+revereseword+" ";  //

	}

	 System.out.println(revstring);

}
}