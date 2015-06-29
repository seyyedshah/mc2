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
 *   <li>{@link mc2.impl.DataAssociationImpl#getInRoleName <em>In Role Name</em>}</li>
 *   <li>{@link mc2.impl.DataAssociationImpl#getOutRoleName <em>Out Role Name</em>}</li>
 *   <li>{@link mc2.impl.DataAssociationImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link mc2.impl.DataAssociationImpl#getTo <em>To</em>}</li>
 *   <li>{@link mc2.impl.DataAssociationImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link mc2.impl.DataAssociationImpl#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataAssociationImpl extends DataConceptImpl implements DataAssociation {
	/**
	 * The default value of the '{@link #getInRoleName() <em>In Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInRoleName()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_ROLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInRoleName() <em>In Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInRoleName()
	 * @generated
	 * @ordered
	 */
	protected String inRoleName = IN_ROLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutRoleName() <em>Out Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutRoleName()
	 * @generated
	 * @ordered
	 */
	protected static final String OUT_ROLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutRoleName() <em>Out Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutRoleName()
	 * @generated
	 * @ordered
	 */
	protected String outRoleName = OUT_ROLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final int DIRECTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected int direction = DIRECTION_EDEFAULT;

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
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected String multiplicity = MULTIPLICITY_EDEFAULT;

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
	public String getInRoleName() {
		return inRoleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInRoleName(String newInRoleName) {
		String oldInRoleName = inRoleName;
		inRoleName = newInRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mc2Package.DATA_ASSOCIATION__IN_ROLE_NAME, oldInRoleName, inRoleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutRoleName() {
		return outRoleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutRoleName(String newOutRoleName) {
		String oldOutRoleName = outRoleName;
		outRoleName = newOutRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mc2Package.DATA_ASSOCIATION__OUT_ROLE_NAME, oldOutRoleName, outRoleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(int newDirection) {
		int oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mc2Package.DATA_ASSOCIATION__DIRECTION, oldDirection, direction));
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
	public String getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(String newMultiplicity) {
		String oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mc2Package.DATA_ASSOCIATION__MULTIPLICITY, oldMultiplicity, multiplicity));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mc2Package.DATA_ASSOCIATION__IN_ROLE_NAME:
				return getInRoleName();
			case Mc2Package.DATA_ASSOCIATION__OUT_ROLE_NAME:
				return getOutRoleName();
			case Mc2Package.DATA_ASSOCIATION__DIRECTION:
				return getDirection();
			case Mc2Package.DATA_ASSOCIATION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case Mc2Package.DATA_ASSOCIATION__MULTIPLICITY:
				return getMultiplicity();
			case Mc2Package.DATA_ASSOCIATION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
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
			case Mc2Package.DATA_ASSOCIATION__IN_ROLE_NAME:
				setInRoleName((String)newValue);
				return;
			case Mc2Package.DATA_ASSOCIATION__OUT_ROLE_NAME:
				setOutRoleName((String)newValue);
				return;
			case Mc2Package.DATA_ASSOCIATION__DIRECTION:
				setDirection((Integer)newValue);
				return;
			case Mc2Package.DATA_ASSOCIATION__TO:
				setTo((CatalogueCore)newValue);
				return;
			case Mc2Package.DATA_ASSOCIATION__MULTIPLICITY:
				setMultiplicity((String)newValue);
				return;
			case Mc2Package.DATA_ASSOCIATION__FROM:
				setFrom((CatalogueCore)newValue);
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
			case Mc2Package.DATA_ASSOCIATION__IN_ROLE_NAME:
				setInRoleName(IN_ROLE_NAME_EDEFAULT);
				return;
			case Mc2Package.DATA_ASSOCIATION__OUT_ROLE_NAME:
				setOutRoleName(OUT_ROLE_NAME_EDEFAULT);
				return;
			case Mc2Package.DATA_ASSOCIATION__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case Mc2Package.DATA_ASSOCIATION__TO:
				setTo((CatalogueCore)null);
				return;
			case Mc2Package.DATA_ASSOCIATION__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
			case Mc2Package.DATA_ASSOCIATION__FROM:
				setFrom((CatalogueCore)null);
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
			case Mc2Package.DATA_ASSOCIATION__IN_ROLE_NAME:
				return IN_ROLE_NAME_EDEFAULT == null ? inRoleName != null : !IN_ROLE_NAME_EDEFAULT.equals(inRoleName);
			case Mc2Package.DATA_ASSOCIATION__OUT_ROLE_NAME:
				return OUT_ROLE_NAME_EDEFAULT == null ? outRoleName != null : !OUT_ROLE_NAME_EDEFAULT.equals(outRoleName);
			case Mc2Package.DATA_ASSOCIATION__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case Mc2Package.DATA_ASSOCIATION__TO:
				return to != null;
			case Mc2Package.DATA_ASSOCIATION__MULTIPLICITY:
				return MULTIPLICITY_EDEFAULT == null ? multiplicity != null : !MULTIPLICITY_EDEFAULT.equals(multiplicity);
			case Mc2Package.DATA_ASSOCIATION__FROM:
				return from != null;
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
		result.append(" (inRoleName: ");
		result.append(inRoleName);
		result.append(", outRoleName: ");
		result.append(outRoleName);
		result.append(", direction: ");
		result.append(direction);
		result.append(", multiplicity: ");
		result.append(multiplicity);
		result.append(')');
		return result.toString();
	}

} //DataAssociationImpl
