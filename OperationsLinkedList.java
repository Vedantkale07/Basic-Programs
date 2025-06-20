package com.linkedlist;

import java.util.LinkedList;

public class OperationsLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(45);
		list.add(18);
		list.add(22);
		list.add(20);
		System.out.println(list);
		
		//get element from index
		System.out.println("\nelement at index 2:"+list.get(2));
		
		
		//index of elements
		System.out.println("\nindex of element 18: "+list.indexOf(18));
		
		//modify list 
		System.out.println("\nmodify list :");
		list.set(3,200);
		list.set(4, null);
		System.out.println(list);
		
		//size of element
		System.out.println("\nsize of list: "+ list.size());
		
		//last index 
		System.out.println("\nindex of element is: "+list.indexOf(20));
		System.out.println("last index: "+list.lastIndexOf(20));
		
	}
	
	
}
