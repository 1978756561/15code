package com.bwf.service;

import com.bwf.dao.IUserDao;
import com.bwf.dao.UserDaoImpl;
import com.bwf.data.TokenDataSource;

public class UserServiceImpl implements IUserService{

	private IUserDao userDao=new UserDaoImpl();
	
	@Override
	public void findUser() {
		
		//也需要获取TestServlet分配的令牌
		//由于令牌和线程是一对一的，因此，我们应当根据当前线程编号获取Token对象
		long id=Thread.currentThread().getId();
		TokenDataSource.tokenDataSource.get(id);
		
		//获取当前线程对应的实例
		TokenDataSource.tokenThreadLocale.get();
		
		userDao.findUser();
		
	}

}
