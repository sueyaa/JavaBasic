package Chapter8.innerClass;

public class C implements E{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		//接口可以实例化，但是不可以直接实例化，因为接口没有构造函数。通过类实现接口再将该类的实例赋值给接口对象是可以的，这是间接实例化。
		E e = new C();
	}

}
