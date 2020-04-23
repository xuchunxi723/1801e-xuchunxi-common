package com.xcx.common.junit;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testRandom() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 4, 1);
		
		Date date = DateUtil.random(c.getTime(), new Date());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(date);
		System.out.println(format);
	}

}
