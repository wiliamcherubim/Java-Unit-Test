package br.test.erudio.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleMathTest {

	@Test
	void testSum() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		
		Double actual = math.sum(firstNumber, secondNumber);
		double expected = 8.2D;
		
		assertEquals(expected, actual, firstNumber + "+" + secondNumber +
				" did not produced " + expected + "!");
		assertNotEquals(9.2, actual);
		assertNotNull(actual);
	}
	
	@Test
	void testSubtraction() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		
		Double actual = math.subtraction(firstNumber, secondNumber);
		double expected = 4.2D;
		
		assertEquals(expected, actual, firstNumber + "-" + secondNumber +
				" did not produced " + expected + "!");
		assertNotEquals(9.2, actual);
		assertNotNull(actual);
	}
	
	@Test
	void testMultiplication() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		
		Double actual = math.multiplication(firstNumber, secondNumber);
		double expected = 12.4D;
		
		assertEquals(expected, actual, firstNumber + "*" + secondNumber +
				" did not produced " + expected + "!");
		assertNotEquals(9.2, actual);
		assertNotNull(actual);
	}
	
	@Test
	void testDivion() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		
		Double actual = math.division(firstNumber, secondNumber);
		double expected = 3.1D;
		
		assertEquals(expected, actual, firstNumber + "/" + secondNumber +
				" did not produced " + expected + "!");
		assertNotEquals(9.2, actual);
		assertNotNull(actual);
	}
	
	@Test
	void testMean() {
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		
		Double actual = math.mean(firstNumber, secondNumber);
		double expected = 4.1D;
		
		assertEquals(expected, actual, 
				"(" + firstNumber + "+" + secondNumber + ")/2" + 
				" did not produced " + expected + "!");
		assertNotEquals(9.2, actual);
		assertNotNull(actual);
	}
	
	@Test
	void testSquareRoot() {
		SimpleMath math = new SimpleMath();
		double number = 81D;
		double expected = 9D;
		
		Double actual = math.squareRoot(number);
	
		
		assertEquals(expected, actual, 
				 "Square Root of" + number + " did not produced " + expected + "!");
		
	}

}
