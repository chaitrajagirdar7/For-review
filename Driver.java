package TestDrive;

import java.util.Scanner;

import customer.Customer;
import sms.SendSms;

public class Driver {
	  static Scanner sc=new Scanner (System.in); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  System.out.println("Enter cust name -");
		  String Name=sc.nextLine(); 
		  System.out.println("Enter cust phon num "); 
		  String Phonenum=sc.nextLine(); 
		  Customer Cz=new Customer(Name,Phonenum);
		  Cz.getShoppingDetails(); 
			
			  Cz.printShoppingDetails(); Cz.calculateShoppingTotal();
			  SendSms.smsCustomer(Cz.getShoppingTotal().toString());
			
		 


	}

}
