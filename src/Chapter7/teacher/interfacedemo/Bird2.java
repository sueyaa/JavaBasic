package Chapter7.teacher.interfacedemo;

//--把Bird这个类称作是接口Fly的实现类.
public class Bird2 implements Fly{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("我是一只小小小小鸟,想要飞的更高");
	}

}
