/**
 */
package mc2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mc2.DataClass#getClassifies <em>Classifies</em>}</li>
 * </ul>
 * </p>
 *
 * @see mc2.Mc2Package#getDataClass()
 * @model
 * @generated
 */
public interface DataClass extends DataConcept {
	/**
	 * Returns the value of the '<em><b>Classifies</b></em>' reference list.
	 * The list contents are of type {@link mc2.DataElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifies</em>' reference list.
	 * @see mc2.Mc2Package#getDataClass_Classifies()
	 * @model
	 * @generated
	 */
	EList<DataElement> getClassifies();

} // DataClass
