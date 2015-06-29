/**
 */
package mc2.impl;

import java.util.Collection;

import mc2.DataConcept;
import mc2.Mc2Package;
import mc2.ValueDomain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mc2.impl.ValueDomainImpl#getConceptualDomain <em>Conceptual Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueDomainImpl extends DataConceptImpl implements ValueDomain {
	/**
	 * The cached value of the '{@link #getConceptualDomain() <em>Conceptual Domain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptualDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<DataConcept> conceptualDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mc2Package.Literals.VALUE_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataConcept> getConceptualDomain() {
		if (conceptualDomain == null) {
			conceptualDomain = new EObjectResolvingEList<DataConcept>(DataConcept.class, this, Mc2Package.VALUE_DOMAIN__CONCEPTUAL_DOMAIN);
		}
		return conceptualDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mc2Package.VALUE_DOMAIN__CONCEPTUAL_DOMAIN:
				return getConceptualDomain();
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
			case Mc2Package.VALUE_DOMAIN__CONCEPTUAL_DOMAIN:
				getConceptualDomain().clear();
				getConceptualDomain().addAll((Collection<? extends DataConcept>)newValue);
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
			case Mc2Package.VALUE_DOMAIN__CONCEPTUAL_DOMAIN:
				getConceptualDomain().clear();
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
			case Mc2Package.VALUE_DOMAIN__CONCEPTUAL_DOMAIN:
				return conceptualDomain != null && !conceptualDomain.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueDomainImpl
