package com.jing.emperor.common.util;

import java.util.List;

/**
 * 公共校验类
 * @author liangjun
 *
 */
public class ListUtil {

	public static boolean isEmpty(List list){
		return null==list||list.size()==0;
	}
	
	public static boolean isNotEmpty(List list){
		return !isEmpty(list);
	}
	
}
