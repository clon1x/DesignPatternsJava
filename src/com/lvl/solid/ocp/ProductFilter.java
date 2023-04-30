package com.lvl.solid.ocp;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter implements Filter<Product> {

	@Override
	public Stream<Product> filter(List<Product> items, Specification<Product> condition) {
		return items.stream().filter(p -> condition.isSatisfied(p));
	}

}
