package Chapter6.homework;

//数组获取最值(获取数组中的最大值最小值)

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{2,5,8,11,4,33};
		/*sortNum(arr);
		System.out.println("数组中的最大值：" + arr[arr.length - 1]);
		System.out.println("数组中的最小值：" + arr[0]);*/
		System.out.println("数组中的最大值：" + getMax(arr));
		System.out.println("数组中的最小值：" + getMin(arr));
	}
	
	//方法一：先将数组升序排列，那么数组的第一个数就是最小值，最后一个值就是最大值
	/*public static void sortNum(int[] arr){
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]){		
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}*/
	//方法二：假设第一个数是最大（小）的，从第二个数开始遍历，如果大（小）于max（min），则将值赋给max（min）
	public static int getMax(int[] arr){
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int getMin(int[] arr){
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
}
