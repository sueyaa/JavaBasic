package Chapter6.homework;

//������(���ݼ���¼������,���Ҷ�Ӧ����)

public class ArrayDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����"+ getWeek(5));
	}
	
	public static char getWeek(int week){
		char[] arr = {' ','һ','��','��','��','��','��','��'};
		return arr[week];
	}

}
