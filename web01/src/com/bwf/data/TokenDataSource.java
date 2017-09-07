package com.bwf.data;

import java.util.HashMap;
import java.util.Map;

import com.bwf.pojo.UserToken;

public class TokenDataSource {

	public static Map<Long, UserToken> tokenDataSource=new HashMap<>();
	
	/**
	 * ThreadLocal可以管理当前线程和指定实例对象之间的对应关系
	 * */
	public static ThreadLocal<UserToken> tokenThreadLocale=new ThreadLocal<>();
	
}
