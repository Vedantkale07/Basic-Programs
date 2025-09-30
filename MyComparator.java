package com.arraylist;

import java.util.Comparator;

public class MyComparator implements Comparator<PersonClass> {

	public int compare(PersonClass p1, PersonClass p2)
	{
		return Integer.compare(p1.getAge(), p2.getAge());
	}

}
