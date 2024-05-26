package br.com.erudio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.erudio.model.Person;
import br.com.erudio.service.IPersonService;
import br.com.erudio.service.PersonService;

public class PersonServiceTest {
	
	IPersonService service;
	Person person;
	
	
	@BeforeEach
	void setup() {
		service = new PersonService();
		person = new Person(
				"Keith",
				"Moon",
				"kmoon@erudio.com.br",
				"Wembley - UK",
				"Male"
			);
	}

	@DisplayName("When Create a Person with Success Should Return a Person Object")
	@Test
	void testCreatePerson_WhenSuccess_ShouldReturnPersonObject() {	

		// Given / Arrange
				
		
		// When / Act
		Person actual = service.createPerson(person);
		
		// Then / Assert
		assertNotNull(actual, "The createPerson() should not have returned null!");

	}
	
	@DisplayName("When Create a Person with Success Should Contains Valid Fields in Returned Person Object")
	@Test

	void testCreatePerson_WhenSuccess_ShouldContainsValidFieldsInReturnedPersonObject() {
		

		// Given / Arrange		
		
		// When / Act
		Person actual = service.createPerson(person);
		
		// Then / Assert
		assertNotNull(person.getId(), "Person ID is Missing");
		assertEquals(
				person.getFirstName(), 
				actual.getFirstName(), 
				"The firstName is Incorrect!");
		
		assertEquals(
				person.getLastName(), 
				actual.getLastName(), 
				"The lastName is Incorrect!");
		
		assertEquals(
				person.getAddress(), 
				actual.getAddress(), 
				"The Address is Incorrect!");
		
		assertEquals(
				person.getGender(), 
				actual.getGender(), 
				"The Gender is Incorrect!");
		
		assertEquals(
				person.getEmail(), 
				actual.getEmail(), 
				"The Email is Incorrect!");

	}
	
	
	@DisplayName("When Create a Person with Null E-mail Should Throw Illegal Argument Exception")
	@Test

	void testCreatePerson_WithNullEmail_ShouldThrowIllegalArgumentException() {
				
				// Given / Arrange
				person.setEmail(null);
				
				
				var expectedMessage = "The Person e-mail is null or empty!";
				
				// When / Act & / Then / Assert
				IllegalArgumentException exception =  assertThrows(
						IllegalArgumentException.class, 
						service.createPerson(person),
						"Empty e-mail should have caused an IllegalArgumentException"
					);
				
				// Then / Assert
				assertEquals(
						expectedMessage, 
						exception.getMessage(),
						() -> "Exception Error Message is Incorrect!");

	}


	
}

	
