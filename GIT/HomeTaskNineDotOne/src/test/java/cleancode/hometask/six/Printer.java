package cleancode.hometask.six;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Printer {
	private static Logger logger = LogManager.getLogger(Printer.class);
	private PrintArrayClass arrayClass = null;

	@BeforeTest
	public void init() {
		arrayClass = new PrintArrayClass();
	}

	@Test
	public void printArrayTest() {
		Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
		logger.info("Array integerArray contains:");
		arrayClass.printArray(integerArray);
		logger.info("\nArray doubleArray contains:");
		arrayClass.printArray(doubleArray);
		logger.info("\nArray characterArray contains:");
		arrayClass.printArray(characterArray);
	}

	@AfterTest
	public void teardown() {
		arrayClass = null;
	}

}
