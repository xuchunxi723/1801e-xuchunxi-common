package com.xcx.common.junit;

import org.junit.Test;

public class StringUtilTest {
	@Test//判断是否是手机号
	public void testIsPhone() {
	 String str ="18935071125";
	 boolean b = StringUtil.isPhone(str);
	 if(b) {
		 System.out.println("是");
	 }else {
		 System.out.println("不是");

	 }
		
	}
	
	@Test//判断是否数字
	public void testIsNumber() {
		/* String str ="1aaaaa4.0"; */
		 String str ="12.0";
	 boolean b = StringUtil.isNumber(str);
	 if(b) {
		 System.out.println("是数字");
	 }else {
		 System.out.println("不是数字");

	 }
		
	}
	@Test
	public void testHasLength() {
		String str=" ";
		System.out.println(StringUtil.hasLength(str));
	}

	@Test
	public void testHasText() {
		
		String str=" ";
		System.out.println(StringUtil.hasText(str));
	}

	@Test
	public void testRandomChineseString() {
		String string = StringUtil.randomChineseString(100);
		System.out.println(string);
	}

	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 100; i++) {
			String name = StringUtil.generateChineseName();
			System.out.println(name);
		}
	}
}
