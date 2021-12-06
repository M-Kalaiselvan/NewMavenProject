package org.pratice;

import java.util.Iterator;

public class Array {
	
	 public void sample() {
		 
		 
		 int a[] = new int[5];
		 
		 a[0]=10;
		 a[1]=20;
		 a[2]=30;
		 a[3]=40;
		 a[4]=50;
		 
		 for (int i : a) {
			 
			 System.out.println(i);
			
		}
		
	}
	 
	 public static void main(String[] args) {
		Array a =new Array();
		a.sample();
	}

}
