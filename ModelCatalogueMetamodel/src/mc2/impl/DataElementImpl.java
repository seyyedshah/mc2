/**
 */
package mc2.impl;

import mc2.DataElement;
import mc2.Mc2Package;
import mc2.MeasurementUnit;
import mc2.Type;
import mc2.ValueDomain;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mc2.impl.DataElementImpl#getHasA <em>Has A</em>}</li>
 *   <li>{@link mc2.impl.DataElementImpl#getMayHave <em>May Have</em>}</li>
 *   <li>{@link mc2.impl.DataElementImpl#getHas <em>Has</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataElementImpl extends DataConceptImpl implements DataElement {
	/**
	 * The cached value of the '{@link #getHasA() <em>Has A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasA()
	 * @generated
	 * @ordered
	 */
	protected ValueDomain hasA;
	/**
	 * The cached value of the '{@link #getMayHave() <em>May Have</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMayHave()
	 * @generated
	 * @ordered
	 */
	protected MeasurementUnit mayHave;
	/**
	 * The cached value of the '{@link #getHas() <em>Has</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected Type has;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mc2Package.Literals.DATA_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueDomain getHasA() {
		if (hasA != null && hasA.eIsProxy()) {
			InternalEObject oldHasA = (InternalEObject)hasA;
			hasA = (ValueDomain)eResolveProxy(oldHasA);
			if (hasA != oldHasA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mc2Package.DATA_ELEMENT__HAS_A, oldHasA, hasA));
			}
		}
		return hasA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueDomain basicGetHasA() {
		return hasA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasA(ValueDomain newHasA) {
		ValueDomain oldHasA = hasA;
		hasA = newHasA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mc2Package.DATA_ELEMENT__HAS_A, oldHasA, hasA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUnit getMayHave() {
		if (mayHave != null && mayHave.eIsProxy()) {
			InternalEObject oldMayHave = (InternalEObject)mayHave;
			mayHave = (MeasurementUnit)eResolveProxy(oldMayHave);
			if (mayHave != oldMayHave) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mc2Package.DATA_ELEMENT__MAY_HAVE, oldMayHave, mayHave));
			}
		}
		return mayHave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUnit basicGetMayHave() {
		return mayHave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMayHave(MeasurementUnit newMayHave) {
		MeasurementUnit oldMayHave = mayHave;
		mayHave = newMayHave;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mc2Package.DATA_ELEMENT__MAY_HAVE, oldMayHave, mayHave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getHas() {
		if (has != null && has.eIsProxy()) {
			InternalEObject oldHas = (InternalEObject)has;
			has = (Type)eResolveProxy(oldHas);
			if (has != oldHas) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mc2Package.DATA_ELEMENT__HAS, oldHas, has));
			}
		}
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetHas() {
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas(Type newHas) {
		Type oldHas = has;
		has = newHas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mc2Package.DATA_ELEMENT__HAS, oldHas, has));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mc2Package.DATA_ELEMENT__HAS_A:
				if (resolve) return getHasA();
				return basicGetHasA();
			case Mc2Package.DATA_ELEMENT__MAY_HAVE:
				if (resolve) return getMayHave();
				return basicGetMayHave();
			case Mc2Package.DATA_ELEMENT__HAS:
				if (resolve) return getHas();
				return basicGetHas();
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
			case Mc2Package.DATA_ELEMENT__HAS_A:
				setHasA((ValueDomain)newValue);
				return;
			case Mc2Package.DATA_ELEMENT__MAY_HAVE:
				setMayHave((MeasurementUnit)newValue);
				return;
			case Mc2Package.DATA_ELEMENT__HAS:
				setHas((Type)newValue);
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
			case Mc2Package.DATA_ELEMENT__HAS_A:
				setHasA((ValueDomain)null);
				return;
			case Mc2Package.DATA_ELEMENT__MAY_HAVE:
				setMayHave((MeasurementUnit)null);
				return;
			case Mc2Package.DATA_ELEMENT__HAS:
				setHas((Type)null);
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
			case Mc2Package.DATA_ELEMENT__HAS_A:
				return hasA != null;
			case Mc2Package.DATA_ELEMENT__MAY_HAVE:
				return mayHave != null;
			case Mc2Package.DATA_ELEMENT__HAS:
				return has != null;
		}
		return super.eIsSet(featureID);
	}

} //DataElementImpl
