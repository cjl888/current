package com.sxt.sys.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class AppListener implements ServletContextListener{

	// 销毁
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	// 初始化
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// 取到ServletContext
		ServletContext context=arg0.getServletContext();
		context.setAttribute("ctx", context.getContextPath());
		System.err.println("---------Servlet容器创建成功 ctx被放到ServletContext作用域-------");
	}

}
