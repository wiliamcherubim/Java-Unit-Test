package br.com.erudio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

// @Order(3)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MethodOrderedByOrderIndexTest {

	StringBuilder actualValue = new StringBuilder("");
	
	@AfterEach
	void afterEach() {
		System.out.println("The actual value is: " + actualValue);
	}
	
	@Test
	@Order(1)
	void testC() {
		System.out.println("Running Test C");
		actualValue.append("1");
	}
	
	@Test
	void testD() {
		System.out.println("Running Test D");
		actualValue.append("2");
	}
	@Test
	void testA() {
		System.out.println("Running Test A");
		actualValue.append("3");
	}
	
	@Test
	void testB() {
		System.out.println("Running Test B");
		actualValue.append("4");
	}
	
	

}
