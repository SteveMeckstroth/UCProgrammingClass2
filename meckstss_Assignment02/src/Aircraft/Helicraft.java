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

public class Helicraft extends Aircraft{
	private boolean military;
	
	public Helicraft(String name) {
		super(name);
		// Constructor inherited from super
	}

	@Override
	public Double calculateTakeOffDistance() {
		// All Helicraft require 0 takeoff distance
		return 0.0;
	}

	public boolean isMilitary() {
		return military;
	}

	public void setMilitary(boolean military) {
		this.military = military;
	}

}
