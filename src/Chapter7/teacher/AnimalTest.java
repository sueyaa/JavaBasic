package Chapter7.teacher;
import java.util.Arrays;

public class AnimalTest {
	public static void main(String[] args) {
		
		Animal[] array = new Animal[4];
		
		array[0] = new Animal();//--���޲ι�������Animal����.
		array[0].setAge(-1);
		array[0].setColor("��ħɫ");
		array[0].setName("��̹֮");
		
		array[1] = new Animal(10);
		array[1].setColor("ɭ��ɫ");
		array[1].setName("�귨���");
		
		array[2] = new Animal("̩����");
		array[2].setColor("�׻�ɫ");
		array[2].setAge(5);
		
		array[3] = new Animal("��ɫ","������");
		array[3].setAge(3);	
		
//		Arrays  // Java ��������ṩ��һ��������.
		
		
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
