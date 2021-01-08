package eshop.maven;

import java.awt.List;

//Uses the Item class to create items and add them to a shopping
//cart stored in an ArrayList.


import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
	
public static void main (String[] args)
{
 ArrayList<ProductItem> productList=new ArrayList<ProductItem>();
	
 int itemID;
 int quantity;

 @SuppressWarnings("resource")
 Scanner scan = new Scanner(System.in);

 String keepShopping = "y";
 Sopcart cart1 = new Sopcart();

 productList.add( new ProductItem(1,"Apple", 10.00));
 productList.add(new ProductItem(2,"Dell", 10.00));
 productList.add( new ProductItem(3,"Sony", 10.00));
 productList.add( new ProductItem(4,"iPhone", 10.00));
 
 System.out.print ("Available Products: ");
 System.out.println('\n');
 for(ProductItem i: productList){
 System.out.println(i);
 System.out.println('\n');
 }

 do
     {
	 
	   //print("Keep Shopping --- " + keepShopping);
	   
	   if(keepShopping.equals("update")){

	      print("Add(a) or Delete(d)? or Finish(f)");
	      
	      String upStr = scan.next();
	      
	      if(upStr.equals("a")){
	    	  print("Adding to existing item list");

	    	   //print("Trying to add");
		       System.out.print ("Enter the ID of the item: ");
		       itemID = scan.nextInt();
		       itemID-=1;

		       System.out.print ("Enter the quantity: ");
		       quantity = scan.nextInt();
		       
		       ProductItem tmpItem2= new ProductItem();
		       tmpItem2=productList.get(itemID); //getting the iteamID from array
		       
		       cart1.addToCart(tmpItem2.getName(), tmpItem2.getPrice(), quantity); 
		       //getting the name, price based on iteamID stored in tmpItem
		       // *** create a new item and add it to the cart
		       //cart1.addToCart(itemName, itemPrice, quantity);

		       // *** print the contents of the cart object using println
		       System.out.println(cart1);
	      }
	      else if(upStr.equals("d")){
	    	  print("Deleting from existing item list");
	    	  
	    	   //print("Trying to delete");
		       System.out.print ("Enter the ID of the item: ");
		       itemID = scan.nextInt();
		       itemID-=1;
		      
		       System.out.print ("Enter the quantity: ");
		       quantity = scan.nextInt();
		       
		       ProductItem tmpItem2= new ProductItem();
		       tmpItem2=productList.get(itemID); //getting the iteamID from array
		       
		       cart1.updateCart(tmpItem2.getName(), tmpItem2.getPrice(), quantity);

		       // *** print the contents of the cart object using println
		       System.out.println(cart1);
	      }
	      
	      else if(upStr.equals("f")){
		      System.out.println ("Proceed for payment...");
		   } 
	   }
	   else{
		   //print("Trying to add");
	       System.out.print ("Enter the ID of the item: ");
	       itemID = scan.nextInt();
	       itemID-=1;	      

	       System.out.print ("Enter the quantity: ");
	       quantity = scan.nextInt();
	       
	       ProductItem tmpItem= new ProductItem();
	       tmpItem=productList.get(itemID); //getting the iteamID from array
	       
	       cart1.addToCart(tmpItem.getName(), tmpItem.getPrice(), quantity); 
	       // *** create a new item and add it to the cart


	       // *** print the contents of the cart object using println
	       System.out.println(cart1);

	       System.out.print ("Continue shopping (y/n)? or Update ?");
	       keepShopping = scan.next();
	   }
	   
	   
     }
 while (keepShopping.equals("y") || keepShopping.equals("update"));

}

public static void print(String str){
	System.out.println("" + str);
}

}