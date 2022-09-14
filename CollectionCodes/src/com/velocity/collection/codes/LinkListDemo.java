package com.velocity.collection.codes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
