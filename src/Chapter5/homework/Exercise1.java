package Chapter5.homework;

//1.��1+4+7+����+100֮�͡�

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int sum = 0;
		while(a <= 100){
			sum += a;
			a +=3;
		}
		System.out.println("��1+4+7+����+100֮��Ϊ��"+sum);
	}

}
