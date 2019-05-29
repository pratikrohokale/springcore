package com.csc.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(85);
		al.add(100);

		/*
		 * for (Integer i : al) { if (i % 2 == 0) { res.add(i); } }
		 * res.forEach(System.out::println);
		 */
		List<Integer> res1 = al.stream().filter(i -> (i % 2 == 0)).collect(Collectors.toList());
		List<Integer> res2 = res1.parallelStream().map(i -> (i * 2)).collect(Collectors.toList());
		res1.forEach(System.out::println);
		System.out.println("--------------");
		for (Integer i : res2) {
			System.out.println(i);
		}
	}
}
