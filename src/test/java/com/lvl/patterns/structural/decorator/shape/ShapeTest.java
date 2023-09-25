package com.lvl.patterns.structural.decorator.shape;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapeTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void should_ReturnInfo_When_SimpleCircleShape() {
	
	// given
	Shape circle = new Circle(10);
	String expected = "A circle of radius 10.0";

	// when
	String actual = circle.info();
	
	// then
	assertEquals(expected, actual);
    }

    @Test
    void should_ReturnInfo_When_SimpleSquareShape() {
	
	// given
	Shape circle = new Square(10);
	String expected = "A square of side 10.0";

	// when
	String actual = circle.info();
	
	// then
	assertEquals(expected, actual);
    }

    @Test
    void should_ReturnInfo_When_ColoredCircle() {
	
	// given
	Shape blueCircle = new ColoredShape<Circle>(() ->new Circle(11), "blue");
	String expected = "A circle of radius 11.0 and blue color";
	
	// when
	String actual = blueCircle.info();
	
	// then
	assertEquals(expected, actual);
    }

    @Test
    void should_ReturnInfo_When_ColoredSquare() {
	
	// given
	Shape greenSquare = new ColoredShape<Square>(() ->new Square(11), "green");
	String expected = "A square of side 11.0 and green color";
	
	// when
	String actual = greenSquare.info();
	
	// then
	assertEquals(expected, actual);
    }


    @Test
    void should_ReturnInfo_When_TransparentCircle() {
	
	// given
	Shape transparentCircle = new TransparentShape<Circle>(() -> new Circle(11), 50);
	String expected = "A circle of radius 11.0 and transparency of 50%";
	
	// when
	String actual = transparentCircle.info();
	
	// then
	assertEquals(expected, actual);
    }

    @Test
    void should_ReturnInfo_When_TransparentSquare() {
	
	// given
	Shape transparentSquare = new TransparentShape<Square>(() -> new Square(11), 80);
	String expected = "A square of side 11.0 and transparency of 80%";
	
	// when
	String actual = transparentSquare.info();
	
	// then
	assertEquals(expected, actual);
    }
    
    @Test
    void should_ReturnInfo_When_TransparentColoredCircle() {
	
	// given
	Shape transparentBlueCircle = new TransparentShape<>(() -> 
		new ColoredShape<>(() -> new Circle(8), "blue"), 12);
	String expected = "A circle of radius 8.0 and blue color and transparency of 12%";
	
	// when
	String actual = transparentBlueCircle.info();
	
	// then
	assertEquals(expected, actual);
    }
    
    @Test
    void should_ResizeAndReturnInfo_When_TransparentColoredSquare() {

	// given
	Shape transparentGreenSquare = new TransparentShape<>(()->
		new ColoredShape<>(() -> new Square(8), "green"), 25);
	String expected = "A square of side 16.0 and green color and transparency of 25%";
	
	// when
	transparentGreenSquare.resize(2);
	String actual = transparentGreenSquare.info();
	
	// then
	assertEquals(expected, actual);
    }
    
    @Test
    void should_ResizeAndReturnInfo_When_ColoredTransparentCircle() {
	
	// given
	Shape redTransparentCircle = new ColoredShape<>(() ->
		new TransparentShape<>(() -> new Circle(8), 15), "red");
	String expected = "A circle of radius 12.0 and transparency of 15% and red color";
	
	// when
	redTransparentCircle.resize(1.5f);
	String actual = redTransparentCircle.info();
	
	// then
	assertEquals(expected, actual);
    }


}
