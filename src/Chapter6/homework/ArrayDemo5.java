package Chapter6.homework;

//����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)

public class ArrayDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1,5,6,11,8,9,11,33};
		int num = 11;
		if(getIndex(arr,num) > 0){
			System.out.println(num + "��һ�γ����������е�����Ϊ��" + getIndex(arr,num));
		}else{
			System.out.println(num + "û�г�����������");
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
