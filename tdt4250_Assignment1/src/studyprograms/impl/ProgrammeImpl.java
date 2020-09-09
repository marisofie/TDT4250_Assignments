/**
 */
package studyprograms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import studyprograms.DegreeType;
import studyprograms.Programme;
import studyprograms.Semester;
import studyprograms.Specialisation;
import studyprograms.StudyprogramsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.impl.ProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyprograms.impl.ProgrammeImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link studyprograms.impl.ProgrammeImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link studyprograms.impl.ProgrammeImpl#getSpecialisations <em>Specialisations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends MinimalEObjectImpl.Container implements Programme {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected static final DegreeType DEGREE_EDEFAULT = DegreeType.BACHELOR;

	/**
	 * The cached value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected DegreeType degree = DEGREE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * The cached value of the '{@link #getSpecialisations() <em>Specialisations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialisation> specialisations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramsPackage.Literals.PROGRAMME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.PROGRAMME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DegreeType getDegree() {
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegree(DegreeType newDegree) {
		DegreeType oldDegree = degree;
		degree = newDegree == null ? DEGREE_EDEFAULT : newDegree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.PROGRAMME__DEGREE, oldDegree, degree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<Semester>(Semester.class, this, StudyprogramsPackage.PROGRAMME__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialisation> getSpecialisations() {
		if (specialisations == null) {
			specialisations = new EObjectContainmentEList<Specialisation>(Specialisation.class, this, StudyprogramsPackage.PROGRAMME__SPECIALISATIONS);
		}
		return specialisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogramsPackage.PROGRAMME__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case StudyprogramsPackage.PROGRAMME__SPECIALISATIONS:
				return ((InternalEList<?>)getSpecialisations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyprogramsPackage.PROGRAMME__NAME:
				return getName();
			case StudyprogramsPackage.PROGRAMME__DEGREE:
				return getDegree();
			case StudyprogramsPackage.PROGRAMME__SEMESTERS:
				return getSemesters();
			case StudyprogramsPackage.PROGRAMME__SPECIALISATIONS:
				return getSpecialisations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyprogramsPackage.PROGRAMME__NAME:
				setName((String)newValue);
				return;
			case StudyprogramsPackage.PROGRAMME__DEGREE:
				setDegree((DegreeType)newValue);
				return;
			case StudyprogramsPackage.PROGRAMME__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
				return;
			case StudyprogramsPackage.PROGRAMME__SPECIALISATIONS:
				getSpecialisations().clear();
				getSpecialisations().addAll((Collection<? extends Specialisation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudyprogramsPackage.PROGRAMME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyprogramsPackage.PROGRAMME__DEGREE:
				setDegree(DEGREE_EDEFAULT);
				return;
			case StudyprogramsPackage.PROGRAMME__SEMESTERS:
				getSemesters().clear();
				return;
			case StudyprogramsPackage.PROGRAMME__SPECIALISATIONS:
				getSpecialisations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudyprogramsPackage.PROGRAMME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyprogramsPackage.PROGRAMME__DEGREE:
				return degree != DEGREE_EDEFAULT;
			case StudyprogramsPackage.PROGRAMME__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case StudyprogramsPackage.PROGRAMME__SPECIALISATIONS:
				return specialisations != null && !specialisations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", degree: ");
		result.append(degree);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
