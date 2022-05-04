package com.simplilearn.namita1;
import java.util.*;
public class Test_arraylist {
	public static void main(String []args) {
		ArrayList list=new ArrayList ();//creating arraylist
		list.add("nam");//adding object
		list.add(123);
		list.add(222);
		list.add(45);//can add 
		System.out.println("helo"+list);
		//for(String str:list) {
		//	System.out.println(str);
		//}
		//traversing through iterator
		Iterator itr=list.iterator();
		while(itr.hasNext()){
	System.out.println(itr.next());
		}
	}
	
}


