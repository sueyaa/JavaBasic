package Chapter7.teacher;
import java.util.Scanner;

//--ӰƬ
public class Movie {
	//--���췽��Ҳ�Ƿ���.ֻ�Ǻ���ͨ�ķ�����΢�е�����.
	//--û�з���ֵ.�ҷ����������Ǻ�����һ��
	public Movie(){	
		
		int i = 0;//--  0 ��һ��int���͵�ֵ.����i����Ӧ���ڴ���
		Scanner scan = new Scanner(System.in); //A��һ��ֵ.��ֵ��Scanner���͵�.�����ڶ���.
		//--������汣��A�ĵ�ַ����scan.
		
		new Scanner(System.in);//-������һ������.
		//new + ���췽������.
		//-- ���췽���ᱻnew����. ���õ��Ľ������һ������.(ʵ��)
		
		
		
		
		
		
		
		
		
	}
	//-- ���췽����newһ��ʹ������ʵ����������������.
	//-- �����������������͵Ķ���
	
	
	
	
	
	
	
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

	// --GET Ŀ����Ϊ��ȡֵ. .�ǽ�ֵ���ݵ�����.ͨ�������ķ���ֵ��ʵ��
	public String getName() {
		return name;
	}

	// --SET Ŀ����Ϊ�˸�ֵ.�������洫���ֵ.��ֵ����Ӧ�ı���.
	// --ͨ����������ɿ��Խ���ʲô�������ݺͶ����������ݵĶ���.
	public void setName(String name) {
		this.name = name;
	}

	public long getTime() {
		return time;
	}

	//--��ֵ. ��ֵ�ſ��Ը�ֵ
	//--���ֵ�����ڲ��Ƿ���Բ���?
	//--������Բ����ڲ�ֱ�Ӹ�ֵ.����ڲ��޷�����.
	//-- Ҫ��һ����Ӱ���ò���ʱ�䳤��.
	//--�����൱��һ�����տ����ڽ������洫����������.
	//-- ���տڻ��д�С.��涨�˿��Խ��յ���������.
	public void setTime(long time) {
		if (time < 200) {
			System.out.println("̫����,����ӳ���");
			time = 200;
		}
		this.time = time;
	}

}
