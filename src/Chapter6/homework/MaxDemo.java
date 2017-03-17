package Chapter6.homework;

//C:获取两个数中较大的值

public class MaxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;
		System.out.println("两个数中的最大值为：" + maxNum(a,b));
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
