/**
 */
package studyprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Course Group Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see studyprograms.StudyprogramsPackage#getCourseGroupType()
 * @model
 * @generated
 */
public enum CourseGroupType implements Enumerator {
	/**
	 * The '<em><b>Mandatory Subjects</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANDATORY_SUBJECTS_VALUE
	 * @generated
	 * @ordered
	 */
	MANDATORY_SUBJECTS(0, "mandatorySubjects", "Obligatoriske emner"), /**
	 * The '<em><b>Elective Subjects</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTIVE_SUBJECTS_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTIVE_SUBJECTS(1, "electiveSubjects", "Valgbare emner"), /**
	 * The '<em><b>Complimentary Subjects</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLIMENTARY_SUBJECTS_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLIMENTARY_SUBJECTS(2, "complimentarySubjects", "Komplementaere emner"), /**
	 * The '<em><b>Engineering Subjects Other Programme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENGINEERING_SUBJECTS_OTHER_PROGRAMME_VALUE
	 * @generated
	 * @ordered
	 */
	ENGINEERING_SUBJECTS_OTHER_PROGRAMME(3, "engineeringSubjectsOtherProgramme", "Ingenioremne annet studieprogram"), /**
	 * The '<em><b>Experts In Team</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPERTS_IN_TEAM_VALUE
	 * @generated
	 * @ordered
	 */
	EXPERTS_IN_TEAM(4, "expertsInTeam", "Eksperter i Team"),

	/**
	 * The '<em><b>Specialisation Subjects Thesis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIALISATION_SUBJECTS_THESIS_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIALISATION_SUBJECTS_THESIS(5, "specialisationSubjectsThesis", "Fordypningsemner og masteroppgave"), /**
	 * The '<em><b>Omradeemne</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OMRADEEMNE_VALUE
	 * @generated
	 * @ordered
	 */
	OMRADEEMNE(6, "omradeemne", "Omr\u00e5deemne");

	/**
	 * The '<em><b>Mandatory Subjects</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANDATORY_SUBJECTS
	 * @model name="mandatorySubjects" literal="Obligatoriske emner"
	 * @generated
	 * @ordered
	 */
	public static final int MANDATORY_SUBJECTS_VALUE = 0;

	/**
	 * The '<em><b>Elective Subjects</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTIVE_SUBJECTS
	 * @model name="electiveSubjects" literal="Valgbare emner"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTIVE_SUBJECTS_VALUE = 1;

	/**
	 * The '<em><b>Complimentary Subjects</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLIMENTARY_SUBJECTS
	 * @model name="complimentarySubjects" literal="Komplementaere emner"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLIMENTARY_SUBJECTS_VALUE = 2;

	/**
	 * The '<em><b>Engineering Subjects Other Programme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENGINEERING_SUBJECTS_OTHER_PROGRAMME
	 * @model name="engineeringSubjectsOtherProgramme" literal="Ingenioremne annet studieprogram"
	 * @generated
	 * @ordered
	 */
	public static final int ENGINEERING_SUBJECTS_OTHER_PROGRAMME_VALUE = 3;

	/**
	 * The '<em><b>Experts In Team</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPERTS_IN_TEAM
	 * @model name="expertsInTeam" literal="Eksperter i Team"
	 * @generated
	 * @ordered
	 */
	public static final int EXPERTS_IN_TEAM_VALUE = 4;

	/**
	 * The '<em><b>Specialisation Subjects Thesis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIALISATION_SUBJECTS_THESIS
	 * @model name="specialisationSubjectsThesis" literal="Fordypningsemner og masteroppgave"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIALISATION_SUBJECTS_THESIS_VALUE = 5;

	/**
	 * The '<em><b>Omradeemne</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OMRADEEMNE
	 * @model name="omradeemne" literal="Omr\345deemne"
	 * @generated
	 * @ordered
	 */
	public static final int OMRADEEMNE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Course Group Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CourseGroupType[] VALUES_ARRAY =
		new CourseGroupType[] {
			MANDATORY_SUBJECTS,
			ELECTIVE_SUBJECTS,
			COMPLIMENTARY_SUBJECTS,
			ENGINEERING_SUBJECTS_OTHER_PROGRAMME,
			EXPERTS_IN_TEAM,
			SPECIALISATION_SUBJECTS_THESIS,
			OMRADEEMNE,
		};

	/**
	 * A public read-only list of all the '<em><b>Course Group Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CourseGroupType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Course Group Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseGroupType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CourseGroupType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course Group Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseGroupType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CourseGroupType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course Group Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseGroupType get(int value) {
		switch (value) {
			case MANDATORY_SUBJECTS_VALUE: return MANDATORY_SUBJECTS;
			case ELECTIVE_SUBJECTS_VALUE: return ELECTIVE_SUBJECTS;
			case COMPLIMENTARY_SUBJECTS_VALUE: return COMPLIMENTARY_SUBJECTS;
			case ENGINEERING_SUBJECTS_OTHER_PROGRAMME_VALUE: return ENGINEERING_SUBJECTS_OTHER_PROGRAMME;
			case EXPERTS_IN_TEAM_VALUE: return EXPERTS_IN_TEAM;
			case SPECIALISATION_SUBJECTS_THESIS_VALUE: return SPECIALISATION_SUBJECTS_THESIS;
			case OMRADEEMNE_VALUE: return OMRADEEMNE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CourseGroupType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CourseGroupType
