package org.pratice;

import java.util.HashSet;
import java.util.Set;

public class sett {
	
	public static void main(String[] args) {
		
		Set<Integer> s= new HashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		
		System.out.println(s);
		
		for (Integer integer : s) {
			System.out.println(integer);
			
		}
		
	}

}
