/**
 */
package mc2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mc2.DataModel#getOwns <em>Owns</em>}</li>
 *   <li>{@link mc2.DataModel#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see mc2.Mc2Package#getDataModel()
 * @model
 * @generated
 */
public interface DataModel extends CatalogueCore {
	/**
	 * Returns the value of the '<em><b>Owns</b></em>' containment reference list.
	 * The list contents are of type {@link mc2.DataConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' containment reference list.
	 * @see mc2.Mc2Package#getDataModel_Owns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DataConcept> getOwns();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' reference list.
	 * The list contents are of type {@link mc2.DataConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' reference list.
	 * @see mc2.Mc2Package#getDataModel_Imports()
	 * @model
	 * @generated
	 */
	EList<DataConcept> getImports();

} // DataModel
