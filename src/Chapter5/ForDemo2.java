package Chapter5;

public class ForDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 50; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		for (int j = 1; j <= 100; j++) {
			System.out.print("*");
			if( j % 50 == 0 && j != 0){
				System.out.println();
			}
		}
		
	}

}
