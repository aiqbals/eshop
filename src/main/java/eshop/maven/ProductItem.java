package eshop.maven;

//Represents an ProductItem in a shopping cart.


import java.text.NumberFormat;

public class ProductItem
{
public int id;
private String name;
private double price;

public ProductItem (int Id, String ProductItemName, double ProductItemPrice)  //  Create a new ProductItem with the given attributes.
{
  id=Id;
  name = ProductItemName;
  price = ProductItemPrice;
}

public ProductItem() {

}

public String toString ()  //   Return a string with the information about the ProductItem
{
  NumberFormat fmt = NumberFormat.getCurrencyInstance();

  return (id+"\t" + name + "\t" + fmt.format(price) );
}

public double getPrice()  //   Returns the unit price of the ProductItem
{
  return price;
}

public String getName()  //   Returns the name of the ProductItem
{
  return name;
}

public int getID() //   Returns the quantity of the ProductItem
{
  return id;
}
} 
