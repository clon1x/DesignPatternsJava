package com.lvl.solid.OCP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OCPDemo {

	public static void main(String[] args) {
		
		List<Product> products = createProductList();
		
		ProductFilter filter = new ProductFilter();
		
		ColorSpecification greenProductSpecification = new ColorSpecification(Color.GREEN);
		SizeSpecification largeProductSpecification = new SizeSpecification(Size.LARGE);

		printFilteredProducts("Green products: ", filter.filter(products, greenProductSpecification), "is green");
		printFilteredProducts("\nLarge products: ", filter.filter(products, largeProductSpecification), "is large");

		AndSpecification<Product> andSpecification = new AndSpecification<>();
		andSpecification.addSpecification(greenProductSpecification)
			.addSpecification(largeProductSpecification);
		
		printFilteredProducts("\nLarge green products: ", filter.filter(products, andSpecification), "is large and green");
		
	}

	private static void printFilteredProducts(String header, Stream<Product> productStream, String message) {
		System.out.println(header);
		productStream.forEach(p -> System.out.println(" - " + p.getName() + " " + message));
	}

	private static List<Product> createProductList() {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Apple", Color.GREEN, Size.SMALL));
		products.add(new Product("Tree", Color.GREEN, Size.LARGE));
		products.add(new Product("House", Color.BLUE, Size.LARGE));
		
		return products;
	}

}
