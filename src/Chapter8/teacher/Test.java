package Chapter8.teacher;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 能一次性封装方法的最好 如果做不到可以先写在main中再独立出来. 最终一定要做到一次性封装方法.
 * 
 * @author Administrator
 *
 */
public class Test implements IStuBiz {
	boolean isOK = false;// --boolean类型的变量通常is开头.
	ArrayList<Student> stuList = new ArrayList<>();

	public static void main(String[] args) {

		Test t = new Test();

		// --模拟数据源
		Student stu1 = new Student("张三", 18, 80.1);
		Student stu2 = new Student("李四", 19, 70.1);
		Student stu3 = new Student("王五", 20, 90.1);

		t.stuList.add(stu1);
		t.stuList.add(stu2);
		t.stuList.add(stu3);

		/*
		 * 添加学生: 1.要有一个学生对象. 2.将学生对象add加入到list中. 3.add方法有一个返回值为boolean.来判断是否添加成功
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		Student stu = new Student();

		System.out.println("请输入学生姓名");
		stu.setName(scan.next());
		System.out.println("请输入学生年龄");
		stu.setAge(scan.nextInt());
		System.out.println("请输入学生成绩");
		stu.setScroe(scan.nextDouble());

		t.isOK = t.addStudent(stu);
		if (t.isOK) {
			System.out.println("添加成功");
			// System.out.println(t.stuList.get(t.stuList.size()-1));
		} else {
			System.out.println("添加失败");
		}
		t.queryAllStudent();

		System.out.println("请输入学生姓名:");
		String name = scan.next();
		System.out.println("输入的姓名为:" + name);
		t.isOK = t.delStuByName(name);

		if (t.isOK) {
			System.out.println("删除成功");
		} else {
			System.out.println("删除失败");
		}

		t.queryAllStudent();
		
		/*
		 * 修改:
		 */
		System.out.println("请输入要修改的学员姓名:");
		name = scan.next();
		System.out.println("请输入新的成绩");
		double temp = scan.nextDouble();
		//--调用修改的方法.
		t.updateStuInfo(name,temp);
		t.queryAllStudent();
	}

	/* (non-Javadoc)
	 * @see com.oaec.ex.IStuBiz#updateStuInfo(java.lang.String, double)
	 */
	@Override
	public boolean updateStuInfo(String name, double temp) {
		//--1遍历找到姓名对应的学员
		for (int i = 0; i < stuList.size(); i++) {
			Student stu = stuList.get(i);
			if (stu.getName().equals(name)) {
				//--2更新成绩
				stu.setScroe(temp);
				isOK = true;
			}else {
				isOK = false;
			}			
		}
		return isOK;
		
	}

	/* (non-Javadoc)
	 * @see com.oaec.ex.IStuBiz#delStuByName(java.lang.String)
	 */
	@Override
	public boolean delStuByName(String name) {
		// --1 .到数据源中遍历查找该名字是否存在
		for (int i = 0; i < stuList.size(); i++) {
			if (stuList.get(i).getName().equals(name)) {
				/*
				 * remove方法有2种参数 1.是Object 返回值为boolean 2.是int(下标)返回值为删除的对象.
				 */
				isOK = stuList.remove(i) != null;
			}
		}
		return isOK;
	}

	/**
	 * 查询全部
	 */
	private void queryAllStudent() {
		for (Student student : stuList) {
			System.out.println(student);
		}

	}

	/* (non-Javadoc)
	 * @see com.oaec.ex.IStuBiz#addStudent(com.oaec.ex.Student)
	 */
	@Override
	public boolean addStudent(Student stu) {

		// --将学生加入到集合中
		// --如果不是使用boolean作为返回值比如使用int
		/*
		 * 例如 1 代表成功 2 代表用户重复 3 代表密码不对
		 * 
		 * 这里的1 2 3 都应该已常量形式存在..并且这些值要定义在接口中.
		 */
		isOK = stuList.add(stu);
		return isOK;
	}

}
