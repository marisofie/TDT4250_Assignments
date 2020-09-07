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
	 * The '<em><b>Mandatory Subject</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANDATORY_SUBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	MANDATORY_SUBJECT(0, "mandatorySubject", "mandatory subject"),

	/**
	 * The '<em><b>Complimentary Subject</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLIMENTARY_SUBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLIMENTARY_SUBJECT(1, "complimentarySubject", "complimentary subject"),

	/**
	 * The '<em><b>Optional Subject</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIONAL_SUBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIONAL_SUBJECT(2, "optionalSubject", "optional subject"),

	/**
	 * The '<em><b>Engineering Subject Other Programme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENGINEERING_SUBJECT_OTHER_PROGRAMME_VALUE
	 * @generated
	 * @ordered
	 */
	ENGINEERING_SUBJECT_OTHER_PROGRAMME(3, "engineeringSubjectOtherProgramme", "engineering subject other programme"),

	/**
	 * The '<em><b>Experts In Team</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPERTS_IN_TEAM_VALUE
	 * @generated
	 * @ordered
	 */
	EXPERTS_IN_TEAM(4, "expertsInTeam", "experts in team"),

	/**
	 * The '<em><b>Specialisation Subject</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIALISATION_SUBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIALISATION_SUBJECT(5, "specialisationSubject", "specialisation subject");

	/**
	 * The '<em><b>Mandatory Subject</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANDATORY_SUBJECT
	 * @model name="mandatorySubject" literal="mandatory subject"
	 * @generated
	 * @ordered
	 */
	public static final int MANDATORY_SUBJECT_VALUE = 0;

	/**
	 * The '<em><b>Complimentary Subject</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLIMENTARY_SUBJECT
	 * @model name="complimentarySubject" literal="complimentary subject"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLIMENTARY_SUBJECT_VALUE = 1;

	/**
	 * The '<em><b>Optional Subject</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIONAL_SUBJECT
	 * @model name="optionalSubject" literal="optional subject"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIONAL_SUBJECT_VALUE = 2;

	/**
	 * The '<em><b>Engineering Subject Other Programme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENGINEERING_SUBJECT_OTHER_PROGRAMME
	 * @model name="engineeringSubjectOtherProgramme" literal="engineering subject other programme"
	 * @generated
	 * @ordered
	 */
	public static final int ENGINEERING_SUBJECT_OTHER_PROGRAMME_VALUE = 3;

	/**
	 * The '<em><b>Experts In Team</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPERTS_IN_TEAM
	 * @model name="expertsInTeam" literal="experts in team"
	 * @generated
	 * @ordered
	 */
	public static final int EXPERTS_IN_TEAM_VALUE = 4;

	/**
	 * The '<em><b>Specialisation Subject</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIALISATION_SUBJECT
	 * @model name="specialisationSubject" literal="specialisation subject"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIALISATION_SUBJECT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Course Group Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CourseGroupType[] VALUES_ARRAY =
		new CourseGroupType[] {
			MANDATORY_SUBJECT,
			COMPLIMENTARY_SUBJECT,
			OPTIONAL_SUBJECT,
			ENGINEERING_SUBJECT_OTHER_PROGRAMME,
			EXPERTS_IN_TEAM,
			SPECIALISATION_SUBJECT,
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
			case MANDATORY_SUBJECT_VALUE: return MANDATORY_SUBJECT;
			case COMPLIMENTARY_SUBJECT_VALUE: return COMPLIMENTARY_SUBJECT;
			case OPTIONAL_SUBJECT_VALUE: return OPTIONAL_SUBJECT;
			case ENGINEERING_SUBJECT_OTHER_PROGRAMME_VALUE: return ENGINEERING_SUBJECT_OTHER_PROGRAMME;
			case EXPERTS_IN_TEAM_VALUE: return EXPERTS_IN_TEAM;
			case SPECIALISATION_SUBJECT_VALUE: return SPECIALISATION_SUBJECT;
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
