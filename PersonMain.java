package com.arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class PersonMain {
	
	public static void main(String[] args) {

		ArrayList<PersonClass> list = new ArrayList<PersonClass>();
		PersonClass p1 = new PersonClass("suhas", 20);
		list.add(p1);
		list.add(1,new PersonClass("pragati", 21));
		list.add(2,new PersonClass("siddhi", 22));
		list.add(3,new PersonClass("sahil", 23));

		Collections.sort(list, new MyComparator());
		System.out.println(list);

	}

}
