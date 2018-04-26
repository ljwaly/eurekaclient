package com.ljw.eureka.client.util;

import org.springframework.util.Assert;

public class MyAssert extends Assert{

	/**
	 * 
	 * 
	 * @param value
	 * @return true ：空（null或者""）;
	 * 			false : 非空
	 */
	public static boolean isNullOrNot(String value){
		return value == null || "".equals(value) ? true :false;
	}
}
