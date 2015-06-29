/**
 */
package mc2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mc2.DataAnnotation#getType <em>Type</em>}</li>
 *   <li>{@link mc2.DataAnnotation#getContent <em>Content</em>}</li>
 *   <li>{@link mc2.DataAnnotation#getLanguageURI <em>Language URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see mc2.Mc2Package#getDataAnnotation()
 * @model
 * @generated
 */
public interface DataAnnotation extends CatalogueCore {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(int)
	 * @see mc2.Mc2Package#getDataAnnotation_Type()
	 * @model
	 * @generated
	 */
	int getType();

	/**
	 * Sets the value of the '{@link mc2.DataAnnotation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(int value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see mc2.Mc2Package#getDataAnnotation_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link mc2.DataAnnotation#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Language URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language URI</em>' attribute.
	 * @see #setLanguageURI(String)
	 * @see mc2.Mc2Package#getDataAnnotation_LanguageURI()
	 * @model
	 * @generated
	 */
	String getLanguageURI();

	/**
	 * Sets the value of the '{@link mc2.DataAnnotation#getLanguageURI <em>Language URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language URI</em>' attribute.
	 * @see #getLanguageURI()
	 * @generated
	 */
	void setLanguageURI(String value);

} // DataAnnotation
