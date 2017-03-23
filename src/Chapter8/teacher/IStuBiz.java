package Chapter8.teacher;

public interface IStuBiz {

	/**
	 * 根据姓名更新成绩
	 * @param name
	 * @param temp
	 */
	boolean updateStuInfo(String name, double temp);

	/**
	 * 删除
	 * 
	 * @param t
	 * @param name
	 */
	boolean delStuByName(String name);

	/**
	 * 添加
	 * 
	 * @param stu
	 * @return
	 */
	boolean addStudent(Student stu);

}