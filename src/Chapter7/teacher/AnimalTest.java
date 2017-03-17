package Chapter7.teacher;
import java.util.Arrays;

public class AnimalTest {
	public static void main(String[] args) {
		
		Animal[] array = new Animal[4];
		
		array[0] = new Animal();//--用无参构造生成Animal对象.
		array[0].setAge(-1);
		array[0].setColor("恶魔色");
		array[0].setName("游坦之");
		
		array[1] = new Animal(10);
		array[1].setColor("森林色");
		array[1].setName("玛法里奥");
		
		array[2] = new Animal("泰兰德");
		array[2].setColor("白虎色");
		array[2].setAge(5);
		
		array[3] = new Animal("铁色","守望者");
		array[3].setAge(3);	
		
//		Arrays  // Java 针对数组提供的一个工具类.
		
		
		for(int i = 0 ;i < array.length;i++){
			for(int j = 0 ;j <array.length - 1- i;j++){
				Animal temp = null;
				if(array[j].getAge() > array[j+1].getAge()){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		for(int i = 0 ;i<array.length;i++){
			array[i].introduce();
		}
		
		
	}

}
