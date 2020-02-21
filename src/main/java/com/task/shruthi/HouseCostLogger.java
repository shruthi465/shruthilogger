package com.task.shruthi;
import java.util.*;
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*; 
public class HouseCostLogger{
	static int n;
	static float cost;
private final static Logger LOGGER =  
                Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
public void method() {
 Scanner sc=new Scanner(System.in);

LOGGER.log(Level.INFO, "Enter the square feet:");
            n=sc.nextInt();
LOGGER.log(Level.INFO, "Enter the choice:");
	int choice=sc.nextInt();
 
    switch(choice) {
	case 1:
        cost=1200*n;
    	break;
    case 2:
        cost=1500*n;
    	break;
    case 3:
    	cost=1800*n;
    	break;
    case 4:
    	cost=2500*n;
    	break;
    default:
    	LOGGER.log(Level.INFO, "invalid choice");
    }
  LOGGER.log(Level.INFO, "cost for house"+cost);
   }
public static void main(String args[]) {
               
	    HouseCostLogger hc=new HouseCostLogger();
	hc.method();
              
}
}


