package finstancemodelgenerator4catalogue2resourcecatalogue;

//import statements
import fur.FInstance;
import org.eclipse.emf.ecore.resource.Resource;

import sitra.Rule;
import sitra.Transformer;

import modelgenerator4catalogue.ModelGenerator4Catalogue;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EObject;
import java.util.List;


public class FInstanceModelGenerator4Catalogue2Resourcecatalogue0 implements Rule<FInstance,Resource>{

	public boolean check(FInstance source){
		return true;
	}

	public Resource build(FInstance source, Transformer t){
		//create the result
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		//create the model result, where instances will be stored
		Resource result = resourceSet.createResource(URI.createFileURI("./data/instance_model_of_catalogue_"+System.currentTimeMillis()+".xmi"));

		return result;
	}

	public void setProperties(Resource target, FInstance source, Transformer t){

		List<org.eclipse.emf.ecore.EObject> FTuple_DataAnnotation2EObjectDataAnnotation2_conv = t.transformAll(FTuple_DataAnnotation2EObjectDataAnnotation2.class,source.getTuples("get_DataAnnotation"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_DataAnnotation2EObjectDataAnnotation2_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_ValueDomain2EObjectValueDomain17_conv = t.transformAll(FTuple_ValueDomain2EObjectValueDomain17.class,source.getTuples("get_ValueDomain"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_ValueDomain2EObjectValueDomain17_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_DataConcept2EObjectDataConcept8_conv = t.transformAll(FTuple_DataConcept2EObjectDataConcept8.class,source.getTuples("get_DataConcept"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_DataConcept2EObjectDataConcept8_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_PrimitiveType2EObjectPrimitiveType20_conv = t.transformAll(FTuple_PrimitiveType2EObjectPrimitiveType20.class,source.getTuples("get_PrimitiveType"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_PrimitiveType2EObjectPrimitiveType20_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_DataElement2EObjectDataElement16_conv = t.transformAll(FTuple_DataElement2EObjectDataElement16.class,source.getTuples("get_DataElement"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_DataElement2EObjectDataElement16_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_DataAssociation2EObjectDataAssociation9_conv = t.transformAll(FTuple_DataAssociation2EObjectDataAssociation9.class,source.getTuples("get_DataAssociation"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_DataAssociation2EObjectDataAssociation9_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_MeasurementUnit2EObjectMeasurementUnit18_conv = t.transformAll(FTuple_MeasurementUnit2EObjectMeasurementUnit18.class,source.getTuples("get_MeasurementUnit"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_MeasurementUnit2EObjectMeasurementUnit18_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_EnumLiteral2EObjectEnumLiteral22_conv = t.transformAll(FTuple_EnumLiteral2EObjectEnumLiteral22.class,source.getTuples("get_EnumLiteral"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_EnumLiteral2EObjectEnumLiteral22_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_CatalogueCore2EObjectCatalogueCore1_conv = t.transformAll(FTuple_CatalogueCore2EObjectCatalogueCore1.class,source.getTuples("get_CatalogueCore"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_CatalogueCore2EObjectCatalogueCore1_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_Enumeration2EObjectEnumeration21_conv = t.transformAll(FTuple_Enumeration2EObjectEnumeration21.class,source.getTuples("get_Enumeration"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_Enumeration2EObjectEnumeration21_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_Type2EObjectType19_conv = t.transformAll(FTuple_Type2EObjectType19.class,source.getTuples("get_Type"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_Type2EObjectType19_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_DataSection2EObjectDataSection14_conv = t.transformAll(FTuple_DataSection2EObjectDataSection14.class,source.getTuples("get_DataSection"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_DataSection2EObjectDataSection14_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_DataModel2EObjectDataModel7_conv = t.transformAll(FTuple_DataModel2EObjectDataModel7.class,source.getTuples("get_DataModel"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_DataModel2EObjectDataModel7_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_DataClass2EObjectDataClass15_conv = t.transformAll(FTuple_DataClass2EObjectDataClass15.class,source.getTuples("get_DataClass"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_DataClass2EObjectDataClass15_conv)
			if(data != null)
				target.getContents().add(data);


		//write model out 
		try {
			target.save(null);
		}
		catch (java.io.IOException e){
			System.err.println("could not write generated file to directory");
			e.printStackTrace();
			System.exit(-1);
		}
	}

}
