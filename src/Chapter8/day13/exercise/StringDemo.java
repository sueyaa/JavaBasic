package Chapter8.day13.exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//求字符串：dgaabcddcbadfabcdefghijkkjihgfedcbagaaabbccddddccbbaaaf中出现频率最高的字符（20分）

public class StringDemo {
	
	public static void main(String[] args) {
		String str = "dgaabcddcbadfabcdefghijkkjihgfedcbagaaabbccddddccbbaaaf11111111111";
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		System.out.println(arr);	
		int i = 0;
		int count = 0;
		char ch = 1;
		method(i,arr,count,ch);
	}
	
	public static void method(int i,char[] arr,int count,char ch){
		ch = arr[i];
		count = 0;
		for (; i < arr.length; i++) {
			if(arr[i] != ch){
				System.out.println(arr[i-1]+ "出现的次数为：" + count);
				method(i,arr,count,ch);	
				return;
			}	
			++count;
			if (i == arr.length - 1) {
				System.out.println(arr[i]+ "出现的次数为：" + count);
			}
		}
	}
}
