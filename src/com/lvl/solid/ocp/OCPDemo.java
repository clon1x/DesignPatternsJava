package com.lvl.solid.ocp;

import java.util.ArrayList;
import java.util.List;

public class OCPDemo {

	public static void main(String[] args) {
		
		List<Product> products = createProductList();
		
		ProductFilter filter = new ProductFilter();
		
		System.out.println("Green products: ");
		filter.filter(products, new ColorSpecification(Color.GREEN))
			.forEach(p -> System.out.println(" - " + p.getName() + " is green"));

		System.out.println("\nLarge products: ");
		filter.filter(products, new SizeSpecification(Size.LARGE))
			.forEach(p -> System.out.println(" - " + p.getName() + " is large"));
	}

	private static List<Product> createProductList() {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Apple", Color.GREEN, Size.SMALL));
		products.add(new Product("Tree", Color.GREEN, Size.LARGE));
		products.add(new Product("House", Color.BLUE, Size.LARGE));
		
		return products;
	}

}
