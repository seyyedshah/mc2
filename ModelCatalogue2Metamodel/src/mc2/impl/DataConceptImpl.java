/**
 */
package mc2.impl;

import java.util.Collection;

import mc2.DataConcept;
import mc2.Mc2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mc2.impl.DataConceptImpl#getClones <em>Clones</em>}</li>
 *   <li>{@link mc2.impl.DataConceptImpl#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataConceptImpl extends CatalogueCoreImpl implements DataConcept {
	/**
	 * The cached value of the '{@link #getClones() <em>Clones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClones()
	 * @generated
	 * @ordered
	 */
	protected EList<DataConcept> clones;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected DataConcept extends_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mc2Package.Literals.DATA_CONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataConcept> getClones() {
		if (clones == null) {
			clones = new EObjectResolvingEList<DataConcept>(DataConcept.class, this, Mc2Package.DATA_CONCEPT__CLONES);
		}
		return clones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConcept getExtends() {
		if (extends_ != null && extends_.eIsProxy()) {
			InternalEObject oldExtends = (InternalEObject)extends_;
			extends_ = (DataConcept)eResolveProxy(oldExtends);
			if (extends_ != oldExtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mc2Package.DATA_CONCEPT__EXTENDS, oldExtends, extends_));
			}
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConcept basicGetExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(DataConcept newExtends) {
		DataConcept oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mc2Package.DATA_CONCEPT__EXTENDS, oldExtends, extends_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mc2Package.DATA_CONCEPT__CLONES:
				return getClones();
			case Mc2Package.DATA_CONCEPT__EXTENDS:
				if (resolve) return getExtends();
				return basicGetExtends();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Mc2Package.DATA_CONCEPT__CLONES:
				getClones().clear();
				getClones().addAll((Collection<? extends DataConcept>)newValue);
				return;
			case Mc2Package.DATA_CONCEPT__EXTENDS:
				setExtends((DataConcept)newValue);
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
			case Mc2Package.DATA_CONCEPT__CLONES:
				getClones().clear();
				return;
			case Mc2Package.DATA_CONCEPT__EXTENDS:
				setExtends((DataConcept)null);
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
			case Mc2Package.DATA_CONCEPT__CLONES:
				return clones != null && !clones.isEmpty();
			case Mc2Package.DATA_CONCEPT__EXTENDS:
				return extends_ != null;
		}
		return super.eIsSet(featureID);
	}

} //DataConceptImpl
