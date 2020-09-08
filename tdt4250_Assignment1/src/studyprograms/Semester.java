/**
 */
package studyprograms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.Semester#getSemesterNumber <em>Semester Number</em>}</li>
 *   <li>{@link studyprograms.Semester#getMaximumCredits <em>Maximum Credits</em>}</li>
 *   <li>{@link studyprograms.Semester#getCourseGroups <em>Course Groups</em>}</li>
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Number</em>' attribute.
	 * @see #setSemesterNumber(int)
	 * @see studyprograms.StudyprogramsPackage#getSemester_SemesterNumber()
	 * @model
	 * @generated
	 */
	int getSemesterNumber();

	/**
	 * Sets the value of the '{@link studyprograms.Semester#getSemesterNumber <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Number</em>' attribute.
	 * @see #getSemesterNumber()
	 * @generated
	 */
	void setSemesterNumber(int value);

	/**
	 * Returns the value of the '<em><b>Maximum Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Credits</em>' attribute.
	 * @see #setMaximumCredits(int)
	 * @see studyprograms.StudyprogramsPackage#getSemester_MaximumCredits()
	 * @model
	 * @generated
	 */
	int getMaximumCredits();

	/**
	 * Sets the value of the '{@link studyprograms.Semester#getMaximumCredits <em>Maximum Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Credits</em>' attribute.
	 * @see #getMaximumCredits()
	 * @generated
	 */
	void setMaximumCredits(int value);

	/**
	 * Returns the value of the '<em><b>Course Groups</b></em>' containment reference list.
	 * The list contents are of type {@link studyprograms.CourseGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Groups</em>' containment reference list.
	 * @see studyprograms.StudyprogramsPackage#getSemester_CourseGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseGroup> getCourseGroups();

} // Semester