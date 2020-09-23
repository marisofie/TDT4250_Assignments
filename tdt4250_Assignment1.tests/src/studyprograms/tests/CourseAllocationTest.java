/**
 */
package studyprograms.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import studyprograms.CourseAllocation;
import studyprograms.StudyprogramsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Course Allocation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CourseAllocationTest extends TestCase {

	/**
	 * The fixture for this Course Allocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseAllocation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CourseAllocationTest.class);
	}

	/**
	 * Constructs a new Course Allocation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseAllocationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Course Allocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CourseAllocation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Course Allocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseAllocation getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StudyprogramsFactory.eINSTANCE.createCourseAllocation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CourseAllocationTest
