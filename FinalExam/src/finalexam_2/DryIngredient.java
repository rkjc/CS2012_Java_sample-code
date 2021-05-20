package finalexam_2;

public class DryIngredient extends Ingredient {
	
	// attributes
	public enum DryIngredientType {FLOUR, BAKINGPOWDER, SUGAR, SALT, YEAST};
	
	private DryIngredientType dryIngredient;
	
	// constructors
	public DryIngredient(DryIngredientType ingredient, String name, double units) {
		super(name, units);
		dryIngredient = ingredient;
	}

	// methods
	public DryIngredientType getCourseNum() {
		return dryIngredient;
	}

	public void setCourseNum(DryIngredientType ingredient) {
		this.dryIngredient = ingredient;
	}

	@Override
	public String toString() {
		String cNum = this.dryIngredient.toString();
		String blank15 = "               ";
		String blank22 = "                      ";
		String padNum = cNum  + blank22.substring(0, 22 - cNum.length());
		String cName = super.getMeasurmentUnits();
		String padName = cName  + blank22.substring(0, 22 - cName.length());
		String tempStr = padNum  + "\t" + padName + "\t" + super.getAmountUsed()  + "\t\t" + super.getCostPerMeasurementAmmount();
 		return tempStr;
	}
	
//	@Override
//	public String toString() {
//		return this.courseNum.toString()  + ", " + super.getCourseName() + ", " + super.getCourseUnits()  + ", " + super.getGradePoints();
//	}
	
}
