package cleancode.hometask.five;

public class JasmineFlowers extends Flowers {
	@Override
	public int getPrice() {
		switch (Price.valueOf(getColour())) {
		case RED:
			return 15;
		case YELLOW:
			return 18;
		case WHITE:
			return 4;
		case PINK:
			return 10;
		default:
			return 0;
		}

	}

}
