package Chapter8.day16.homework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		LinkedListDemo ld = new LinkedListDemo();
		ld.inti(list);
		System.out.println("删除重复元素之前：");
		ld.printAll(list);
		System.out.println();
		ld.removeRepe(list);
		System.out.println("删除重复元素之后：");
		ld.printAll(list);
	}
	
	public void inti(LinkedList<Integer> list){
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		list.addFirst(1);
		list.addLast(1);
		list.add(3, 1);
	}
	
	public void removeRepe(LinkedList<Integer> list){
		for (int i = 0; i < list.size(); i++) {
			Integer num = list.get(i);
			while(list.indexOf(num) != list.lastIndexOf(num)){
				list.remove(num);
			}
		}
	}
	
	public void printAll(LinkedList<Integer> list){
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next() + "\t");
		}
	}

}
