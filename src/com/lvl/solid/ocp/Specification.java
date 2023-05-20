package com.lvl.solid.ocp;

public interface Specification<T> {
	boolean isSatisfied(T item);
}
