package Chapter6.homework;

//A:二维数组遍历

public class ArrayDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,3,5},{2,4,6},{7,8,9,10}};
		print(arr);
	}
	
	public static void print(int[][] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
