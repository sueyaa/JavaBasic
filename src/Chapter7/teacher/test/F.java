package Chapter7.teacher.test;

public class F {
	public static void main(String[] args) {	
		F f = new F();
		f.method_f();
		
		G.method();
		G g = new G();
		g.method2();
	}
	public void method_f(){
		G.i = 10;
		System.out.println(G.i);
		G g = new G();
		g.j =11;
		System.out.println(g.j);
	}
}

class G{
	
	public static void method(){
		System.out.println("���Ǿ�̬����.");
	}
	
	public void method2(){
		System.out.println("���ǷǾ�̬����");
	}
	
	
	
	static int i;//--��̬Ҳ�������Ա
	int j;//--��ͨ��Ա
}