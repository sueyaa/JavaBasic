package Chapter6;

import java.util.Random;
public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = array();
		print(arr);
	}
	
	public static int[][] array(){
		Random ran = new Random();
		int[][] arr = new int[2][7];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j<6){
					arr[i][j] = ran.nextInt(32) + 1;
				}else{
					arr[i][j] = ran.nextInt(16) + 1;
				}
			}		
		}
		return arr;
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
