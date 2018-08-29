package hometask.ten;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name = "sum")
	public static Object[][] additionData() {
		return new Object[][] { { 1, 2, 3 }, { 1.22, 2.467, 3.896 }, { 1.11, -1.11, 0 } };
	}

	@DataProvider(name = "multiplication")
	public static Object[][] multiplicationData() {
		return new Object[][] { { 1, 2, 2 }, { 2.2, 3.2, 7.04 } };
	}

	@DataProvider(name = "squareRoot")
	public static Object[][] squareRootData() {
		return new Object[][] { { 4, 2 } };
	}

	@DataProvider(name = "subtraction")
	public static Object[][] subtractionData() {
		return new Object[][] { { 4, 2, 2 }, { 4.32, 2.16, 2.16 }, { 1.11, -1.11, 0 } };
	}

	@DataProvider(name = "positive")
	public static Object[][] positiveData() {
		return new Object[][] { { 120, true } };
	}

	@DataProvider(name = "negative")
	public static Object[][] negativeData() {
		return new Object[][] { { -120, true } };
	}
}
