package Chapter8.day16.homework;

import java.util.ArrayList;

//1.�ֱ�ʹ��ArrayList��LinkedList��ʵ��ȥ���������ظ���Ԫ��(�Զ������ͺ�ϵͳ�ṩ�����ͱ���Integer��Student)�����Լ�ģ��

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		ArrayListDemo ld = new ArrayListDemo();
		ld.inti(list);
		System.out.println("ɾ���ظ�Ԫ��֮ǰ��");
		ld.printAll(list);
		System.out.println();
		ld.removeRepe(list);
		System.out.println("ɾ���ظ�Ԫ��֮��");
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
