package Chapter8.day14.student;

import java.util.ArrayList;

public class StuArrTest {
	ArrayList<Student> list = new ArrayList();

	public static void main(String[] args) {	
		IStuBizImpl biz = new IStuBizImpl();
		StuArrTest T = new StuArrTest();
		
		T.init();
		
		Student stu5 =new Student("FF",15,98.3); 
		
		//新增
		if(biz.addStudent(stu5, T.list)){
			System.out.println("添加成功");
			System.out.println(T.list.get(T.list.size() - 1));
		}else{
			System.out.println("添加失败");
		}
		
		biz.print(T.list);
		
		//删除
		biz.delStuByName("AA", T.list);
		biz.print(T.list);
		
		//修改
		biz.updateStudentByName(new Student("BB",16,66.5), T.list);
		biz.print(T.list);
		
		//查询	
		Student stu = biz.getStudentByName("GG", T.list);
		System.out.println(stu);
		
	}
	
	void init(){
		Student stu1 =new Student("AA",10,88.3); 
		Student stu2 =new Student("BB",12,78.3); 
		Student stu3 =new Student("CC",11,58.3); 
		Student stu4 =new Student("DD",13,68.3); 
		
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
	}

}
