/**
 */
package mc2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mc2.Mc2Factory
 * @model kind="package"
 * @generated
 */
public interface Mc2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mc2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mc2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mc2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mc2Package eINSTANCE = mc2.impl.Mc2PackageImpl.init();

	/**
	 * The meta object id for the '{@link mc2.impl.CatalogueCoreImpl <em>Catalogue Core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mc2.impl.CatalogueCoreImpl
	 * @see mc2.impl.Mc2PackageImpl#getCatalogueCore()
	 * @generated
	 */
	int CATALOGUE_CORE = 0;

	/**
	 * The feature id for the '<em><b>Notes That</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_CORE__NOTES_THAT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_CORE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Catalogue Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_CORE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Catalogue Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mc2.impl.DataAnnotationImpl <em>Data Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mc2.impl.DataAnnotationImpl
	 * @see mc2.impl.Mc2PackageImpl#getDataAnnotation()
	 * @generated
	 */
	int DATA_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Notes That</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANNOTATION__NOTES_THAT = CATALOGUE_CORE__NOTES_THAT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANNOTATION__NAME = CATALOGUE_CORE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANNOTATION__TYPE = CATALOGUE_CORE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANNOTATION__CONTENT = CATALOGUE_CORE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANNOTATION__LANGUAGE_URI = CATALOGUE_CORE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANNOTATION_FEATURE_COUNT = CATALOGUE_CORE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANNOTATION_OPERATION_COUNT = CATALOGUE_CORE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mc2.impl.DataConceptImpl <em>Data Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mc2.impl.DataConceptImpl
	 * @see mc2.impl.Mc2PackageImpl#getDataConcept()
	 * @generated
	 */
	int DATA_CONCEPT = 4;

	/**
	 * The feature id for the '<em><b>Notes That</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONCEPT__NOTES_THAT = CATALOGUE_CORE__NOTES_THAT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONCEPT__NAME = CATALOGUE_CORE__NAME;

	/**
	 * The feature id for the '<em><b>Clones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONCEPT__CLONES = CATALOGUE_CORE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONCEPT__EXTENDS = CATALOGUE_CORE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONCEPT_FEATURE_COUNT = CATALOGUE_CORE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONCEPT_OPERATION_COUNT = CATALOGUE_CORE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mc2.impl.DataAssociationImpl <em>Data Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mc2.impl.DataAssociationImpl
	 * @see mc2.impl.Mc2PackageImpl#getDataAssociation()
	 * @generated
	 */
	int DATA_ASSOCIATION = 2;

	/**
	 * The feature id for the '<em><b>Notes That</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__NOTES_THAT = DATA_CONCEPT__NOTES_THAT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__NAME = DATA_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Clones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__CLONES = DATA_CONCEPT__CLONES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__EXTENDS = DATA_CONCEPT__EXTENDS;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__TO = DATA_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__MULTIPLICITY = DATA_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__FROM = DATA_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION_FEATURE_COUNT = DATA_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION_OPERATION_COUNT = DATA_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mc2.impl.DataModelImpl <em>Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mc2.impl.DataModelImpl
	 * @see mc2.impl.Mc2PackageImpl#getDataModel()
	 * @generated
	 */
	int DATA_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Notes That</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__NOTES_THAT = CATALOGUE_CORE__NOTES_THAT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__NAME = CATALOGUE_CORE__NAME;

	/**
	 * The feature id for the '<em><b>Owns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__OWNS = CATALOGUE_CORE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__IMPORTS = CATALOGUE_CORE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = CATALOGUE_CORE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_OPERATION_COUNT = CATALOGUE_CORE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mc2.impl.DataSectionImpl <em>Data Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mc2.impl.DataSectionImpl
	 * @see mc2.impl.Mc2PackageImpl#getDataSection()
	 * @generated
	 */
	int DATA_SECTION = 5;

	/**
	 * The feature id for the '<em><b>Notes That</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SECTION__NOTES_THAT = DATA_CONCEPT__NOTES_THAT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SECTION__NAME = DATA_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Clones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SECTION__CLONES = DATA_CONCEPT__CLONES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SECTION__EXTENDS = DATA_CONCEPT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SECTION__GROUPS = DATA_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SECTION_FEATURE_COUNT = DATA_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SECTION_OPERATION_COUNT = DATA_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mc2.impl.DataClassImpl <em>Data Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mc2.impl.DataClassImpl
	 * @see mc2.impl.Mc2PackageImpl#getDataClass()
	 * @generated
	 */
	int DATA_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Notes That</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__NOTES_THAT = DATA_CONCEPT__NOTES_THAT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__NAME = DATA_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Clones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__CLONES = DATA_CONCEPT__CLONES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__EXTENDS = DATA_CONCEPT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Classifies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__CLASSIFIES = DATA_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS_FEATURE_COUNT = DATA_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS_OPERATION_COUNT = DATA_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mc2.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mc2.impl.TypeImpl
	 * @see mc2.impl.Mc2PackageImpl#getType()
	 * @generated
	 */
	int TYPE = 7;

	/**
	 * The feature id for the '<em><b>Notes That</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NOTES_THAT = DATA_CONCEPT__NOTES_THAT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = DATA_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Clones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CLONES = DATA_CONCEPT__CLONES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__EXTENDS = DATA_CONCEPT__EXTENDS;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = DATA_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = DATA_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mc2.impl.DataElementImpl <em>Data Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mc2.impl.DataElementImpl
	 * @see mc2.impl.Mc2PackageImpl#getDataElement()
	 * @generated
	 */
	int DATA_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Notes That</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__NOTES_THAT = DATA_CONCEPT__NOTES_THAT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__NAME = DATA_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Clones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__CLONES = DATA_CONCEPT__CLONES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__EXTENDS = DATA_CONCEPT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Has A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__HAS_A = DATA_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>May Have</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__MAY_HAVE = DATA_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__HAS = DATA_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FEATURE_COUNT = DATA_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_OPERATION_COUNT = DATA_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mc2.impl.ValueDomainImpl <em>Value Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mc2.impl.ValueDomainImpl
	 * @see mc2.impl.Mc2PackageImpl#getValueDomain()
	 * @generated
	 */
	int VALUE_DOMAIN = 9;

	/**
	 * The feature id for the '<em><b>Notes That</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOMAIN__NOTES_THAT = DATA_CONCEPT__NOTES_THAT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOMAIN__NAME = DATA_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Clones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOMAIN__CLONES = DATA_CONCEPT__CLONES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOMAIN__EXTENDS = DATA_CONCEPT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Conceptual Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOMAIN__CONCEPTUAL_DOMAIN = DATA_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOMAIN_FEATURE_COUNT = DATA_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOMAIN_OPERATION_COUNT = DATA_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mc2.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mc2.impl.PrimitiveTypeImpl
	 * @see mc2.impl.Mc2PackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Notes That</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NOTES_THAT = TYPE__NOTES_THAT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Clones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__CLONES = TYPE__CLONES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__EXTENDS = TYPE__EXTENDS;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mc2.impl.MeasurementUnitImpl <em>Measurement Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mc2.impl.MeasurementUnitImpl
	 * @see mc2.impl.Mc2PackageImpl#getMeasurementUnit()
	 * @generated
	 */
	int MEASUREMENT_UNIT = 11;

	/**
	 * The feature id for the '<em><b>Notes That</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT__NOTES_THAT = DATA_CONCEPT__NOTES_THAT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT__NAME = DATA_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Clones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT__CLONES = DATA_CONCEPT__CLONES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT__EXTENDS = DATA_CONCEPT__EXTENDS;

	/**
	 * The number of structural features of the '<em>Measurement Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT_FEATURE_COUNT = DATA_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Measurement Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT_OPERATION_COUNT = DATA_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mc2.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mc2.impl.EnumerationImpl
	 * @see mc2.impl.Mc2PackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 12;

	/**
	 * The feature id for the '<em><b>Notes That</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NOTES_THAT = TYPE__NOTES_THAT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Clones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CLONES = TYPE__CLONES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__EXTENDS = TYPE__EXTENDS;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__HAS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mc2.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mc2.impl.EnumLiteralImpl
	 * @see mc2.impl.Mc2PackageImpl#getEnumLiteral()
	 * @generated
	 */
	int ENUM_LITERAL = 13;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Enum Literal Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__ENUM_LITERAL_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link mc2.CatalogueCore <em>Catalogue Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogue Core</em>'.
	 * @see mc2.CatalogueCore
	 * @generated
	 */
	EClass getCatalogueCore();

	/**
	 * Returns the meta object for the containment reference list '{@link mc2.CatalogueCore#getNotesThat <em>Notes That</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes That</em>'.
	 * @see mc2.CatalogueCore#getNotesThat()
	 * @see #getCatalogueCore()
	 * @generated
	 */
	EReference getCatalogueCore_NotesThat();

	/**
	 * Returns the meta object for the attribute '{@link mc2.CatalogueCore#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mc2.CatalogueCore#getName()
	 * @see #getCatalogueCore()
	 * @generated
	 */
	EAttribute getCatalogueCore_Name();

	/**
	 * Returns the meta object for class '{@link mc2.DataAnnotation <em>Data Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Annotation</em>'.
	 * @see mc2.DataAnnotation
	 * @generated
	 */
	EClass getDataAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link mc2.DataAnnotation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mc2.DataAnnotation#getType()
	 * @see #getDataAnnotation()
	 * @generated
	 */
	EAttribute getDataAnnotation_Type();

	/**
	 * Returns the meta object for the attribute '{@link mc2.DataAnnotation#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see mc2.DataAnnotation#getContent()
	 * @see #getDataAnnotation()
	 * @generated
	 */
	EAttribute getDataAnnotation_Content();

	/**
	 * Returns the meta object for the attribute '{@link mc2.DataAnnotation#getLanguageURI <em>Language URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language URI</em>'.
	 * @see mc2.DataAnnotation#getLanguageURI()
	 * @see #getDataAnnotation()
	 * @generated
	 */
	EAttribute getDataAnnotation_LanguageURI();

	/**
	 * Returns the meta object for class '{@link mc2.DataAssociation <em>Data Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Association</em>'.
	 * @see mc2.DataAssociation
	 * @generated
	 */
	EClass getDataAssociation();

	/**
	 * Returns the meta object for the reference '{@link mc2.DataAssociation#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see mc2.DataAssociation#getTo()
	 * @see #getDataAssociation()
	 * @generated
	 */
	EReference getDataAssociation_To();

	/**
	 * Returns the meta object for the attribute '{@link mc2.DataAssociation#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see mc2.DataAssociation#getMultiplicity()
	 * @see #getDataAssociation()
	 * @generated
	 */
	EAttribute getDataAssociation_Multiplicity();

	/**
	 * Returns the meta object for the reference '{@link mc2.DataAssociation#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see mc2.DataAssociation#getFrom()
	 * @see #getDataAssociation()
	 * @generated
	 */
	EReference getDataAssociation_From();

	/**
	 * Returns the meta object for class '{@link mc2.DataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Model</em>'.
	 * @see mc2.DataModel
	 * @generated
	 */
	EClass getDataModel();

	/**
	 * Returns the meta object for the containment reference list '{@link mc2.DataModel#getOwns <em>Owns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns</em>'.
	 * @see mc2.DataModel#getOwns()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Owns();

	/**
	 * Returns the meta object for the reference list '{@link mc2.DataModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see mc2.DataModel#getImports()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Imports();

	/**
	 * Returns the meta object for class '{@link mc2.DataConcept <em>Data Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Concept</em>'.
	 * @see mc2.DataConcept
	 * @generated
	 */
	EClass getDataConcept();

	/**
	 * Returns the meta object for the reference list '{@link mc2.DataConcept#getClones <em>Clones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clones</em>'.
	 * @see mc2.DataConcept#getClones()
	 * @see #getDataConcept()
	 * @generated
	 */
	EReference getDataConcept_Clones();

	/**
	 * Returns the meta object for the reference '{@link mc2.DataConcept#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see mc2.DataConcept#getExtends()
	 * @see #getDataConcept()
	 * @generated
	 */
	EReference getDataConcept_Extends();

	/**
	 * Returns the meta object for class '{@link mc2.DataSection <em>Data Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Section</em>'.
	 * @see mc2.DataSection
	 * @generated
	 */
	EClass getDataSection();

	/**
	 * Returns the meta object for the reference list '{@link mc2.DataSection#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see mc2.DataSection#getGroups()
	 * @see #getDataSection()
	 * @generated
	 */
	EReference getDataSection_Groups();

	/**
	 * Returns the meta object for class '{@link mc2.DataClass <em>Data Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Class</em>'.
	 * @see mc2.DataClass
	 * @generated
	 */
	EClass getDataClass();

	/**
	 * Returns the meta object for the reference list '{@link mc2.DataClass#getClassifies <em>Classifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classifies</em>'.
	 * @see mc2.DataClass#getClassifies()
	 * @see #getDataClass()
	 * @generated
	 */
	EReference getDataClass_Classifies();

	/**
	 * Returns the meta object for class '{@link mc2.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see mc2.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link mc2.DataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Element</em>'.
	 * @see mc2.DataElement
	 * @generated
	 */
	EClass getDataElement();

	/**
	 * Returns the meta object for the reference '{@link mc2.DataElement#getHasA <em>Has A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has A</em>'.
	 * @see mc2.DataElement#getHasA()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_HasA();

	/**
	 * Returns the meta object for the reference '{@link mc2.DataElement#getMayHave <em>May Have</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>May Have</em>'.
	 * @see mc2.DataElement#getMayHave()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_MayHave();

	/**
	 * Returns the meta object for the reference '{@link mc2.DataElement#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has</em>'.
	 * @see mc2.DataElement#getHas()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_Has();

	/**
	 * Returns the meta object for class '{@link mc2.ValueDomain <em>Value Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Domain</em>'.
	 * @see mc2.ValueDomain
	 * @generated
	 */
	EClass getValueDomain();

	/**
	 * Returns the meta object for the reference list '{@link mc2.ValueDomain#getConceptualDomain <em>Conceptual Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conceptual Domain</em>'.
	 * @see mc2.ValueDomain#getConceptualDomain()
	 * @see #getValueDomain()
	 * @generated
	 */
	EReference getValueDomain_ConceptualDomain();

	/**
	 * Returns the meta object for class '{@link mc2.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see mc2.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link mc2.MeasurementUnit <em>Measurement Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Unit</em>'.
	 * @see mc2.MeasurementUnit
	 * @generated
	 */
	EClass getMeasurementUnit();

	/**
	 * Returns the meta object for class '{@link mc2.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see mc2.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link mc2.Enumeration#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see mc2.Enumeration#getHas()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Has();

	/**
	 * Returns the meta object for class '{@link mc2.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal</em>'.
	 * @see mc2.EnumLiteral
	 * @generated
	 */
	EClass getEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link mc2.EnumLiteral#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see mc2.EnumLiteral#getKey()
	 * @see #getEnumLiteral()
	 * @generated
	 */
	EAttribute getEnumLiteral_Key();

	/**
	 * Returns the meta object for the attribute '{@link mc2.EnumLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mc2.EnumLiteral#getValue()
	 * @see #getEnumLiteral()
	 * @generated
	 */
	EAttribute getEnumLiteral_Value();

	/**
	 * Returns the meta object for the reference '{@link mc2.EnumLiteral#getEnumLiteralType <em>Enum Literal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Literal Type</em>'.
	 * @see mc2.EnumLiteral#getEnumLiteralType()
	 * @see #getEnumLiteral()
	 * @generated
	 */
	EReference getEnumLiteral_EnumLiteralType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Mc2Factory getMc2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mc2.impl.CatalogueCoreImpl <em>Catalogue Core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mc2.impl.CatalogueCoreImpl
		 * @see mc2.impl.Mc2PackageImpl#getCatalogueCore()
		 * @generated
		 */
		EClass CATALOGUE_CORE = eINSTANCE.getCatalogueCore();

		/**
		 * The meta object literal for the '<em><b>Notes That</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE_CORE__NOTES_THAT = eINSTANCE.getCatalogueCore_NotesThat();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOGUE_CORE__NAME = eINSTANCE.getCatalogueCore_Name();

		/**
		 * The meta object literal for the '{@link mc2.impl.DataAnnotationImpl <em>Data Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mc2.impl.DataAnnotationImpl
		 * @see mc2.impl.Mc2PackageImpl#getDataAnnotation()
		 * @generated
		 */
		EClass DATA_ANNOTATION = eINSTANCE.getDataAnnotation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ANNOTATION__TYPE = eINSTANCE.getDataAnnotation_Type();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ANNOTATION__CONTENT = eINSTANCE.getDataAnnotation_Content();

		/**
		 * The meta object literal for the '<em><b>Language URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ANNOTATION__LANGUAGE_URI = eINSTANCE.getDataAnnotation_LanguageURI();

		/**
		 * The meta object literal for the '{@link mc2.impl.DataAssociationImpl <em>Data Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mc2.impl.DataAssociationImpl
		 * @see mc2.impl.Mc2PackageImpl#getDataAssociation()
		 * @generated
		 */
		EClass DATA_ASSOCIATION = eINSTANCE.getDataAssociation();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ASSOCIATION__TO = eINSTANCE.getDataAssociation_To();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ASSOCIATION__MULTIPLICITY = eINSTANCE.getDataAssociation_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ASSOCIATION__FROM = eINSTANCE.getDataAssociation_From();

		/**
		 * The meta object literal for the '{@link mc2.impl.DataModelImpl <em>Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mc2.impl.DataModelImpl
		 * @see mc2.impl.Mc2PackageImpl#getDataModel()
		 * @generated
		 */
		EClass DATA_MODEL = eINSTANCE.getDataModel();

		/**
		 * The meta object literal for the '<em><b>Owns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__OWNS = eINSTANCE.getDataModel_Owns();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__IMPORTS = eINSTANCE.getDataModel_Imports();

		/**
		 * The meta object literal for the '{@link mc2.impl.DataConceptImpl <em>Data Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mc2.impl.DataConceptImpl
		 * @see mc2.impl.Mc2PackageImpl#getDataConcept()
		 * @generated
		 */
		EClass DATA_CONCEPT = eINSTANCE.getDataConcept();

		/**
		 * The meta object literal for the '<em><b>Clones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONCEPT__CLONES = eINSTANCE.getDataConcept_Clones();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONCEPT__EXTENDS = eINSTANCE.getDataConcept_Extends();

		/**
		 * The meta object literal for the '{@link mc2.impl.DataSectionImpl <em>Data Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mc2.impl.DataSectionImpl
		 * @see mc2.impl.Mc2PackageImpl#getDataSection()
		 * @generated
		 */
		EClass DATA_SECTION = eINSTANCE.getDataSection();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SECTION__GROUPS = eINSTANCE.getDataSection_Groups();

		/**
		 * The meta object literal for the '{@link mc2.impl.DataClassImpl <em>Data Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mc2.impl.DataClassImpl
		 * @see mc2.impl.Mc2PackageImpl#getDataClass()
		 * @generated
		 */
		EClass DATA_CLASS = eINSTANCE.getDataClass();

		/**
		 * The meta object literal for the '<em><b>Classifies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CLASS__CLASSIFIES = eINSTANCE.getDataClass_Classifies();

		/**
		 * The meta object literal for the '{@link mc2.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mc2.impl.TypeImpl
		 * @see mc2.impl.Mc2PackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link mc2.impl.DataElementImpl <em>Data Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mc2.impl.DataElementImpl
		 * @see mc2.impl.Mc2PackageImpl#getDataElement()
		 * @generated
		 */
		EClass DATA_ELEMENT = eINSTANCE.getDataElement();

		/**
		 * The meta object literal for the '<em><b>Has A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__HAS_A = eINSTANCE.getDataElement_HasA();

		/**
		 * The meta object literal for the '<em><b>May Have</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__MAY_HAVE = eINSTANCE.getDataElement_MayHave();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__HAS = eINSTANCE.getDataElement_Has();

		/**
		 * The meta object literal for the '{@link mc2.impl.ValueDomainImpl <em>Value Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mc2.impl.ValueDomainImpl
		 * @see mc2.impl.Mc2PackageImpl#getValueDomain()
		 * @generated
		 */
		EClass VALUE_DOMAIN = eINSTANCE.getValueDomain();

		/**
		 * The meta object literal for the '<em><b>Conceptual Domain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_DOMAIN__CONCEPTUAL_DOMAIN = eINSTANCE.getValueDomain_ConceptualDomain();

		/**
		 * The meta object literal for the '{@link mc2.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mc2.impl.PrimitiveTypeImpl
		 * @see mc2.impl.Mc2PackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link mc2.impl.MeasurementUnitImpl <em>Measurement Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mc2.impl.MeasurementUnitImpl
		 * @see mc2.impl.Mc2PackageImpl#getMeasurementUnit()
		 * @generated
		 */
		EClass MEASUREMENT_UNIT = eINSTANCE.getMeasurementUnit();

		/**
		 * The meta object literal for the '{@link mc2.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mc2.impl.EnumerationImpl
		 * @see mc2.impl.Mc2PackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__HAS = eINSTANCE.getEnumeration_Has();

		/**
		 * The meta object literal for the '{@link mc2.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mc2.impl.EnumLiteralImpl
		 * @see mc2.impl.Mc2PackageImpl#getEnumLiteral()
		 * @generated
		 */
		EClass ENUM_LITERAL = eINSTANCE.getEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_LITERAL__KEY = eINSTANCE.getEnumLiteral_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_LITERAL__VALUE = eINSTANCE.getEnumLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Enum Literal Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_LITERAL__ENUM_LITERAL_TYPE = eINSTANCE.getEnumLiteral_EnumLiteralType();

	}

} //Mc2Package
