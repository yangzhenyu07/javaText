package com.yzy.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class P8 {

	public void timeHs(int i)  throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Date date = sdf.parse("00:00");
		
		Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MINUTE, 15*i);
        String dayBefore ="";
        dayBefore = new SimpleDateFormat("HH:mm").format(c.getTime());   
        System.out.println(dayBefore);
	}
	public static void main(String[] args) throws ParseException {
		P8 p = new P8();
		for (int i = 1; i <= 24*4; i++) {
			p.timeHs(i);
		}
	}
}
