package Chapter8.day13.exercise;

import java.util.Arrays;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str = "dgaabcddcbadfabcdefghijkkjihgfedcbagaaabbccddddccbbaaaf";
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		str = new String(arr);
		int length = str.length();
		StringBuffer str2 = new StringBuffer();
		int a = 0;
		while(length > 0){
			String tmp = String.valueOf(str.charAt(0));
			str = str.replaceAll(tmp, "");
			str2.append(tmp);
			str2.append(String.valueOf(length-str.length()));
			length = str.length();
		}
		System.out.println(str2);*/
		
		String str = "dgaabcddcbadfabcdefghijkkjihgfedcbagaaabbccddddccbbaaaf";
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		str = new String(arr);
		int length = str.length();
		char[] arr1 = new char[arr.length];
		int[] arr2 = new int[arr.length];
		int a = 0;
		int b = 0;
		while(length > 0){
			String tmp = String.valueOf(str.charAt(0));
			arr1[a++] = tmp.charAt(0);
			str = str.replaceAll(tmp, "");
			arr2[b++] = length-str.length();
			length = str.length();
		}
		
		int max = 0;
		for (int i = 0; i < arr2.length; i++) {
			max = Math.max(arr2[i],max);
		}
		System.out.println(max);
		int index = 0;
		for (int i = 0; i < arr2.length; i++) {
			if(arr2[i] == max){
				index = i;
			}
		}
		
		System.out.println("出现字符次数最多的是" + arr1[index] + "，出现了" + arr2[index] + "次");
	}

}
