package br.test.erudio.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleMathTest {

	@Test
	void test() {
		SimpleMath math = new SimpleMath();
		Double actual = math.sum(6.2D, 2D);
		double expected = 8.2D;
		assertEquals(expected, actual);
	}

}
