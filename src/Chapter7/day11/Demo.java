package Chapter7.day11;

//15.�����: �ֱ��ӡ��1-10�Ľ׳�,Ҫ��ʹ��break���
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(10);
	}
	
	public static int method(int n){
		int num = 0;
		for (int i = 1; i <= n; i++) {
			if(i == 1){
				num = 1;
			} else{
				num = i * method(i - 1);
			}
		}
		return num;
	}
	
	public static void print(int n){
		for (int i = 1; i <= n; i++) {
			System.out.println(i + "!=" + method(i));
		}
	}
}
