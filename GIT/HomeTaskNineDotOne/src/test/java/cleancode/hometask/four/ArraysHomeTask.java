package cleancode.hometask.four;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ArraysHomeTask {
	private Logger logger = LogManager.getLogger(ArraysHomeTask.class);
	Utilities utilities = null;

	@BeforeTest
	public void init() {
		utilities = new Utilities();
	}

	@Test
	public void countClumpsTest() {
		int firstOutput[] = { 1, 2, 2, 3, 4, 4 };
		int secondOutput[] = { 1, 1, 2, 1, 1 };
		int thirdOutput[] = { 1, 1, 1, 1, 1 };
		logger.info(utilities.countClumps(firstOutput));
		logger.info(utilities.countClumps(secondOutput));
		logger.info(utilities.countClumps(thirdOutput));
	}

	@Test
	public void maxSpanTest() {
		int firstOutput[] = { 1, 2, 1, 1, 3 };
		int secondOutput[] = { 1, 4, 2, 1, 4, 1, 4 };
		int thirdOutput[] = { 1, 4, 2, 1, 4, 4, 4 };
		logger.info(utilities.maxSpan(firstOutput));
		logger.info(utilities.maxSpan(secondOutput));
		logger.info(utilities.maxSpan(thirdOutput));
	}

	@Test
	public void maxMirrorTest() {
		int firstOutput[] = { 1, 2, 3, 8, 9, 3, 2, 1 };
		int secondOutput[] = { 1, 2, 1, 4 };
		int thirdOutput[] = { 7, 1, 2, 9, 7, 2, 1 };
		logger.info(utilities.maxMirror(firstOutput));
		logger.info(utilities.maxMirror(secondOutput));
		logger.info(utilities.maxMirror(thirdOutput));
	}

	@Test
	public void singleLinearPassOfBothArraysTest() {
		int firstArray[] = { 1, 2, 4, 6 };
		int firstinsideArray[] = { 2, 4 };
		int secondArray[] = { 1, 2, 4, 6 };
		int secondinsideArray[] = { 2, 3, 4 };
		int thirdArray[] = { 1, 2, 4, 4, 6 };
		int thirdinsideArray[] = { 2, 4 };
		logger.info(utilities.linearIn(firstArray, firstinsideArray));
		logger.info(utilities.linearIn(secondArray, secondinsideArray));
		logger.info(utilities.linearIn(thirdArray, thirdinsideArray));
	}

	@Test
	public void splitArraysSumOfOtherSidesTest() {
		int firstOutput[] = { 1, 1, 1, 2, 1 };
		int secondOutput[] = { 2, 1, 1, 2, 1 };
		int thirdOutput[] = { 10, 10 };
		logger.info(utilities.canBalance(firstOutput));
		logger.info(utilities.canBalance(secondOutput));
		logger.info(utilities.canBalance(thirdOutput));
	}

	@AfterTest
	public void teardown() {
		utilities = null;
	}

}
