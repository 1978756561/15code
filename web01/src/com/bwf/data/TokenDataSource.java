package com.bwf.data;

import java.util.HashMap;
import java.util.Map;

import com.bwf.pojo.UserToken;

public class TokenDataSource {

	public static Map<Long, UserToken> tokenDataSource=new HashMap<>();
	
	/**
	 * ThreadLocal���Թ���ǰ�̺߳�ָ��ʵ������֮��Ķ�Ӧ��ϵ
	 * */
	public static ThreadLocal<UserToken> tokenThreadLocale=new ThreadLocal<>();
	
}
