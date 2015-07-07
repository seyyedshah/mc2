/**
 */
package mc2.impl;

import mc2.CatalogueCore;
import mc2.DataAssociation;
import mc2.Mc2Package;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mc2.impl.DataAssociationImpl#getTo <em>To</em>}</li>
 *   <li>{@link mc2.impl.DataAssociationImpl#getLowerMultiplicity <em>Lower Multiplicity</em>}</li>
 *   <li>{@link mc2.impl.DataAssociationImpl#getFrom <em>From</em>}</li>
 *   <li>{@link mc2.impl.DataAssociationImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link mc2.impl.DataAssociationImpl#getUpperMultiplicity <em>Upper Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataAssociationImpl extends DataConceptImpl implements DataAssociation {
	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected CatalogueCore to;

	/**
	 * The default value of the '{@link #getLowerMultiplicity() <em>Lower Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_MULTIPLICITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerMultiplicity() <em>Lower Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected int lowerMultiplicity = LOWER_MULTIPLICITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected CatalogueCore from;

	/**
	 * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite()
	 * @generated
	 * @ordered
	 */
	protected DataAssociation opposite;

	/**
	 * The default value of the '{@link #getUpperMultiplicity() <em>Upper Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_MULTIPLICITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpperMultiplicity() <em>Upper Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected int upperMultiplicity = UPPER_MULTIPLICITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mc2Package.Literals.DATA_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogueCore getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (CatalogueCore)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mc2Package.DATA_ASSOCIATION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogueCore basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(CatalogueCore newTo) {
		CatalogueCore oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mc2Package.DATA_ASSOCIATION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerMultiplicity() {
		return lowerMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerMultiplicity(int newLowerMultiplicity) {
		int oldLowerMultiplicity = lowerMultiplicity;
		lowerMultiplicity = newLowerMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mc2Package.DATA_ASSOCIATION__LOWER_MULTIPLICITY, oldLowerMultiplicity, lowerMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogueCore getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (CatalogueCore)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mc2Package.DATA_ASSOCIATION__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogueCore basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(CatalogueCore newFrom) {
		CatalogueCore oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mc2Package.DATA_ASSOCIATION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAssociation getOpposite() {
		if (opposite != null && opposite.eIsProxy()) {
			InternalEObject oldOpposite = (InternalEObject)opposite;
			opposite = (DataAssociation)eResolveProxy(oldOpposite);
			if (opposite != oldOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mc2Package.DATA_ASSOCIATION__OPPOSITE, oldOpposite, opposite));
			}
		}
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAssociation basicGetOpposite() {
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(DataAssociation newOpposite) {
		DataAssociation oldOpposite = opposite;
		opposite = newOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mc2Package.DATA_ASSOCIATION__OPPOSITE, oldOpposite, opposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperMultiplicity() {
		return upperMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperMultiplicity(int newUpperMultiplicity) {
		int oldUpperMultiplicity = upperMultiplicity;
		upperMultiplicity = newUpperMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mc2Package.DATA_ASSOCIATION__UPPER_MULTIPLICITY, oldUpperMultiplicity, upperMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mc2Package.DATA_ASSOCIATION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case Mc2Package.DATA_ASSOCIATION__LOWER_MULTIPLICITY:
				return getLowerMultiplicity();
			case Mc2Package.DATA_ASSOCIATION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case Mc2Package.DATA_ASSOCIATION__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case Mc2Package.DATA_ASSOCIATION__UPPER_MULTIPLICITY:
				return getUpperMultiplicity();
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
			case Mc2Package.DATA_ASSOCIATION__TO:
				setTo((CatalogueCore)newValue);
				return;
			case Mc2Package.DATA_ASSOCIATION__LOWER_MULTIPLICITY:
				setLowerMultiplicity((Integer)newValue);
				return;
			case Mc2Package.DATA_ASSOCIATION__FROM:
				setFrom((CatalogueCore)newValue);
				return;
			case Mc2Package.DATA_ASSOCIATION__OPPOSITE:
				setOpposite((DataAssociation)newValue);
				return;
			case Mc2Package.DATA_ASSOCIATION__UPPER_MULTIPLICITY:
				setUpperMultiplicity((Integer)newValue);
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
			case Mc2Package.DATA_ASSOCIATION__TO:
				setTo((CatalogueCore)null);
				return;
			case Mc2Package.DATA_ASSOCIATION__LOWER_MULTIPLICITY:
				setLowerMultiplicity(LOWER_MULTIPLICITY_EDEFAULT);
				return;
			case Mc2Package.DATA_ASSOCIATION__FROM:
				setFrom((CatalogueCore)null);
				return;
			case Mc2Package.DATA_ASSOCIATION__OPPOSITE:
				setOpposite((DataAssociation)null);
				return;
			case Mc2Package.DATA_ASSOCIATION__UPPER_MULTIPLICITY:
				setUpperMultiplicity(UPPER_MULTIPLICITY_EDEFAULT);
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
			case Mc2Package.DATA_ASSOCIATION__TO:
				return to != null;
			case Mc2Package.DATA_ASSOCIATION__LOWER_MULTIPLICITY:
				return lowerMultiplicity != LOWER_MULTIPLICITY_EDEFAULT;
			case Mc2Package.DATA_ASSOCIATION__FROM:
				return from != null;
			case Mc2Package.DATA_ASSOCIATION__OPPOSITE:
				return opposite != null;
			case Mc2Package.DATA_ASSOCIATION__UPPER_MULTIPLICITY:
				return upperMultiplicity != UPPER_MULTIPLICITY_EDEFAULT;
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
		result.append(" (lowerMultiplicity: ");
		result.append(lowerMultiplicity);
		result.append(", upperMultiplicity: ");
		result.append(upperMultiplicity);
		result.append(')');
		return result.toString();
	}

} //DataAssociationImpl
