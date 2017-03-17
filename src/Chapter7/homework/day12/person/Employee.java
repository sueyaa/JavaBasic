package Chapter7.homework.day12.person;

public class Employee extends Person{
	private String position;

	public Employee(String name, int age, char gender, String position) {
		super(name, age, gender);
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public void introduce() {
		System.out.println("name:" + getName() + ", age:" + getAge() + ", gender:" + getGender() + ", position:" + getPosition());
	}
	
/*	public static void equals(Employee emp1, Employee emp2){
		boolean flag = true;
		System.out.println("两位职员信息如下：");
		emp1.introduce();
		emp2.introduce();
		System.out.println("判断两个职员是否“相等”：");
		if(emp1.getName().equals(emp2.getName()) && emp1.getAge() == (emp2.getAge())
				&& emp1.getGender() == emp2.getGender() && emp1.getPosition().equals(emp2.getPosition())){
			flag = true;
		}else{
			flag = false;
		}
		System.out.println(flag);
	}*/

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(arg0 == null || arg0.getClass() != this.getClass()){
			return false;
		}
		
		Employee em = (Employee)arg0;
		if(this.getName().equals(em.getName()) 
				&& this.getAge() == em.getAge() 
				&& this.getGender() == em.getGender() 
				&& this.getPosition().equals(em.getPosition())){
			flag = true;
		}else{
			flag = false;
		}
		return flag;
	}
}
