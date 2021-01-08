package eshop.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {

	@Test
	public void Itemtest() {
		Item tst = new Item(null, 10, 5);
		tst.getName();
		tst.getPrice();
		tst.getQuantity();
	}

}
