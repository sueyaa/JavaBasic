package Chapter7.teacher;

public class MovieTest {
	public static void main(String[] args) {
		
		Movie m = new Movie();
		//The field Movie.name is not visible
		//m.name = "";
		
		m.setName("浪漫樱花");
		m.setTime(120);//-M 为单位
		
		System.out.println("影片的名称:" + m.getName());
		System.out.println("影片的时长:" + m.getTime());
	}

}
