/************************************************
 * Name: Stephen Meckstroth
 * Assignment #: 02
 * Course IT2045C, Section:001
 * Due Date: 01/23/2018
 * Description: A program to display the hierarchy of Aircraft using inheritance
 * Citations: N/A
 * Anything else: N/A
 */
package Aircraft;

public class Cessna extends Airplane{
	private int modelYear;
	
	public Cessna(String name, int modelYear) {
		super(name);
		// Uses super constructor
		this.setModelYear(modelYear);
	}
	
	@Override
	public Double calculateTakeOffDistance() {
		// return generic value just to prove inheritance
		return 1500.00;
	}
	
	/**
	 * 
	 * Make modelyear property read-only for public
	 */
	public int getModelYear() {
		return modelYear;
	}

	private void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

}
