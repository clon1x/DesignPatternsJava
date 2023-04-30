package com.lvl.solid.ocp;

public class SizeSpecification implements Specification<Product> {

	private Size size;
	
	public SizeSpecification(Size size) {
		super();
		this.size = size;
	}

	@Override
	public boolean isSatisfied(Product product) {
		return product.getSize() == size;
	}

}
