package eshop.maven;

//Represents a shopping cart as an array of items

import java.text.NumberFormat;

public class Sopcart {
  private Item[] cart;
  private int itemCount;      // total number of items in the cart
  private double totalPrice;  // total price of items in the cart
  private int capacity;       // current cart capacity

  
  public Sopcart()    //  Creates an empty shopping cart with a capacity of 5 items.
  {

    capacity = 5;
    cart = new Item[capacity];
    itemCount = 0;
    totalPrice = 0.0;
  }

  public void addToCart(String itemName, double price, int quantity)    //  Adds an item to the shopping cart.
  { 

      Item temp = new Item(itemName, price, quantity);
      totalPrice += (price * quantity);
      cart[itemCount] = temp;
      itemCount +=1;
  }
  
  public void updateCart(String itemName, double price, int quantity)
  {
	  Item temp = new Item(itemName, price, quantity);
      totalPrice -= (price * quantity);
      cart[itemCount] = temp;
      itemCount -=1;
  }

  public String toString()    //  summary information.
  {
    NumberFormat fmt = NumberFormat.getCurrencyInstance();

    String contents = "\nShopping Cart\n";
    contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";

    for (int i = 0; i < itemCount; i++)
        contents += cart[i].toString() + "\n";

    contents += "\nTotal Price: " + fmt.format(totalPrice);
    contents += "\n";

    return contents;
  }
  
  /*Healped by: https://stackoverflow.com/questions/18473130/shopping-cart-java-application-addtocart*/
}
