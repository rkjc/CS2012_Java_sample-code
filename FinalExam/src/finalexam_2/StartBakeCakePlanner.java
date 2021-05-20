package finalexam_2;

import java.util.Scanner;

import finalexam_2.WetIngredient.WetIngredientType;
import finalexam_2.DryIngredient.DryIngredientType;

public class StartBakeCakePlanner {

	public static void main(String[] args) {
		System.out.println("Enter cost of ingredients per measurment unit to determine total cost of cake.");

		// Make 3 WetIngredient objects and fill out the attributes
		   // EXCEPT - do not set the cost-per-unit, make sure the constructor sets it to default of 0.0.
		WetIngredient ingredient_1 = new WetIngredient(WetIngredientType.MILK, "Cup", 2.5);
		WetIngredient ingredient_2 = new WetIngredient(WetIngredientType.EGG, "Whole raw egg", 2);
		WetIngredient ingredient_3 = new WetIngredient(WetIngredientType.BUTTER, "Tablespoon", 4);

		// Make 3 DryIngredient  objects and fill out the attributes.
		// EXCEPT - do not set the cost-per-unit, make sure the constructor sets it to default of 0.0.
		DryIngredient ingredient_4 = new DryIngredient(DryIngredientType.FLOUR, "Cup", 3.5);
		DryIngredient ingredient_5 = new DryIngredient(DryIngredientType.BAKINGPOWDER, "Teaspoon", 3);
		DryIngredient ingredient_6 = new DryIngredient(DryIngredientType.SUGAR, "Cup", 2.25);

		// Make a IngredientList object.
		IngredientList ingredientList = new IngredientList();

		// Add all the ingredient to the ingredientList.
		ingredientList.getIngredientList().add(ingredient_1);
		ingredientList.getIngredientList().add(ingredient_2);
		ingredientList.getIngredientList().add(ingredient_3);
		ingredientList.getIngredientList().add(ingredient_4);
		ingredientList.getIngredientList().add(ingredient_5);
		ingredientList.getIngredientList().add(ingredient_6);

		
		// get the number of items in the list of ingredients 
		int numberItems = ingredientList.getIngredientList().size();

		// loop through the list of ingredients and set the cost for each unit amount
		Scanner userinput = new Scanner(System.in);
		double tempCost = 0;
		int item = 0;
		while (item < numberItems) {
			System.out.println("-----------------------------------------------------");
			System.out.println("Ingredient Type,\tMeasurment Units,\tCAmount Used,\tCost Per Unit");
			// get the next ingredient object in the list
			Ingredient tempIngredient = ingredientList.getIngredientList().get(item);
			// display ingredient info
			System.out.println(tempIngredient.toString());

			// input the cost of an ingredient unit
			System.out.print("\nEnter the cost for a single unit of this ingredient: "); 
			tempCost = userinput.nextDouble(); // just going to trust the user for good input values
			
			// set the cost of an ingredient unit
			tempIngredient.setCostPerMeasurementAmmount(tempCost);

			//increment for next loop
			item += 1;
		}
		// clean up resources
		userinput.close();

		
		// display all of the ingredients together one last time
		System.out.println("-----------------------------------------------------");
		System.out.println("Ingredient Type,\tMeasurment Units,\tAmount Used,\tCost Per Unit");
		for (int i = 0; i < numberItems; i++) {
			// display Ingredient List info item
			System.out.println(ingredientList.getIngredientList().get(i).toString());
		}
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Total cost of cake ingredients: " + ingredientList.getTotalIngredientCost());

		System.out.println("-----------------------------------------------------");
	}

}
