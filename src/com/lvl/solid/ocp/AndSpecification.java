package com.lvl.solid.ocp;

import java.util.ArrayList;
import java.util.List;

public class AndSpecification<T> implements Specification<T>{

	private List<Specification<T>> specifications = new ArrayList<>();
	
	public AndSpecification<T> addSpecification(Specification<T> specification) {
		specifications.add(specification);
		return this;
	}

	@Override
	public boolean isSatisfied(T item) {
		return specifications.stream().allMatch(spec -> spec.isSatisfied(item));
	}

}
