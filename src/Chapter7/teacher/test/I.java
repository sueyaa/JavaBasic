package Chapter7.teacher.test;

public class I {
	static int i;
	int j;
	public static void main(String[] args){
		I i1 = new I();
		I i2 = new I();
		I i3 = new I();
		
		i1.i =10;
		i1.j = 0;
		
		i2.i = 20;
		i2.j = 30;
		
		i3.i = 50; 
		i3.j = 40;
		
		System.out.println(i1.i);//   i ÊÇstaticµÄ.
		System.out.println(i1.j);//
		
		
		
		
		
	}

}
