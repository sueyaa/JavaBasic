package Chapter4;

import java.util.Random;

public class ELseIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//,rand.nextInt(100);�е�100�������������,�����������Ϊ0-100������,������100��
		Random  rand = new Random();
		int number = rand.nextInt(90)+10;
		//�������Math.Random()�����ܹ����ش����ŵ�doubleֵ����ֵ���ڵ���0.0��С��1.0��
		//��ȡֵ��Χ��[0.0,1.0)������ҿ����䣬����ֵ��һ��α���ѡ��������ڸ÷�Χ�ڣ����ƣ����ȷֲ���
	//	int number = (int)(Math.random()*90+10);
		System.out.println(number);
		if(number > 10 && number <= 20){
			System.out.println("��10��20֮��");
		} else if(number > 20 && number <= 40){
			System.out.println("��20��40֮��");
		} else if(number > 40 && number <= 60){
			System.out.println("��40��60֮��");
		} else if(number <= 100){
			System.out.println("��60��100֮��");
		}
	}

}
