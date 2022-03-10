package customer;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Scanner;

import sms.SendSms;

public class Customer {

	private String CustomerName;
	private String PhoneNum;
	private Double ShoppingTotal;
	private HashMap <String,Double> shoppingList=new HashMap <String,Double>();
	
	private HashMap<String, Double> getShoppingList() {
		return shoppingList;
		
	}
	private void setShoppingList(HashMap<String, Double> shoppingList) {
		this.shoppingList = shoppingList;
	}

	
	
	
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getPhoneNum() {
		return PhoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}
	
	public Customer(String Name,String PhoneNum)
	{
		setCustomerName(Name);
		setPhoneNum(PhoneNum);
		setShoppingList(null);
		
	}
	
	public void getShoppingDetails()
	
	{
		HashMap <String,Double>shoppingList2=new HashMap <String,Double>();		 
		Scanner sc1=new Scanner (System.in);
		String Item=null;
		java.awt.event.KeyEvent evt=null;
		Double amount=(double) 0;
		
	
		do 
		{
			System.out.println("Enter shopping item ");
			System.out.println("Enter <EXIT> if shopping list has ended-");
			Item=sc1.next() ;

			 if(Item.contains("EXIT")) 
				{
				System.out.println(Item);
				System.out.println("Shopping list has ended");
				setShoppingList(shoppingList2);
				try {
					sc1.close();
				} catch (Exception e) {
					
									}
				break;
				}
			 
			if(!Item.equals(""))
			{
				System.out.println("Enter amount: ");
				amount=sc1.nextDouble();
			}
			
			/*private void formKeyPressed(java.awt.event.KeyEvent evt) {
			     if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
			        System.exit(0);
			    }
			}*/
			
				
			shoppingList2.put(Item, amount);
					}
		while(!Item.equals(""));
						
	
				
	}
	
public void printShoppingDetails()
	
	{
	System.out.println(getShoppingList());
		
	}
	
public void calculateShoppingTotal()

{
Double total=0.0;	
for(Double sum1:getShoppingList().values())
{
	total+=sum1;
}
	System.out.println("total::"+total);
	setShoppingTotal(total);
		
}


public Double getShoppingTotal() {
	return ShoppingTotal;
}
public void setShoppingTotal(Double shoppingTotal) {
	ShoppingTotal = shoppingTotal;
}
}
