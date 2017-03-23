package Chapter8.day18.Map;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {
	Map<String,Integer> map = new HashMap<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapExercise me =  new MapExercise();
		String[] arr = {"chenhao","zhangsan","zhangsan","chenhao","lisi","wangwu","zhaoliu","xiaoqiang","haha"};		
		me.method(arr);
		me.show();		
	}
	
	public void method(String...strings){
		int count = 0;
		for (int i = 0; i < strings.length; i++) {
			String str = strings[i];
			if(map.containsKey(str)){
				count = map.get(str);
				map.put(str, ++count);
			}else{
				map.put(str, 1);
			}
		}
	}
	
	public void show(){
		map.forEach((String,Integer)->
		System.out.println(String + "出现了" + Integer + "次"));
	}

}
