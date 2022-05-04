package com.simplilearn.namita1;
import java.util.*;

public class Array_examples {
	public static void main (String[] args) {
		ArrayList <String> list=new ArrayList();//creating generic array list
		list.add("mango");
		list.add("apple");
		list.add("papaya");
		list.add("bananna");
		System.out.println(list);
	
	//traversing through iterator
	Iterator itr= list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	

}
}
