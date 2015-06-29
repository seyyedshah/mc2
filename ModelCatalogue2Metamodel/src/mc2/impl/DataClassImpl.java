/**
 */
package mc2.impl;

import java.util.Collection;

import mc2.DataClass;
import mc2.DataElement;
import mc2.Mc2Package;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mc2.impl.DataClassImpl#getClassifies <em>Classifies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataClassImpl extends DataConceptImpl implements DataClass {
	/**
	 * The cached value of the '{@link #getClassifies() <em>Classifies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifies()
	 * @generated
	 * @ordered
	 */
	protected EList<DataElement> classifies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mc2Package.Literals.DATA_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataElement> getClassifies() {
		if (classifies == null) {
			classifies = new EObjectResolvingEList<DataElement>(DataElement.class, this, Mc2Package.DATA_CLASS__CLASSIFIES);
		}
		return classifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mc2Package.DATA_CLASS__CLASSIFIES:
				return getClassifies();
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
			case Mc2Package.DATA_CLASS__CLASSIFIES:
				getClassifies().clear();
				getClassifies().addAll((Collection<? extends DataElement>)newValue);
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
			case Mc2Package.DATA_CLASS__CLASSIFIES:
				getClassifies().clear();
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
			case Mc2Package.DATA_CLASS__CLASSIFIES:
				return classifies != null && !classifies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataClassImpl
