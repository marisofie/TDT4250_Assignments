package studyprograms.examples;

import studyprograms.Course;
import studyprograms.StudyprogramsFactory;

public class ManualCodeExample {
	
	public static void main(String[] args) {
		Course course = StudyprogramsFactory.eINSTANCE.createCourse();
		System.out.println(course.getLabel() + " == " + course.getCode() + " - " + course.getSubject());
		course.setCode("TDT4250");
		System.out.println(course.getLabel() + " == " + course.getCode() + " - " + course.getSubject());
		course.setSubject("Avansert Programvaredesign");
		System.out.println(course.getLabel() + " == " + course.getCode() + " - " + course.getSubject());
	}

}
