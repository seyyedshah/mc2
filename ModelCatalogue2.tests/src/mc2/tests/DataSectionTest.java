/**
 */
package mc2.tests;

import junit.textui.TestRunner;

import mc2.DataSection;
import mc2.Mc2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Section</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataSectionTest extends DataConceptTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataSectionTest.class);
	}

	/**
	 * Constructs a new Data Section test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Section test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataSection getFixture() {
		return (DataSection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Mc2Factory.eINSTANCE.createDataSection());
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

} //DataSectionTest
