package finstancemodelgenerator4catalogue2resourcecatalogue;

//import statements
import fur.FInstance;
import org.eclipse.emf.ecore.resource.Resource;

import modelgenerator4catalogue.ModelGenerator4Catalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import sitra.Rule;
import sitra.Transformer;
import sitra.SimpleTransformerImpl;

public class Main4FInstanceModelGenerator4Catalogue2Resourcecatalogue0{

	//the entry point of the transformation
	public static void main(String[] args){
		//set up the Transformer
		Transformer transformer = new SimpleTransformerImpl(getRules());

		//create the model generator
		Iterator<FInstance> mm = new ModelGenerator4Catalogue();

		//create a list to hold the results
		List<Resource> results = new ArrayList<Resource>();

		//get model instances to convert
		while(mm.hasNext()){
			FInstance next = mm.next();
			System.out.println(next);
			Resource result =  transformer.transform( FInstanceModelGenerator4Catalogue2Resourcecatalogue0.class , next );
			System.out.println(result);
			results.add(result);
		}
	}

	//a list of the transformation rules
	static List<java.lang.Class<? extends Rule>> getRules(){
		List<java.lang.Class<? extends Rule>> rules = new ArrayList<java.lang.Class<? extends Rule>>();
		rules.add( FTuple_PrimitiveType2EObjectPrimitiveType20.class );
		rules.add( FTuple_MeasurementUnit2EObjectMeasurementUnit18.class );
		rules.add( FTuple_DataElement2EObjectDataElement16.class );
		rules.add( FTuple_EnumLiteral2EObjectEnumLiteral22.class );
		rules.add( FTuple_String2StringEString6.class );
		rules.add( FTuple_DataAssociation_inRoleName2StringinRoleName10.class );
		rules.add( FTuple_CatalogueCore2EObjectCatalogueCore1.class );
		rules.add( FTuple_DataAssociation_direction2Integerdirection12.class );
		rules.add( FTuple_Type2EObjectType19.class );
		rules.add( FTuple_DataAnnotation_languageURI2StringlanguageURI5.class );
		rules.add( FTuple_DataModel2EObjectDataModel7.class );
		rules.add( FTuple_DataAnnotation_content2Stringcontent4.class );
		rules.add( FTuple_DataAnnotation2EObjectDataAnnotation2.class );
		rules.add( FTuple_EnumLiteral_value2Integervalue24.class );
		rules.add( FTuple_DataAssociation_outRoleName2StringoutRoleName11.class );
		rules.add( FTuple_DataConcept2EObjectDataConcept8.class );
		rules.add( FTuple_ValueDomain2EObjectValueDomain17.class );
		rules.add( FTuple_DataAssociation2EObjectDataAssociation9.class );
		rules.add( FTuple_CatalogueCore_name2Stringname25.class );
		rules.add( FInstanceModelGenerator4Catalogue2Resourcecatalogue0.class );
		rules.add( FTuple_Enumeration2EObjectEnumeration21.class );
		rules.add( FTuple_EnumLiteral_key2Stringkey23.class );
		rules.add( FTuple_DataAssociation_multiplicity2Stringmultiplicity13.class );
		rules.add( FTuple_DataAnnotation_type2Integertype3.class );
		rules.add( FTuple_DataSection2EObjectDataSection14.class );
		rules.add( FTuple_DataClass2EObjectDataClass15.class );
		return rules;
	}

}

