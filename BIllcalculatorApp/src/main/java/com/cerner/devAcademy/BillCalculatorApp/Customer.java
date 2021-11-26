package com.cerner.devAcademy.BillCalculatorApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *@author Anuj Singh
 *@category Business logic
 */
public class Customer {
	
    String productName = null;
    int quantity = 0;
    double price = 0.0;
    double totalPrice = 0.0;
    double overAllPrice = 0.0;
    char choice = '\0';

    Scanner scan = new Scanner(System.in);
	public double calculateBill(){
		
	ArrayList<Product> product = new ArrayList<Product>();
    
		do {
			productName = scan.nextLine();
			quantity = scan.nextInt();
			price = scan.nextDouble();
			totalPrice = price * quantity;
			overAllPrice += totalPrice;

			product.add(new Product(productName, quantity, price, totalPrice));
      
			choice = scan.next().charAt(0);

			scan.nextLine();
		} 
		while (choice == 'y' || choice == 'Y');
    
		for (Product p : product) {
			p.display();
		}
		scan.close();
		return overAllPrice;
  }
	
	public String timer() {
		LocalDateTime object = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM");
		return object.format(formatter);
	}

}
