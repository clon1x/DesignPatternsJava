package com.lvl.patterns.structural.decorator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class MagicStringTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void should_CountVowelsCorrectly_When_PhraseHasSomeVowels() {
	// given
	Long expected = 21L;
	String text = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme...";
	
	// when
	MagicString phrase = new MagicString(text);
	long actual = phrase.getNumberOfVowels();

	// then
	assertEquals(expected , actual);
	
    }

    @Test
    void should_ThrowException_When_PhraseIsNull() {
	// given
	Class<NullPointerException> expected = NullPointerException.class;
	String text = null;
	
	// when
	MagicString phrase = new MagicString(text);
	Executable executable = () -> phrase.getNumberOfVowels();

	// then
	assertThrows(expected, executable);
	
    }
    
    @Test
    void should_ReturnZero_When_PhraseHasNoVowels() {
	// given
	Long expected = 0L;
	String text = "YMC";
	
	// when
	MagicString phrase = new MagicString(text);
	long actual = phrase.getNumberOfVowels();

	// then
	assertEquals(expected , actual);
	
    }
    
}
