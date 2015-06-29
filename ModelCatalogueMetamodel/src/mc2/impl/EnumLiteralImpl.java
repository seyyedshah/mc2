/**
 */
package mc2.impl;

import mc2.EnumLiteral;
import mc2.Mc2Package;
import mc2.PrimitiveType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mc2.impl.EnumLiteralImpl#getKey <em>Key</em>}</li>
 *   <li>{@link mc2.impl.EnumLiteralImpl#getValue <em>Value</em>}</li>
 *   <li>{@link mc2.impl.EnumLiteralImpl#getEnumLiteralType <em>Enum Literal Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumLiteralImpl extends MinimalEObjectImpl.Container implements EnumLiteral {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnumLiteralType() <em>Enum Literal Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumLiteralType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType enumLiteralType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mc2Package.Literals.ENUM_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mc2Package.ENUM_LITERAL__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mc2Package.ENUM_LITERAL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType getEnumLiteralType() {
		if (enumLiteralType != null && enumLiteralType.eIsProxy()) {
			InternalEObject oldEnumLiteralType = (InternalEObject)enumLiteralType;
			enumLiteralType = (PrimitiveType)eResolveProxy(oldEnumLiteralType);
			if (enumLiteralType != oldEnumLiteralType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mc2Package.ENUM_LITERAL__ENUM_LITERAL_TYPE, oldEnumLiteralType, enumLiteralType));
			}
		}
		return enumLiteralType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType basicGetEnumLiteralType() {
		return enumLiteralType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumLiteralType(PrimitiveType newEnumLiteralType) {
		PrimitiveType oldEnumLiteralType = enumLiteralType;
		enumLiteralType = newEnumLiteralType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mc2Package.ENUM_LITERAL__ENUM_LITERAL_TYPE, oldEnumLiteralType, enumLiteralType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mc2Package.ENUM_LITERAL__KEY:
				return getKey();
			case Mc2Package.ENUM_LITERAL__VALUE:
				return getValue();
			case Mc2Package.ENUM_LITERAL__ENUM_LITERAL_TYPE:
				if (resolve) return getEnumLiteralType();
				return basicGetEnumLiteralType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Mc2Package.ENUM_LITERAL__KEY:
				setKey((String)newValue);
				return;
			case Mc2Package.ENUM_LITERAL__VALUE:
				setValue((Integer)newValue);
				return;
			case Mc2Package.ENUM_LITERAL__ENUM_LITERAL_TYPE:
				setEnumLiteralType((PrimitiveType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Mc2Package.ENUM_LITERAL__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case Mc2Package.ENUM_LITERAL__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case Mc2Package.ENUM_LITERAL__ENUM_LITERAL_TYPE:
				setEnumLiteralType((PrimitiveType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Mc2Package.ENUM_LITERAL__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case Mc2Package.ENUM_LITERAL__VALUE:
				return value != VALUE_EDEFAULT;
			case Mc2Package.ENUM_LITERAL__ENUM_LITERAL_TYPE:
				return enumLiteralType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (key: ");
		result.append(key);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //EnumLiteralImpl
