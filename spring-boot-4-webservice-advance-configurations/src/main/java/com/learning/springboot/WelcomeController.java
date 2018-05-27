package com.learning.springboot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	// Auto wiring
	@Autowired
	private WelcomeService welcomeService;

	@Autowired
	private ConfigurationBean configurationBean;

	@RequestMapping("/welcome")
	public String welcome() {
		return welcomeService.retrieveWelcomeMessage();
	}

	@RequestMapping("/welcomeConfiguration")
	public Map welcomeConfiguration() {
		Map map = new HashMap();
		map.put("message", configurationBean.getMessage());
		map.put("number", configurationBean.getNumber());
		map.put("flag", configurationBean.isTrue());
		return map;
	}
}
