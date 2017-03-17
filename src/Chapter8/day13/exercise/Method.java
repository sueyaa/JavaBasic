package Chapter8.day13.exercise;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method m = new Method();
		m.method(1,2,4,5,6,7);
	}
	
	public void method(int... i){
		System.out.println(i.length);
		for (int j = 0; j < i.length; j++) {
			System.out.print(i[j]+"\t");
		}
	}

}
