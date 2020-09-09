/**
 */
package studyprograms.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import studyprograms.Course;
import studyprograms.CourseAllocation;
import studyprograms.CourseGroup;
import studyprograms.CourseGroupType;
import studyprograms.CourseStatusType;
import studyprograms.DegreeType;
import studyprograms.LevelType;
import studyprograms.Programme;
import studyprograms.SeasonType;
import studyprograms.Semester;
import studyprograms.Specialisation;
import studyprograms.StudyprogramsFactory;
import studyprograms.StudyprogramsPackage;
import studyprograms.University;
import studyprograms.util.StudyprogramsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyprogramsPackageImpl extends EPackageImpl implements StudyprogramsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programmeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum degreeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum courseGroupTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum courseStatusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum seasonTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType courseCodeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType courseCreditEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType semesterNumberEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see studyprograms.StudyprogramsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StudyprogramsPackageImpl() {
		super(eNS_URI, StudyprogramsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link StudyprogramsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StudyprogramsPackage init() {
		if (isInited) return (StudyprogramsPackage)EPackage.Registry.INSTANCE.getEPackage(StudyprogramsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStudyprogramsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StudyprogramsPackageImpl theStudyprogramsPackage = registeredStudyprogramsPackage instanceof StudyprogramsPackageImpl ? (StudyprogramsPackageImpl)registeredStudyprogramsPackage : new StudyprogramsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theStudyprogramsPackage.createPackageContents();

		// Initialize created meta-data
		theStudyprogramsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theStudyprogramsPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return StudyprogramsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theStudyprogramsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StudyprogramsPackage.eNS_URI, theStudyprogramsPackage);
		return theStudyprogramsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Label() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Code() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Subject() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Level() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Credits() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Season() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramme() {
		return programmeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramme_Name() {
		return (EAttribute)programmeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramme_Degree() {
		return (EAttribute)programmeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramme_Semesters() {
		return (EReference)programmeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramme_Specialisations() {
		return (EReference)programmeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialisation() {
		return specialisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialisation_Name() {
		return (EAttribute)specialisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialisation_ChildSpecialisations() {
		return (EReference)specialisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialisation_Semesters() {
		return (EReference)specialisationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniversity() {
		return universityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversity_Programmes() {
		return (EReference)universityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversity_Courses() {
		return (EReference)universityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseGroup() {
		return courseGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseGroup_Name() {
		return (EAttribute)courseGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseGroup_CourseAllocations() {
		return (EReference)courseGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseGroup_MinRequiredCredits() {
		return (EAttribute)courseGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseGroup_Semester() {
		return (EReference)courseGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemester() {
		return semesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemester_SemesterNumber() {
		return (EAttribute)semesterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemester_CourseGroups() {
		return (EReference)semesterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseAllocation() {
		return courseAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseAllocation_Status() {
		return (EAttribute)courseAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseAllocation_CourseGroup() {
		return (EReference)courseAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseAllocation_Course() {
		return (EReference)courseAllocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLevelType() {
		return levelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDegreeType() {
		return degreeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCourseGroupType() {
		return courseGroupTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCourseStatusType() {
		return courseStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeasonType() {
		return seasonTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCourseCode() {
		return courseCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCourseCredit() {
		return courseCreditEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSemesterNumber() {
		return semesterNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyprogramsFactory getStudyprogramsFactory() {
		return (StudyprogramsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		universityEClass = createEClass(UNIVERSITY);
		createEReference(universityEClass, UNIVERSITY__PROGRAMMES);
		createEReference(universityEClass, UNIVERSITY__COURSES);

		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__LABEL);
		createEAttribute(courseEClass, COURSE__CODE);
		createEAttribute(courseEClass, COURSE__SUBJECT);
		createEAttribute(courseEClass, COURSE__LEVEL);
		createEAttribute(courseEClass, COURSE__CREDITS);
		createEAttribute(courseEClass, COURSE__SEASON);

		programmeEClass = createEClass(PROGRAMME);
		createEAttribute(programmeEClass, PROGRAMME__NAME);
		createEAttribute(programmeEClass, PROGRAMME__DEGREE);
		createEReference(programmeEClass, PROGRAMME__SEMESTERS);
		createEReference(programmeEClass, PROGRAMME__SPECIALISATIONS);

		specialisationEClass = createEClass(SPECIALISATION);
		createEAttribute(specialisationEClass, SPECIALISATION__NAME);
		createEReference(specialisationEClass, SPECIALISATION__CHILD_SPECIALISATIONS);
		createEReference(specialisationEClass, SPECIALISATION__SEMESTERS);

		semesterEClass = createEClass(SEMESTER);
		createEAttribute(semesterEClass, SEMESTER__SEMESTER_NUMBER);
		createEReference(semesterEClass, SEMESTER__COURSE_GROUPS);

		courseGroupEClass = createEClass(COURSE_GROUP);
		createEAttribute(courseGroupEClass, COURSE_GROUP__NAME);
		createEReference(courseGroupEClass, COURSE_GROUP__COURSE_ALLOCATIONS);
		createEAttribute(courseGroupEClass, COURSE_GROUP__MIN_REQUIRED_CREDITS);
		createEReference(courseGroupEClass, COURSE_GROUP__SEMESTER);

		courseAllocationEClass = createEClass(COURSE_ALLOCATION);
		createEAttribute(courseAllocationEClass, COURSE_ALLOCATION__STATUS);
		createEReference(courseAllocationEClass, COURSE_ALLOCATION__COURSE_GROUP);
		createEReference(courseAllocationEClass, COURSE_ALLOCATION__COURSE);

		// Create enums
		degreeTypeEEnum = createEEnum(DEGREE_TYPE);
		levelTypeEEnum = createEEnum(LEVEL_TYPE);
		courseGroupTypeEEnum = createEEnum(COURSE_GROUP_TYPE);
		courseStatusTypeEEnum = createEEnum(COURSE_STATUS_TYPE);
		seasonTypeEEnum = createEEnum(SEASON_TYPE);

		// Create data types
		courseCodeEDataType = createEDataType(COURSE_CODE);
		courseCreditEDataType = createEDataType(COURSE_CREDIT);
		semesterNumberEDataType = createEDataType(SEMESTER_NUMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(universityEClass, University.class, "University", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniversity_Programmes(), this.getProgramme(), null, "programmes", null, 0, -1, University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversity_Courses(), this.getCourse(), null, "courses", null, 0, -1, University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_Label(), ecorePackage.getEString(), "label", null, 0, 1, Course.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Code(), this.getCourseCode(), "code", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Subject(), ecorePackage.getEString(), "subject", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Level(), this.getLevelType(), "level", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Credits(), this.getCourseCredit(), "credits", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Season(), this.getSeasonType(), "season", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programmeEClass, Programme.class, "Programme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramme_Name(), ecorePackage.getEString(), "name", null, 0, 1, Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramme_Degree(), this.getDegreeType(), "degree", null, 0, 1, Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramme_Semesters(), this.getSemester(), null, "semesters", null, 0, -1, Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramme_Specialisations(), this.getSpecialisation(), null, "specialisations", null, 0, -1, Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specialisationEClass, Specialisation.class, "Specialisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecialisation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Specialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialisation_ChildSpecialisations(), this.getSpecialisation(), null, "childSpecialisations", null, 0, -1, Specialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialisation_Semesters(), this.getSemester(), null, "semesters", null, 0, -1, Specialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semesterEClass, Semester.class, "Semester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemester_SemesterNumber(), this.getSemesterNumber(), "semesterNumber", null, 0, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemester_CourseGroups(), this.getCourseGroup(), this.getCourseGroup_Semester(), "courseGroups", null, 0, -1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseGroupEClass, CourseGroup.class, "CourseGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourseGroup_Name(), this.getCourseGroupType(), "name", null, 0, 1, CourseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseGroup_CourseAllocations(), this.getCourseAllocation(), this.getCourseAllocation_CourseGroup(), "courseAllocations", null, 0, -1, CourseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseGroup_MinRequiredCredits(), ecorePackage.getEFloat(), "minRequiredCredits", null, 0, 1, CourseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseGroup_Semester(), this.getSemester(), this.getSemester_CourseGroups(), "semester", null, 0, 1, CourseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseAllocationEClass, CourseAllocation.class, "CourseAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourseAllocation_Status(), this.getCourseStatusType(), "status", null, 0, 1, CourseAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseAllocation_CourseGroup(), this.getCourseGroup(), this.getCourseGroup_CourseAllocations(), "courseGroup", null, 1, 1, CourseAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseAllocation_Course(), this.getCourse(), null, "course", null, 1, 1, CourseAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(degreeTypeEEnum, DegreeType.class, "DegreeType");
		addEEnumLiteral(degreeTypeEEnum, DegreeType.BACHELOR);
		addEEnumLiteral(degreeTypeEEnum, DegreeType.MASTER);
		addEEnumLiteral(degreeTypeEEnum, DegreeType.INTEGRATED_MASTER);

		initEEnum(levelTypeEEnum, LevelType.class, "LevelType");
		addEEnumLiteral(levelTypeEEnum, LevelType.FOUNDATION_COURSE_LEVEL1);
		addEEnumLiteral(levelTypeEEnum, LevelType.INTERMEDIATE_COURSE_LEVEL2);
		addEEnumLiteral(levelTypeEEnum, LevelType.THIRD_YEAR_SUBJECTS_LEVEL3);
		addEEnumLiteral(levelTypeEEnum, LevelType.SECOND_DEGREE);

		initEEnum(courseGroupTypeEEnum, CourseGroupType.class, "CourseGroupType");
		addEEnumLiteral(courseGroupTypeEEnum, CourseGroupType.MANDATORY_SUBJECTS);
		addEEnumLiteral(courseGroupTypeEEnum, CourseGroupType.ELECTIVE_SUBJECTS);
		addEEnumLiteral(courseGroupTypeEEnum, CourseGroupType.COMPLIMENTARY_SUBJECTS);
		addEEnumLiteral(courseGroupTypeEEnum, CourseGroupType.ENGINEERING_SUBJECTS_OTHER_PROGRAMME);
		addEEnumLiteral(courseGroupTypeEEnum, CourseGroupType.EXPERTS_IN_TEAM);
		addEEnumLiteral(courseGroupTypeEEnum, CourseGroupType.SPECIALISATION_SUBJECTS_THESIS);

		initEEnum(courseStatusTypeEEnum, CourseStatusType.class, "CourseStatusType");
		addEEnumLiteral(courseStatusTypeEEnum, CourseStatusType.O);
		addEEnumLiteral(courseStatusTypeEEnum, CourseStatusType.V);
		addEEnumLiteral(courseStatusTypeEEnum, CourseStatusType.VA);
		addEEnumLiteral(courseStatusTypeEEnum, CourseStatusType.VB);
		addEEnumLiteral(courseStatusTypeEEnum, CourseStatusType.MAX1A);
		addEEnumLiteral(courseStatusTypeEEnum, CourseStatusType.M1A);
		addEEnumLiteral(courseStatusTypeEEnum, CourseStatusType.M2A);

		initEEnum(seasonTypeEEnum, SeasonType.class, "SeasonType");
		addEEnumLiteral(seasonTypeEEnum, SeasonType.FALL);
		addEEnumLiteral(seasonTypeEEnum, SeasonType.SPRING);
		addEEnumLiteral(seasonTypeEEnum, SeasonType.BOTH);

		// Initialize data types
		initEDataType(courseCodeEDataType, String.class, "CourseCode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(courseCreditEDataType, float.class, "CourseCredit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(semesterNumberEDataType, int.class, "SemesterNumber", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/acceleo/query/1.0
		create_1Annotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "validationDelegates", "http://www.eclipse.org/acceleo/query/1.0"
		   });
		addAnnotation
		  (courseGroupEClass,
		   source,
		   new String[] {
			   "constraints", "courseSeasonMatchesSemester"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/acceleo/query/1.0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_1Annotations() {
		String source = "http://www.eclipse.org/acceleo/query/1.0";
		addAnnotation
		  (courseEClass,
		   source,
		   new String[] {
			   "derivation", "self.label = self.code + self.subject"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (courseCreditEDataType,
		   source,
		   new String[] {
			   "maxInclusive", "60",
			   "minInclusive", "0"
		   });
		addAnnotation
		  (semesterNumberEDataType,
		   source,
		   new String[] {
			   "minInclusive", "1"
		   });
	}

} //StudyprogramsPackageImpl
