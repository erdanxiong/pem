package com.pem.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static final SimpleDateFormat   dateFormat = new  SimpleDateFormat("yyyy-MM-dd");
	public static String changeDate(Date date){
		String result = null;
		try {
			result = dateFormat.format(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
