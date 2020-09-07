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
 *   <li>{@link studyprograms.CourseGroup#getCourses <em>Courses</em>}</li>
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
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link studyprograms.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see studyprograms.StudyprogramsPackage#getCourseGroup_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

} // CourseGroup
