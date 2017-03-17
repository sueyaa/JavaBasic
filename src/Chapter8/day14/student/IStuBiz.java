package Chapter8.day14.student;

import java.util.ArrayList;

public interface IStuBiz {

	boolean addStudent(Student stu,ArrayList<Student> list);
	Student getStudentByName(String name,ArrayList<Student> list);
	boolean delStuByName(String name,ArrayList<Student> list);
	boolean updateStudentByName(Student stu,ArrayList<Student> list);
}
