package Chapter8.day13.homework;

public class StudentTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1,zhangsan,18";
		String[] strArr = str.split(",");
		Student stu = new Student();
		stu.setId(Long.parseLong(strArr[0]));
		stu.setName(new StringBuilder(strArr[1]));
		stu.setAge(Integer.parseInt(strArr[2]));
		
		System.out.println(stu.toString());
	}

}
