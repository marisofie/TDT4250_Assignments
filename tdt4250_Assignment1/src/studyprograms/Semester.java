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
 *   <li>{@link studyprograms.Semester#getCourseGroups <em>Course Groups</em>}</li>
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getSemester()
 * @model annotation="http://www.eclipse.org/acceleo/query/1.0 validateSemesterCredits=' let mc = self.courseGroups -&gt;collect(cg | cg.minRequiredCredits) -&gt; sum()  in  (if mc &gt;= 30.0 then true else false endif)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validateSemesterCredits'"
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
	 * @model dataType="studyprograms.SemesterNumber"
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
	 * Returns the value of the '<em><b>Course Groups</b></em>' containment reference list.
	 * The list contents are of type {@link studyprograms.CourseGroup}.
	 * It is bidirectional and its opposite is '{@link studyprograms.CourseGroup#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Groups</em>' containment reference list.
	 * @see studyprograms.StudyprogramsPackage#getSemester_CourseGroups()
	 * @see studyprograms.CourseGroup#getSemester
	 * @model opposite="semester" containment="true"
	 * @generated
	 */
	EList<CourseGroup> getCourseGroups();

} // Semester
