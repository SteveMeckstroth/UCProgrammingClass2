/************************************************
 * Name
 * Assignment #:
 * Course #, Section:
 * Due Date:
 * Description:
 * Citations:
 * Anything else: This class models a pizza being delivered by an autonomous vehicle from Pizza Hut
 */
package meckstss_Assignment00;

public class Pizza {

		private String address;
		private double totalAmountDue;
		private double salesTaxPercentage;
		
		// Constructor with three arguments. Address, Total Amount, Sales Tax Pct
		/**
		 * 
		 * @param address The address to deliver to.
		 * @param totalAmountDue The total amount due (calculated)
		 * @param salesTaxPercentage The Sales Tax Percentage
		 */
		public Pizza(String address, double totalAmountDue, double salesTaxPercentage){
			this.setAddress(address);
			this.setTotalAmountDue(totalAmountDue);
			this.setSalesTaxPercentage(salesTaxPercentage);
		}
		//A method called checkAmount: If the amount > 50 then print a message that the driver cannot carry that much money
		// else print a message that it's OK to deliver the pizza
		/**
		 * This method checks to see if a delivery exceeds the driver cash limit
		 */
		public void checkAmount () {
			if (totalAmountDue > 50 ) {
				System.out.println("Driver cannot deliver this order.");
			} else {
				System.out.println("Driver CAN deliver this order.");
			}
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public double getTotalAmountDue() {
			return totalAmountDue;
		}

		public void setTotalAmountDue(double totalAmountDue) {
			this.totalAmountDue = totalAmountDue;
		}

		public double getSalesTaxPercentage() {
			return salesTaxPercentage;
		}

		public void setSalesTaxPercentage(double salesTaxPercentage) {
			this.salesTaxPercentage = salesTaxPercentage;
		}
		
		public String toString() {
			return "Address:" + this.getAddress() + "TotalAmountDue: " + this.getTotalAmountDue() + "SalesTaxPercentage:" + this.getSalesTaxPercentage();
		}
}
