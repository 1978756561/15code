package com.bwf;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bwf.data.TokenDataSource;
import com.bwf.pojo.UserToken;
import com.bwf.service.IUserService;
import com.bwf.service.UserServiceImpl;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private static int count=100;
	private int number=99;
	
	private IUserService userService=new UserServiceImpl();
	
	/**
	 * Servlet在WEB容器中是单例的  WEB容器单例
	 * 在这种情况下，我们应当考虑：多线程情况下的线程并发带来的安全问题.
	 * */
	
    public TestServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		int age=8;
		
		if(request.getParameter("id").equals("10")){
			count=200;
			number=999;
			age=88;
		}
		
		TokenDataSource.tokenDataSource.put(Thread.currentThread().getId(), new UserToken());
		
		
		if(TokenDataSource.tokenThreadLocale.get()==null){
			
			TokenDataSource.tokenThreadLocale.set(new UserToken());
		}
		
		
		userService.findUser();
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		response.getWriter().write("<h2>count = "+count+"</h2>");
		response.getWriter().write("<br><br><h2>number = "+number+"</h2>");
		response.getWriter().write("<br><br><h2>age = "+age+"</h2>");
	}

	

}
