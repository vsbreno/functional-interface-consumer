package model.util;

import java.util.function.Consumer;

import model.entities.Product;

public class MyConsumer implements Consumer<Product>{

	@Override
	public void accept(Product t) {
		t.setPrice(t.getPrice() * 1.1);
	}
}
