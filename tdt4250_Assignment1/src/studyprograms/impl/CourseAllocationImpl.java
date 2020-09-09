/**
 */
package studyprograms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import studyprograms.Course;
import studyprograms.CourseAllocation;
import studyprograms.CourseGroup;
import studyprograms.CourseStatusType;
import studyprograms.StudyprogramsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprograms.impl.CourseAllocationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link studyprograms.impl.CourseAllocationImpl#getCourseGroup <em>Course Group</em>}</li>
 *   <li>{@link studyprograms.impl.CourseAllocationImpl#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseAllocationImpl extends MinimalEObjectImpl.Container implements CourseAllocation {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CourseStatusType STATUS_EDEFAULT = CourseStatusType.O;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CourseStatusType status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected Course course;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramsPackage.Literals.COURSE_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseStatusType getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CourseStatusType newStatus) {
		CourseStatusType oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.COURSE_ALLOCATION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseGroup getCourseGroup() {
		if (eContainerFeatureID() != StudyprogramsPackage.COURSE_ALLOCATION__COURSE_GROUP) return null;
		return (CourseGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourseGroup(CourseGroup newCourseGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCourseGroup, StudyprogramsPackage.COURSE_ALLOCATION__COURSE_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseGroup(CourseGroup newCourseGroup) {
		if (newCourseGroup != eInternalContainer() || (eContainerFeatureID() != StudyprogramsPackage.COURSE_ALLOCATION__COURSE_GROUP && newCourseGroup != null)) {
			if (EcoreUtil.isAncestor(this, newCourseGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCourseGroup != null)
				msgs = ((InternalEObject)newCourseGroup).eInverseAdd(this, StudyprogramsPackage.COURSE_GROUP__COURSE_ALLOCATIONS, CourseGroup.class, msgs);
			msgs = basicSetCourseGroup(newCourseGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.COURSE_ALLOCATION__COURSE_GROUP, newCourseGroup, newCourseGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course getCourse() {
		if (course != null && course.eIsProxy()) {
			InternalEObject oldCourse = (InternalEObject)course;
			course = (Course)eResolveProxy(oldCourse);
			if (course != oldCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyprogramsPackage.COURSE_ALLOCATION__COURSE, oldCourse, course));
			}
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetCourse() {
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourse(Course newCourse) {
		Course oldCourse = course;
		course = newCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramsPackage.COURSE_ALLOCATION__COURSE, oldCourse, course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogramsPackage.COURSE_ALLOCATION__COURSE_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCourseGroup((CourseGroup)otherEnd, msgs);
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
			case StudyprogramsPackage.COURSE_ALLOCATION__COURSE_GROUP:
				return basicSetCourseGroup(null, msgs);
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
			case StudyprogramsPackage.COURSE_ALLOCATION__COURSE_GROUP:
				return eInternalContainer().eInverseRemove(this, StudyprogramsPackage.COURSE_GROUP__COURSE_ALLOCATIONS, CourseGroup.class, msgs);
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
			case StudyprogramsPackage.COURSE_ALLOCATION__STATUS:
				return getStatus();
			case StudyprogramsPackage.COURSE_ALLOCATION__COURSE_GROUP:
				return getCourseGroup();
			case StudyprogramsPackage.COURSE_ALLOCATION__COURSE:
				if (resolve) return getCourse();
				return basicGetCourse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyprogramsPackage.COURSE_ALLOCATION__STATUS:
				setStatus((CourseStatusType)newValue);
				return;
			case StudyprogramsPackage.COURSE_ALLOCATION__COURSE_GROUP:
				setCourseGroup((CourseGroup)newValue);
				return;
			case StudyprogramsPackage.COURSE_ALLOCATION__COURSE:
				setCourse((Course)newValue);
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
			case StudyprogramsPackage.COURSE_ALLOCATION__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case StudyprogramsPackage.COURSE_ALLOCATION__COURSE_GROUP:
				setCourseGroup((CourseGroup)null);
				return;
			case StudyprogramsPackage.COURSE_ALLOCATION__COURSE:
				setCourse((Course)null);
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
			case StudyprogramsPackage.COURSE_ALLOCATION__STATUS:
				return status != STATUS_EDEFAULT;
			case StudyprogramsPackage.COURSE_ALLOCATION__COURSE_GROUP:
				return getCourseGroup() != null;
			case StudyprogramsPackage.COURSE_ALLOCATION__COURSE:
				return course != null;
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
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //CourseAllocationImpl
