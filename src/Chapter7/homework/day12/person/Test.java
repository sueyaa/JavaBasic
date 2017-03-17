package Chapter7.homework.day12.person;

public class Test {

	public static void main(String[] args) {
		Employee p1 = new Employee("Jim",28,'男',"软件工程师");
		Employee p2 = new Employee("Jim",28,'男',"软件工程师");

		System.out.println(p1.equals(p2));
	}

}
