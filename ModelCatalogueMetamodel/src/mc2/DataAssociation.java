/**
 */
package mc2;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mc2.DataAssociation#getInRoleName <em>In Role Name</em>}</li>
 *   <li>{@link mc2.DataAssociation#getOutRoleName <em>Out Role Name</em>}</li>
 *   <li>{@link mc2.DataAssociation#getDirection <em>Direction</em>}</li>
 *   <li>{@link mc2.DataAssociation#getTo <em>To</em>}</li>
 *   <li>{@link mc2.DataAssociation#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link mc2.DataAssociation#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see mc2.Mc2Package#getDataAssociation()
 * @model
 * @generated
 */
public interface DataAssociation extends DataConcept {
	/**
	 * Returns the value of the '<em><b>In Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Role Name</em>' attribute.
	 * @see #setInRoleName(String)
	 * @see mc2.Mc2Package#getDataAssociation_InRoleName()
	 * @model
	 * @generated
	 */
	String getInRoleName();

	/**
	 * Sets the value of the '{@link mc2.DataAssociation#getInRoleName <em>In Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Role Name</em>' attribute.
	 * @see #getInRoleName()
	 * @generated
	 */
	void setInRoleName(String value);

	/**
	 * Returns the value of the '<em><b>Out Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Role Name</em>' attribute.
	 * @see #setOutRoleName(String)
	 * @see mc2.Mc2Package#getDataAssociation_OutRoleName()
	 * @model
	 * @generated
	 */
	String getOutRoleName();

	/**
	 * Sets the value of the '{@link mc2.DataAssociation#getOutRoleName <em>Out Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Role Name</em>' attribute.
	 * @see #getOutRoleName()
	 * @generated
	 */
	void setOutRoleName(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(int)
	 * @see mc2.Mc2Package#getDataAssociation_Direction()
	 * @model
	 * @generated
	 */
	int getDirection();

	/**
	 * Sets the value of the '{@link mc2.DataAssociation#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(int value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(CatalogueCore)
	 * @see mc2.Mc2Package#getDataAssociation_To()
	 * @model required="true"
	 * @generated
	 */
	CatalogueCore getTo();

	/**
	 * Sets the value of the '{@link mc2.DataAssociation#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(CatalogueCore value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see #setMultiplicity(String)
	 * @see mc2.Mc2Package#getDataAssociation_Multiplicity()
	 * @model
	 * @generated
	 */
	String getMultiplicity();

	/**
	 * Sets the value of the '{@link mc2.DataAssociation#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(CatalogueCore)
	 * @see mc2.Mc2Package#getDataAssociation_From()
	 * @model required="true"
	 * @generated
	 */
	CatalogueCore getFrom();

	/**
	 * Sets the value of the '{@link mc2.DataAssociation#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(CatalogueCore value);

} // DataAssociation
