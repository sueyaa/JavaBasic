package Chapter8.day16.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {
	Scanner scan = new Scanner(System.in);
	static ArrayList<DVD> list = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListDemo2 ld = new ArrayListDemo2();
		ld.init();
		System.out.println("ɾ���ظ�Ԫ��֮ǰ��");
		ld.printAll(list);
		System.out.println();
		ld.removeRepe(list);
		System.out.println("ɾ���ظ�Ԫ��֮��");
		ld.printAll(list);
	}
	
	public void init(){
		DVD dvd1 = new DVD(1, "���涯��ȥ����", "", "", false, 0);
		DVD dvd2 = new DVD(2, "���:���õ�", "", "", false, 0);
		DVD dvd3 = new DVD(3, "�����3", "", "", false, 0);
		DVD dvd4 = new DVD(4, "����Σ��-����", "", "", false, 0);
		DVD dvd5 = new DVD(5, "��Ů��Ұ��", "", "", false, 0);
		
		list.add(dvd1);
		list.add(dvd2);
		list.add(dvd3);
		list.add(dvd4);
		list.add(dvd5);	
		
		DVD dvd6 = createDVD();
		list.add(1, dvd6);
		list.add(5,dvd1);
	}
	
	public void removeRepe(ArrayList<DVD> list){
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size() - i - 1; j++) {
				if(list.get(i).getDvdId() == list.get(j).getDvdId() 
						&& list.get(i).getDvdName().equals(list.get(j).getDvdName())){
					list.remove(j);
				}
			}
		}
	}
	
	public void printAll(ArrayList<DVD> list){
		for (DVD dvd : list) {
			System.out.println(dvd);
		}
	}
	
	private DVD createDVD() {
		// --��Scanner.���ڴӱ�׼����(����)��ȡ¼�������
		DVD dvd = new DVD();
		System.out.println("������DVD���");
		dvd.setDvdId(scan.nextInt());
		System.out.println("������DVD����");
		dvd.setDvdName(scan.next());
		dvd.setDvdlendTime("");
		dvd.setDvdReturnTime("");
		dvd.setDvdStatus(false);
		dvd.setLendCount(0);
		return dvd;
	}

}

