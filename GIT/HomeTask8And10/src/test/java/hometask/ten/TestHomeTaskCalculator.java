package hometask.ten;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class TestHomeTaskCalculator extends BaseTest {
	private Logger logger = LogManager.getLogger(TestHomeTaskCalculator.class);

	@Test(dataProviderClass = TestData.class, dataProvider = "sum", groups = { "NegativeTesCase", "All" }, priority = 1)
	public void testaddTwoNumbers(Double actualValue1, Double actualValue2, Double exepectedResult) {
		assertEquals(calc.sum(actualValue1, actualValue2), exepectedResult);
	}

	@Test(dataProvider = "sum", dataProviderClass = TestData.class, groups = { "NegativeTesCase", "All" }, priority = 2)
	public void testdivTwoNumbers(Double actualValue1, Double actualValue2, Double exepectedResult) {
		assertEquals(calc.div(actualValue1, actualValue2), exepectedResult);
	}

	@Test(dataProviderClass = TestData.class, dataProvider = "multiplication", groups = { "NegativeTesCase",
			"All" }, priority = 3)
	public void testMultiNumbers(Double actualValue1, Double actualValue2, Double exepectedResult) {
		assertEquals(calc.mult(actualValue1, actualValue2), exepectedResult);
	}

	@Test(dataProvider = "subtraction", dataProviderClass = TestData.class, groups = { "NegativeTesCase",
			"All" }, priority = 4)
	public void testSubtractionNumbers(Double actualValue1, Double actualValue2, Double exepectedResult) {
		assertEquals(calc.sub(actualValue1, actualValue2), 1.2);
	}

	@Test(dataProviderClass = TestData.class, dataProvider = "positive", groups = { "positiveTestCase",
			"All" }, priority = 5)
	public void testisPostive(long actualValue1, boolean isPositive) {
		// assertTrue(c.isPositive(actualValue1));
		assertEquals(calc.isPositive(actualValue1), isPositive);
	}

	@Test(dataProvider = "squareRoot", dataProviderClass = TestData.class, groups = { "positiveTestCase",
			"All" }, priority = 6)
	public void testSquareRoot(Long actualValue1, Long exepectedResult) {
		assertEquals(calc.sqrt(actualValue1), exepectedResult);
	}

	@Test(dataProviderClass = TestData.class, dataProvider = "negative", groups = { "positiveTestCase",
			"All" }, priority = 7)
	public void testisNegative(long actualValue1, boolean isPositive) {
		// assertTrue(c.isPositive(actualValue1));
		assertEquals(calc.isNegative(actualValue1), isPositive);

	}

	@Test(priority = 8, groups = { "All" })
	public void findAllBugsTest() {
		logger.info("cos " + calc.cos(90));
		logger.info("is -12 NEgative " + calc.isNegative(-12));
		logger.info("is 12 NEgative " + calc.isNegative(12));
		logger.info("is 0 NEgative " + calc.isNegative(0));
		logger.info("is 0 Positive " + calc.isPositive(0));
		logger.info("is 1 Positive " + calc.isPositive(1));
		logger.info("is -1 Positive " + calc.isPositive(-1));
		logger.info("3 Pow 2 " + calc.pow(3, 2));
		logger.info("2 Pow 3 " + calc.pow(2, 3));
		logger.info("sqrt of 8 is " + calc.sqrt(8));
		logger.info("ctg of 0 is " + calc.ctg(0));
		logger.info("ctg of 30 is " + calc.ctg(30));
		logger.info("ctg of 45 is " + calc.ctg(45));
		logger.info("ctg of 60 is " + calc.ctg(60));
		logger.info("ctg of 90 is " + calc.ctg(90));
		logger.info("tg of 0 is " + calc.tg(0));
		logger.info("tg of 30 is " + calc.tg(30));
		logger.info("tg of 45 is " + calc.tg(45));
		logger.info("tg of 60 is " + calc.tg(60));
		logger.info("tg of 90 is " + calc.tg(90));
		logger.info("sin of 0 is " + calc.sin(0));
		logger.info("sin of 30 is " + calc.sin(30));
		logger.info("sin of 45 is " + calc.sin(45));
		logger.info("sin of 60 is " + calc.sin(60));
		logger.info("sin of 90 is " + calc.sin(90));
		logger.info("cos of 0 is " + calc.cos(0));
		logger.info("cos of 30 is " + calc.cos(30));
		logger.info("cos of 45 is " + calc.cos(45));
		logger.info("cos of 60 is " + calc.cos(60));
		logger.info("cos of 90 is " + calc.cos(90));
		logger.info("cos of 180 is " + calc.cos(180));
	}

}
