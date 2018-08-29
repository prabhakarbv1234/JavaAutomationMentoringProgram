package cleancode.hometask.five;



public class FlowerBoqueFactory {
	enum flower{   
		Hibiscus, Jasmine, Lotus, Rose;   
		}
	public static Flower getFlower(String flowerName){
		if(flower.Hibiscus.toString().equalsIgnoreCase(flowerName)) {
			return new HibiscusFlowers();
		}else if(flower.Lotus.toString().equalsIgnoreCase(flowerName)) {
			return new LotusFlowers();
		}else if(flower.Jasmine.toString().equalsIgnoreCase(flowerName)) {
			return new JasmineFlowers();
		}
		return null;
	}
}
