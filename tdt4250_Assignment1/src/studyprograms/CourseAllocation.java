/**
 */
package studyprograms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.CourseAllocation#getStatus <em>Status</em>}</li>
 *   <li>{@link studyprograms.CourseAllocation#getCourseGroup <em>Course Group</em>}</li>
 *   <li>{@link studyprograms.CourseAllocation#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getCourseAllocation()
 * @model
 * @generated
 */
public interface CourseAllocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link studyprograms.CourseStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see studyprograms.CourseStatusType
	 * @see #setStatus(CourseStatusType)
	 * @see studyprograms.StudyprogramsPackage#getCourseAllocation_Status()
	 * @model
	 * @generated
	 */
	CourseStatusType getStatus();

	/**
	 * Sets the value of the '{@link studyprograms.CourseAllocation#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see studyprograms.CourseStatusType
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CourseStatusType value);

	/**
	 * Returns the value of the '<em><b>Course Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyprograms.CourseGroup#getCourseAllocations <em>Course Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Group</em>' container reference.
	 * @see #setCourseGroup(CourseGroup)
	 * @see studyprograms.StudyprogramsPackage#getCourseAllocation_CourseGroup()
	 * @see studyprograms.CourseGroup#getCourseAllocations
	 * @model opposite="courseAllocations" required="true" transient="false"
	 * @generated
	 */
	CourseGroup getCourseGroup();

	/**
	 * Sets the value of the '{@link studyprograms.CourseAllocation#getCourseGroup <em>Course Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Group</em>' container reference.
	 * @see #getCourseGroup()
	 * @generated
	 */
	void setCourseGroup(CourseGroup value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see studyprograms.StudyprogramsPackage#getCourseAllocation_Course()
	 * @model required="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link studyprograms.CourseAllocation#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

} // CourseAllocation
