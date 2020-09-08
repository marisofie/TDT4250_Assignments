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
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getCourseGroup()
 * @model
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

} // CourseGroup
