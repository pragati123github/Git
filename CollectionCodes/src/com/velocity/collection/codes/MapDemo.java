package com.velocity.collection.codes;

import java.util.HashMap;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
	HashMap<Integer,String> map = new HashMap<Integer,String>();	
	map.put(10, "Pragati");
	map.put(20, "Kavita");
	map.put(20, "Akshata");
	
	Set<Integer> set = map.keySet();
	for(Integer i:set) {
		System.out.println(i);
		System.out.println(map.get(i));
	}
	}

}
