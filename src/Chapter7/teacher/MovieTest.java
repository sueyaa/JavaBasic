package Chapter7.teacher;

public class MovieTest {
	public static void main(String[] args) {
		
		Movie m = new Movie();
		//The field Movie.name is not visible
		//m.name = "";
		
		m.setName("����ӣ��");
		m.setTime(120);//-M Ϊ��λ
		
		System.out.println("ӰƬ������:" + m.getName());
		System.out.println("ӰƬ��ʱ��:" + m.getTime());
	}

}
