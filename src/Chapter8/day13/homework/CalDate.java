package Chapter8.day13.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String date1 = "2015��2��17��";
		String date2 = "2015��3��29��";
		int days = cal(date1,date2);
		System.out.println(date1 + "��" + date2 + "һ�����" + days + "��");
		
	}
	
	public static int cal(String date1, String date2) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd��");  
        Calendar cal = Calendar.getInstance();    
        cal.setTime(sdf.parse(date1));    
        long time1 = cal.getTimeInMillis();                 
        cal.setTime(sdf.parse(date2));    
        long time2 = cal.getTimeInMillis();         
        long days=(time2-time1)/(1000*3600*24);  
            
       return Integer.parseInt(String.valueOf(days));

	}

}
