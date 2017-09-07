package com.bwf.dao;

import com.bwf.data.TokenDataSource;

public class UserDaoImpl implements IUserDao{

	@Override
	public void findUser() {
		
		//在Dao这里需要在TestServlet分配的令牌Token
		//由于令牌和线程是一对一的，因此，我们应当根据当前线程编号获取Token对象
		long id=Thread.currentThread().getId();
		
		TokenDataSource.tokenDataSource.get(id);
		
	}

}
