package cleancode.hometask.five;

public class LotusFlowers extends Flowers {

	@Override
	public int getPrice() {
		switch (Price.valueOf(getColour())) {
		case RED:
			return 5;
		case YELLOW:
			return 12;
		case WHITE:
			return 19;
		case PINK:
			return 7;
		default:
			return 0;
		}

	}

}
