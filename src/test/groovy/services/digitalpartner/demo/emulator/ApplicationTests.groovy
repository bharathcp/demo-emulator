package services.digitalpartner.demo.emulator

import cucumber.runtime.java.spring.GlueCodeScope
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.config.CustomScopeConfigurer
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(initializers = ConfigFileApplicationContextInitializer.class)
//@ComponentScan("services.digitalpartner.demo.test")
class ApplicationTests {


	@Test
	void contextLoad(){
		//atleast one @Test method is required for spring context to load
	}
}
