/*
 * @诗屿星河
 */
package jp.co.syxh.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import jp.co.syxh.common.Const;

/**
 * 年龄算出.<br>
 * 
 * @author M
 */
public class GetAgeUtil {
	
	/**
	 * 年龄算出.<br>
	 * 
	 * @param birthday 出生年月日
	 * @return 年龄
	 * @throws ParseException 
	 */
	public int getAge(String birthday) throws ParseException {
		//日期格式
		SimpleDateFormat sdf = new SimpleDateFormat(Const.YYYY_MM_DD);
		//String型转换成DATE类型
		Date birDate = sdf.parse(birthday);
		//获取当前日期
		Calendar cal = Calendar.getInstance();
		
		//判断出生年月日是否早于当前日期
		if(cal.before(birDate)) {
			
		}

		//出生年月日转换成
		Calendar bir = Calendar.getInstance();
		bir.setTime(birDate);
		
		//计算整数岁
		int age = cal.get(Calendar.YEAR) - bir.get(Calendar.YEAR);
		//判断月份
		if(cal.get(Calendar.MONTH) > bir.get(Calendar.MONTH)) {
			return age;
		} else if(cal.get(Calendar.MONTH) < bir.get(Calendar.MONTH)) {
			return age - 1;
		} else if(cal.get(Calendar.DAY_OF_MONTH) < bir.get(Calendar.DAY_OF_MONTH)) {
			return age - 1;
		} else {
			return age;
		}
	}

}
