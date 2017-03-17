package Chapter6.homework;

//E:¥Ú”°nn≥À∑®±Ì

public class MulDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		printMul(n);
	}
	
	public static void printMul(int n){
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j +"=" +(i * j) + "\t");
			}
			System.out.println();
		}	
	}

}
