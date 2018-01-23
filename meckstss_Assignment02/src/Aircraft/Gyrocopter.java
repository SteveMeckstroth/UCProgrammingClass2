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

/**
 * 
 * Note method calculateTakeOffDistance is overridden in super class of Helicraft
 *
 */
public class Gyrocopter extends Helicraft{
	private int horsepower;
	
	public Gyrocopter(String name) {
		super(name);
		// Uses super constructor
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

}
