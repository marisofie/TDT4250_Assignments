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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import studyprograms.CourseAllocation;
import studyprograms.CourseGroup;
import studyprograms.CourseGroupType;
import studyprograms.Semester;
import studyprograms.StudyprogramsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.impl.CourseGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyprograms.impl.CourseGroupImpl#getCourseAllocations <em>Course Allocations</em>}</li>
 *   <li>{@link studyprograms.impl.CourseGroupImpl#getMinRequiredCredits <em>Min Required Credits</em>}</li>
 *   <li>{@link studyprograms.impl.CourseGroupImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link studyprograms.impl.CourseGroupImpl#getInformation <em>Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseGroupImpl extends MinimalEObjectImpl.Container implements CourseGroup {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final CourseGroupType NAME_EDEFAULT = CourseGroupType.MANDATORY_SUBJECTS;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected CourseGroupType name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourseAllocations() <em>Course Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseAllocation> courseAllocations;

	/**
	 * The default value of the '{@link #getMinRequiredCredits() <em>Min Required Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRequiredCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_REQUIRED_CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinRequiredCredits() <em>Min Required Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRequiredCredits()
	 * @generated
	 * @ordered
	 */
	protected float minRequiredCredits = MIN_REQUIRED_CREDITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInformation() <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected String information = INFORMATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramsPackage.Literals.COURSE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseGroupType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(CourseGroupType newName) {
		CourseGroupType oldName = name;
		name = newName == null ? NAME_EDEFAULT : newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.COURSE_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseAllocation> getCourseAllocations() {
		if (courseAllocations == null) {
			courseAllocations = new EObjectContainmentWithInverseEList<CourseAllocation>(CourseAllocation.class, this, StudyprogramsPackage.COURSE_GROUP__COURSE_ALLOCATIONS, StudyprogramsPackage.COURSE_ALLOCATION__COURSE_GROUP);
		}
		return courseAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinRequiredCredits() {
		return minRequiredCredits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRequiredCredits(float newMinRequiredCredits) {
		float oldMinRequiredCredits = minRequiredCredits;
		minRequiredCredits = newMinRequiredCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.COURSE_GROUP__MIN_REQUIRED_CREDITS, oldMinRequiredCredits, minRequiredCredits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester getSemester() {
		if (eContainerFeatureID() != StudyprogramsPackage.COURSE_GROUP__SEMESTER) return null;
		return (Semester)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemester(Semester newSemester, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSemester, StudyprogramsPackage.COURSE_GROUP__SEMESTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemester(Semester newSemester) {
		if (newSemester != eInternalContainer() || (eContainerFeatureID() != StudyprogramsPackage.COURSE_GROUP__SEMESTER && newSemester != null)) {
			if (EcoreUtil.isAncestor(this, newSemester))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSemester != null)
				msgs = ((InternalEObject)newSemester).eInverseAdd(this, StudyprogramsPackage.SEMESTER__COURSE_GROUPS, Semester.class, msgs);
			msgs = basicSetSemester(newSemester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.COURSE_GROUP__SEMESTER, newSemester, newSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInformation() {
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformation(String newInformation) {
		String oldInformation = information;
		information = newInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.COURSE_GROUP__INFORMATION, oldInformation, information));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogramsPackage.COURSE_GROUP__COURSE_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourseAllocations()).basicAdd(otherEnd, msgs);
			case StudyprogramsPackage.COURSE_GROUP__SEMESTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSemester((Semester)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogramsPackage.COURSE_GROUP__COURSE_ALLOCATIONS:
				return ((InternalEList<?>)getCourseAllocations()).basicRemove(otherEnd, msgs);
			case StudyprogramsPackage.COURSE_GROUP__SEMESTER:
				return basicSetSemester(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StudyprogramsPackage.COURSE_GROUP__SEMESTER:
				return eInternalContainer().eInverseRemove(this, StudyprogramsPackage.SEMESTER__COURSE_GROUPS, Semester.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyprogramsPackage.COURSE_GROUP__NAME:
				return getName();
			case StudyprogramsPackage.COURSE_GROUP__COURSE_ALLOCATIONS:
				return getCourseAllocations();
			case StudyprogramsPackage.COURSE_GROUP__MIN_REQUIRED_CREDITS:
				return getMinRequiredCredits();
			case StudyprogramsPackage.COURSE_GROUP__SEMESTER:
				return getSemester();
			case StudyprogramsPackage.COURSE_GROUP__INFORMATION:
				return getInformation();
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
			case StudyprogramsPackage.COURSE_GROUP__NAME:
				setName((CourseGroupType)newValue);
				return;
			case StudyprogramsPackage.COURSE_GROUP__COURSE_ALLOCATIONS:
				getCourseAllocations().clear();
				getCourseAllocations().addAll((Collection<? extends CourseAllocation>)newValue);
				return;
			case StudyprogramsPackage.COURSE_GROUP__MIN_REQUIRED_CREDITS:
				setMinRequiredCredits((Float)newValue);
				return;
			case StudyprogramsPackage.COURSE_GROUP__SEMESTER:
				setSemester((Semester)newValue);
				return;
			case StudyprogramsPackage.COURSE_GROUP__INFORMATION:
				setInformation((String)newValue);
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
			case StudyprogramsPackage.COURSE_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyprogramsPackage.COURSE_GROUP__COURSE_ALLOCATIONS:
				getCourseAllocations().clear();
				return;
			case StudyprogramsPackage.COURSE_GROUP__MIN_REQUIRED_CREDITS:
				setMinRequiredCredits(MIN_REQUIRED_CREDITS_EDEFAULT);
				return;
			case StudyprogramsPackage.COURSE_GROUP__SEMESTER:
				setSemester((Semester)null);
				return;
			case StudyprogramsPackage.COURSE_GROUP__INFORMATION:
				setInformation(INFORMATION_EDEFAULT);
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
			case StudyprogramsPackage.COURSE_GROUP__NAME:
				return name != NAME_EDEFAULT;
			case StudyprogramsPackage.COURSE_GROUP__COURSE_ALLOCATIONS:
				return courseAllocations != null && !courseAllocations.isEmpty();
			case StudyprogramsPackage.COURSE_GROUP__MIN_REQUIRED_CREDITS:
				return minRequiredCredits != MIN_REQUIRED_CREDITS_EDEFAULT;
			case StudyprogramsPackage.COURSE_GROUP__SEMESTER:
				return getSemester() != null;
			case StudyprogramsPackage.COURSE_GROUP__INFORMATION:
				return INFORMATION_EDEFAULT == null ? information != null : !INFORMATION_EDEFAULT.equals(information);
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
		result.append(", minRequiredCredits: ");
		result.append(minRequiredCredits);
		result.append(", information: ");
		result.append(information);
		result.append(')');
		return result.toString();
	}

} //CourseGroupImpl
