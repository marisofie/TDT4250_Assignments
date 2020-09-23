package studyprograms.tests;


import org.eclipse.acceleo.query.delegates.AQLValidationDelegate;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EValidator.ValidationDelegate;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import junit.framework.TestCase;
import studyprograms.*;

public class StudyprogramsValidatorTest extends TestCase{
	
	private Resource testInstance;
	private Diagnostic diagnostics;
	
	protected Resource loadResource(String name) {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(StudyprogramsPackage.eNS_URI, StudyprogramsPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		return resSet.getResource(URI.createURI(StudyprogramsValidatorTest.class.getResource(name + ".xmi").toString()), true);
	}

	protected void setUp() throws Exception {
		ValidationDelegate.Registry.INSTANCE.put("http://www.eclipse.org/acceleo/query/1.0", new AQLValidationDelegate());
		
		testInstance = loadResource("StudyprogramsValidatorTest");
		diagnostics = Diagnostician.INSTANCE.validate(testInstance.getContents().get(0));
	}
	
	private Diagnostic findDiagnostics(Diagnostic diagnostic, Object obj, String constraint) {
		if (diagnostic.getMessage().contains(constraint) && (obj == null || diagnostic.getData().contains(obj))) {
			return diagnostic;
		}
		
		for (Diagnostic child: diagnostic.getChildren()) {
			Diagnostic found = findDiagnostics(child, obj, constraint);
			if (found != null) {
				return found;
			}
		}
		return null;
	}
	
	public void testConstraint_ValidateSemesterCredits_valid() {
		University uni = (University) testInstance.getContents().get(0);
		Programme datatek = uni.getProgrammes().stream().filter(programme -> programme.getName().equals("Datateknologi")).findAny().get();
		Semester sem1 = datatek.getSemesters().stream().filter(semester -> semester.getSemesterNumber() == 1).findAny().get();
		
		// constraint ok for sem1 datateknologi
		assertNull(findDiagnostics(diagnostics, sem1, "validateSemesterCredits"));
	}
	
	public void testConstraint_ValidateSemesterCredits_invalid() {
		University uni = (University) testInstance.getContents().get(0);
		Programme informatikk = uni.getProgrammes().stream().filter(programme -> programme.getName().equals("Informatikk")).findAny().get();
		Specialisation spes = informatikk.getSpecialisations().stream().filter(spesialisation -> spesialisation.getName().equals("Software")).findAny().get();
		Semester sem1 = spes.getSemesters().stream().filter(semester -> semester.getSemesterNumber() == 1).findAny().get();
		
		// constraint violated for sem1 informatikk
		assertNotNull(findDiagnostics(diagnostics, sem1, "validateSemesterCredits"));
	}
	
	public void testConstraint_CourseSeasonMatchesSemester_Valid() {
		University uni = (University) testInstance.getContents().get(0);
		Programme datatek = uni.getProgrammes().stream().filter(programme -> programme.getName().equals("Datateknologi")).findAny().get();
		Semester sem1 = datatek.getSemesters().stream().filter(semester -> semester.getSemesterNumber() == 1).findAny().get();
		CourseGroup cg = sem1.getCourseGroups().stream().filter(coursegroup -> coursegroup.getName().equals(CourseGroupType.MANDATORY_SUBJECTS)).findAny().get();
		
		// constraint ok for sem1 with season datateknologi
		assertNull(findDiagnostics(diagnostics, cg, "courseSeasonMatchesSemester"));
	}
	
	public void testConstraint_CourseSeasonMatchesSemester_Invalid() {
		University uni = (University) testInstance.getContents().get(0);
		Programme informatikk = uni.getProgrammes().stream().filter(programme -> programme.getName().equals("Informatikk")).findAny().get();
		Specialisation spes = informatikk.getSpecialisations().stream().filter(spesialisation -> spesialisation.getName().equals("Software")).findAny().get();
		Semester sem1 = spes.getSemesters().stream().filter(semester -> semester.getSemesterNumber() == 1).findAny().get();
		CourseGroup cg = sem1.getCourseGroups().stream().filter(coursegroup -> coursegroup.getName().equals(CourseGroupType.MANDATORY_SUBJECTS)).findAny().get();
		
		// constraint violated for sem1 with season informatikk
		assertNotNull(findDiagnostics(diagnostics, cg, "courseSeasonMatchesSemester"));
	}
}
