package Chapter6.homework;

//B:判断两个数据是否相等

public class EqualDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10,b = 20;
		System.out.println("a和b"+ isEqual(a,b));
	}
	
	public static String isEqual(int a,int b){
		String str = "";
		if(a == b){
			str = "相等";
		}else{
			str = "不相等";
		}
		return str;
	}

}
