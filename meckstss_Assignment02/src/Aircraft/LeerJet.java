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

public class LeerJet extends Airplane{
	private String manufacturer;
	
	public LeerJet(String name) {
		super(name);
		// Uses super constructor
	}
	
	@Override
	public Double calculateTakeOffDistance() {
		// return generic value just to prove inheritance
		return 999.99;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

}
