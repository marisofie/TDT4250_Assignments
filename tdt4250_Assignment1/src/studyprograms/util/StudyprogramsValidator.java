/**
 */
package studyprograms.util;

import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import studyprograms.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see studyprograms.StudyprogramsPackage
 * @generated
 */
public class StudyprogramsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StudyprogramsValidator INSTANCE = new StudyprogramsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "studyprograms";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyprogramsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return StudyprogramsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case StudyprogramsPackage.UNIVERSITY:
				return validateUniversity((University)value, diagnostics, context);
			case StudyprogramsPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case StudyprogramsPackage.PROGRAMME:
				return validateProgramme((Programme)value, diagnostics, context);
			case StudyprogramsPackage.SPECIALISATION:
				return validateSpecialisation((Specialisation)value, diagnostics, context);
			case StudyprogramsPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case StudyprogramsPackage.COURSE_GROUP:
				return validateCourseGroup((CourseGroup)value, diagnostics, context);
			case StudyprogramsPackage.COURSE_ALLOCATION:
				return validateCourseAllocation((CourseAllocation)value, diagnostics, context);
			case StudyprogramsPackage.DEGREE_TYPE:
				return validateDegreeType((DegreeType)value, diagnostics, context);
			case StudyprogramsPackage.LEVEL_TYPE:
				return validateLevelType((LevelType)value, diagnostics, context);
			case StudyprogramsPackage.COURSE_GROUP_TYPE:
				return validateCourseGroupType((CourseGroupType)value, diagnostics, context);
			case StudyprogramsPackage.COURSE_STATUS_TYPE:
				return validateCourseStatusType((CourseStatusType)value, diagnostics, context);
			case StudyprogramsPackage.SEASON_TYPE:
				return validateSeasonType((SeasonType)value, diagnostics, context);
			case StudyprogramsPackage.COURSE_CODE:
				return validateCourseCode((String)value, diagnostics, context);
			case StudyprogramsPackage.COURSE_CREDIT:
				return validateCourseCredit((Float)value, diagnostics, context);
			case StudyprogramsPackage.SEMESTER_NUMBER:
				return validateSemesterNumber((Integer)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programme, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialisation(Specialisation specialisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(university, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseGroup(CourseGroup courseGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(courseGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourseGroup_courseSeasonMatchesSemester(courseGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the courseSeasonMatchesSemester constraint of '<em>Course Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourseGroup_courseSeasonMatchesSemester(CourseGroup courseGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		int semester = courseGroup.getSemester().getSemesterNumber();
		EList<CourseAllocation> courseAllocations = courseGroup.getCourseAllocations();
		
		Boolean isNotCorrect = false;
		
		for (int i = 0; i < courseAllocations.size(); i++) {
			SeasonType season = courseAllocations.get(i).getCourse().getSeason();
			
			if (season == SeasonType.BOTH) {
				continue;
			}
		
			// Check that is semester is odd, the course is running in fall
			if (semester % 2 == 1  && season != SeasonType.FALL) {
				isNotCorrect = true;
			}
			// Check that is semester is even, the course is running in spring
			else if (semester % 2 == 0 && season != SeasonType.SPRING) {
				isNotCorrect = true;
			}
		}
		
		if (isNotCorrect) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "courseSeasonMatchesSemester", getObjectLabel(courseGroup, context) },
						 new Object[] { courseGroup },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseAllocation(CourseAllocation courseAllocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseAllocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelType(LevelType levelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegreeType(DegreeType degreeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseGroupType(CourseGroupType courseGroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseStatusType(CourseStatusType courseStatusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeasonType(SeasonType seasonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCode(String courseCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCredit(float courseCredit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCourseCredit_Min(courseCredit, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourseCredit_Max(courseCredit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCourseCredit_Min
	 */
	public static final float COURSE_CREDIT__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Course Credit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCredit_Min(float courseCredit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = courseCredit >= COURSE_CREDIT__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(StudyprogramsPackage.Literals.COURSE_CREDIT, courseCredit, COURSE_CREDIT__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCourseCredit_Max
	 */
	public static final float COURSE_CREDIT__MAX__VALUE = 60.0F;

	/**
	 * Validates the Max constraint of '<em>Course Credit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCredit_Max(float courseCredit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = courseCredit <= COURSE_CREDIT__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(StudyprogramsPackage.Literals.COURSE_CREDIT, courseCredit, COURSE_CREDIT__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterNumber(int semesterNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSemesterNumber_Min(semesterNumber, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSemesterNumber_Min
	 */
	public static final int SEMESTER_NUMBER__MIN__VALUE = 1;

	/**
	 * Validates the Min constraint of '<em>Semester Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterNumber_Min(int semesterNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = semesterNumber >= SEMESTER_NUMBER__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(StudyprogramsPackage.Literals.SEMESTER_NUMBER, semesterNumber, SEMESTER_NUMBER__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StudyprogramsValidator
