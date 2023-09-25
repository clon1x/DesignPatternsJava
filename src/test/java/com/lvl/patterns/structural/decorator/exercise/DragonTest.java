package com.lvl.patterns.structural.decorator.exercise;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DragonTest {
    
    private Dragon dragon;

    @BeforeEach
    void setUp() throws Exception {
	dragon = new Dragon();
    }

    @Test
    void should_Fly_When_OnAge() {
	
	// given 
	dragon.setAge(9);
	String expected = "flying";
	
	// when
	String actual = dragon.fly();
	
	// then
	assertTrue(expected.equals(actual));
    }

    @Test
    void should_NotFly_When_TooOld() {
	
	// given 
	dragon.setAge(10);
	String expected = "too old to fly!";
	
	// when
	String actual = dragon.fly();
	
	// then
	assertTrue(expected.equals(actual));
    }

    @Test
    void should_Crawl_When_OnAge() {
	
	// given 
	dragon.setAge(9);
	String expected = "crawling";
	
	// when
	String actual = dragon.crawl();
	
	// then
	assertTrue(expected.equals(actual));
    }

    @Test
    void should_NotCrawl_When_TooYoung() {
	
	// given 
	dragon.setAge(1);
	String expected = "too young to crawl!";
	
	// when
	String actual = dragon.crawl();
	
	// then
	assertTrue(expected.equals(actual));
    }
}
