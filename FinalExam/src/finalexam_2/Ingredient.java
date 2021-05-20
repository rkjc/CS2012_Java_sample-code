package finalexam_2;

public abstract class Ingredient {

	// attributes
	private double costPerMeasurementAmmount;  // must be positive, set default to 0.0
	private double amountUsed;
	private String measurmentUnits;
	
	// constructors
	public Ingredient(String measurment, double amount) {
		costPerMeasurementAmmount = 0.0;
		amountUsed = amount;
		measurmentUnits = measurment;
	}
	
	// methods
	public double getCostPerMeasurementAmmount() {
		return costPerMeasurementAmmount;
	}
	public void setCostPerMeasurementAmmount(double cost) {
		this.costPerMeasurementAmmount = cost;
	}
	public double getAmountUsed() {
		return amountUsed;
	}
	public void setAmountUsed(double amount) {
		this.amountUsed = amount;
	}
	
	public String getMeasurmentUnits() {
		return measurmentUnits;
	}
	public void getMeasurmentUnits(String measuredUnits) {
		this.measurmentUnits = measuredUnits;
	}
	
	@Override
	public abstract String toString();
	
	
}
