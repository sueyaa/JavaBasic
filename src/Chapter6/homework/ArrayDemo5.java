package Chapter6.homework;

//数组元素查找(查找指定元素第一次在数组中出现的索引)

public class ArrayDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1,5,6,11,8,9,11,33};
		int num = 11;
		if(getIndex(arr,num) > 0){
			System.out.println(num + "第一次出现在数组中的索引为：" + getIndex(arr,num));
		}else{
			System.out.println(num + "没有出现在数组中");
		}
		
	}

	public static int getIndex(int[] arr,int num){
		for (int i = 0; i < arr.length; i++) {
			if(num == arr[i]){
				return i;
			}
		}
		return -1;
	}
}
