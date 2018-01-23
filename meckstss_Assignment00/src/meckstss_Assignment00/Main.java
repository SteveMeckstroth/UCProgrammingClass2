/************************************************
 * Name
 * Assignment #:
 * Course #, Section:
 * Due Date:
 * Description:
 * Citations:
 * Anything else:
 */
package meckstss_Assignment00;

public class Main {

	public static void main(String[] args) {
		//Declare and instantiate a Pizza object
		
		Pizza myPizza = new Pizza("4200 University Drive, Batavia, OH 45103", 100.00, 6.9); 
		myPizza.checkAmount();
		System.out.println(myPizza.toString());

	}

}
