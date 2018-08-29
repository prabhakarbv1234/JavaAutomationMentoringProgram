package cleancode.hometask.five;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class CustomerOrder {
	private static Logger logger = LogManager.getLogger(CustomerOrder.class);

	@Test
	public void orderBoque() {
		logger.info("Do you want Boque Yes or No");
		Scanner scanner = new Scanner(System.in);
		String orderConfirmation = scanner.nextLine();
		if ("Yes".equalsIgnoreCase(orderConfirmation)) {
			String input = "Y";
			Boque boqueObj = new Boque();
			while ("Y".equalsIgnoreCase(input)) {
				logger.info("Please Select the below flower names Lotus or Hibiscus or Jasmine or Lotus");
				scanner = new Scanner(System.in);
				String flowerName = scanner.nextLine();
				logger.info("Please Select the Color of the flower");
				scanner = new Scanner(System.in);
				String flowerColour = scanner.nextLine();
				Flower flower = FlowerBoqueFactory.getFlower(flowerName);
				flower.setColour(flowerColour);
				boqueObj.addFlowers(flower);
				logger.info("Do you want other flowers enter Y/N");
				scanner = new Scanner(System.in);
				input = scanner.nextLine();
			}
			logger.info("cost of Boque-->" + boqueObj.getCost());
		}
	}

}
