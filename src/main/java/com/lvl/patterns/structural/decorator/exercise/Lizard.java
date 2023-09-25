package com.lvl.patterns.structural.decorator.exercise;

public class Lizard {

    public int age;
    
    public String crawl() {
	return (age > 1) ? "crawling" : "too young to crawl!";
    }
}
