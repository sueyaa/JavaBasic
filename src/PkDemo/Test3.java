package PkDemo;

//从长度为n的数组（元素互不相同）中任意选择m个数的所有组合。

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) throws Exception {
			int[] valueArr = {1, 5, 6, 9, 10};
			int num = 2;
			
			int[] result = new int[num];
			
			display(valueArr, 0, num, result, 0);
		}
		
		private static void display(int[] arr, int begin, int num, int[] result, int index) {
			if (num <= 0) {
				for (int i = 0; i < result.length; ++i) {
					System.out.print(result[i]);
					System.out.print(" ");
				}
				System.out.println();				
				return;
			}
			
			for (int i = begin; i <= arr.length - num; ++i) {
				result[index] = arr[i];
				display(arr, i + 1, num - 1, result, index + 1);
			}
		}
}
