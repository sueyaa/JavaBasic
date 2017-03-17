package Chapter7.teacher.interfacedemo;

//--定义飞行这种行为规范.
public interface Fly {
	int i = 10;//--在Eclipse中通常静态的变量时歪的.
	//--在接口中变量默认被public static final 所修饰
	public static final int j =10;
	public void fly();
}
