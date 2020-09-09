/**
 */
package studyprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Level Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see studyprograms.StudyprogramsPackage#getLevelType()
 * @model
 * @generated
 */
public enum LevelType implements Enumerator {
	/**
	 * The '<em><b>Foundation Course Level1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOUNDATION_COURSE_LEVEL1_VALUE
	 * @generated
	 * @ordered
	 */
	FOUNDATION_COURSE_LEVEL1(0, "foundationCourseLevel1", "Grunnleggende emner, nivaa 1"),

	/**
	 * The '<em><b>Intermediate Course Level2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIATE_COURSE_LEVEL2_VALUE
	 * @generated
	 * @ordered
	 */
	INTERMEDIATE_COURSE_LEVEL2(1, "intermediateCourseLevel2", "Videregaaende emner, nivaa 2"),

	/**
	 * The '<em><b>Third Year Subjects Level3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_YEAR_SUBJECTS_LEVEL3_VALUE
	 * @generated
	 * @ordered
	 */
	THIRD_YEAR_SUBJECTS_LEVEL3(2, "thirdYearSubjectsLevel3", "Tredjeaarsemner, nivaa 3"),

	/**
	 * The '<em><b>Second Degree</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_DEGREE_VALUE
	 * @generated
	 * @ordered
	 */
	SECOND_DEGREE(3, "secondDegree", "Hoyere grads nivaa");

	/**
	 * The '<em><b>Foundation Course Level1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOUNDATION_COURSE_LEVEL1
	 * @model name="foundationCourseLevel1" literal="Grunnleggende emner, nivaa 1"
	 * @generated
	 * @ordered
	 */
	public static final int FOUNDATION_COURSE_LEVEL1_VALUE = 0;

	/**
	 * The '<em><b>Intermediate Course Level2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIATE_COURSE_LEVEL2
	 * @model name="intermediateCourseLevel2" literal="Videregaaende emner, nivaa 2"
	 * @generated
	 * @ordered
	 */
	public static final int INTERMEDIATE_COURSE_LEVEL2_VALUE = 1;

	/**
	 * The '<em><b>Third Year Subjects Level3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_YEAR_SUBJECTS_LEVEL3
	 * @model name="thirdYearSubjectsLevel3" literal="Tredjeaarsemner, nivaa 3"
	 * @generated
	 * @ordered
	 */
	public static final int THIRD_YEAR_SUBJECTS_LEVEL3_VALUE = 2;

	/**
	 * The '<em><b>Second Degree</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_DEGREE
	 * @model name="secondDegree" literal="Hoyere grads nivaa"
	 * @generated
	 * @ordered
	 */
	public static final int SECOND_DEGREE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Level Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LevelType[] VALUES_ARRAY =
		new LevelType[] {
			FOUNDATION_COURSE_LEVEL1,
			INTERMEDIATE_COURSE_LEVEL2,
			THIRD_YEAR_SUBJECTS_LEVEL3,
			SECOND_DEGREE,
		};

	/**
	 * A public read-only list of all the '<em><b>Level Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LevelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Level Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LevelType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LevelType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Level Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LevelType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LevelType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Level Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LevelType get(int value) {
		switch (value) {
			case FOUNDATION_COURSE_LEVEL1_VALUE: return FOUNDATION_COURSE_LEVEL1;
			case INTERMEDIATE_COURSE_LEVEL2_VALUE: return INTERMEDIATE_COURSE_LEVEL2;
			case THIRD_YEAR_SUBJECTS_LEVEL3_VALUE: return THIRD_YEAR_SUBJECTS_LEVEL3;
			case SECOND_DEGREE_VALUE: return SECOND_DEGREE;
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
	private LevelType(int value, String name, String literal) {
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
	
} //LevelType
