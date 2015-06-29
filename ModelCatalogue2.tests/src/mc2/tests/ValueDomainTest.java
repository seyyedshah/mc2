/**
 */
package mc2.tests;

import junit.textui.TestRunner;

import mc2.Mc2Factory;
import mc2.ValueDomain;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Value Domain</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueDomainTest extends DataConceptTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ValueDomainTest.class);
	}

	/**
	 * Constructs a new Value Domain test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueDomainTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Value Domain test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ValueDomain getFixture() {
		return (ValueDomain)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Mc2Factory.eINSTANCE.createValueDomain());
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

} //ValueDomainTest
