/**
 */
package mc2.impl;

import java.util.Collection;

import mc2.DataConcept;
import mc2.Mc2Package;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mc2.impl.DataConceptImpl#getClones <em>Clones</em>}</li>
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mc2Package.DATA_CONCEPT__CLONES:
				return getClones();
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
		}
		return super.eIsSet(featureID);
	}

} //DataConceptImpl
