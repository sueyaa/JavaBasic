package Chapter7.homework;

import java.util.Scanner;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Cat cat1 = new Cat("小黑",2,"黑色");
		Cat cat2 = new Cat("小白",5,"白色");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入小猫的名字：");
		String name = input.next();
		if(name.equals(cat1.getName())){
			System.out.println(cat1.toString());
		} else if(name.equals(cat2.getName())){
			System.out.println(cat2.toString());
		} else{
			System.out.println("小红没有养这只猫");
		}*/
		Cat[] cat = new Cat[4];
		
		cat[0] = new Cat();
		cat[0] .setName("小白");
		cat[0] .setAge(1);
		cat[0] .setColor("白色");
		cat[1]  = new Cat(2);
		cat[1].setName("小花");
		cat[1].setColor("花色");
		cat[2] = new Cat("小红");
		cat[2].setAge(3);
		cat[2].setColor("红色");
		cat[3] = new Cat("小黑",4,"黑色");
		
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
