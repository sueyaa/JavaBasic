package Chapter6.homework;

//数组元素逆序 (就是把元素对调)

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1,4,6,11,8,9};
		reverse(arr);
	}
	
	public static void reverse(int[] arr){
		int a = arr.length;
		for (int i = 0; i < a / 2; i++) {
			int tmp = arr[a-1-i];
			arr[a-1-i] = arr[i];
			arr[i] = tmp;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

}
