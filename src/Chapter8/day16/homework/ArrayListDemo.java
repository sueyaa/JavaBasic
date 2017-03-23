package Chapter8.day16.homework;

import java.util.ArrayList;

//1.分别使用ArrayList和LinkedList来实现去除集合中重复的元素(自定义类型和系统提供的类型比如Integer和Student)数据自己模拟

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		ArrayListDemo ld = new ArrayListDemo();
		ld.inti(list);
		System.out.println("删除重复元素之前：");
		ld.printAll(list);
		System.out.println();
		ld.removeRepe(list);
		System.out.println("删除重复元素之后：");
		ld.printAll(list);
	}
	
	public void inti(ArrayList<Integer> list){
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		list.add(1, 1);
		list.add(7,9);
		list.add(11, 9);
	}
	
	public void removeRepe(ArrayList<Integer> list){
		for (int i = 0; i < list.size(); i++) {
			Integer num = list.get(i);
			while(list.indexOf(num) != list.lastIndexOf(num)){
				list.remove(list.lastIndexOf(num));
			}
		}
	}
	
	public void printAll(ArrayList<Integer> list){
		for (Integer integer : list) {
			System.out.print(integer + "\t");
		}
	}

}
