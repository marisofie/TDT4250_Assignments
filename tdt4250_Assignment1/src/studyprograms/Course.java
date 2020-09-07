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
 *   <li>{@link studyprograms.Course#getCode <em>Code</em>}</li>
 *   <li>{@link studyprograms.Course#getSubject <em>Subject</em>}</li>
 *   <li>{@link studyprograms.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link studyprograms.Course#getCredit <em>Credit</em>}</li>
 *   <li>{@link studyprograms.Course#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='creditBounds'"
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
	 * @model transient="true" volatile="true"
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
	 * @see #setSubject(String)
	 * @see studyprograms.StudyprogramsPackage#getCourse_Subject()
	 * @model transient="true" volatile="true"
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link studyprograms.Course#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyprograms.StudyprogramsPackage#getCourse_Name()
	 * @model id="true"
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
	 * Returns the value of the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit</em>' attribute.
	 * @see #setCredit(float)
	 * @see studyprograms.StudyprogramsPackage#getCourse_Credit()
	 * @model
	 * @generated
	 */
	float getCredit();

	/**
	 * Sets the value of the '{@link studyprograms.Course#getCredit <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit</em>' attribute.
	 * @see #getCredit()
	 * @generated
	 */
	void setCredit(float value);

} // Course
