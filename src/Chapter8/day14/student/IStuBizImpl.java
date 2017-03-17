package Chapter8.day14.student;

import java.util.ArrayList;

public class IStuBizImpl implements IStuBiz{

	
	@Override
	public boolean addStudent(Student stu,ArrayList<Student> list) {
		if(stu != null){
			list.add(stu);
			return true;
		}
		return false;
	}

	@Override
	public Student getStudentByName(String name,ArrayList<Student> list) {
		for (Student student : list) {
			if(student.getName().equals(name)){
				return student;
			}
		}
		return null;
	}

	@Override
	public boolean delStuByName(String name,ArrayList<Student> list) {
		for (Student student : list) {
			if(student.getName().equals(name)){
				list.remove(student);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateStudentByName(Student stu,ArrayList<Student> list) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(stu.getName())){
				list.set(i, stu);
			}
		}
		return false;
	}
	
	public void print(ArrayList<Student> list){
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("***************");
	}	

}
