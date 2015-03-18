package com.wc.findyy.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
/**
 * @author xuguang
 * @time 2015-3-18 下午6:35:35
 */
@Component
public class SessionListener implements HttpSessionListener{
	
	
	Logger logger = Logger.getLogger(getClass());

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
	
			
	}
	
}


