package Chapter6.homework;

/*B:��˾�����۶����
	ĳ��˾���ռ��Ⱥ��·�ͳ�Ƶ��������£���λ(��Ԫ)
	��һ���ȣ�22,66,44
	�ڶ����ȣ�77,33,88
	�������ȣ�25,45,65
	���ļ��ȣ�11,66,99*/

public class ArrayDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		System.out.println("��˾�����۶�֮��Ϊ��" + arrSum(arr));
	}
	
	public static int arrSum(int[][] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

}
