package looping;

import java.util.Scanner;

/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */

public class Cashier {
	Scanner s1 = new Scanner(System.in);
	private int quantity;
	private double price;
	private double total;
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	

	public void getNumberOfItems(int quantity) {
		System.out.println("Enter the number of items you would you like to scan:");
        
        quantity = s1.nextInt();
        
       
        
	}
	public double calculateTotal(int qauntity) {
		for(int quantity=1;quantity<=getQuantity();quantity++) {
			System.out.println("Enter the cost of the item:");
	          double price = s1.nextDouble();
			setPrice(price);
	            double total = getTotal() + price;
	            System.out.println("Your total is $" + total);
	        }
		return qauntity;

	        

	      
	       
		}

	}
