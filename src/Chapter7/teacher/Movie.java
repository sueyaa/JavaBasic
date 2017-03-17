package Chapter7.teacher;
import java.util.Scanner;

//--影片
public class Movie {
	//--构造方法也是方法.只是和普通的方法略微有点区别.
	//--没有返回值.且方法的名称是和类名一致
	public Movie(){	
		
		int i = 0;//--  0 是一个int类型的值.放在i所对应的内存中
		Scanner scan = new Scanner(System.in); //A是一个值.该值是Scanner类型的.保存在堆中.
		//--便堆里面保存A的地址给了scan.
		
		new Scanner(System.in);//-整体是一个对象.
		//new + 构造方法来的.
		//-- 构造方法会被new调用. 所得到的结果就是一个对象.(实例)
		
		
		
		
		
		
		
		
		
	}
	//-- 构造方法和new一起使用用于实例化引用数据类型.
	//-- 即创建引用数据类型的对象
	
	
	
	
	
	
	
	public String[] getXXX(){
		return new String[]{"1","2"};
	}

	private String name;
	private long time;
	
	public Student getStudent(){
		return new Student();
	}

	public int getID() {
		return 0;
	}
	
	public boolean isOK() {
		return false;
	}

	// --GET 目的是为了取值. .是将值传递到外面.通过方法的返回值来实现
	public String getName() {
		return name;
	}

	// --SET 目的是为了赋值.接收外面传入的值.赋值给对应的变量.
	// --通过参数来完成可以接收什么类型数据和多少数量数据的定义.
	public void setName(String name) {
		this.name = name;
	}

	public long getTime() {
		return time;
	}

	//--赋值. 有值才可以赋值
	//--这个值方法内部是否可以产生?
	//--如果可以产生内部直接赋值.如果内部无法产生.
	//-- 要给一部电影设置播放时间长度.
	//--参数相当于一个接收口用于接收外面传进来的内容.
	//-- 接收口会有大小.这规定了可以接收的数据类型.
	public void setTime(long time) {
		if (time < 200) {
			System.out.println("太短了,帮你加长点");
			time = 200;
		}
		this.time = time;
	}

}
