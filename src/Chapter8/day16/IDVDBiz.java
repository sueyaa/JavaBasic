package Chapter8.day16;

import java.util.LinkedList;

import Chapter8.teacher.Student;

public interface IDVDBiz {
	
	void delDVDByName(String name);
	void addDVD(DVD dvd);
	void updateDVD(String name, boolean status);
}
