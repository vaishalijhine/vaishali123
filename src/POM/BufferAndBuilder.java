package POM;

public class BufferAndBuilder {
	public static void main(String[] args) {
		
		String s="vaishali";
		
		String s1=s.concat(" jhine");
		System.out.println(s1);
		
		
		StringBuffer sb=new StringBuffer("Rahul");
		sb.append(" jhine");
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		StringBuilder sbd= new StringBuilder("Rudransh");
		sbd.append(" jhine");
		System.out.println(sbd);
	}

}
