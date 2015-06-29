/**
 */
package mc2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mc2.DataSection#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see mc2.Mc2Package#getDataSection()
 * @model
 * @generated
 */
public interface DataSection extends DataConcept {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' reference list.
	 * The list contents are of type {@link mc2.DataClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' reference list.
	 * @see mc2.Mc2Package#getDataSection_Groups()
	 * @model
	 * @generated
	 */
	EList<DataClass> getGroups();

} // DataSection
