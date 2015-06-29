/**
 */
package mc2.impl;

import mc2.DataAnnotation;
import mc2.Mc2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mc2.impl.DataAnnotationImpl#getType <em>Type</em>}</li>
 *   <li>{@link mc2.impl.DataAnnotationImpl#getContent <em>Content</em>}</li>
 *   <li>{@link mc2.impl.DataAnnotationImpl#getLanguageURI <em>Language URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataAnnotationImpl extends CatalogueCoreImpl implements DataAnnotation {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final int TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected int type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguageURI() <em>Language URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageURI()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguageURI() <em>Language URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageURI()
	 * @generated
	 * @ordered
	 */
	protected String languageURI = LANGUAGE_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mc2Package.Literals.DATA_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(int newType) {
		int oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mc2Package.DATA_ANNOTATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mc2Package.DATA_ANNOTATION__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguageURI() {
		return languageURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageURI(String newLanguageURI) {
		String oldLanguageURI = languageURI;
		languageURI = newLanguageURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mc2Package.DATA_ANNOTATION__LANGUAGE_URI, oldLanguageURI, languageURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mc2Package.DATA_ANNOTATION__TYPE:
				return getType();
			case Mc2Package.DATA_ANNOTATION__CONTENT:
				return getContent();
			case Mc2Package.DATA_ANNOTATION__LANGUAGE_URI:
				return getLanguageURI();
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
			case Mc2Package.DATA_ANNOTATION__TYPE:
				setType((Integer)newValue);
				return;
			case Mc2Package.DATA_ANNOTATION__CONTENT:
				setContent((String)newValue);
				return;
			case Mc2Package.DATA_ANNOTATION__LANGUAGE_URI:
				setLanguageURI((String)newValue);
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
			case Mc2Package.DATA_ANNOTATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Mc2Package.DATA_ANNOTATION__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case Mc2Package.DATA_ANNOTATION__LANGUAGE_URI:
				setLanguageURI(LANGUAGE_URI_EDEFAULT);
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
			case Mc2Package.DATA_ANNOTATION__TYPE:
				return type != TYPE_EDEFAULT;
			case Mc2Package.DATA_ANNOTATION__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case Mc2Package.DATA_ANNOTATION__LANGUAGE_URI:
				return LANGUAGE_URI_EDEFAULT == null ? languageURI != null : !LANGUAGE_URI_EDEFAULT.equals(languageURI);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", content: ");
		result.append(content);
		result.append(", languageURI: ");
		result.append(languageURI);
		result.append(')');
		return result.toString();
	}

} //DataAnnotationImpl
