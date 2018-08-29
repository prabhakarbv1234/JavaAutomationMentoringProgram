package hometask.ten;

import java.util.ArrayList;
import java.util.List;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestCaseRunnerTestNG {
	public static List<XmlClass> getclassList(String TCName) {
		XmlClass classlist = null;
		classlist = new XmlClass(TestHomeTaskCalculator.class);
		List<XmlClass> class_list = new ArrayList<XmlClass>();
		class_list.add(classlist);
		return class_list;
	}

	public static void main(String[] args) throws Exception {
		XmlSuite mainsuite = new XmlSuite();
		mainsuite.setName("Test Suite");
		mainsuite.setFileName(System.getProperty("user.dir") + "\\src\\test\\resource\\TestNG.xml");		
		XmlTest mainTest;
		String sTestName = "LTI_ENV";
		mainTest = new XmlTest(mainsuite);
		mainTest.setName("Test CaseName :" + sTestName);
		mainTest.setPreserveOrder("True");
		mainTest.setXmlClasses(getclassList(sTestName));
		TestNG runner = new TestNG();
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(mainsuite);
		runner.setXmlSuites(suites);
		runner.run();
	}
}
