package studyprograms.examples;

import studyprograms.Course;
import studyprograms.SeasonType;
import studyprograms.Semester;
import studyprograms.StudyprogramsFactory;

public class ValidateSeasonSemesterExample {

	public static void main(String[] args) {
		Course course = StudyprogramsFactory.eINSTANCE.createCourse();
		course.setSeason(SeasonType.FALL);
		Semester semester = StudyprogramsFactory.eINSTANCE.createSemester();
		semester.setSemesterNumber(1);
		
		System.out.println(semester.getSemesterNumber() % 2 == 1  && course.getSeason() == SeasonType.FALL);
	}
}
