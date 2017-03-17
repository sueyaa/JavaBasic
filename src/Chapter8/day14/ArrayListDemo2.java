package Chapter8.day14;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList();
		list.add(1);
		list.add(0,2);
		list.add(2,3);
		list.remove(1);
		list.set(1, 5);
		System.out.println(list.get(0));
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		System.out.println("*******************");
		ArrayList <Integer> list2 = new ArrayList();
		list2.addAll(list);
		for (Integer integer : list2) {
			System.out.println(integer);
		}
		
		list.clear();
		System.out.println("**********************");
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		list.add(5);
		System.out.println(list.indexOf(5));
		System.out.println(list.lastIndexOf(5));
		list.remove((Integer)2);
		System.out.println("*******************");
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
