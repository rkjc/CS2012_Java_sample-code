package finalexam_2;

public class WetIngredient extends Ingredient {
	// attributes
	public enum WetIngredientType {EGG, MILK, WATER, BUTTER};
	
	private WetIngredientType wetIngredient;

	// constructors
	public WetIngredient(WetIngredientType courseNumber, String name, double units) {
		super(name, units);
		wetIngredient = courseNumber;
	}
	
	// methods
	public WetIngredientType getCourseNum() {
		return wetIngredient;
	}

	public void setCourseNum(WetIngredientType courseNum) {
		this.wetIngredient = courseNum;
	}

	@Override
	public String toString() {
		String cNum = this.wetIngredient.toString();
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
