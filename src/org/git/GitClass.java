package org.git;

import java.util.LinkedList;
import java.util.List;


public class GitClass {
	public static void main(String[] args) {
		List<Integer> set = new LinkedList();
		set.add(10);
		set.add(30);
		set.add(30);
		set.add(70);
		set.add(100);
		set.add(12);
		System.out.println(set);
		int size = set.size();
		System.out.println(size);
		Integer j = set.get(4);
		System.out.println(j);
		int f = set.indexOf(70);
		System.out.println(f);
		int l = set.lastIndexOf(30);
		System.out.println(l);
					
		}

	}
	


