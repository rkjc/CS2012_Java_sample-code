package enumpractice;

public class SpaceShip extends Vehicle{

	
	public enum ShipColor {
	    BLERG, MABEV, TULLOP, FLEEM
	}
	
	public SpaceShip(ShipColor inclr) {
		System.out.println(inclr );
	}
	
}


