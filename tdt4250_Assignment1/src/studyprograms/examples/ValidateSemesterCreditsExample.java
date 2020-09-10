package studyprograms.examples;

import studyprograms.Course;
import studyprograms.CourseGroup;
import studyprograms.CourseGroupType;
import studyprograms.Semester;
import studyprograms.StudyprogramsFactory;

public class ValidateSemesterCreditsExample {
	
	public static void main(String[] args) {
		Semester semester = StudyprogramsFactory.eINSTANCE.createSemester();
		CourseGroup cg = StudyprogramsFactory.eINSTANCE.createCourseGroup();
		cg.setName(CourseGroupType.MANDATORY_SUBJECTS);
		cg.setMinRequiredCredits(22.5f);
		
		semester.getCourseGroups().add(cg);
		
		System.out.println(semester.getCourseGroups());
		
	}

}
