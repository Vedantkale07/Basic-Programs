package com.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class AddAll {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(2);
		list.add(4);
		list.add(9);
		list.add(5);
		list.add(1);
		
		System.out.println(list);
		
		ArrayList<Integer> list2= new ArrayList<Integer>();
		
		//copy list element into list2 
		list2.addAll(list);
		System.out.println(" copy arraylist:");
		System.out.println(list2);
		
		System.out.println("delete copy list :");
		list2.clear();
		System.out.println(list2);
		
		//sort list element 
		Collections.sort(list);
		System.out.println("sort array in assending order:");
		System.out.println(list);
		
//		Iterator<Integer> itr= list.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(" "+itr.next());
//		}
	}
}

