package Chapter6.homework;

//�������(������������е�ÿһ��Ԫ��)

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1,3,5,7,9};
		printArray(arr);
	}
	
	public static void printArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

}
