package com.lvl.solid.ocp;

public class ColorSpecification implements Specification<Product> {

	private Color color;
	
	public ColorSpecification(Color color) {
		super();
		this.color = color;
	}

	@Override
	public boolean isSatisfied(Product product) {
		return product.getColor() == color;
	}

}
