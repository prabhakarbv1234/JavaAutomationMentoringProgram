package cleancode.hometask.six;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class PrintArrayClass {
	private static Logger logger = LogManager.getLogger(PrintArrayClass.class);
	public void printArray(Object[] integerArray) {
		for (Object obj : integerArray) {
			logger.info(obj);
			
		}

	}

}
