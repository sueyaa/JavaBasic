package Chapter7.homework;

import java.util.Scanner;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Cat cat1 = new Cat("С��",2,"��ɫ");
		Cat cat2 = new Cat("С��",5,"��ɫ");
		Scanner input = new Scanner(System.in);
		System.out.println("������Сè�����֣�");
		String name = input.next();
		if(name.equals(cat1.getName())){
			System.out.println(cat1.toString());
		} else if(name.equals(cat2.getName())){
			System.out.println(cat2.toString());
		} else{
			System.out.println("С��û������ֻè");
		}*/
		Cat[] cat = new Cat[4];
		
		cat[0] = new Cat();
		cat[0] .setName("С��");
		cat[0] .setAge(1);
		cat[0] .setColor("��ɫ");
		cat[1]  = new Cat(2);
		cat[1].setName("С��");
		cat[1].setColor("��ɫ");
		cat[2] = new Cat("С��");
		cat[2].setAge(3);
		cat[2].setColor("��ɫ");
		cat[3] = new Cat("С��",4,"��ɫ");
		
		for (int i = 0; i < cat.length - 1; i++) {
			for (int j = 0; j < cat.length - i - 1; j++) {
				if(cat[j+1].getAge() < cat[j].getAge()){
					Cat tmp = null;
					tmp = cat[j+1];
					cat[j+1] = cat[j];
					cat[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < cat.length; i++) {
			System.out.println(cat[i]);
		}
	}

}
