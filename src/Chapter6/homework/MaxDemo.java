package Chapter6.homework;

//C:��ȡ�������нϴ��ֵ

public class MaxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;
		System.out.println("�������е����ֵΪ��" + maxNum(a,b));
	}
	
	public static int maxNum(int a,int b){
		int max = 0;
		if(a >= b){
			max = a;
		}else{
			max = b;
		}
		return max;
	}

}
