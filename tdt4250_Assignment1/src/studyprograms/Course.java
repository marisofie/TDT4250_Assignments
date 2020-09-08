/**
 */
package studyprograms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.Course#getName <em>Name</em>}</li>
 *   <li>{@link studyprograms.Course#getCode <em>Code</em>}</li>
 *   <li>{@link studyprograms.Course#getSubject <em>Subject</em>}</li>
 *   <li>{@link studyprograms.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link studyprograms.Course#getCredits <em>Credits</em>}</li>
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see studyprograms.StudyprogramsPackage#getCourse_Code()
	 * @model id="true" dataType="studyprograms.CourseCode" required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link studyprograms.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see studyprograms.StudyprogramsPackage#getCourse_Subject()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getSubject();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyprograms.StudyprogramsPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyprograms.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link studyprograms.LevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see studyprograms.LevelType
	 * @see #setLevel(LevelType)
	 * @see studyprograms.StudyprogramsPackage#getCourse_Level()
	 * @model
	 * @generated
	 */
	LevelType getLevel();

	/**
	 * Sets the value of the '{@link studyprograms.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see studyprograms.LevelType
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(LevelType value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see studyprograms.StudyprogramsPackage#getCourse_Credits()
	 * @model dataType="studyprograms.CourseCredit"
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link studyprograms.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

} // Course