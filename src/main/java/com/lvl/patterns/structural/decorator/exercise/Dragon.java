package com.lvl.patterns.structural.decorator.exercise;

public class Dragon {

    private Bird bird = new Bird();
    private Lizard lizzard = new Lizard();
    
    public void setAge(int age) {
	bird.age = age;
	lizzard.age = age;
    }
    
    public String fly() {
	return bird.fly();
    }
    
    public String crawl() {
	return lizzard.crawl();
    }
    
}
