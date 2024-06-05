package br.com.erudio.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.erudio.business.service.CourseService;
import br.com.erudio.service.stubs.CourseServiceStub;

class CourseBusinessStubTest {

	@Test

	void testCourseRelatedToSpring_WhenUsingAFooBarStudent() {
		
		// Given Arrange
		CourseService stubService = new CourseServiceStub();
		CourseBusiness business = new CourseBusiness(stubService);
		
		// When Act
		var filteredCourses = 
				business.retrieveCourseRelatedToSpring("Foo Bar");
		
		// Then Arrange
		assertEquals(0, filteredCourses.size());

	}

}
