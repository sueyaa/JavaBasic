package Chapter6.homework;

//�����ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{2,5,8,11,4,33};
		/*sortNum(arr);
		System.out.println("�����е����ֵ��" + arr[arr.length - 1]);
		System.out.println("�����е���Сֵ��" + arr[0]);*/
		System.out.println("�����е����ֵ��" + getMax(arr));
		System.out.println("�����е���Сֵ��" + getMin(arr));
	}
	
	//����һ���Ƚ������������У���ô����ĵ�һ����������Сֵ�����һ��ֵ�������ֵ
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
	//�������������һ���������С���ģ��ӵڶ�������ʼ�����������С����max��min������ֵ����max��min��
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
