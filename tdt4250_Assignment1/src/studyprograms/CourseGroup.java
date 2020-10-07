/**
 */
package studyprograms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.CourseGroup#getName <em>Name</em>}</li>
 *   <li>{@link studyprograms.CourseGroup#getCourseAllocations <em>Course Allocations</em>}</li>
 *   <li>{@link studyprograms.CourseGroup#getMinRequiredCredits <em>Min Required Credits</em>}</li>
 *   <li>{@link studyprograms.CourseGroup#getSemester <em>Semester</em>}</li>
 *   <li>{@link studyprograms.CourseGroup#getInformation <em>Information</em>}</li>
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getCourseGroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='courseSeasonMatchesSemester'"
 * @generated
 */
public interface CourseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link studyprograms.CourseGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see studyprograms.CourseGroupType
	 * @see #setName(CourseGroupType)
	 * @see studyprograms.StudyprogramsPackage#getCourseGroup_Name()
	 * @model
	 * @generated
	 */
	CourseGroupType getName();

	/**
	 * Sets the value of the '{@link studyprograms.CourseGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see studyprograms.CourseGroupType
	 * @see #getName()
	 * @generated
	 */
	void setName(CourseGroupType value);

	/**
	 * Returns the value of the '<em><b>Course Allocations</b></em>' containment reference list.
	 * The list contents are of type {@link studyprograms.CourseAllocation}.
	 * It is bidirectional and its opposite is '{@link studyprograms.CourseAllocation#getCourseGroup <em>Course Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Allocations</em>' containment reference list.
	 * @see studyprograms.StudyprogramsPackage#getCourseGroup_CourseAllocations()
	 * @see studyprograms.CourseAllocation#getCourseGroup
	 * @model opposite="courseGroup" containment="true"
	 * @generated
	 */
	EList<CourseAllocation> getCourseAllocations();

	/**
	 * Returns the value of the '<em><b>Min Required Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Required Credits</em>' attribute.
	 * @see #setMinRequiredCredits(float)
	 * @see studyprograms.StudyprogramsPackage#getCourseGroup_MinRequiredCredits()
	 * @model
	 * @generated
	 */
	float getMinRequiredCredits();

	/**
	 * Sets the value of the '{@link studyprograms.CourseGroup#getMinRequiredCredits <em>Min Required Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Required Credits</em>' attribute.
	 * @see #getMinRequiredCredits()
	 * @generated
	 */
	void setMinRequiredCredits(float value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyprograms.Semester#getCourseGroups <em>Course Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' container reference.
	 * @see #setSemester(Semester)
	 * @see studyprograms.StudyprogramsPackage#getCourseGroup_Semester()
	 * @see studyprograms.Semester#getCourseGroups
	 * @model opposite="courseGroups" transient="false"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link studyprograms.CourseGroup#getSemester <em>Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' container reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' attribute.
	 * @see #setInformation(String)
	 * @see studyprograms.StudyprogramsPackage#getCourseGroup_Information()
	 * @model
	 * @generated
	 */
	String getInformation();

	/**
	 * Sets the value of the '{@link studyprograms.CourseGroup#getInformation <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information</em>' attribute.
	 * @see #getInformation()
	 * @generated
	 */
	void setInformation(String value);

} // CourseGroup
