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
 * Note calculateTakeOffDistance is overriden in super
 *
 */
public class Helicopter extends Helicraft{
	private String callsign;
	
	public Helicopter(String name) {
		super(name);
		// Uses super constructor
	}

	public String getCallsign() {
		return callsign;
	}

	public void setCallsign(String callsign) {
		this.callsign = callsign;
	}

}
