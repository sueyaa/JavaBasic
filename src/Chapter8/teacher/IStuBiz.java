package Chapter8.teacher;

public interface IStuBiz {

	/**
	 * �����������³ɼ�
	 * @param name
	 * @param temp
	 */
	boolean updateStuInfo(String name, double temp);

	/**
	 * ɾ��
	 * 
	 * @param t
	 * @param name
	 */
	boolean delStuByName(String name);

	/**
	 * ���
	 * 
	 * @param stu
	 * @return
	 */
	boolean addStudent(Student stu);

}