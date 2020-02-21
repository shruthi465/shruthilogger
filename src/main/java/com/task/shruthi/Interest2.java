package com.task.shruthi;
import java.util.Scanner;
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*; 
public class Interest2
 {
static double simp_interest,comp_interest;
static double prin_amount, rate, time;
private final static Logger LOGGER =  
                Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
public void calculation() 
	{
 	Scanner scanner=new Scanner (System. in);
LOGGER.log(Level.INFO, "enter the principle amount"); 
prin_amount=scanner.nextDouble();
LOGGER.log(Level.INFO, "enter the time period"); 
time=scanner.nextDouble();
LOGGER.log(Level.INFO, "enter the rate of interest"); 
rate=scanner.nextDouble();
 	 simp_interest=(prin_amount*time*rate)/100;
		LOGGER.log(Level.INFO, "the simple interest is:"+simp_interest); 
	comp_interest=prin_amount * Math.pow(1.0+rate/100.0,time) - prin_amount;
		LOGGER.log(Level.INFO, "the compound interest is"+comp_interest); 
} 

public static void main(String args[]) 
	{

Interest2 interest=new Interest2();
	interest.calculation();

	}
}

