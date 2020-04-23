package com.xcx.common.junit;

import org.junit.Test;

public class StringUtilTest {

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
