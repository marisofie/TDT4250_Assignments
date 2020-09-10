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
 *   <li>{@link studyprograms.Course#getSubject <em>Subject</em>}</li>
 *   <li>{@link studyprograms.Course#getLabel <em>Label</em>}</li>
 *   <li>{@link studyprograms.Course#getCode <em>Code</em>}</li>
 *   <li>{@link studyprograms.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link studyprograms.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link studyprograms.Course#getSeason <em>Season</em>}</li>
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getCourse()
 * @model annotation="http://www.eclipse.org/acceleo/query/1.0 derivation='self.label = self.code + self.subject'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see studyprograms.StudyprogramsPackage#getCourse_Label()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link studyprograms.Course#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see studyprograms.StudyprogramsPackage#getCourse_Code()
	 * @model id="true" dataType="studyprograms.CourseCode"
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
	 * @model
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

	/**
	 * Returns the value of the '<em><b>Season</b></em>' attribute.
	 * The literals are from the enumeration {@link studyprograms.SeasonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' attribute.
	 * @see studyprograms.SeasonType
	 * @see #setSeason(SeasonType)
	 * @see studyprograms.StudyprogramsPackage#getCourse_Season()
	 * @model
	 * @generated
	 */
	SeasonType getSeason();

	/**
	 * Sets the value of the '{@link studyprograms.Course#getSeason <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' attribute.
	 * @see studyprograms.SeasonType
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(SeasonType value);

} // Course
