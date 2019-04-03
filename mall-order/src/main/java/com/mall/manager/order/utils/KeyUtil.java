package com.mall.manager.order.utils;

import java.util.Random;

public class KeyUtil {
		/**
		 * 生成唯一主键 ; 这个不能作为唯一，只是简单使用
		 */
		public static synchronized String genUniqueKey(){
				Random random = new Random();
				Integer number = random.nextInt(900000) + 100000;
				return System.currentTimeMillis() + String.valueOf(number);
		}
}