
package Chapter8.innerClass;

public class NoName {
	public static void main(String[] args) {
		new D(){
			@Override
			public void method() {
				System.out.println("����������");
			}
		}.method();
		
		E e = new E(){
			@Override
			public void method() {
				System.out.println("woshinimingneibulei");		
			}		
		};
		e.method();
	}
}
