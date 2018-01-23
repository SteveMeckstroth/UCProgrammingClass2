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

public abstract class Aircraft {
	private String name;
	
	public Aircraft(String name) {
		// Constructor for all Aircraft
		this.setName(name);
	}
	
	/**
	 * 
	 * The name is set in the contructor, but can be viewed read-only as a property
	 */
	public String getName() {
		return this.name;
	}

	private void setName(String name) {
		this.name = name;
	}
	
	public abstract Double calculateTakeOffDistance();
}
