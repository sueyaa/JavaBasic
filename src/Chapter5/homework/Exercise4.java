package Chapter5.homework;

//4.��ӡ��ͼ��ʾ����9��9��(��ʾ���Խ����ηֳ���������������,����ÿ�пո������ǺŸ����Ĺ�ϵ)


public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2*i+1; k++) {
				System.out.print("*");
			}	
			System.out.println();
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <7-2*i; k++) {
				System.out.print("*");
			}	
			System.out.println();
		}
	}

}
