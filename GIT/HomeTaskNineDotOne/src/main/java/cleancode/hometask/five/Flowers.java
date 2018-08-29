package cleancode.hometask.five;

public  abstract class Flowers implements Flower  {
	enum Price {
		RED, YELLOW, WHITE, PINK;
	}
	private String colour;
	String fose;
	@Override
	public void setColour(String colour) {		
		this.colour=colour;
	}
	@Override
	public String getColour() {
		return colour;
	}	
	public String getvalue() {
		return fose;
	}
	
}