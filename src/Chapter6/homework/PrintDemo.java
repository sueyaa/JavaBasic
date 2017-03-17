package Chapter6.homework;

//D:打印m行n列的星形矩形

public class PrintDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 5,n = 4;
		print(5,4);
	}
	
	public static void print(int a,int b){
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
