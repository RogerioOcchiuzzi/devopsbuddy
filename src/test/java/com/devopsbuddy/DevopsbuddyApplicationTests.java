package com.devopsbuddy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.devopsbuddy.web.i18n.I18NService;

@SpringBootTest
class DevopsbuddyApplicationTests {

	
	@Autowired
	private I18NService i18NService;
	
	@Test
	public void testMessageByLocaleService() throws Exception{
		String expectedResult = "Bootstrap starter template";
		String messageId = "index.main.callout";
		String actual = i18NService.getMessage(messageId);
		Assert.hasText(actual, "falhou em encontrar messageId");
	}

}
