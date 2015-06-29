/**
 */
package mc2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mc2.DataConcept#getClones <em>Clones</em>}</li>
 * </ul>
 * </p>
 *
 * @see mc2.Mc2Package#getDataConcept()
 * @model abstract="true"
 * @generated
 */
public interface DataConcept extends CatalogueCore {
	/**
	 * Returns the value of the '<em><b>Clones</b></em>' reference list.
	 * The list contents are of type {@link mc2.DataConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clones</em>' reference list.
	 * @see mc2.Mc2Package#getDataConcept_Clones()
	 * @model
	 * @generated
	 */
	EList<DataConcept> getClones();

} // DataConcept
