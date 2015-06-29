/**
 */
package mc2.tests;

import junit.textui.TestRunner;

import mc2.DataAnnotation;
import mc2.Mc2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Annotation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataAnnotationTest extends CatalogueCoreTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataAnnotationTest.class);
	}

	/**
	 * Constructs a new Data Annotation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAnnotationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Annotation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataAnnotation getFixture() {
		return (DataAnnotation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Mc2Factory.eINSTANCE.createDataAnnotation());
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

} //DataAnnotationTest
