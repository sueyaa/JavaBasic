package Chapter8.day16;

import java.util.ArrayList;
import java.util.LinkedList;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeTest tt = new TimeTest();
		tt.array();
		tt.linked();
	}
	
	public void array(){
		ArrayList<Integer> list = new ArrayList();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			list.add(i);
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("ArrayList时间差：" + (endTime - startTime));
	}
	
	public void linked(){
		LinkedList<Integer> list = new LinkedList();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			list.add(i);
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("LinkedList时间差：" + (endTime - startTime));
	}

}
