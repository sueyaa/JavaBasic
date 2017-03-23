package Chapter8.teacher;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ��һ���Է�װ��������� ���������������д��main���ٶ�������. ����һ��Ҫ����һ���Է�װ����.
 * 
 * @author Administrator
 *
 */
public class Test implements IStuBiz {
	boolean isOK = false;// --boolean���͵ı���ͨ��is��ͷ.
	ArrayList<Student> stuList = new ArrayList<>();

	public static void main(String[] args) {

		Test t = new Test();

		// --ģ������Դ
		Student stu1 = new Student("����", 18, 80.1);
		Student stu2 = new Student("����", 19, 70.1);
		Student stu3 = new Student("����", 20, 90.1);

		t.stuList.add(stu1);
		t.stuList.add(stu2);
		t.stuList.add(stu3);

		/*
		 * ���ѧ��: 1.Ҫ��һ��ѧ������. 2.��ѧ������add���뵽list��. 3.add������һ������ֵΪboolean.���ж��Ƿ���ӳɹ�
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		Student stu = new Student();

		System.out.println("������ѧ������");
		stu.setName(scan.next());
		System.out.println("������ѧ������");
		stu.setAge(scan.nextInt());
		System.out.println("������ѧ���ɼ�");
		stu.setScroe(scan.nextDouble());

		t.isOK = t.addStudent(stu);
		if (t.isOK) {
			System.out.println("��ӳɹ�");
			// System.out.println(t.stuList.get(t.stuList.size()-1));
		} else {
			System.out.println("���ʧ��");
		}
		t.queryAllStudent();

		System.out.println("������ѧ������:");
		String name = scan.next();
		System.out.println("���������Ϊ:" + name);
		t.isOK = t.delStuByName(name);

		if (t.isOK) {
			System.out.println("ɾ���ɹ�");
		} else {
			System.out.println("ɾ��ʧ��");
		}

		t.queryAllStudent();
		
		/*
		 * �޸�:
		 */
		System.out.println("������Ҫ�޸ĵ�ѧԱ����:");
		name = scan.next();
		System.out.println("�������µĳɼ�");
		double temp = scan.nextDouble();
		//--�����޸ĵķ���.
		t.updateStuInfo(name,temp);
		t.queryAllStudent();
	}

	/* (non-Javadoc)
	 * @see com.oaec.ex.IStuBiz#updateStuInfo(java.lang.String, double)
	 */
	@Override
	public boolean updateStuInfo(String name, double temp) {
		//--1�����ҵ�������Ӧ��ѧԱ
		for (int i = 0; i < stuList.size(); i++) {
			Student stu = stuList.get(i);
			if (stu.getName().equals(name)) {
				//--2���³ɼ�
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
		// --1 .������Դ�б������Ҹ������Ƿ����
		for (int i = 0; i < stuList.size(); i++) {
			if (stuList.get(i).getName().equals(name)) {
				/*
				 * remove������2�ֲ��� 1.��Object ����ֵΪboolean 2.��int(�±�)����ֵΪɾ���Ķ���.
				 */
				isOK = stuList.remove(i) != null;
			}
		}
		return isOK;
	}

	/**
	 * ��ѯȫ��
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

		// --��ѧ�����뵽������
		// --�������ʹ��boolean��Ϊ����ֵ����ʹ��int
		/*
		 * ���� 1 ����ɹ� 2 �����û��ظ� 3 �������벻��
		 * 
		 * �����1 2 3 ��Ӧ���ѳ�����ʽ����..������ЩֵҪ�����ڽӿ���.
		 */
		isOK = stuList.add(stu);
		return isOK;
	}

}
