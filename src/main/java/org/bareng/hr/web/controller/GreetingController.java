package org.bareng.hr.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Very simple controller sample.
 * 
 * @author zakyalvan
 */
@Controller
public class GreetingController {
	private static final Logger LOGGER = LoggerFactory.getLogger(GreetingController.class);
	
	/**
	 * This will render hello.jsp file inside WEB-INF/views/ directory.
	 * 
	 * @return
	 */
	@RequestMapping(value="/hello")
	public String showHello() {
		LOGGER.debug("Show hello page");
		return "hello";
	}
}
