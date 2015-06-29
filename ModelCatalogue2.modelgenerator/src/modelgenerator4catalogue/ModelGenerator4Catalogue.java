package modelgenerator4catalogue;
//This (meta) model was automatically generated 

//import statements
import fur.FInstance;
import java.lang.Iterable;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import kodkod.ast.Formula;
import kodkod.ast.Relation;
import kodkod.ast.Variable;
import kodkod.ast.Expression;
import kodkod.engine.Solution;
import kodkod.engine.Solver;
import kodkod.engine.satlab.SATFactory;
import kodkod.instance.Bounds;
import kodkod.instance.TupleFactory;
import kodkod.instance.Universe;

public class ModelGenerator4Catalogue implements Iterator<FInstance>, Iterable<FInstance>{

	private final Relation _Integer;
	private final Relation _String;
	private final Relation _CatalogueCore;
	private final Relation _DataConcept;
	private final Relation _Type;
	private final Relation _DataAnnotation_type;
	private final Relation _DataAnnotation_content;
	private final Relation _DataAnnotation_languageURI;
	private final Relation _DataAssociation_inRoleName;
	private final Relation _DataAssociation_outRoleName;
	private final Relation _DataAssociation_direction;
	private final Relation _DataAssociation_multiplicity;
	private final Relation _EnumLiteral_key;
	private final Relation _EnumLiteral_value;
	private final Relation _CatalogueCore_name;
	private final Relation _DataAnnotation;
	private final Relation _DataAssociation;
	private final Relation _DataModel;
	private final Relation _DataSection;
	private final Relation _DataClass;
	private final Relation _DataElement;
	private final Relation _ValueDomain;
	private final Relation _PrimitiveType;
	private final Relation _MeasurementUnit;
	private final Relation _Enumeration;
	private final Relation _EnumLiteral;
	private final Relation _type_DataAnnotation_to_DataAnnotation_type;
	private final Relation _content_DataAnnotation_to_DataAnnotation_content;
	private final Relation _languageURI_DataAnnotation_to_DataAnnotation_languageURI;
	private final Relation _to_DataAssociation_to_DataAssociation_to;
	private final Relation _from_DataAssociation_to_DataAssociation_from;
	private final Relation _inRoleName_DataAssociation_to_DataAssociation_inRoleName;
	private final Relation _outRoleName_DataAssociation_to_DataAssociation_outRoleName;
	private final Relation _direction_DataAssociation_to_DataAssociation_direction;
	private final Relation _multiplicity_DataAssociation_to_DataAssociation_multiplicity;
	private final Relation _conceptualDomain_ValueDomain_to_ValueDomain_conceptualDomain;
	private final Relation _enumLiteralType_EnumLiteral_to_EnumLiteral_enumLiteralType;
	private final Relation _key_EnumLiteral_to_EnumLiteral_key;
	private final Relation _value_EnumLiteral_to_EnumLiteral_value;
	private final Relation _has_Enumeration_to_Enumeration_has;
	private final Relation _hasA_DataElement_to_DataElement_hasA;
	private final Relation _mayHave_DataElement_to_DataElement_mayHave;
	private final Relation _has_DataElement_to_DataElement_has;
	private final Relation _classifies_DataClass_to_DataClass_classifies;
	private final Relation _groups_DataSection_to_DataSection_groups;
	private final Relation _clones_DataConcept_to_DataConcept_clones;
	private final Relation _owns_DataModel_to_DataModel_owns;
	private final Relation _imports_DataModel_to_DataModel_imports;
	private final Relation _notesThat_CatalogueCore_to_CatalogueCore_notesThat;
	private final Relation _name_CatalogueCore_to_CatalogueCore_name;
	private Solver solver;
	private Iterator<Solution> solutions;

	//constructor to initialise (meta) models objects
	public ModelGenerator4Catalogue(){
		_Integer = Relation.nary("_Integer", 1);
		_String = Relation.nary("_String", 1);
		_CatalogueCore = Relation.nary("_CatalogueCore", 1);
		_DataConcept = Relation.nary("_DataConcept", 1);
		_Type = Relation.nary("_Type", 1);
		_DataAnnotation_type = Relation.nary("_DataAnnotation_type", 1);
		_DataAnnotation_content = Relation.nary("_DataAnnotation_content", 1);
		_DataAnnotation_languageURI = Relation.nary("_DataAnnotation_languageURI", 1);
		_DataAssociation_inRoleName = Relation.nary("_DataAssociation_inRoleName", 1);
		_DataAssociation_outRoleName = Relation.nary("_DataAssociation_outRoleName", 1);
		_DataAssociation_direction = Relation.nary("_DataAssociation_direction", 1);
		_DataAssociation_multiplicity = Relation.nary("_DataAssociation_multiplicity", 1);
		_EnumLiteral_key = Relation.nary("_EnumLiteral_key", 1);
		_EnumLiteral_value = Relation.nary("_EnumLiteral_value", 1);
		_CatalogueCore_name = Relation.nary("_CatalogueCore_name", 1);
		_DataAnnotation = Relation.nary("_DataAnnotation", 1);
		_DataAssociation = Relation.nary("_DataAssociation", 1);
		_DataModel = Relation.nary("_DataModel", 1);
		_DataSection = Relation.nary("_DataSection", 1);
		_DataClass = Relation.nary("_DataClass", 1);
		_DataElement = Relation.nary("_DataElement", 1);
		_ValueDomain = Relation.nary("_ValueDomain", 1);
		_PrimitiveType = Relation.nary("_PrimitiveType", 1);
		_MeasurementUnit = Relation.nary("_MeasurementUnit", 1);
		_Enumeration = Relation.nary("_Enumeration", 1);
		_EnumLiteral = Relation.nary("_EnumLiteral", 1);
		_type_DataAnnotation_to_DataAnnotation_type = Relation.nary("_type_DataAnnotation_to_DataAnnotation_type", 2);
		_content_DataAnnotation_to_DataAnnotation_content = Relation.nary("_content_DataAnnotation_to_DataAnnotation_content", 2);
		_languageURI_DataAnnotation_to_DataAnnotation_languageURI = Relation.nary("_languageURI_DataAnnotation_to_DataAnnotation_languageURI", 2);
		_to_DataAssociation_to_DataAssociation_to = Relation.nary("_to_DataAssociation_to_DataAssociation_to", 2);
		_from_DataAssociation_to_DataAssociation_from = Relation.nary("_from_DataAssociation_to_DataAssociation_from", 2);
		_inRoleName_DataAssociation_to_DataAssociation_inRoleName = Relation.nary("_inRoleName_DataAssociation_to_DataAssociation_inRoleName", 2);
		_outRoleName_DataAssociation_to_DataAssociation_outRoleName = Relation.nary("_outRoleName_DataAssociation_to_DataAssociation_outRoleName", 2);
		_direction_DataAssociation_to_DataAssociation_direction = Relation.nary("_direction_DataAssociation_to_DataAssociation_direction", 2);
		_multiplicity_DataAssociation_to_DataAssociation_multiplicity = Relation.nary("_multiplicity_DataAssociation_to_DataAssociation_multiplicity", 2);
		_conceptualDomain_ValueDomain_to_ValueDomain_conceptualDomain = Relation.nary("_conceptualDomain_ValueDomain_to_ValueDomain_conceptualDomain", 2);
		_enumLiteralType_EnumLiteral_to_EnumLiteral_enumLiteralType = Relation.nary("_enumLiteralType_EnumLiteral_to_EnumLiteral_enumLiteralType", 2);
		_key_EnumLiteral_to_EnumLiteral_key = Relation.nary("_key_EnumLiteral_to_EnumLiteral_key", 2);
		_value_EnumLiteral_to_EnumLiteral_value = Relation.nary("_value_EnumLiteral_to_EnumLiteral_value", 2);
		_has_Enumeration_to_Enumeration_has = Relation.nary("_has_Enumeration_to_Enumeration_has", 2);
		_hasA_DataElement_to_DataElement_hasA = Relation.nary("_hasA_DataElement_to_DataElement_hasA", 2);
		_mayHave_DataElement_to_DataElement_mayHave = Relation.nary("_mayHave_DataElement_to_DataElement_mayHave", 2);
		_has_DataElement_to_DataElement_has = Relation.nary("_has_DataElement_to_DataElement_has", 2);
		_classifies_DataClass_to_DataClass_classifies = Relation.nary("_classifies_DataClass_to_DataClass_classifies", 2);
		_groups_DataSection_to_DataSection_groups = Relation.nary("_groups_DataSection_to_DataSection_groups", 2);
		_clones_DataConcept_to_DataConcept_clones = Relation.nary("_clones_DataConcept_to_DataConcept_clones", 2);
		_owns_DataModel_to_DataModel_owns = Relation.nary("_owns_DataModel_to_DataModel_owns", 2);
		_imports_DataModel_to_DataModel_imports = Relation.nary("_imports_DataModel_to_DataModel_imports", 2);
		_notesThat_CatalogueCore_to_CatalogueCore_notesThat = Relation.nary("_notesThat_CatalogueCore_to_CatalogueCore_notesThat", 2);
		_name_CatalogueCore_to_CatalogueCore_name = Relation.nary("_name_CatalogueCore_to_CatalogueCore_name", 2);
		solver = new Solver();
		solver.options().setSolver(SATFactory.MiniSat);
		solutions = solver.solveAll(this.declaration(),this.bounds());
	}

	//the model declartion is helper for the constructor, it builds the Formula that defines the relationships of the model
	private Formula declaration(){
		final List<Formula> decls = new ArrayList<Formula>();
		//declare the model

		//constraints for _Integer

		//constraints for _String

		//constraints for _CatalogueCore
		//_CatalogueCore is not instanceable, so any instance must be a sub element
		final Variable sub1 = Variable.unary("sub1");
		decls.add( sub1.in(_DataAnnotation).or( sub1.in(_DataModel) ).or( sub1.in(_DataConcept) ).forAll(sub1.oneOf(_CatalogueCore)) );


		//constraints for _DataConcept
		//_DataConcept is a kind of _CatalogueCore
		decls.add( _DataConcept.in( _CatalogueCore ) );
		//_DataConcept must be disjoint from the sibling _DataAnnotation
		decls.add( _DataConcept.intersection(_DataAnnotation).no() );
		//_DataConcept must be disjoint from the sibling _DataModel
		decls.add( _DataConcept.intersection(_DataModel).no() );
		//_DataConcept is not instanceable, so any instance must be a sub element
		final Variable sub2 = Variable.unary("sub2");
		decls.add( sub2.in(_DataAssociation).or( sub2.in(_DataSection) ).or( sub2.in(_DataClass) ).or( sub2.in(_Type) ).or( sub2.in(_DataElement) ).or( sub2.in(_ValueDomain) ).or( sub2.in(_MeasurementUnit) ).forAll(sub2.oneOf(_DataConcept)) );


		//constraints for _Type
		//_Type is a kind of _DataConcept
		decls.add( _Type.in( _DataConcept ) );
		//_Type must be disjoint from the sibling _DataAssociation
		decls.add( _Type.intersection(_DataAssociation).no() );
		//_Type must be disjoint from the sibling _DataSection
		decls.add( _Type.intersection(_DataSection).no() );
		//_Type must be disjoint from the sibling _DataClass
		decls.add( _Type.intersection(_DataClass).no() );
		//_Type must be disjoint from the sibling _DataElement
		decls.add( _Type.intersection(_DataElement).no() );
		//_Type must be disjoint from the sibling _ValueDomain
		decls.add( _Type.intersection(_ValueDomain).no() );
		//_Type must be disjoint from the sibling _MeasurementUnit
		decls.add( _Type.intersection(_MeasurementUnit).no() );
		//_Type is not instanceable, so any instance must be a sub element
		final Variable sub3 = Variable.unary("sub3");
		decls.add( sub3.in(_PrimitiveType).or( sub3.in(_Enumeration) ).forAll(sub3.oneOf(_Type)) );


		//constraints for _DataAnnotation_type
		//_DataAnnotation_type is a kind of _Integer
		decls.add( _DataAnnotation_type.in( _Integer ) );
		//_DataAnnotation_type must be disjoint from the sibling _DataAssociation_direction
		decls.add( _DataAnnotation_type.intersection(_DataAssociation_direction).no() );
		//_DataAnnotation_type must be disjoint from the sibling _EnumLiteral_value
		decls.add( _DataAnnotation_type.intersection(_EnumLiteral_value).no() );

		//constraints for _DataAnnotation_content
		//_DataAnnotation_content is a kind of _String
		decls.add( _DataAnnotation_content.in( _String ) );
		//_DataAnnotation_content must be disjoint from the sibling _DataAnnotation_languageURI
		decls.add( _DataAnnotation_content.intersection(_DataAnnotation_languageURI).no() );
		//_DataAnnotation_content must be disjoint from the sibling _DataAssociation_inRoleName
		decls.add( _DataAnnotation_content.intersection(_DataAssociation_inRoleName).no() );
		//_DataAnnotation_content must be disjoint from the sibling _DataAssociation_outRoleName
		decls.add( _DataAnnotation_content.intersection(_DataAssociation_outRoleName).no() );
		//_DataAnnotation_content must be disjoint from the sibling _DataAssociation_multiplicity
		decls.add( _DataAnnotation_content.intersection(_DataAssociation_multiplicity).no() );
		//_DataAnnotation_content must be disjoint from the sibling _EnumLiteral_key
		decls.add( _DataAnnotation_content.intersection(_EnumLiteral_key).no() );
		//_DataAnnotation_content must be disjoint from the sibling _CatalogueCore_name
		decls.add( _DataAnnotation_content.intersection(_CatalogueCore_name).no() );

		//constraints for _DataAnnotation_languageURI
		//_DataAnnotation_languageURI is a kind of _String
		decls.add( _DataAnnotation_languageURI.in( _String ) );
		//_DataAnnotation_languageURI must be disjoint from the sibling _DataAnnotation_content
		decls.add( _DataAnnotation_languageURI.intersection(_DataAnnotation_content).no() );
		//_DataAnnotation_languageURI must be disjoint from the sibling _DataAssociation_inRoleName
		decls.add( _DataAnnotation_languageURI.intersection(_DataAssociation_inRoleName).no() );
		//_DataAnnotation_languageURI must be disjoint from the sibling _DataAssociation_outRoleName
		decls.add( _DataAnnotation_languageURI.intersection(_DataAssociation_outRoleName).no() );
		//_DataAnnotation_languageURI must be disjoint from the sibling _DataAssociation_multiplicity
		decls.add( _DataAnnotation_languageURI.intersection(_DataAssociation_multiplicity).no() );
		//_DataAnnotation_languageURI must be disjoint from the sibling _EnumLiteral_key
		decls.add( _DataAnnotation_languageURI.intersection(_EnumLiteral_key).no() );
		//_DataAnnotation_languageURI must be disjoint from the sibling _CatalogueCore_name
		decls.add( _DataAnnotation_languageURI.intersection(_CatalogueCore_name).no() );

		//constraints for _DataAssociation_inRoleName
		//_DataAssociation_inRoleName is a kind of _String
		decls.add( _DataAssociation_inRoleName.in( _String ) );
		//_DataAssociation_inRoleName must be disjoint from the sibling _DataAnnotation_content
		decls.add( _DataAssociation_inRoleName.intersection(_DataAnnotation_content).no() );
		//_DataAssociation_inRoleName must be disjoint from the sibling _DataAnnotation_languageURI
		decls.add( _DataAssociation_inRoleName.intersection(_DataAnnotation_languageURI).no() );
		//_DataAssociation_inRoleName must be disjoint from the sibling _DataAssociation_outRoleName
		decls.add( _DataAssociation_inRoleName.intersection(_DataAssociation_outRoleName).no() );
		//_DataAssociation_inRoleName must be disjoint from the sibling _DataAssociation_multiplicity
		decls.add( _DataAssociation_inRoleName.intersection(_DataAssociation_multiplicity).no() );
		//_DataAssociation_inRoleName must be disjoint from the sibling _EnumLiteral_key
		decls.add( _DataAssociation_inRoleName.intersection(_EnumLiteral_key).no() );
		//_DataAssociation_inRoleName must be disjoint from the sibling _CatalogueCore_name
		decls.add( _DataAssociation_inRoleName.intersection(_CatalogueCore_name).no() );

		//constraints for _DataAssociation_outRoleName
		//_DataAssociation_outRoleName is a kind of _String
		decls.add( _DataAssociation_outRoleName.in( _String ) );
		//_DataAssociation_outRoleName must be disjoint from the sibling _DataAnnotation_content
		decls.add( _DataAssociation_outRoleName.intersection(_DataAnnotation_content).no() );
		//_DataAssociation_outRoleName must be disjoint from the sibling _DataAnnotation_languageURI
		decls.add( _DataAssociation_outRoleName.intersection(_DataAnnotation_languageURI).no() );
		//_DataAssociation_outRoleName must be disjoint from the sibling _DataAssociation_inRoleName
		decls.add( _DataAssociation_outRoleName.intersection(_DataAssociation_inRoleName).no() );
		//_DataAssociation_outRoleName must be disjoint from the sibling _DataAssociation_multiplicity
		decls.add( _DataAssociation_outRoleName.intersection(_DataAssociation_multiplicity).no() );
		//_DataAssociation_outRoleName must be disjoint from the sibling _EnumLiteral_key
		decls.add( _DataAssociation_outRoleName.intersection(_EnumLiteral_key).no() );
		//_DataAssociation_outRoleName must be disjoint from the sibling _CatalogueCore_name
		decls.add( _DataAssociation_outRoleName.intersection(_CatalogueCore_name).no() );

		//constraints for _DataAssociation_direction
		//_DataAssociation_direction is a kind of _Integer
		decls.add( _DataAssociation_direction.in( _Integer ) );
		//_DataAssociation_direction must be disjoint from the sibling _DataAnnotation_type
		decls.add( _DataAssociation_direction.intersection(_DataAnnotation_type).no() );
		//_DataAssociation_direction must be disjoint from the sibling _EnumLiteral_value
		decls.add( _DataAssociation_direction.intersection(_EnumLiteral_value).no() );

		//constraints for _DataAssociation_multiplicity
		//_DataAssociation_multiplicity is a kind of _String
		decls.add( _DataAssociation_multiplicity.in( _String ) );
		//_DataAssociation_multiplicity must be disjoint from the sibling _DataAnnotation_content
		decls.add( _DataAssociation_multiplicity.intersection(_DataAnnotation_content).no() );
		//_DataAssociation_multiplicity must be disjoint from the sibling _DataAnnotation_languageURI
		decls.add( _DataAssociation_multiplicity.intersection(_DataAnnotation_languageURI).no() );
		//_DataAssociation_multiplicity must be disjoint from the sibling _DataAssociation_inRoleName
		decls.add( _DataAssociation_multiplicity.intersection(_DataAssociation_inRoleName).no() );
		//_DataAssociation_multiplicity must be disjoint from the sibling _DataAssociation_outRoleName
		decls.add( _DataAssociation_multiplicity.intersection(_DataAssociation_outRoleName).no() );
		//_DataAssociation_multiplicity must be disjoint from the sibling _EnumLiteral_key
		decls.add( _DataAssociation_multiplicity.intersection(_EnumLiteral_key).no() );
		//_DataAssociation_multiplicity must be disjoint from the sibling _CatalogueCore_name
		decls.add( _DataAssociation_multiplicity.intersection(_CatalogueCore_name).no() );

		//constraints for _EnumLiteral_key
		//_EnumLiteral_key is a kind of _String
		decls.add( _EnumLiteral_key.in( _String ) );
		//_EnumLiteral_key must be disjoint from the sibling _DataAnnotation_content
		decls.add( _EnumLiteral_key.intersection(_DataAnnotation_content).no() );
		//_EnumLiteral_key must be disjoint from the sibling _DataAnnotation_languageURI
		decls.add( _EnumLiteral_key.intersection(_DataAnnotation_languageURI).no() );
		//_EnumLiteral_key must be disjoint from the sibling _DataAssociation_inRoleName
		decls.add( _EnumLiteral_key.intersection(_DataAssociation_inRoleName).no() );
		//_EnumLiteral_key must be disjoint from the sibling _DataAssociation_outRoleName
		decls.add( _EnumLiteral_key.intersection(_DataAssociation_outRoleName).no() );
		//_EnumLiteral_key must be disjoint from the sibling _DataAssociation_multiplicity
		decls.add( _EnumLiteral_key.intersection(_DataAssociation_multiplicity).no() );
		//_EnumLiteral_key must be disjoint from the sibling _CatalogueCore_name
		decls.add( _EnumLiteral_key.intersection(_CatalogueCore_name).no() );

		//constraints for _EnumLiteral_value
		//_EnumLiteral_value is a kind of _Integer
		decls.add( _EnumLiteral_value.in( _Integer ) );
		//_EnumLiteral_value must be disjoint from the sibling _DataAnnotation_type
		decls.add( _EnumLiteral_value.intersection(_DataAnnotation_type).no() );
		//_EnumLiteral_value must be disjoint from the sibling _DataAssociation_direction
		decls.add( _EnumLiteral_value.intersection(_DataAssociation_direction).no() );

		//constraints for _CatalogueCore_name
		//_CatalogueCore_name is a kind of _String
		decls.add( _CatalogueCore_name.in( _String ) );
		//_CatalogueCore_name must be disjoint from the sibling _DataAnnotation_content
		decls.add( _CatalogueCore_name.intersection(_DataAnnotation_content).no() );
		//_CatalogueCore_name must be disjoint from the sibling _DataAnnotation_languageURI
		decls.add( _CatalogueCore_name.intersection(_DataAnnotation_languageURI).no() );
		//_CatalogueCore_name must be disjoint from the sibling _DataAssociation_inRoleName
		decls.add( _CatalogueCore_name.intersection(_DataAssociation_inRoleName).no() );
		//_CatalogueCore_name must be disjoint from the sibling _DataAssociation_outRoleName
		decls.add( _CatalogueCore_name.intersection(_DataAssociation_outRoleName).no() );
		//_CatalogueCore_name must be disjoint from the sibling _DataAssociation_multiplicity
		decls.add( _CatalogueCore_name.intersection(_DataAssociation_multiplicity).no() );
		//_CatalogueCore_name must be disjoint from the sibling _EnumLiteral_key
		decls.add( _CatalogueCore_name.intersection(_EnumLiteral_key).no() );

		//constraints for _DataAnnotation
		//_DataAnnotation is a kind of _CatalogueCore
		decls.add( _DataAnnotation.in( _CatalogueCore ) );
		//_DataAnnotation must be disjoint from the sibling _DataModel
		decls.add( _DataAnnotation.intersection(_DataModel).no() );
		//_DataAnnotation must be disjoint from the sibling _DataConcept
		decls.add( _DataAnnotation.intersection(_DataConcept).no() );

		//constraints for _DataAssociation
		//_DataAssociation is a kind of _DataConcept
		decls.add( _DataAssociation.in( _DataConcept ) );
		//_DataAssociation must be disjoint from the sibling _DataSection
		decls.add( _DataAssociation.intersection(_DataSection).no() );
		//_DataAssociation must be disjoint from the sibling _DataClass
		decls.add( _DataAssociation.intersection(_DataClass).no() );
		//_DataAssociation must be disjoint from the sibling _Type
		decls.add( _DataAssociation.intersection(_Type).no() );
		//_DataAssociation must be disjoint from the sibling _DataElement
		decls.add( _DataAssociation.intersection(_DataElement).no() );
		//_DataAssociation must be disjoint from the sibling _ValueDomain
		decls.add( _DataAssociation.intersection(_ValueDomain).no() );
		//_DataAssociation must be disjoint from the sibling _MeasurementUnit
		decls.add( _DataAssociation.intersection(_MeasurementUnit).no() );

		//constraints for _DataModel
		//_DataModel is a kind of _CatalogueCore
		decls.add( _DataModel.in( _CatalogueCore ) );
		//_DataModel must be disjoint from the sibling _DataAnnotation
		decls.add( _DataModel.intersection(_DataAnnotation).no() );
		//_DataModel must be disjoint from the sibling _DataConcept
		decls.add( _DataModel.intersection(_DataConcept).no() );

		//constraints for _DataSection
		//_DataSection is a kind of _DataConcept
		decls.add( _DataSection.in( _DataConcept ) );
		//_DataSection must be disjoint from the sibling _DataAssociation
		decls.add( _DataSection.intersection(_DataAssociation).no() );
		//_DataSection must be disjoint from the sibling _DataClass
		decls.add( _DataSection.intersection(_DataClass).no() );
		//_DataSection must be disjoint from the sibling _Type
		decls.add( _DataSection.intersection(_Type).no() );
		//_DataSection must be disjoint from the sibling _DataElement
		decls.add( _DataSection.intersection(_DataElement).no() );
		//_DataSection must be disjoint from the sibling _ValueDomain
		decls.add( _DataSection.intersection(_ValueDomain).no() );
		//_DataSection must be disjoint from the sibling _MeasurementUnit
		decls.add( _DataSection.intersection(_MeasurementUnit).no() );

		//constraints for _DataClass
		//_DataClass is a kind of _DataConcept
		decls.add( _DataClass.in( _DataConcept ) );
		//_DataClass must be disjoint from the sibling _DataAssociation
		decls.add( _DataClass.intersection(_DataAssociation).no() );
		//_DataClass must be disjoint from the sibling _DataSection
		decls.add( _DataClass.intersection(_DataSection).no() );
		//_DataClass must be disjoint from the sibling _Type
		decls.add( _DataClass.intersection(_Type).no() );
		//_DataClass must be disjoint from the sibling _DataElement
		decls.add( _DataClass.intersection(_DataElement).no() );
		//_DataClass must be disjoint from the sibling _ValueDomain
		decls.add( _DataClass.intersection(_ValueDomain).no() );
		//_DataClass must be disjoint from the sibling _MeasurementUnit
		decls.add( _DataClass.intersection(_MeasurementUnit).no() );

		//constraints for _DataElement
		//_DataElement is a kind of _DataConcept
		decls.add( _DataElement.in( _DataConcept ) );
		//_DataElement must be disjoint from the sibling _DataAssociation
		decls.add( _DataElement.intersection(_DataAssociation).no() );
		//_DataElement must be disjoint from the sibling _DataSection
		decls.add( _DataElement.intersection(_DataSection).no() );
		//_DataElement must be disjoint from the sibling _DataClass
		decls.add( _DataElement.intersection(_DataClass).no() );
		//_DataElement must be disjoint from the sibling _Type
		decls.add( _DataElement.intersection(_Type).no() );
		//_DataElement must be disjoint from the sibling _ValueDomain
		decls.add( _DataElement.intersection(_ValueDomain).no() );
		//_DataElement must be disjoint from the sibling _MeasurementUnit
		decls.add( _DataElement.intersection(_MeasurementUnit).no() );

		//constraints for _ValueDomain
		//_ValueDomain is a kind of _DataConcept
		decls.add( _ValueDomain.in( _DataConcept ) );
		//_ValueDomain must be disjoint from the sibling _DataAssociation
		decls.add( _ValueDomain.intersection(_DataAssociation).no() );
		//_ValueDomain must be disjoint from the sibling _DataSection
		decls.add( _ValueDomain.intersection(_DataSection).no() );
		//_ValueDomain must be disjoint from the sibling _DataClass
		decls.add( _ValueDomain.intersection(_DataClass).no() );
		//_ValueDomain must be disjoint from the sibling _Type
		decls.add( _ValueDomain.intersection(_Type).no() );
		//_ValueDomain must be disjoint from the sibling _DataElement
		decls.add( _ValueDomain.intersection(_DataElement).no() );
		//_ValueDomain must be disjoint from the sibling _MeasurementUnit
		decls.add( _ValueDomain.intersection(_MeasurementUnit).no() );

		//constraints for _PrimitiveType
		//_PrimitiveType is a kind of _Type
		decls.add( _PrimitiveType.in( _Type ) );
		//_PrimitiveType must be disjoint from the sibling _Enumeration
		decls.add( _PrimitiveType.intersection(_Enumeration).no() );

		//constraints for _MeasurementUnit
		//_MeasurementUnit is a kind of _DataConcept
		decls.add( _MeasurementUnit.in( _DataConcept ) );
		//_MeasurementUnit must be disjoint from the sibling _DataAssociation
		decls.add( _MeasurementUnit.intersection(_DataAssociation).no() );
		//_MeasurementUnit must be disjoint from the sibling _DataSection
		decls.add( _MeasurementUnit.intersection(_DataSection).no() );
		//_MeasurementUnit must be disjoint from the sibling _DataClass
		decls.add( _MeasurementUnit.intersection(_DataClass).no() );
		//_MeasurementUnit must be disjoint from the sibling _Type
		decls.add( _MeasurementUnit.intersection(_Type).no() );
		//_MeasurementUnit must be disjoint from the sibling _DataElement
		decls.add( _MeasurementUnit.intersection(_DataElement).no() );
		//_MeasurementUnit must be disjoint from the sibling _ValueDomain
		decls.add( _MeasurementUnit.intersection(_ValueDomain).no() );

		//constraints for _Enumeration
		//_Enumeration is a kind of _Type
		decls.add( _Enumeration.in( _Type ) );
		//_Enumeration must be disjoint from the sibling _PrimitiveType
		decls.add( _Enumeration.intersection(_PrimitiveType).no() );

		//constraints for _EnumLiteral

		//constraints for _type_DataAnnotation_to_DataAnnotation_type
		//decare the binary relation AB as a partialfunction of A B
		//declare the multiplicity contraints of the relation _type_DataAnnotation_to_DataAnnotation_type
		decls.add (_type_DataAnnotation_to_DataAnnotation_type.partialFunction(_DataAnnotation , _DataAnnotation_type));

		//for every A A.AB is a B
		final Variable _type_dataannotation_to_dataannotation_type_type4 = Variable.unary("_type_dataannotation_to_dataannotation_type_type4");
		decls.add ( _type_dataannotation_to_dataannotation_type_type4.join(_type_DataAnnotation_to_DataAnnotation_type).in(_DataAnnotation_type).forAll(_type_dataannotation_to_dataannotation_type_type4.oneOf(_DataAnnotation)) );


		//constraints for _content_DataAnnotation_to_DataAnnotation_content
		//decare the binary relation AB as a partialfunction of A B
		//declare the multiplicity contraints of the relation _content_DataAnnotation_to_DataAnnotation_content
		decls.add (_content_DataAnnotation_to_DataAnnotation_content.partialFunction(_DataAnnotation , _DataAnnotation_content));

		//for every A A.AB is a B
		final Variable _content_dataannotation_to_dataannotation_content_type5 = Variable.unary("_content_dataannotation_to_dataannotation_content_type5");
		decls.add ( _content_dataannotation_to_dataannotation_content_type5.join(_content_DataAnnotation_to_DataAnnotation_content).in(_DataAnnotation_content).forAll(_content_dataannotation_to_dataannotation_content_type5.oneOf(_DataAnnotation)) );


		//constraints for _languageURI_DataAnnotation_to_DataAnnotation_languageURI
		//decare the binary relation AB as a partialfunction of A B
		//declare the multiplicity contraints of the relation _languageURI_DataAnnotation_to_DataAnnotation_languageURI
		decls.add (_languageURI_DataAnnotation_to_DataAnnotation_languageURI.partialFunction(_DataAnnotation , _DataAnnotation_languageURI));

		//for every A A.AB is a B
		final Variable _languageuri_dataannotation_to_dataannotation_languageuri_type6 = Variable.unary("_languageuri_dataannotation_to_dataannotation_languageuri_type6");
		decls.add ( _languageuri_dataannotation_to_dataannotation_languageuri_type6.join(_languageURI_DataAnnotation_to_DataAnnotation_languageURI).in(_DataAnnotation_languageURI).forAll(_languageuri_dataannotation_to_dataannotation_languageuri_type6.oneOf(_DataAnnotation)) );


		//constraints for _to_DataAssociation_to_DataAssociation_to
		//declare the binary relation AB as a function of A B
		//declare the multiplicity contraints of the binary relation _to_DataAssociation_to_DataAssociation_to
		decls.add (_to_DataAssociation_to_DataAssociation_to.function(_DataAssociation , _CatalogueCore ));

		//for every A there is one AB and A.AB is a B 
		final Variable _to_dataassociation_to_dataassociation_to_type7 = Variable.unary("_to_dataassociation_to_dataassociation_to_type7");
		decls.add ( _to_dataassociation_to_dataassociation_to_type7.join( _to_DataAssociation_to_DataAssociation_to ).one().and( _to_dataassociation_to_dataassociation_to_type7.join(_to_DataAssociation_to_DataAssociation_to).in(_CatalogueCore ) ).forAll(_to_dataassociation_to_dataassociation_to_type7.oneOf(_DataAssociation)) );


		//constraints for _from_DataAssociation_to_DataAssociation_from
		//declare the binary relation AB as a function of A B
		//declare the multiplicity contraints of the binary relation _from_DataAssociation_to_DataAssociation_from
		decls.add (_from_DataAssociation_to_DataAssociation_from.function(_DataAssociation , _CatalogueCore ));

		//for every A there is one AB and A.AB is a B 
		final Variable _from_dataassociation_to_dataassociation_from_type8 = Variable.unary("_from_dataassociation_to_dataassociation_from_type8");
		decls.add ( _from_dataassociation_to_dataassociation_from_type8.join( _from_DataAssociation_to_DataAssociation_from ).one().and( _from_dataassociation_to_dataassociation_from_type8.join(_from_DataAssociation_to_DataAssociation_from).in(_CatalogueCore ) ).forAll(_from_dataassociation_to_dataassociation_from_type8.oneOf(_DataAssociation)) );


		//constraints for _inRoleName_DataAssociation_to_DataAssociation_inRoleName
		//decare the binary relation AB as a partialfunction of A B
		//declare the multiplicity contraints of the relation _inRoleName_DataAssociation_to_DataAssociation_inRoleName
		decls.add (_inRoleName_DataAssociation_to_DataAssociation_inRoleName.partialFunction(_DataAssociation , _DataAssociation_inRoleName));

		//for every A A.AB is a B
		final Variable _inrolename_dataassociation_to_dataassociation_inrolename_type9 = Variable.unary("_inrolename_dataassociation_to_dataassociation_inrolename_type9");
		decls.add ( _inrolename_dataassociation_to_dataassociation_inrolename_type9.join(_inRoleName_DataAssociation_to_DataAssociation_inRoleName).in(_DataAssociation_inRoleName).forAll(_inrolename_dataassociation_to_dataassociation_inrolename_type9.oneOf(_DataAssociation)) );


		//constraints for _outRoleName_DataAssociation_to_DataAssociation_outRoleName
		//decare the binary relation AB as a partialfunction of A B
		//declare the multiplicity contraints of the relation _outRoleName_DataAssociation_to_DataAssociation_outRoleName
		decls.add (_outRoleName_DataAssociation_to_DataAssociation_outRoleName.partialFunction(_DataAssociation , _DataAssociation_outRoleName));

		//for every A A.AB is a B
		final Variable _outrolename_dataassociation_to_dataassociation_outrolename_type10 = Variable.unary("_outrolename_dataassociation_to_dataassociation_outrolename_type10");
		decls.add ( _outrolename_dataassociation_to_dataassociation_outrolename_type10.join(_outRoleName_DataAssociation_to_DataAssociation_outRoleName).in(_DataAssociation_outRoleName).forAll(_outrolename_dataassociation_to_dataassociation_outrolename_type10.oneOf(_DataAssociation)) );


		//constraints for _direction_DataAssociation_to_DataAssociation_direction
		//decare the binary relation AB as a partialfunction of A B
		//declare the multiplicity contraints of the relation _direction_DataAssociation_to_DataAssociation_direction
		decls.add (_direction_DataAssociation_to_DataAssociation_direction.partialFunction(_DataAssociation , _DataAssociation_direction));

		//for every A A.AB is a B
		final Variable _direction_dataassociation_to_dataassociation_direction_type11 = Variable.unary("_direction_dataassociation_to_dataassociation_direction_type11");
		decls.add ( _direction_dataassociation_to_dataassociation_direction_type11.join(_direction_DataAssociation_to_DataAssociation_direction).in(_DataAssociation_direction).forAll(_direction_dataassociation_to_dataassociation_direction_type11.oneOf(_DataAssociation)) );


		//constraints for _multiplicity_DataAssociation_to_DataAssociation_multiplicity
		//decare the binary relation AB as a partialfunction of A B
		//declare the multiplicity contraints of the relation _multiplicity_DataAssociation_to_DataAssociation_multiplicity
		decls.add (_multiplicity_DataAssociation_to_DataAssociation_multiplicity.partialFunction(_DataAssociation , _DataAssociation_multiplicity));

		//for every A A.AB is a B
		final Variable _multiplicity_dataassociation_to_dataassociation_multiplicity_type12 = Variable.unary("_multiplicity_dataassociation_to_dataassociation_multiplicity_type12");
		decls.add ( _multiplicity_dataassociation_to_dataassociation_multiplicity_type12.join(_multiplicity_DataAssociation_to_DataAssociation_multiplicity).in(_DataAssociation_multiplicity).forAll(_multiplicity_dataassociation_to_dataassociation_multiplicity_type12.oneOf(_DataAssociation)) );


		//constraints for _conceptualDomain_ValueDomain_to_ValueDomain_conceptualDomain
		//declare the multiplicity contraints of the relation
		decls.add (_conceptualDomain_ValueDomain_to_ValueDomain_conceptualDomain.in( _ValueDomain.product(_DataConcept) ) );

		//for every A  A.AB is a B
		final Variable _conceptualdomain_valuedomain_to_valuedomain_conceptualdomain_type13 = Variable.unary("_conceptualdomain_valuedomain_to_valuedomain_conceptualdomain_type13");
		decls.add ( _conceptualdomain_valuedomain_to_valuedomain_conceptualdomain_type13.join(_conceptualDomain_ValueDomain_to_ValueDomain_conceptualDomain).in(_DataConcept).forAll(_conceptualdomain_valuedomain_to_valuedomain_conceptualdomain_type13.oneOf(_ValueDomain)) );


		//constraints for _enumLiteralType_EnumLiteral_to_EnumLiteral_enumLiteralType
		//declare the binary relation AB as a function of A B
		//declare the multiplicity contraints of the binary relation _enumLiteralType_EnumLiteral_to_EnumLiteral_enumLiteralType
		decls.add (_enumLiteralType_EnumLiteral_to_EnumLiteral_enumLiteralType.function(_EnumLiteral , _PrimitiveType ));

		//for every A there is one AB and A.AB is a B 
		final Variable _enumliteraltype_enumliteral_to_enumliteral_enumliteraltype_type14 = Variable.unary("_enumliteraltype_enumliteral_to_enumliteral_enumliteraltype_type14");
		decls.add ( _enumliteraltype_enumliteral_to_enumliteral_enumliteraltype_type14.join( _enumLiteralType_EnumLiteral_to_EnumLiteral_enumLiteralType ).one().and( _enumliteraltype_enumliteral_to_enumliteral_enumliteraltype_type14.join(_enumLiteralType_EnumLiteral_to_EnumLiteral_enumLiteralType).in(_PrimitiveType ) ).forAll(_enumliteraltype_enumliteral_to_enumliteral_enumliteraltype_type14.oneOf(_EnumLiteral)) );


		//constraints for _key_EnumLiteral_to_EnumLiteral_key
		//decare the binary relation AB as a partialfunction of A B
		//declare the multiplicity contraints of the relation _key_EnumLiteral_to_EnumLiteral_key
		decls.add (_key_EnumLiteral_to_EnumLiteral_key.partialFunction(_EnumLiteral , _EnumLiteral_key));

		//for every A A.AB is a B
		final Variable _key_enumliteral_to_enumliteral_key_type15 = Variable.unary("_key_enumliteral_to_enumliteral_key_type15");
		decls.add ( _key_enumliteral_to_enumliteral_key_type15.join(_key_EnumLiteral_to_EnumLiteral_key).in(_EnumLiteral_key).forAll(_key_enumliteral_to_enumliteral_key_type15.oneOf(_EnumLiteral)) );


		//constraints for _value_EnumLiteral_to_EnumLiteral_value
		//decare the binary relation AB as a partialfunction of A B
		//declare the multiplicity contraints of the relation _value_EnumLiteral_to_EnumLiteral_value
		decls.add (_value_EnumLiteral_to_EnumLiteral_value.partialFunction(_EnumLiteral , _EnumLiteral_value));

		//for every A A.AB is a B
		final Variable _value_enumliteral_to_enumliteral_value_type16 = Variable.unary("_value_enumliteral_to_enumliteral_value_type16");
		decls.add ( _value_enumliteral_to_enumliteral_value_type16.join(_value_EnumLiteral_to_EnumLiteral_value).in(_EnumLiteral_value).forAll(_value_enumliteral_to_enumliteral_value_type16.oneOf(_EnumLiteral)) );


		//constraints for _has_Enumeration_to_Enumeration_has
		//declare the multiplicity contraints of the relation
		decls.add (_has_Enumeration_to_Enumeration_has.in( _Enumeration.product(_EnumLiteral) ) );

		//for every A there is one or more (some) AB and A.AB is a B
		final Variable _has_enumeration_to_enumeration_has_type17 = Variable.unary("_has_enumeration_to_enumeration_has_type17");
		decls.add ( _has_enumeration_to_enumeration_has_type17.join(_has_Enumeration_to_Enumeration_has).some().and( _has_enumeration_to_enumeration_has_type17.join(_has_Enumeration_to_Enumeration_has).in(_EnumLiteral) ).forAll(_has_enumeration_to_enumeration_has_type17.oneOf(_Enumeration)) );

		//this binary relation is containment
		//the B may only exist if there is an A and an AB
		//TODO: create decls.add ( );

		//constraints for _hasA_DataElement_to_DataElement_hasA
		//declare the binary relation AB as a function of A B
		//declare the multiplicity contraints of the binary relation _hasA_DataElement_to_DataElement_hasA
		decls.add (_hasA_DataElement_to_DataElement_hasA.function(_DataElement , _ValueDomain ));

		//for every A there is one AB and A.AB is a B 
		final Variable _hasa_dataelement_to_dataelement_hasa_type18 = Variable.unary("_hasa_dataelement_to_dataelement_hasa_type18");
		decls.add ( _hasa_dataelement_to_dataelement_hasa_type18.join( _hasA_DataElement_to_DataElement_hasA ).one().and( _hasa_dataelement_to_dataelement_hasa_type18.join(_hasA_DataElement_to_DataElement_hasA).in(_ValueDomain ) ).forAll(_hasa_dataelement_to_dataelement_hasa_type18.oneOf(_DataElement)) );


		//constraints for _mayHave_DataElement_to_DataElement_mayHave
		//decare the binary relation AB as a partialfunction of A B
		//declare the multiplicity contraints of the relation _mayHave_DataElement_to_DataElement_mayHave
		decls.add (_mayHave_DataElement_to_DataElement_mayHave.partialFunction(_DataElement , _MeasurementUnit));

		//for every A A.AB is a B
		final Variable _mayhave_dataelement_to_dataelement_mayhave_type19 = Variable.unary("_mayhave_dataelement_to_dataelement_mayhave_type19");
		decls.add ( _mayhave_dataelement_to_dataelement_mayhave_type19.join(_mayHave_DataElement_to_DataElement_mayHave).in(_MeasurementUnit).forAll(_mayhave_dataelement_to_dataelement_mayhave_type19.oneOf(_DataElement)) );


		//constraints for _has_DataElement_to_DataElement_has
		//declare the binary relation AB as a function of A B
		//declare the multiplicity contraints of the binary relation _has_DataElement_to_DataElement_has
		decls.add (_has_DataElement_to_DataElement_has.function(_DataElement , _Type ));

		//for every A there is one AB and A.AB is a B 
		final Variable _has_dataelement_to_dataelement_has_type20 = Variable.unary("_has_dataelement_to_dataelement_has_type20");
		decls.add ( _has_dataelement_to_dataelement_has_type20.join( _has_DataElement_to_DataElement_has ).one().and( _has_dataelement_to_dataelement_has_type20.join(_has_DataElement_to_DataElement_has).in(_Type ) ).forAll(_has_dataelement_to_dataelement_has_type20.oneOf(_DataElement)) );


		//constraints for _classifies_DataClass_to_DataClass_classifies
		//declare the multiplicity contraints of the relation
		decls.add (_classifies_DataClass_to_DataClass_classifies.in( _DataClass.product(_DataElement) ) );

		//for every A  A.AB is a B
		final Variable _classifies_dataclass_to_dataclass_classifies_type21 = Variable.unary("_classifies_dataclass_to_dataclass_classifies_type21");
		decls.add ( _classifies_dataclass_to_dataclass_classifies_type21.join(_classifies_DataClass_to_DataClass_classifies).in(_DataElement).forAll(_classifies_dataclass_to_dataclass_classifies_type21.oneOf(_DataClass)) );


		//constraints for _groups_DataSection_to_DataSection_groups
		//declare the multiplicity contraints of the relation
		decls.add (_groups_DataSection_to_DataSection_groups.in( _DataSection.product(_DataClass) ) );

		//for every A  A.AB is a B
		final Variable _groups_datasection_to_datasection_groups_type22 = Variable.unary("_groups_datasection_to_datasection_groups_type22");
		decls.add ( _groups_datasection_to_datasection_groups_type22.join(_groups_DataSection_to_DataSection_groups).in(_DataClass).forAll(_groups_datasection_to_datasection_groups_type22.oneOf(_DataSection)) );


		//constraints for _clones_DataConcept_to_DataConcept_clones
		//declare the multiplicity contraints of the relation
		decls.add (_clones_DataConcept_to_DataConcept_clones.in( _DataConcept.product(_DataConcept) ) );

		//for every A  A.AB is a B
		final Variable _clones_dataconcept_to_dataconcept_clones_type23 = Variable.unary("_clones_dataconcept_to_dataconcept_clones_type23");
		decls.add ( _clones_dataconcept_to_dataconcept_clones_type23.join(_clones_DataConcept_to_DataConcept_clones).in(_DataConcept).forAll(_clones_dataconcept_to_dataconcept_clones_type23.oneOf(_DataConcept)) );


		//constraints for _owns_DataModel_to_DataModel_owns
		//declare the multiplicity contraints of the relation
		decls.add (_owns_DataModel_to_DataModel_owns.in( _DataModel.product(_DataConcept) ) );

		//for every A there is one or more (some) AB and A.AB is a B
		final Variable _owns_datamodel_to_datamodel_owns_type24 = Variable.unary("_owns_datamodel_to_datamodel_owns_type24");
		decls.add ( _owns_datamodel_to_datamodel_owns_type24.join(_owns_DataModel_to_DataModel_owns).some().and( _owns_datamodel_to_datamodel_owns_type24.join(_owns_DataModel_to_DataModel_owns).in(_DataConcept) ).forAll(_owns_datamodel_to_datamodel_owns_type24.oneOf(_DataModel)) );

		//this binary relation is containment
		//the B may only exist if there is an A and an AB
		//TODO: create decls.add ( );

		//constraints for _imports_DataModel_to_DataModel_imports
		//declare the multiplicity contraints of the relation
		decls.add (_imports_DataModel_to_DataModel_imports.in( _DataModel.product(_DataConcept) ) );

		//for every A  A.AB is a B
		final Variable _imports_datamodel_to_datamodel_imports_type25 = Variable.unary("_imports_datamodel_to_datamodel_imports_type25");
		decls.add ( _imports_datamodel_to_datamodel_imports_type25.join(_imports_DataModel_to_DataModel_imports).in(_DataConcept).forAll(_imports_datamodel_to_datamodel_imports_type25.oneOf(_DataModel)) );


		//constraints for _notesThat_CatalogueCore_to_CatalogueCore_notesThat
		//declare the multiplicity contraints of the relation
		decls.add (_notesThat_CatalogueCore_to_CatalogueCore_notesThat.in( _CatalogueCore.product(_DataAnnotation) ) );

		//for every A  A.AB is a B
		final Variable _notesthat_cataloguecore_to_cataloguecore_notesthat_type26 = Variable.unary("_notesthat_cataloguecore_to_cataloguecore_notesthat_type26");
		decls.add ( _notesthat_cataloguecore_to_cataloguecore_notesthat_type26.join(_notesThat_CatalogueCore_to_CatalogueCore_notesThat).in(_DataAnnotation).forAll(_notesthat_cataloguecore_to_cataloguecore_notesthat_type26.oneOf(_CatalogueCore)) );

		//this binary relation is containment
		//the B may only exist if there is an A and an AB
		//TODO: create decls.add ( );

		//constraints for _name_CatalogueCore_to_CatalogueCore_name
		//decare the binary relation AB as a partialfunction of A B
		//declare the multiplicity contraints of the relation _name_CatalogueCore_to_CatalogueCore_name
		decls.add (_name_CatalogueCore_to_CatalogueCore_name.partialFunction(_CatalogueCore , _CatalogueCore_name));

		//for every A A.AB is a B
		final Variable _name_cataloguecore_to_cataloguecore_name_type27 = Variable.unary("_name_cataloguecore_to_cataloguecore_name_type27");
		decls.add ( _name_cataloguecore_to_cataloguecore_name_type27.join(_name_CatalogueCore_to_CatalogueCore_name).in(_CatalogueCore_name).forAll(_name_cataloguecore_to_cataloguecore_name_type27.oneOf(_CatalogueCore)) );
		
		decls.add(_DataConcept.some());
		decls.add(_DataModel.some());
		decls.add(_DataSection.some());
		decls.add(_DataClass.some());
		decls.add(_DataElement.some());


		return Formula.and(decls);
	}

	//the bounds methods is used only by the constructor, and sets the bounds for each relation of the model
	private final Bounds bounds(){
		//the number of atoms (taken from the fur model) 
		final int noAtoms = 130;
		final List<Object> atoms = new ArrayList<Object>(noAtoms);
		int intStartRange=atoms.size();
		for(int i = 0 ; i < 32 ; i++){
			atoms.add(java.lang.Integer.valueOf(1<<i));
		}
		for(int i = 0; i < 10 ; i++ ){
			atoms.add("_Integer"+i);
		}
		for(int i = 0; i < 10 ; i++ ){
			atoms.add("_String"+i);
		}
		for(int i = 0; i < 100 ; i++ ){
			atoms.add("_CatalogueCore"+i);
		}
		for(int i = 0; i < 10 ; i++ ){
			atoms.add("_EnumLiteral"+i);
		}
		final Universe u = new Universe(atoms);
		final TupleFactory f = u.factory();
		final Bounds b = new Bounds(u);
		for(int i = 0 ; i < 32 ; i++){
			b.boundExactly(1<<i, f.setOf(java.lang.Integer.valueOf(1<<i)));
		}
		b.bound(_Integer, f.range(f.tuple(atoms.get(intStartRange)), f.tuple(atoms.get(intStartRange+ 32-1 ))) );
		b.bound(_String, f.range(f.tuple("_String0") , f.tuple("_String"+(10-1) )) );
		b.bound(_CatalogueCore, f.range(f.tuple("_CatalogueCore0") , f.tuple("_CatalogueCore"+(100-1) )) );
		b.bound(_DataConcept , b.upperBound(_CatalogueCore) );
		b.bound(_Type , b.upperBound(_DataConcept) );
		b.bound(_DataAnnotation_type , b.upperBound(_Integer) );
		b.bound(_DataAnnotation_content , b.upperBound(_String) );
		b.bound(_DataAnnotation_languageURI , b.upperBound(_String) );
		b.bound(_DataAssociation_inRoleName , b.upperBound(_String) );
		b.bound(_DataAssociation_outRoleName , b.upperBound(_String) );
		b.bound(_DataAssociation_direction , b.upperBound(_Integer) );
		b.bound(_DataAssociation_multiplicity , b.upperBound(_String) );
		b.bound(_EnumLiteral_key , b.upperBound(_String) );
		b.bound(_EnumLiteral_value , b.upperBound(_Integer) );
		b.bound(_CatalogueCore_name , b.upperBound(_String) );
		b.bound(_DataAnnotation , b.upperBound(_CatalogueCore) );
		b.bound(_DataAssociation , b.upperBound(_DataConcept) );
		b.bound(_DataModel , b.upperBound(_CatalogueCore) );
		b.bound(_DataSection , b.upperBound(_DataConcept) );
		b.bound(_DataClass , b.upperBound(_DataConcept) );
		b.bound(_DataElement , b.upperBound(_DataConcept) );
		b.bound(_ValueDomain , b.upperBound(_DataConcept) );
		b.bound(_PrimitiveType , b.upperBound(_Type) );
		b.bound(_MeasurementUnit , b.upperBound(_DataConcept) );
		b.bound(_Enumeration , b.upperBound(_Type) );
		b.bound(_EnumLiteral, f.range(f.tuple("_EnumLiteral0") , f.tuple("_EnumLiteral"+(10-1) )) );
		b.bound(_type_DataAnnotation_to_DataAnnotation_type, b.upperBound(_DataAnnotation).product(b.upperBound(_DataAnnotation_type)) );
		b.bound(_content_DataAnnotation_to_DataAnnotation_content, b.upperBound(_DataAnnotation).product(b.upperBound(_DataAnnotation_content)) );
		b.bound(_languageURI_DataAnnotation_to_DataAnnotation_languageURI, b.upperBound(_DataAnnotation).product(b.upperBound(_DataAnnotation_languageURI)) );
		b.bound(_to_DataAssociation_to_DataAssociation_to, b.upperBound(_DataAssociation).product(b.upperBound(_CatalogueCore)) );
		b.bound(_from_DataAssociation_to_DataAssociation_from, b.upperBound(_DataAssociation).product(b.upperBound(_CatalogueCore)) );
		b.bound(_inRoleName_DataAssociation_to_DataAssociation_inRoleName, b.upperBound(_DataAssociation).product(b.upperBound(_DataAssociation_inRoleName)) );
		b.bound(_outRoleName_DataAssociation_to_DataAssociation_outRoleName, b.upperBound(_DataAssociation).product(b.upperBound(_DataAssociation_outRoleName)) );
		b.bound(_direction_DataAssociation_to_DataAssociation_direction, b.upperBound(_DataAssociation).product(b.upperBound(_DataAssociation_direction)) );
		b.bound(_multiplicity_DataAssociation_to_DataAssociation_multiplicity, b.upperBound(_DataAssociation).product(b.upperBound(_DataAssociation_multiplicity)) );
		b.bound(_conceptualDomain_ValueDomain_to_ValueDomain_conceptualDomain, b.upperBound(_ValueDomain).product(b.upperBound(_DataConcept)) );
		b.bound(_enumLiteralType_EnumLiteral_to_EnumLiteral_enumLiteralType, b.upperBound(_EnumLiteral).product(b.upperBound(_PrimitiveType)) );
		b.bound(_key_EnumLiteral_to_EnumLiteral_key, b.upperBound(_EnumLiteral).product(b.upperBound(_EnumLiteral_key)) );
		b.bound(_value_EnumLiteral_to_EnumLiteral_value, b.upperBound(_EnumLiteral).product(b.upperBound(_EnumLiteral_value)) );
		b.bound(_has_Enumeration_to_Enumeration_has, b.upperBound(_Enumeration).product(b.upperBound(_EnumLiteral)) );
		b.bound(_hasA_DataElement_to_DataElement_hasA, b.upperBound(_DataElement).product(b.upperBound(_ValueDomain)) );
		b.bound(_mayHave_DataElement_to_DataElement_mayHave, b.upperBound(_DataElement).product(b.upperBound(_MeasurementUnit)) );
		b.bound(_has_DataElement_to_DataElement_has, b.upperBound(_DataElement).product(b.upperBound(_Type)) );
		b.bound(_classifies_DataClass_to_DataClass_classifies, b.upperBound(_DataClass).product(b.upperBound(_DataElement)) );
		b.bound(_groups_DataSection_to_DataSection_groups, b.upperBound(_DataSection).product(b.upperBound(_DataClass)) );
		b.bound(_clones_DataConcept_to_DataConcept_clones, b.upperBound(_DataConcept).product(b.upperBound(_DataConcept)) );
		b.bound(_owns_DataModel_to_DataModel_owns, b.upperBound(_DataModel).product(b.upperBound(_DataConcept)) );
		b.bound(_imports_DataModel_to_DataModel_imports, b.upperBound(_DataModel).product(b.upperBound(_DataConcept)) );
		b.bound(_notesThat_CatalogueCore_to_CatalogueCore_notesThat, b.upperBound(_CatalogueCore).product(b.upperBound(_DataAnnotation)) );
		b.bound(_name_CatalogueCore_to_CatalogueCore_name, b.upperBound(_CatalogueCore).product(b.upperBound(_CatalogueCore_name)) );

		return b;
	}

	//get method for _Integer
	public Relation get_Integer(){
		return _Integer;
	}

	//get method for _String
	public Relation get_String(){
		return _String;
	}

	//get method for _CatalogueCore
	public Relation get_CatalogueCore(){
		return _CatalogueCore;
	}

	//get method for _DataConcept
	public Relation get_DataConcept(){
		return _DataConcept;
	}

	//get method for _Type
	public Relation get_Type(){
		return _Type;
	}

	//get method for _DataAnnotation_type
	public Relation get_DataAnnotation_type(){
		return _DataAnnotation_type;
	}

	//get method for _DataAnnotation_content
	public Relation get_DataAnnotation_content(){
		return _DataAnnotation_content;
	}

	//get method for _DataAnnotation_languageURI
	public Relation get_DataAnnotation_languageURI(){
		return _DataAnnotation_languageURI;
	}

	//get method for _DataAssociation_inRoleName
	public Relation get_DataAssociation_inRoleName(){
		return _DataAssociation_inRoleName;
	}

	//get method for _DataAssociation_outRoleName
	public Relation get_DataAssociation_outRoleName(){
		return _DataAssociation_outRoleName;
	}

	//get method for _DataAssociation_direction
	public Relation get_DataAssociation_direction(){
		return _DataAssociation_direction;
	}

	//get method for _DataAssociation_multiplicity
	public Relation get_DataAssociation_multiplicity(){
		return _DataAssociation_multiplicity;
	}

	//get method for _EnumLiteral_key
	public Relation get_EnumLiteral_key(){
		return _EnumLiteral_key;
	}

	//get method for _EnumLiteral_value
	public Relation get_EnumLiteral_value(){
		return _EnumLiteral_value;
	}

	//get method for _CatalogueCore_name
	public Relation get_CatalogueCore_name(){
		return _CatalogueCore_name;
	}

	//get method for _DataAnnotation
	public Relation get_DataAnnotation(){
		return _DataAnnotation;
	}

	//get method for _DataAssociation
	public Relation get_DataAssociation(){
		return _DataAssociation;
	}

	//get method for _DataModel
	public Relation get_DataModel(){
		return _DataModel;
	}

	//get method for _DataSection
	public Relation get_DataSection(){
		return _DataSection;
	}

	//get method for _DataClass
	public Relation get_DataClass(){
		return _DataClass;
	}

	//get method for _DataElement
	public Relation get_DataElement(){
		return _DataElement;
	}

	//get method for _ValueDomain
	public Relation get_ValueDomain(){
		return _ValueDomain;
	}

	//get method for _PrimitiveType
	public Relation get_PrimitiveType(){
		return _PrimitiveType;
	}

	//get method for _MeasurementUnit
	public Relation get_MeasurementUnit(){
		return _MeasurementUnit;
	}

	//get method for _Enumeration
	public Relation get_Enumeration(){
		return _Enumeration;
	}

	//get method for _EnumLiteral
	public Relation get_EnumLiteral(){
		return _EnumLiteral;
	}

	//get method for _type_DataAnnotation_to_DataAnnotation_type
	public Relation get_type_DataAnnotation_to_DataAnnotation_type(){
		return _type_DataAnnotation_to_DataAnnotation_type;
	}

	//get method for _content_DataAnnotation_to_DataAnnotation_content
	public Relation get_content_DataAnnotation_to_DataAnnotation_content(){
		return _content_DataAnnotation_to_DataAnnotation_content;
	}

	//get method for _languageURI_DataAnnotation_to_DataAnnotation_languageURI
	public Relation get_languageURI_DataAnnotation_to_DataAnnotation_languageURI(){
		return _languageURI_DataAnnotation_to_DataAnnotation_languageURI;
	}

	//get method for _to_DataAssociation_to_DataAssociation_to
	public Relation get_to_DataAssociation_to_DataAssociation_to(){
		return _to_DataAssociation_to_DataAssociation_to;
	}

	//get method for _from_DataAssociation_to_DataAssociation_from
	public Relation get_from_DataAssociation_to_DataAssociation_from(){
		return _from_DataAssociation_to_DataAssociation_from;
	}

	//get method for _inRoleName_DataAssociation_to_DataAssociation_inRoleName
	public Relation get_inRoleName_DataAssociation_to_DataAssociation_inRoleName(){
		return _inRoleName_DataAssociation_to_DataAssociation_inRoleName;
	}

	//get method for _outRoleName_DataAssociation_to_DataAssociation_outRoleName
	public Relation get_outRoleName_DataAssociation_to_DataAssociation_outRoleName(){
		return _outRoleName_DataAssociation_to_DataAssociation_outRoleName;
	}

	//get method for _direction_DataAssociation_to_DataAssociation_direction
	public Relation get_direction_DataAssociation_to_DataAssociation_direction(){
		return _direction_DataAssociation_to_DataAssociation_direction;
	}

	//get method for _multiplicity_DataAssociation_to_DataAssociation_multiplicity
	public Relation get_multiplicity_DataAssociation_to_DataAssociation_multiplicity(){
		return _multiplicity_DataAssociation_to_DataAssociation_multiplicity;
	}

	//get method for _conceptualDomain_ValueDomain_to_ValueDomain_conceptualDomain
	public Relation get_conceptualDomain_ValueDomain_to_ValueDomain_conceptualDomain(){
		return _conceptualDomain_ValueDomain_to_ValueDomain_conceptualDomain;
	}

	//get method for _enumLiteralType_EnumLiteral_to_EnumLiteral_enumLiteralType
	public Relation get_enumLiteralType_EnumLiteral_to_EnumLiteral_enumLiteralType(){
		return _enumLiteralType_EnumLiteral_to_EnumLiteral_enumLiteralType;
	}

	//get method for _key_EnumLiteral_to_EnumLiteral_key
	public Relation get_key_EnumLiteral_to_EnumLiteral_key(){
		return _key_EnumLiteral_to_EnumLiteral_key;
	}

	//get method for _value_EnumLiteral_to_EnumLiteral_value
	public Relation get_value_EnumLiteral_to_EnumLiteral_value(){
		return _value_EnumLiteral_to_EnumLiteral_value;
	}

	//get method for _has_Enumeration_to_Enumeration_has
	public Relation get_has_Enumeration_to_Enumeration_has(){
		return _has_Enumeration_to_Enumeration_has;
	}

	//get method for _hasA_DataElement_to_DataElement_hasA
	public Relation get_hasA_DataElement_to_DataElement_hasA(){
		return _hasA_DataElement_to_DataElement_hasA;
	}

	//get method for _mayHave_DataElement_to_DataElement_mayHave
	public Relation get_mayHave_DataElement_to_DataElement_mayHave(){
		return _mayHave_DataElement_to_DataElement_mayHave;
	}

	//get method for _has_DataElement_to_DataElement_has
	public Relation get_has_DataElement_to_DataElement_has(){
		return _has_DataElement_to_DataElement_has;
	}

	//get method for _classifies_DataClass_to_DataClass_classifies
	public Relation get_classifies_DataClass_to_DataClass_classifies(){
		return _classifies_DataClass_to_DataClass_classifies;
	}

	//get method for _groups_DataSection_to_DataSection_groups
	public Relation get_groups_DataSection_to_DataSection_groups(){
		return _groups_DataSection_to_DataSection_groups;
	}

	//get method for _clones_DataConcept_to_DataConcept_clones
	public Relation get_clones_DataConcept_to_DataConcept_clones(){
		return _clones_DataConcept_to_DataConcept_clones;
	}

	//get method for _owns_DataModel_to_DataModel_owns
	public Relation get_owns_DataModel_to_DataModel_owns(){
		return _owns_DataModel_to_DataModel_owns;
	}

	//get method for _imports_DataModel_to_DataModel_imports
	public Relation get_imports_DataModel_to_DataModel_imports(){
		return _imports_DataModel_to_DataModel_imports;
	}

	//get method for _notesThat_CatalogueCore_to_CatalogueCore_notesThat
	public Relation get_notesThat_CatalogueCore_to_CatalogueCore_notesThat(){
		return _notesThat_CatalogueCore_to_CatalogueCore_notesThat;
	}

	//get method for _name_CatalogueCore_to_CatalogueCore_name
	public Relation get_name_CatalogueCore_to_CatalogueCore_name(){
		return _name_CatalogueCore_to_CatalogueCore_name;
	}


	//indicates for _Integer
	public boolean get_IntegerIsSuper(){
		return true;
	}

	//indicates for _String
	public boolean get_StringIsSuper(){
		return true;
	}

	//indicates for _CatalogueCore
	public boolean get_CatalogueCoreIsSuper(){
		return true;
	}

	//indicates for _DataConcept
	public boolean get_DataConceptIsSuper(){
		return true;
	}

	//indicates for _Type
	public boolean get_TypeIsSuper(){
		return true;
	}

	//indicates for _DataAnnotation_type
	public boolean get_DataAnnotation_typeIsSuper(){
		return false;
	}

	//indicates for _DataAnnotation_content
	public boolean get_DataAnnotation_contentIsSuper(){
		return false;
	}

	//indicates for _DataAnnotation_languageURI
	public boolean get_DataAnnotation_languageURIIsSuper(){
		return false;
	}

	//indicates for _DataAssociation_inRoleName
	public boolean get_DataAssociation_inRoleNameIsSuper(){
		return false;
	}

	//indicates for _DataAssociation_outRoleName
	public boolean get_DataAssociation_outRoleNameIsSuper(){
		return false;
	}

	//indicates for _DataAssociation_direction
	public boolean get_DataAssociation_directionIsSuper(){
		return false;
	}

	//indicates for _DataAssociation_multiplicity
	public boolean get_DataAssociation_multiplicityIsSuper(){
		return false;
	}

	//indicates for _EnumLiteral_key
	public boolean get_EnumLiteral_keyIsSuper(){
		return false;
	}

	//indicates for _EnumLiteral_value
	public boolean get_EnumLiteral_valueIsSuper(){
		return false;
	}

	//indicates for _CatalogueCore_name
	public boolean get_CatalogueCore_nameIsSuper(){
		return false;
	}

	//indicates for _DataAnnotation
	public boolean get_DataAnnotationIsSuper(){
		return false;
	}

	//indicates for _DataAssociation
	public boolean get_DataAssociationIsSuper(){
		return false;
	}

	//indicates for _DataModel
	public boolean get_DataModelIsSuper(){
		return false;
	}

	//indicates for _DataSection
	public boolean get_DataSectionIsSuper(){
		return false;
	}

	//indicates for _DataClass
	public boolean get_DataClassIsSuper(){
		return false;
	}

	//indicates for _DataElement
	public boolean get_DataElementIsSuper(){
		return false;
	}

	//indicates for _ValueDomain
	public boolean get_ValueDomainIsSuper(){
		return false;
	}

	//indicates for _PrimitiveType
	public boolean get_PrimitiveTypeIsSuper(){
		return false;
	}

	//indicates for _MeasurementUnit
	public boolean get_MeasurementUnitIsSuper(){
		return false;
	}

	//indicates for _Enumeration
	public boolean get_EnumerationIsSuper(){
		return false;
	}

	//indicates for _EnumLiteral
	public boolean get_EnumLiteralIsSuper(){
		return false;
	}

	//indicates for _type_DataAnnotation_to_DataAnnotation_type
	public boolean get_type_DataAnnotation_to_DataAnnotation_typeIsSuper(){
		return false;
	}

	//indicates for _content_DataAnnotation_to_DataAnnotation_content
	public boolean get_content_DataAnnotation_to_DataAnnotation_contentIsSuper(){
		return false;
	}

	//indicates for _languageURI_DataAnnotation_to_DataAnnotation_languageURI
	public boolean get_languageURI_DataAnnotation_to_DataAnnotation_languageURIIsSuper(){
		return false;
	}

	//indicates for _to_DataAssociation_to_DataAssociation_to
	public boolean get_to_DataAssociation_to_DataAssociation_toIsSuper(){
		return false;
	}

	//indicates for _from_DataAssociation_to_DataAssociation_from
	public boolean get_from_DataAssociation_to_DataAssociation_fromIsSuper(){
		return false;
	}

	//indicates for _inRoleName_DataAssociation_to_DataAssociation_inRoleName
	public boolean get_inRoleName_DataAssociation_to_DataAssociation_inRoleNameIsSuper(){
		return false;
	}

	//indicates for _outRoleName_DataAssociation_to_DataAssociation_outRoleName
	public boolean get_outRoleName_DataAssociation_to_DataAssociation_outRoleNameIsSuper(){
		return false;
	}

	//indicates for _direction_DataAssociation_to_DataAssociation_direction
	public boolean get_direction_DataAssociation_to_DataAssociation_directionIsSuper(){
		return false;
	}

	//indicates for _multiplicity_DataAssociation_to_DataAssociation_multiplicity
	public boolean get_multiplicity_DataAssociation_to_DataAssociation_multiplicityIsSuper(){
		return false;
	}

	//indicates for _conceptualDomain_ValueDomain_to_ValueDomain_conceptualDomain
	public boolean get_conceptualDomain_ValueDomain_to_ValueDomain_conceptualDomainIsSuper(){
		return false;
	}

	//indicates for _enumLiteralType_EnumLiteral_to_EnumLiteral_enumLiteralType
	public boolean get_enumLiteralType_EnumLiteral_to_EnumLiteral_enumLiteralTypeIsSuper(){
		return false;
	}

	//indicates for _key_EnumLiteral_to_EnumLiteral_key
	public boolean get_key_EnumLiteral_to_EnumLiteral_keyIsSuper(){
		return false;
	}

	//indicates for _value_EnumLiteral_to_EnumLiteral_value
	public boolean get_value_EnumLiteral_to_EnumLiteral_valueIsSuper(){
		return false;
	}

	//indicates for _has_Enumeration_to_Enumeration_has
	public boolean get_has_Enumeration_to_Enumeration_hasIsSuper(){
		return false;
	}

	//indicates for _hasA_DataElement_to_DataElement_hasA
	public boolean get_hasA_DataElement_to_DataElement_hasAIsSuper(){
		return false;
	}

	//indicates for _mayHave_DataElement_to_DataElement_mayHave
	public boolean get_mayHave_DataElement_to_DataElement_mayHaveIsSuper(){
		return false;
	}

	//indicates for _has_DataElement_to_DataElement_has
	public boolean get_has_DataElement_to_DataElement_hasIsSuper(){
		return false;
	}

	//indicates for _classifies_DataClass_to_DataClass_classifies
	public boolean get_classifies_DataClass_to_DataClass_classifiesIsSuper(){
		return false;
	}

	//indicates for _groups_DataSection_to_DataSection_groups
	public boolean get_groups_DataSection_to_DataSection_groupsIsSuper(){
		return false;
	}

	//indicates for _clones_DataConcept_to_DataConcept_clones
	public boolean get_clones_DataConcept_to_DataConcept_clonesIsSuper(){
		return false;
	}

	//indicates for _owns_DataModel_to_DataModel_owns
	public boolean get_owns_DataModel_to_DataModel_ownsIsSuper(){
		return false;
	}

	//indicates for _imports_DataModel_to_DataModel_imports
	public boolean get_imports_DataModel_to_DataModel_importsIsSuper(){
		return false;
	}

	//indicates for _notesThat_CatalogueCore_to_CatalogueCore_notesThat
	public boolean get_notesThat_CatalogueCore_to_CatalogueCore_notesThatIsSuper(){
		return false;
	}

	//indicates for _name_CatalogueCore_to_CatalogueCore_name
	public boolean get_name_CatalogueCore_to_CatalogueCore_nameIsSuper(){
		return false;
	}


	//get sub method for _Integer
	public List<Relation> get_IntegerGetAllSubRelations(){
		List<Relation> subRels = new ArrayList<Relation>();
		return subRels;
	}

	//get sub method for _String
	public List<Relation> get_StringGetAllSubRelations(){
		List<Relation> subRels = new ArrayList<Relation>();
		return subRels;
	}

	//get sub method for _CatalogueCore
	public List<Relation> get_CatalogueCoreGetAllSubRelations(){
		List<Relation> subRels = new ArrayList<Relation>();
		subRels.add (_DataAnnotation);
		subRels.add (_DataAssociation);
		subRels.add (_DataModel);
		subRels.add (_DataConcept);
		subRels.add (_DataSection);
		subRels.add (_DataClass);
		subRels.add (_Type);
		subRels.add (_DataElement);
		subRels.add (_ValueDomain);
		subRels.add (_PrimitiveType);
		subRels.add (_MeasurementUnit);
		subRels.add (_Enumeration);
		return subRels;
	}

	//get sub method for _DataConcept
	public List<Relation> get_DataConceptGetAllSubRelations(){
		List<Relation> subRels = new ArrayList<Relation>();
		subRels.add (_DataAssociation);
		subRels.add (_DataSection);
		subRels.add (_DataClass);
		subRels.add (_Type);
		subRels.add (_DataElement);
		subRels.add (_ValueDomain);
		subRels.add (_PrimitiveType);
		subRels.add (_MeasurementUnit);
		subRels.add (_Enumeration);
		return subRels;
	}

	//get sub method for _Type
	public List<Relation> get_TypeGetAllSubRelations(){
		List<Relation> subRels = new ArrayList<Relation>();
		subRels.add (_PrimitiveType);
		subRels.add (_Enumeration);
		return subRels;
	}


	//iterator hasNext method 
	public boolean hasNext(){
		return solutions.hasNext();
	}

	//iterator next method
	public FInstance next(){
		return new FInstance(this, solutions.next());
	}

	//iterator remove method
	public void remove(){
		throw new UnsupportedOperationException();
	}

	//iterable method
	public Iterator<FInstance> iterator(){
		return this;
	}

	public static void main(String[] args){
		ModelGenerator4Catalogue model = new ModelGenerator4Catalogue();

		System.out.println(model.declaration());

		while (model.hasNext()){
			System.out.println("instance: "+model.next());
		}
		System.out.println(model.declaration());

	}

}

