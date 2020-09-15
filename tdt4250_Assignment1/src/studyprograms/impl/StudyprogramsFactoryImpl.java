/**
 */
package studyprograms.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import studyprograms.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyprogramsFactoryImpl extends EFactoryImpl implements StudyprogramsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StudyprogramsFactory init() {
		try {
			StudyprogramsFactory theStudyprogramsFactory = (StudyprogramsFactory)EPackage.Registry.INSTANCE.getEFactory(StudyprogramsPackage.eNS_URI);
			if (theStudyprogramsFactory != null) {
				return theStudyprogramsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StudyprogramsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyprogramsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StudyprogramsPackage.UNIVERSITY: return createUniversity();
			case StudyprogramsPackage.COURSE: return createCourse();
			case StudyprogramsPackage.PROGRAMME: return createProgramme();
			case StudyprogramsPackage.SPECIALISATION: return createSpecialisation();
			case StudyprogramsPackage.SEMESTER: return createSemester();
			case StudyprogramsPackage.COURSE_GROUP: return createCourseGroup();
			case StudyprogramsPackage.COURSE_ALLOCATION: return createCourseAllocation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StudyprogramsPackage.DEGREE_TYPE:
				return createDegreeTypeFromString(eDataType, initialValue);
			case StudyprogramsPackage.LEVEL_TYPE:
				return createLevelTypeFromString(eDataType, initialValue);
			case StudyprogramsPackage.COURSE_GROUP_TYPE:
				return createCourseGroupTypeFromString(eDataType, initialValue);
			case StudyprogramsPackage.COURSE_STATUS_TYPE:
				return createCourseStatusTypeFromString(eDataType, initialValue);
			case StudyprogramsPackage.SEASON_TYPE:
				return createSeasonTypeFromString(eDataType, initialValue);
			case StudyprogramsPackage.COURSE_CODE:
				return createCourseCodeFromString(eDataType, initialValue);
			case StudyprogramsPackage.COURSE_CREDIT:
				return createCourseCreditFromString(eDataType, initialValue);
			case StudyprogramsPackage.SEMESTER_NUMBER:
				return createSemesterNumberFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StudyprogramsPackage.DEGREE_TYPE:
				return convertDegreeTypeToString(eDataType, instanceValue);
			case StudyprogramsPackage.LEVEL_TYPE:
				return convertLevelTypeToString(eDataType, instanceValue);
			case StudyprogramsPackage.COURSE_GROUP_TYPE:
				return convertCourseGroupTypeToString(eDataType, instanceValue);
			case StudyprogramsPackage.COURSE_STATUS_TYPE:
				return convertCourseStatusTypeToString(eDataType, instanceValue);
			case StudyprogramsPackage.SEASON_TYPE:
				return convertSeasonTypeToString(eDataType, instanceValue);
			case StudyprogramsPackage.COURSE_CODE:
				return convertCourseCodeToString(eDataType, instanceValue);
			case StudyprogramsPackage.COURSE_CREDIT:
				return convertCourseCreditToString(eDataType, instanceValue);
			case StudyprogramsPackage.SEMESTER_NUMBER:
				return convertSemesterNumberToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme createProgramme() {
		ProgrammeImpl programme = new ProgrammeImpl();
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialisation createSpecialisation() {
		SpecialisationImpl specialisation = new SpecialisationImpl();
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public University createUniversity() {
		UniversityImpl university = new UniversityImpl();
		return university;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseGroup createCourseGroup() {
		CourseGroupImpl courseGroup = new CourseGroupImpl();
		return courseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester createSemester() {
		SemesterImpl semester = new SemesterImpl();
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseAllocation createCourseAllocation() {
		CourseAllocationImpl courseAllocation = new CourseAllocationImpl();
		return courseAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelType createLevelTypeFromString(EDataType eDataType, String initialValue) {
		LevelType result = LevelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DegreeType createDegreeTypeFromString(EDataType eDataType, String initialValue) {
		DegreeType result = DegreeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDegreeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseGroupType createCourseGroupTypeFromString(EDataType eDataType, String initialValue) {
		CourseGroupType result = CourseGroupType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCourseGroupTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseStatusType createCourseStatusTypeFromString(EDataType eDataType, String initialValue) {
		CourseStatusType result = CourseStatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCourseStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeasonType createSeasonTypeFromString(EDataType eDataType, String initialValue) {
		SeasonType result = SeasonType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeasonTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String createCourseCodeFromString(EDataType eDataType, String initialValue) {
		if (! initialValue.matches("[A-Z\\Wæøå]+[0-9]+")) {
			throw new IllegalArgumentException("Course code must have the format [A-Z\\Wæøå]+[0-9]+");
		}
		return (String)super.createFromString(eDataType, initialValue);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertCourseCodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createCourseCreditFromString(EDataType eDataType, String initialValue) {
		return (Float)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCourseCreditToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createSemesterNumberFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSemesterNumberToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyprogramsPackage getStudyprogramsPackage() {
		return (StudyprogramsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StudyprogramsPackage getPackage() {
		return StudyprogramsPackage.eINSTANCE;
	}

} //StudyprogramsFactoryImpl
