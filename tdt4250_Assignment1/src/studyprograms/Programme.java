/**
 */
package studyprograms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.Programme#getName <em>Name</em>}</li>
 *   <li>{@link studyprograms.Programme#getDegree <em>Degree</em>}</li>
 *   <li>{@link studyprograms.Programme#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link studyprograms.Programme#getSpecialisations <em>Specialisations</em>}</li>
 * </ul>
 *
 * @see studyprograms.StudyprogramsPackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyprograms.StudyprogramsPackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyprograms.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Degree</b></em>' attribute.
	 * The literals are from the enumeration {@link studyprograms.DegreeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' attribute.
	 * @see studyprograms.DegreeType
	 * @see #setDegree(DegreeType)
	 * @see studyprograms.StudyprogramsPackage#getProgramme_Degree()
	 * @model
	 * @generated
	 */
	DegreeType getDegree();

	/**
	 * Sets the value of the '{@link studyprograms.Programme#getDegree <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' attribute.
	 * @see studyprograms.DegreeType
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(DegreeType value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link studyprograms.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see studyprograms.StudyprogramsPackage#getProgramme_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Specialisations</b></em>' containment reference list.
	 * The list contents are of type {@link studyprograms.Specialisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisations</em>' containment reference list.
	 * @see studyprograms.StudyprogramsPackage#getProgramme_Specialisations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialisation> getSpecialisations();

} // Programme
