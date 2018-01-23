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

public class Drone extends Aircraft{
	private int numberOfPropellors;
	
	public Drone(String name) {
		super(name);
		// TODO Uses super constructor
	}

	@Override
	public Double calculateTakeOffDistance() {
		// Drones require no takeoff distance
		return 0.0;
	}

	public int getNumberOfPropellors() {
		return numberOfPropellors;
	}

	public void setNumberOfPropellors(int numberOfPropellors) {
		this.numberOfPropellors = numberOfPropellors;
	}

}
