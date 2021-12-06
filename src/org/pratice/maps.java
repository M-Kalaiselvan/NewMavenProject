package org.pratice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class maps {
	
	public static void main(String[] args) {
		
		Map<String,Integer> m = new HashMap<>();
		m.put("kalai", 10);
		m.put("piru", 20);
		
		System.out.println(m);
		
		////Set<String> keySet = m.keySet();
		//System.out.println(keySet);
		
		//for (String string : keySet) {
			//System.out.println(string);
			
			Collection<Integer> values = m.values();
			System.out.println(values);
			
			for (Integer integer : values) {
				System.out.println(integer);
				
			}
			
		
				
			}
			
		}
	


