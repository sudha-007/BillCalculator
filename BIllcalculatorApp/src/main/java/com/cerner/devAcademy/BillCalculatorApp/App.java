package com.cerner.devAcademy.BillCalculatorApp;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @category Main class
 *@author Anuj Singh
 * After running this application please provide 
 * 	product name
 * 	product quantity
 * 	product price 
 * 	and choice(Y or N) if you want to add more products.
 */
public class App 
{
	static final Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args ){
    	
    	BasicConfigurator.configure();
    	Customer object = new Customer();
    	logger.info(object.calculateBill());
    	    
    }
}
