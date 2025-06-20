package com.linkedlist;

import java.util.LinkedList;

//self methods of linkedlist 
public class MethodsOfLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		list.add("Rose");
		list.add("sunflower");
		list.add("white rose");
		
		System.out.println(list);
		
		//add fist in the list 
		list.addFirst("Litch");
		System.out.println("\nadd first index:"+list);
		
		//add last of the list
		list.addLast("Flower");
		System.out.println("\nadd last:"+list);

		// remove first element of the list 
		list.removeFirst();
		System.out.println("\nremove first element: "+ list);
		
		//get first element
		System.out.println("\nget first element: "+list.getFirst());
		
		//get last element
		System.out.println("\nget last: "+ list.getLast());
		
	}

}
