package Chapter6.homework;

//B:�ж����������Ƿ����

public class EqualDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10,b = 20;
		System.out.println("a��b"+ isEqual(a,b));
	}
	
	public static String isEqual(int a,int b){
		String str = "";
		if(a == b){
			str = "���";
		}else{
			str = "�����";
		}
		return str;
	}

}
