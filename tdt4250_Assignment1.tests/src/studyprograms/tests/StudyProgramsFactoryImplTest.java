package studyprograms.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import studyprograms.Course;
import studyprograms.StudyprogramsFactory;

public class StudyProgramsFactoryImplTest extends TestCase {
	
	private Course course;

	public void setUp() throws Exception {
		course = StudyprogramsFactory.eINSTANCE.createCourse();
	}

	public void testCreateCourseCode_Success() {
		//TODO:FIGURE OUT THESE TESTS, HOW?
		
		/*try {
		
			course.setCode("TIØ40");
		}
		catch (Exception e) {
			fail();
		}*/
	}
	
	public void testCreateCourseCode_Fail() {
		//TODO:FIGURE OUT THESE TESTS, HOW?
		
		/*try {
			course.setCode("TDT");
			fail();
		}
		catch (IllegalArgumentException iae) {
			fail();
		}
		
		try {
			course.setCode("40");
			fail();
		}
		catch (IllegalArgumentException iae) {
			fail();
		}*/
		
		
	}
}
