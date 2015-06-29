/**
 */
package mc2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mc2.ValueDomain#getConceptualDomain <em>Conceptual Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see mc2.Mc2Package#getValueDomain()
 * @model
 * @generated
 */
public interface ValueDomain extends DataConcept {
	/**
	 * Returns the value of the '<em><b>Conceptual Domain</b></em>' reference list.
	 * The list contents are of type {@link mc2.DataConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conceptual Domain</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conceptual Domain</em>' reference list.
	 * @see mc2.Mc2Package#getValueDomain_ConceptualDomain()
	 * @model
	 * @generated
	 */
	EList<DataConcept> getConceptualDomain();

} // ValueDomain
