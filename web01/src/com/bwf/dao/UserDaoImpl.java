package com.bwf.dao;

import com.bwf.data.TokenDataSource;

public class UserDaoImpl implements IUserDao{

	@Override
	public void findUser() {
		
		//��Dao������Ҫ��TestServlet���������Token
		//�������ƺ��߳���һ��һ�ģ���ˣ�����Ӧ�����ݵ�ǰ�̱߳�Ż�ȡToken����
		long id=Thread.currentThread().getId();
		
		TokenDataSource.tokenDataSource.get(id);
		
	}

}
