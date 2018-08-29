package cleancode.hometask.five;

public class HibiscusFlowers extends Flowers{	
	@Override
	public int getPrice() {			
		switch(Price.valueOf(getColour())) {
		case RED:
			return 10;
		case YELLOW:
			return 8;
		case WHITE:
			return 5;
		case PINK:
			return 20;
		default:
			return 0;
		}
		
		
		       
	}

	
}
