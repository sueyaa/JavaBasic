package Chapter8.day14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list  = new ArrayList();
		System.out.println(list.size());
		list.add(2);
		list.add(3);
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.contains(1));
		System.out.println(list.remove(1));
		list.clear();
		
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
	
		Collection<Integer> list1 = new ArrayList();
		list1.addAll(list);
		
		Iterator<Integer>  iterator1 = list1.iterator();
		while(iterator1.hasNext()){
			System.out.print(iterator1.next() + "\t");
		}
		
		list.add(20);
		
		System.out.println();
		Iterator<Integer>  iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + "\t");
		}
		list1.add(13);
		list1.add(12);
		list1.removeAll(list);
		
		System.out.println();
		for (Integer integer : list1) {
			System.out.println(integer);
		}
		
		System.out.println(Integer.MAX_VALUE);
	}

}
