package Chapter8.day18.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "����");
		map.put(2, "����");
		map.put(3, "����");
		map.put(4, "����");
		map.put(5, "�ܰ�");
		map.put(6, "����");
		
		 //������ʽһ��
		 map.forEach((Integer,String)->
			System.out.println(Integer + "," + String));
			
		System.out.println("********************");
		System.out.println(map.containsKey(0));
		System.out.println(map.containsValue("����"));
		
		//������ʽ����
		Set<Entry<Integer,String>> entry = map.entrySet();
		 for (Entry<Integer, String> entry2 : entry) {
			System.out.println(entry2);
		}		
		System.out.println("********************");
		 
		/*System.out.println(map.get(0));
		System.out.println(map.equals(entry));
		System.out.println(map.isEmpty());*/
		//  ���ش�ӳ���а����ļ��� set ��ͼ��
		Set<Integer> set = map.keySet();
		//���ش�ӳ���а�����ֵ�� collection ��ͼ��
		Collection<String> colle = map.values();
/*		for (String string : colle) {
			System.out.println(string);
		}
		System.out.println("********************");
		for (Integer integer : set) {
			System.out.println(integer);
		}*/
		
		
/*		map.remove(1);
		Set<Entry<Integer,String>> entry1 = map.entrySet();
		 for (Entry<Integer, String> entry2 : entry) {
			System.out.println(entry2);
		}	
		System.out.println(map.hashCode());*/
		
		System.out.println(map.remove(2, "����"));
	}

}
