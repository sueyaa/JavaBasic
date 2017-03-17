package Chapter8.day13.homework;

import java.util.Comparator;

public class NoNameDemo {
	public static void main(String[] args) {
		String[] str = {"abc", "yb", "xiaoqianga", "laifu", "wangcai", "oye"};
		System.out.println("≈≈–Ú«∞");
		for (String string : str) {
			System.out.print(string + "\t");
		}
		System.out.println();
		
		Comparator comparator = new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				if( o1.getClass()==null || !o1.getClass().equals(String.class)){
					return -1;
				}
				String str1 = (String) o1;
				String str2 = (String) o2;
				if(str1.length() < str2.length()){
					return -1;
				}else if (str1.length() == str2.length()){
					return 0;
				}else{
					return 1;
				}
			}	
		};
		
		for (int i = 0; i < str.length - 1; i++) {
				for (int j = 0; j < str.length - i - 1; j++) {
					if(comparator.compare(str[j], str[j+1]) == 1){
						String tmp = str[j];
						str[j] = str[j+1];
						str[j+1] = tmp;
					}
				}	
		}
		
		System.out.println("≈≈–Ú∫Û£∫");
		for (String string : str) {
			System.out.print(string + "\t");
		}
	}
}
