package com.bwf.service;

import com.bwf.dao.IUserDao;
import com.bwf.dao.UserDaoImpl;
import com.bwf.data.TokenDataSource;

public class UserServiceImpl implements IUserService{

	private IUserDao userDao=new UserDaoImpl();
	
	@Override
	public void findUser() {
		
		//Ҳ��Ҫ��ȡTestServlet���������
		//�������ƺ��߳���һ��һ�ģ���ˣ�����Ӧ�����ݵ�ǰ�̱߳�Ż�ȡToken����
		long id=Thread.currentThread().getId();
		TokenDataSource.tokenDataSource.get(id);
		
		//��ȡ��ǰ�̶߳�Ӧ��ʵ��
		TokenDataSource.tokenThreadLocale.get();
		
		userDao.findUser();
		
	}

}
