package studyprograms.tests;

import org.eclipse.acceleo.query.delegates.AQLValidationDelegate;
import org.eclipse.emf.ecore.EValidator.ValidationDelegate;

import junit.framework.TestCase;
import studyprograms.Course;

public class StudyprogramsValidatorTest extends TestCase{
	
	//make sure to register OCL as shown in lecture 
	// done below with validationDelegate.Registry...
	
	private Course testCourse;
	
	protected void SetUp() throws Exception {
		ValidationDelegate.Registry.INSTANCE.put("http://www.eclipse.org/acceleo/query/1.0", new AQLValidationDelegate());
		super.setUp();
	}
	
	public void courseSeasonMatchesSemester_Success() {
		//TODO
	}
	
	public void courseSeasonMatchesSemester_Fails() {
		//TODO
	}
	
	public void validateSemesterCredits_Success() {
		//TODO
	}
	
	public void validateSemesterCredits_Fails() {
		//TODO
	}
	
	
}
