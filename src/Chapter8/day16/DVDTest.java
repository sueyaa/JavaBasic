package Chapter8.day16;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class DVDTest implements IDVDBiz{
	LinkedList<DVD> dvdList = new LinkedList<>();

	public static void main(String[] args) {
		//--使用LinkedList来保存DVD
		DVDTest dt = new DVDTest();
		dt.init();	
		DVD dvd6 = new DVD(6, "致我们终将逝去的青春", "", "", false, 0);
		dt.addDVD(dvd6);
		dt.queryAll();		
		dt.delDVDByName("致我们终将逝去的青春");
		dt.queryAll();
		dt.queryByName("美女与野兽");
	}
	
	private void init() {	
		DVD dvd1 = new DVD(1, "神奇动物去哪了", "", "", false, 0);
		DVD dvd2 = new DVD(2, "金刚:骷髅岛", "", "", false, 0);
		DVD dvd3 = new DVD(3, "金刚狼3", "", "", false, 0);
		DVD dvd4 = new DVD(4, "生化危机-终章", "", "", false, 0);
		DVD dvd5 = new DVD(5, "美女与野兽", "", "", false, 0);
		
		dvdList.add(dvd1);
		dvdList.add(dvd2);
		dvdList.add(dvd3);
		dvdList.add(dvd4);
		dvdList.add(dvd5);

	//--根据DVD的编号进行排序.根据Comparator中定义的规则自动排序.
		Collections.sort(dvdList, new Comparator<DVD>() {
				//--利用匿名内部类生成Comparator接口的实现类对象.
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
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}		
	}
	
	@Override
	public void updateDVD(String name,boolean status) {
		for (int i = 0; i < dvdList.size(); i++) {
			if(dvdList.get(i).getDvdName().equals(name)){
				dvdList.get(i).setDvdStatus(status);
				System.out.println("更新成功");
			}else{
				if(i == dvdList.size() - 1){
					System.out.println("您输的DVD不存在");
				}
			}
		}
	}
	
	@Override
	public void delDVDByName(String name) {
		for (int i = 0; i < dvdList.size(); i++) {
			if(dvdList.get(i).getDvdName().equals(name)){
				dvdList.remove(dvdList.get(i));
				System.out.println("删除成功");
			}else{
				if(i == dvdList.size() - 1){
					System.out.println("您输的DVD不存在");
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
