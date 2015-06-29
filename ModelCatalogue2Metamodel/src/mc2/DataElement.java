/**
 */
package mc2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mc2.DataElement#getHasA <em>Has A</em>}</li>
 *   <li>{@link mc2.DataElement#getMayHave <em>May Have</em>}</li>
 *   <li>{@link mc2.DataElement#getHas <em>Has</em>}</li>
 * </ul>
 * </p>
 *
 * @see mc2.Mc2Package#getDataElement()
 * @model
 * @generated
 */
public interface DataElement extends DataConcept {
	/**
	 * Returns the value of the '<em><b>Has A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has A</em>' reference.
	 * @see #setHasA(ValueDomain)
	 * @see mc2.Mc2Package#getDataElement_HasA()
	 * @model required="true"
	 * @generated
	 */
	ValueDomain getHasA();

	/**
	 * Sets the value of the '{@link mc2.DataElement#getHasA <em>Has A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has A</em>' reference.
	 * @see #getHasA()
	 * @generated
	 */
	void setHasA(ValueDomain value);

	/**
	 * Returns the value of the '<em><b>May Have</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>May Have</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>May Have</em>' reference.
	 * @see #setMayHave(MeasurementUnit)
	 * @see mc2.Mc2Package#getDataElement_MayHave()
	 * @model
	 * @generated
	 */
	MeasurementUnit getMayHave();

	/**
	 * Sets the value of the '{@link mc2.DataElement#getMayHave <em>May Have</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>May Have</em>' reference.
	 * @see #getMayHave()
	 * @generated
	 */
	void setMayHave(MeasurementUnit value);

	/**
	 * Returns the value of the '<em><b>Has</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' reference.
	 * @see #setHas(Type)
	 * @see mc2.Mc2Package#getDataElement_Has()
	 * @model required="true"
	 * @generated
	 */
	Type getHas();

	/**
	 * Sets the value of the '{@link mc2.DataElement#getHas <em>Has</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has</em>' reference.
	 * @see #getHas()
	 * @generated
	 */
	void setHas(Type value);

} // DataElement
