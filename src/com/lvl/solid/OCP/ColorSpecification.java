package com.lvl.solid.OCP;

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
