package POM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;

public class CollectionFramework {
	public static void main(String[] args) {
		
//		ArrayList li=new ArrayList();
//		
//		li.add("vaishali");     //strin,int,char,double,boolean can acceptarraylist...so arraylist is hetrogenous
//		li.add(50);
//		li.add('a');
//		li.add(50.3);
//		li.add(true);
//		
//		System.out.println(li.get(0));
//		System.out.println(li.get(1));
//		System.out.println(li.get(2));
//		System.out.println(li.get(3));
//		System.out.println(li.get(4));
		
		
//		LinkedList <Integer>li=new LinkedList <Integer>();
//		
//		li.add(67);
//		li.add(null);
//		li.add(null);
//		li.add(10);
//		li.add(67);
//		
//		
//		System.out.println(li.get(0));
//		System.out.println(li.get(1));
//		System.out.println(li.get(2));
//		System.out.println(li.get(3));
//		System.out.println(li.get(4));
			
		
//		PriorityQueue<String> p = new PriorityQueue <String>();
//		p.add("vaishu");
//	//	p.add(null);
//		p.add("dehu");
//		p.add("pune");
//		
//	Iterator i= p.iterator();
//	
//	while(i.hasNext())
//	{
//		System.out.println(i.next());
//	}
//	
//	Vector<String> v =new Vector<String>();
//	v.add("abc");
//	v.add(null);
//	v.add(null);
//	v.add("abc");
//	
//     System.out.println(v.get(0));
//     System.out.println(v.get(1));
//     System.out.println(v.get(2));
//     System.out.println(v.get(3));

		

//		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
//		hmap.put(1, "abc");
//		hmap.put(2, "abc");
//		hmap.put(13,null);
//		hmap.put(1, "abc");
//		
//		System.out.println(hmap.get(1));
//		System.out.println(hmap.get(2));
//		System.out.println(hmap.get(13));
//		System.out.println(hmap.get(4));

		
		Hashtable<Integer, String> htable = new Hashtable<Integer, String>();
		
		htable.put(1,"pune");
		htable.put(2,"pune");
		htable.put(3,"abc");
		htable.put(4,"pune");
		htable.put(5,"vcb");
		
		System.out.println(htable.get(0));
		System.out.println(htable.get(1));
		System.out.println(htable.get(2));
		System.out.println(htable.get(3));
		System.out.println(htable.get(4));


		
		

	}

}
