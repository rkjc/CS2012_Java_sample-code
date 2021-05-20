package finalexam_2;

import java.util.ArrayList;

public class IngredientList {

	// attributes
	private ArrayList<Ingredient> ingredientList;
	
	// constructors
	public IngredientList() {
		ingredientList = new ArrayList<>();
	}
	
	// methods
	public ArrayList<Ingredient> getIngredientList() {
		return ingredientList;
	}
	
	public double getTotalIngredientCost() {
		double totalCost = 0;	
		for (Ingredient stuff : ingredientList) {
			totalCost += stuff.getCostPerMeasurementAmmount() * stuff.getAmountUsed();
		}
		double totalRoundOff = (double) Math.round(totalCost * 100) / 100; // optional
		return totalRoundOff;
	}
	
}
