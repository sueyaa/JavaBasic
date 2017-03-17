package Chapter8.day13.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String date1 = "2015年2月17日";
		String date2 = "2015年3月29日";
		int days = cal(date1,date2);
		System.out.println(date1 + "和" + date2 + "一共相差" + days + "天");
		
	}
	
	public static int cal(String date1, String date2) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");  
        Calendar cal = Calendar.getInstance();    
        cal.setTime(sdf.parse(date1));    
        long time1 = cal.getTimeInMillis();                 
        cal.setTime(sdf.parse(date2));    
        long time2 = cal.getTimeInMillis();         
        long days=(time2-time1)/(1000*3600*24);  
            
       return Integer.parseInt(String.valueOf(days));

	}

}
