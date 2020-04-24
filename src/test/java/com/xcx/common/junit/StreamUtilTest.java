package com.xcx.common.junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
	}

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		
		String path ="D:\\pic\\hello.txt";
		
		String string = StreamUtil.readTextFile(new FileInputStream(path));
		System.out.println(string);
	}

	@Test
	public void testReadTextFileFile() {
		String path ="D:\\pic\\hello.txt";
		String file = StreamUtil.readTextFile(new File(path));
		System.out.println(file);
		
	}
	
	
	@Test
	public void testReadText2List() {
		String path ="D:\\pic\\hello.txt";
		List<String> list = StreamUtil.readTextFile2List(new File(path));
		for (String string : list) {
			System.out.println(string);
		}
	}

}
