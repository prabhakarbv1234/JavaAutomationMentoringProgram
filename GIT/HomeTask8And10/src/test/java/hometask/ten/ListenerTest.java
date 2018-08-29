package hometask.ten;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {
	private static Logger logger = LogManager.getLogger(ListenerTest.class);

	public void onFinish(ITestContext result) {
		logger.info("The testcase is finished :" + result.getName());

	}

	public void onStart(ITestContext result) {
		logger.info("The testcase is started :" + result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		logger.info("The testcase failed with sucess percentage :" + result.getName());

	}

	public void onTestFailure(ITestResult result) {
		logger.info("The testcase failed is :" + result.getMethod().getMethodName());

	}

	public void onTestSkipped(ITestResult result) {
		logger.info("The testcase skipped is :" + result.getMethod().getMethodName());

	}

	public void onTestStart(ITestResult result) {
		logger.info("The testcase is started :" + result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {
		logger.info("The testcase is passsed :" + result.getMethod().getMethodName());

	}
}
