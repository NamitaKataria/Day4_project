package com.simplilearn.namita1;
import java.util.*;
public class Collectionassisted {
	//creating arraylist
	
	//arraylist behave according to the dyanamic array DS way
	public static void main(String[]args) {
	System.out.println("Array list mixed data");
	ArrayList al=new ArrayList();
	al.add(10);
	al.add("namita");
	al.add('N');
	al.add(1905.87f);
	al.add(125634.895);
	System.out.println(al);
	System.out.println("Arraylist for specificdata");
	ArrayList<String> city = new ArrayList<String>();//indicate the collection to have only 
	city.add("banglore");
	city.add("delhi");
	//city.add(10);accept only string data
	System.out.println(city);
	System.out.println("......#####......");
	//creating arraylist
	
	//creating vector
	Vector v1=new Vector();
	v1.add(1);
	v1.add(2);
	v1.add("greeks");
	v1.add("for greeks");
	v1.add(3);
	System.out.println("vectors");
	System.out.println("vector v1 is "+v1);
	
	//creating linkedlist
	System.out.println("\n");
	System.out.println("......####.....");
	System.out.println("LinkedList");
	LinkedList<String> name =new LinkedList<String>();
	name.add("alex");
	name.add("namita");
	System.out.println(name);
	//iterator is a cursor that points to an objects,as the java doesnt support pointers
	//it is used for looping through collection
	Iterator itr=name.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	//creating hashset
	//hashset will not maintain order of insertion , it arrange data in 
	System.out.println("\n");
	System.out.println("....####........");
	System.out.println("hashset");
	HashSet<Integer> set=new HashSet<Integer>();
	set.add(101);
	set.add(102);
	set.add(106);
	set.add(110);
	set.add(500);
	System.out.println(set);
	Iterator itr1=set.iterator();
	while (itr1.hasNext()) {
		System.out.println(itr1.next());
		
	}
	
	}
	}
