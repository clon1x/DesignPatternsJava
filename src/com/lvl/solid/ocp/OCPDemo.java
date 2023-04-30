package com.lvl.solid.ocp;

import java.util.ArrayList;
import java.util.List;

public class OCPDemo {

	public static void main(String[] args) {
		
		List<Product> products = createProductList();
		
		ProductFilter filter = new ProductFilter();
		System.out.println("Green products: ");
		filter.filterByColor(products, Color.GREEN)
			.forEach(p -> System.out.println(" - " + p.getName() + " is green"));
		
	}

	private static List<Product> createProductList() {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Apple", Color.GREEN, Size.SMALL));
		products.add(new Product("Tree", Color.GREEN, Size.LARGE));
		products.add(new Product("House", Color.BLUE, Size.LARGE));
		
		return products;
	}

}
