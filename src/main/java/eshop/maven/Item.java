package eshop.maven;

//Represents an item in a shopping cart.

import java.text.NumberFormat;

public class Item
{
  private String name;
  private double price;
  private int quantity;

  public Item (String itemName, double itemPrice, int pQuantity)    //  Create a new item with the given attributes.
  {
    name = itemName;
    price = itemPrice;
    quantity = pQuantity;
  }

  public String toString ()    //   Return a string with the information about the item
  {
    NumberFormat fmt = NumberFormat.getCurrencyInstance();

    return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t"
          + fmt.format(price*quantity));
  }

  public double getPrice()    //   Returns the unit price of the item
  {
    return price;
  }

  public String getName()    //   Returns the name of the item
  {
    return name;
  }

  public int getQuantity()   //   Returns the quantity of the item
  {
    return quantity;
  }
} 
