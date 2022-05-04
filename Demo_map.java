package com.simplilearn.namita1;
import java.util.*;
public class Demo_map {
	public static void main(String[]args) {//map
		System.out.println("the elements of hashmap");
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1,"john");
		hm.put(2,"nam");
		hm.put(3,"sam");
		 
        /*
         * for(Object x : arr)
         * 
         * 
         */
        
         for(Map.Entry m:hm.entrySet()){    //for each 
            System.out.println(m.getKey()+" "+m.getValue());    
        }
        //HashTable
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
        ht.put(4,"Ales");  
        ht.put(5,"Rosy");  
        ht.put(6,"Jack");  
        ht.put(7,"John");  
        System.out.println("\nThe elements of HashTable are ");  
        for(Map.Entry n:ht.entrySet()){    
            System.out.println(n.getKey()+" "+n.getValue());    
        }
        //TreeMap
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(9,"Carlotte"); 
        map.put(10,"Catie"); 
        map.put(8,"Annie");    
           
             
System.out.println("\nThe elements of TreeMap are ");  
        for(Map.Entry l:map.entrySet()){    
            System.out.println(l.getKey()+" "+l.getValue());    
        }    
    }

		
	}


