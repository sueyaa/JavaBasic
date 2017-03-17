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
		System.out.println("这是静态方法.");
	}
	
	public void method2(){
		System.out.println("这是非静态方法");
	}
	
	
	
	static int i;//--静态也叫做类成员
	int j;//--普通成员
}