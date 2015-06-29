/**
 */
package mc2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogue Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mc2.CatalogueCore#getNotesThat <em>Notes That</em>}</li>
 *   <li>{@link mc2.CatalogueCore#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mc2.Mc2Package#getCatalogueCore()
 * @model abstract="true"
 * @generated
 */
public interface CatalogueCore extends EObject {
	/**
	 * Returns the value of the '<em><b>Notes That</b></em>' containment reference list.
	 * The list contents are of type {@link mc2.DataAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes That</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes That</em>' containment reference list.
	 * @see mc2.Mc2Package#getCatalogueCore_NotesThat()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataAnnotation> getNotesThat();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mc2.Mc2Package#getCatalogueCore_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mc2.CatalogueCore#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CatalogueCore
