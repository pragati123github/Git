package com.velocity.collection.codes;

import java.util.Collections;
import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();
	set.add("Sakshi");
	set.add("Sony");
	set.add("Siddhi");
	set.add("Sapna");
	
	for(String s: set) {
		System.out.println(s);
	}

	}

}
