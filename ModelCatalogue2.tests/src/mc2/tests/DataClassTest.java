/**
 */
package mc2.tests;

import junit.textui.TestRunner;

import mc2.DataClass;
import mc2.Mc2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataClassTest extends DataConceptTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataClassTest.class);
	}

	/**
	 * Constructs a new Data Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataClass getFixture() {
		return (DataClass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Mc2Factory.eINSTANCE.createDataClass());
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

} //DataClassTest
