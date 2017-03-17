package Chapter7.homework.day12.student6;

import java.util.Arrays;

public class StudentTest {

	public static void main(String[] args) {
		Student[] stus = new Student[5];
		stus[0] = new Student(1,"李二小",88.5);
		stus[1] = new Student(2,"王一小",88.5);
		stus[2] = new Student(3,"张三小",87.5);
		stus[3] = new Student(4,"王四小",94);
		stus[4] = new Student(5,"安五小",88.5);
		
		
		Arrays.sort(stus);
		
		for (int i = 0; i < stus.length; i++) {
			System.out.println(stus[i]);
		}
		
	}

}
