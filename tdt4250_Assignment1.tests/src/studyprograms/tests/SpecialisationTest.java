/**
 */
package studyprograms.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import studyprograms.Specialisation;
import studyprograms.StudyprogramsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecialisationTest extends TestCase {

	/**
	 * The fixture for this Specialisation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Specialisation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpecialisationTest.class);
	}

	/**
	 * Constructs a new Specialisation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialisationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Specialisation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Specialisation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Specialisation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Specialisation getFixture() {
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
		setFixture(StudyprogramsFactory.eINSTANCE.createSpecialisation());
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

} //SpecialisationTest
