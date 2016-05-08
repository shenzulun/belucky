package org.magen.belucky.util;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.datetime.DateFormatter;

/**
 * 时间日期工具类
 * @date 2015年2月12日
 * @author shenzl
 */
public class DateTimeUtil {
	public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";
	public static final String DEFAULT_DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	
	/**
	 * 日期格式化
	 *
	 * @param date
	 * @param pattern	类似：yyyy-MM-dd HH:mm:ss
	 * @param locale	时区，类似：Locale.CHINESE
	 * @return
	 */
	public static String format(Date date,String pattern,Locale locale){
		DateFormatter formater = new DateFormatter(pattern);
		String str = formater.print(date, locale);
		return str;
	}
	
	/**
	 * 日期格式化
	 *
	 * @param date
	 * @param pattern 类似：yyyy-MM-dd HH:mm:ss	
	 * @return
	 */
	public static String format(Date date,String pattern){
		return format(date,pattern,Locale.CHINESE);
	}
	
	/**
	 * 日期格式化
	 * 默认yyyy-MM-dd HH:mm:ss
	 *
	 * @param date
	 * @return
	 */
	public static String format(Date date){
		return format(date,DEFAULT_DATETIME_PATTERN);
	}
	
	/**
	 * 格式化字符串为日期
	 * @param text
	 * @param pattern	类似：yyyy-MM-dd HH:mm:ss
	 * @param locale	时区，类似：Locale.CHINESE
	 * @return
	 */
	public static Date parse(String text, String pattern, Locale locale){
		DateFormatter formater = new DateFormatter(pattern);
		Date date = null;
		try {
			date = formater.parse(text, locale);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	/**
	 * 格式化字符串为日期
	 * @param text
	 * @param pattern 类似：yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static Date parse(String text, String pattern){
		return parse(text,pattern,Locale.CHINESE);
	}
	
	/**
	 * 格式化字符串为日期，默认yyyy-MM-dd HH:mm:ss
	 * @param text
	 * @return
	 */
	public static Date parse(String text){
		return parse(text,DEFAULT_DATETIME_PATTERN,Locale.CHINESE);
	}
	
	public static String formatAdd8(Date date){
		date.setHours(date.getHours() + 8);
		return format(date,DEFAULT_DATETIME_PATTERN);
	}
}
