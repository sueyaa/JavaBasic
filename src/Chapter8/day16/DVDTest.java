package Chapter8.day16;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class DVDTest implements IDVDBiz{
	LinkedList<DVD> dvdList = new LinkedList<>();

	public static void main(String[] args) {
		//--ʹ��LinkedList������DVD
		DVDTest dt = new DVDTest();
		dt.init();	
		DVD dvd6 = new DVD(6, "�������ս���ȥ���ഺ", "", "", false, 0);
		dt.addDVD(dvd6);
		dt.queryAll();		
		dt.delDVDByName("�������ս���ȥ���ഺ");
		dt.queryAll();
		dt.queryByName("��Ů��Ұ��");
	}
	
	private void init() {	
		DVD dvd1 = new DVD(1, "���涯��ȥ����", "", "", false, 0);
		DVD dvd2 = new DVD(2, "���:���õ�", "", "", false, 0);
		DVD dvd3 = new DVD(3, "�����3", "", "", false, 0);
		DVD dvd4 = new DVD(4, "����Σ��-����", "", "", false, 0);
		DVD dvd5 = new DVD(5, "��Ů��Ұ��", "", "", false, 0);
		
		dvdList.add(dvd1);
		dvdList.add(dvd2);
		dvdList.add(dvd3);
		dvdList.add(dvd4);
		dvdList.add(dvd5);

	//--����DVD�ı�Ž�������.����Comparator�ж���Ĺ����Զ�����.
		Collections.sort(dvdList, new Comparator<DVD>() {
				//--���������ڲ�������Comparator�ӿڵ�ʵ�������.
				@Override
				public int compare(DVD o1, DVD o2) {
					// TODO Auto-generated method stub
					return o1.getDvdId() - o2.getDvdId();
				}
			});		
	}		
			
	@Override
	public void addDVD(DVD dvd) {
		if(dvdList.add(dvd)){
			System.out.println("��ӳɹ�");
		}else{
			System.out.println("���ʧ��");
		}		
	}
	
	@Override
	public void updateDVD(String name,boolean status) {
		for (int i = 0; i < dvdList.size(); i++) {
			if(dvdList.get(i).getDvdName().equals(name)){
				dvdList.get(i).setDvdStatus(status);
				System.out.println("���³ɹ�");
			}else{
				if(i == dvdList.size() - 1){
					System.out.println("�����DVD������");
				}
			}
		}
	}
	
	@Override
	public void delDVDByName(String name) {
		for (int i = 0; i < dvdList.size(); i++) {
			if(dvdList.get(i).getDvdName().equals(name)){
				dvdList.remove(dvdList.get(i));
				System.out.println("ɾ���ɹ�");
			}else{
				if(i == dvdList.size() - 1){
					System.out.println("�����DVD������");
				}
			}
		}
	}
	
	private void queryByName(String name){
		for (DVD dvd : dvdList) {
			if(dvd.getDvdName().equals(name)){
				System.out.println(dvd);
			}
		}
	}
	
	private void queryAll() {
		/*for (DVD dvd : dvdList) {
			System.out.println(dvd);
		}*/
		Iterator<DVD> iterator = dvdList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
