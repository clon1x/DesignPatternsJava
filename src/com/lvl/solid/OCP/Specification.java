package com.lvl.solid.OCP;

public interface Specification<T> {
	boolean isSatisfied(T item);
}
