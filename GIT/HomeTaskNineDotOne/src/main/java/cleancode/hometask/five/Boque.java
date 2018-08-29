package cleancode.hometask.five;

import java.util.ArrayList;
import java.util.List;

public class Boque {
	private List<Flower> flowersInBoque=new ArrayList<>();
	private int cost;
	public void addFlowers(Flower flowerObj) {
		flowersInBoque.add(flowerObj);		
	}
	public List<Flower> getFlowers() {
		return flowersInBoque;
	}
	public int getCost() {
		
		for(Flower flowerObj:flowersInBoque) {
			cost=cost+flowerObj.getPrice();
		}
		return cost;
	}
}
