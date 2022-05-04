package com.simplilearn.namita1;
abstract class test2{
public abstract void display();
}

//@override

public class Anonymous_class {
	public static void main(String[]args) {
		test2 i=new test2() {
		public void display() {//override
			System.out.println("inside anonymous inner class");
		}
		};
		i.display();//calling
		
	}
	

}
