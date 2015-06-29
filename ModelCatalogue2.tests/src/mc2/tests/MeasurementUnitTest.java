/**
 */
package mc2.tests;

import junit.textui.TestRunner;

import mc2.Mc2Factory;
import mc2.MeasurementUnit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Measurement Unit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasurementUnitTest extends DataConceptTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MeasurementUnitTest.class);
	}

	/**
	 * Constructs a new Measurement Unit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUnitTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Measurement Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MeasurementUnit getFixture() {
		return (MeasurementUnit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Mc2Factory.eINSTANCE.createMeasurementUnit());
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

} //MeasurementUnitTest
