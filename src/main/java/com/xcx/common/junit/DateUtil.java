package com.xcx.common.junit;
/**
 * 
 * @ClassName: DateUtil 
 * @Description:日期工具类
 * @author: 徐春喜
 * @date: 2020年4月23日 下午4:39:55
 */

import java.util.Date;

public class DateUtil {
	/**
	 * 
	 * @Title: random 
	 * @Description: 随机产生一个min和max 之间的日期/也就是一个时间段内的随机日期
	 * @param min
	 * @param max
	 * @return
	 * @return: Date
	 */
	public static Date random(Date min,Date max) {
		long t1 = min.getTime();//开始日期
		long t2 = max.getTime();//结束日期
		//Math.random()是>=0 &<1之间的随机小数
		long t = (long)(Math.random()*(t2-t1)+t1);
		return new Date(t);

	}
}
