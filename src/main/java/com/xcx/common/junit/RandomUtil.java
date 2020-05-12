package com.xcx.common.junit;

import java.util.HashSet;
import java.util.Random;

/**
 * 
 * @ClassName: RandomUtil 
 * @Description:(1)	随机数工具类
 * @author: xuchunxi
 * @date: 2020年4月23日 下午3:13:58
 */
public class RandomUtil {
	
	
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		Random r = new Random();
		return r.nextInt(max-min+1)+min;
	}
	
	
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs){
		if(subs>(max-min+1))
			new RuntimeException("数据范围有误！！！");
		
		HashSet<Integer> set = new HashSet<Integer>();
		while (set.size()!=subs) {
			set.add(random(min, max));
		}
		
		int[] x=new int[subs];
		int i=0;
		
		for (Integer integer : set) {
			x[i]=integer;
			i++;
		}
		return x;

	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){	

		String str ="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		return  str.charAt(random(0, str.length()-1));
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sb.append(randomCharacter());
		}
		return sb.toString();

	}
	// 方法4：返回1个  0-9之间的数据。 (8分)
		public static int random() {
			int[] str = {1,2,3,4,5,6,7,8,9,0};
			return str[random(0,9)];
		}
		// 方法5：返回指定长度的随机数字 (8分)
			public static String random(int length) {
				StringBuffer str= new StringBuffer();
				for(int i=0 ;i<length ;i ++) {
					str.append(random());
				}
				return str.toString();
		}

}
