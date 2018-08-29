package hometask.ten;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.epam.tat.module4.Calculator;





public class BaseTest {
	 private Logger logger = LogManager.getLogger(BaseTest.class);
	 Calculator calc=null;	
	
	@BeforeTest
	public void beforeTest() {
		logger.info("Before Test method");
		calc=new Calculator();
	}
	@AfterTest
	public void afterTest() {
		logger.info("After Test method");
			calc=null;
	}
}
