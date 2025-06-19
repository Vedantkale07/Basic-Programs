package com.practicalSet;

import java.util.TreeSet;

public class TreeSetDemo1 {
	
public static void main(String[] args) {
	
	TreeSet ts=new TreeSet(new TreeSetComparator());
	ts.add(21);
	ts.add(44);
	ts.add(12);
	ts.add(7);
	
	System.out.println(ts);
	
   }
}
