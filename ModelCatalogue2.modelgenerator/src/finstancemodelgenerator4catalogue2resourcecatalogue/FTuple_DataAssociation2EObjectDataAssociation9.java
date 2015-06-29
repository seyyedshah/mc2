package finstancemodelgenerator4catalogue2resourcecatalogue;

//import statements
import fur.FTuple;
import org.eclipse.emf.ecore.EObject;

import sitra.Rule;
import sitra.Transformer;

import modelgenerator4catalogue.ModelGenerator4Catalogue;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import java.util.List;
import org.eclipse.emf.common.util.EList;


public class FTuple_DataAssociation2EObjectDataAssociation9 implements Rule<FTuple,EObject>{

	public boolean check(FTuple source){
		//check that there are no sub rules that convert the element
		//check the FTuple is a tuple of the get_DataAssociation relation 
		return source.instanceOf( ((ModelGenerator4Catalogue)source.getInstance().getMetaModel()).get_DataAssociation() );
	}

	public EObject build(FTuple source, Transformer t){
		//create the result
		//get the central resourceset using the FInstance's resouce
		ResourceSet central = (t.transform(  FInstanceModelGenerator4Catalogue2Resourcecatalogue0.class, source.getInstance() )).getResourceSet();
		central.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		central.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());

		//get the EClass EObject using getEObject
		URI mmuri = URI.createURI("./data/catalogue.ecore" );
		Resource metaModel = central.getResource(mmuri, true);
		EClass metaClass = (EClass) metaModel.getEObject( "//DataAssociation" );

		//get the Efactory of the EPackage of the EObject
		EFactory factory = metaClass.getEPackage().getEFactoryInstance();

		//create the result
		EObject result = factory.create(metaClass);

		return result;
	}

	public void setProperties(EObject target, FTuple source, Transformer t){
		EClass objectClass1 = target.eClass();
		EStructuralFeature feature1 = objectClass1.getEStructuralFeature("multiplicity");
				
		List<FTuple> linkFTuples1 = source.getInstance().getTuples("get_multiplicity_DataAssociation_to_DataAssociation_multiplicity");
		List<FTuple> dataFTuples1 = source.getInstance().getTuples("get_DataAssociation_multiplicity"); 
		for(FTuple link1: linkFTuples1){
			if( link1.getAtom(0) == source.getAtom(0)){
				Object dataSrc1 = link1.getAtom(1);
				FTuple dataFTuple1 = null;
				for(FTuple data1: dataFTuples1){
					if(dataSrc1 == data1.getAtom(0)){
						dataFTuple1 = data1;
					}				
				}
				Object dataDst1 =null;
				if(dataFTuple1 != null){
					dataDst1 = (Object) t.transform( dataFTuple1 );
				}
				if(dataDst1 != null){
				try {
					if (feature1.isMany()){
						((EList<EObject>)target.eGet(feature1)).add((EObject)dataDst1);
					}
					else
						target.eSet(feature1, dataDst1);		
				} catch (Throwable tr) {
					tr.printStackTrace();
				}	
				}
			}
		}

		EClass objectClass2 = target.eClass();
		EStructuralFeature feature2 = objectClass2.getEStructuralFeature("to");
				
		List<FTuple> linkFTuples2 = source.getInstance().getTuples("get_to_DataAssociation_to_DataAssociation_to");
		List<FTuple> dataFTuples2 = source.getInstance().getTuples("get_CatalogueCore"); 
		for(FTuple link2: linkFTuples2){
			if( link2.getAtom(0) == source.getAtom(0)){
				Object dataSrc2 = link2.getAtom(1);
				FTuple dataFTuple2 = null;
				for(FTuple data2: dataFTuples2){
					if(dataSrc2 == data2.getAtom(0)){
						dataFTuple2 = data2;
					}				
				}
				Object dataDst2 =null;
				if(dataFTuple2 != null){
					dataDst2 = (Object) t.transform( dataFTuple2 );
				}
				if(dataDst2 != null){
				try {
					if (feature2.isMany()){
						((EList<EObject>)target.eGet(feature2)).add((EObject)dataDst2);
					}
					else
						target.eSet(feature2, dataDst2);		
				} catch (Throwable tr) {
					tr.printStackTrace();
				}	
				}
			}
		}

		EClass objectClass3 = target.eClass();
		EStructuralFeature feature3 = objectClass3.getEStructuralFeature("direction");
				
		List<FTuple> linkFTuples3 = source.getInstance().getTuples("get_direction_DataAssociation_to_DataAssociation_direction");
		List<FTuple> dataFTuples3 = source.getInstance().getTuples("get_DataAssociation_direction"); 
		for(FTuple link3: linkFTuples3){
			if( link3.getAtom(0) == source.getAtom(0)){
				Object dataSrc3 = link3.getAtom(1);
				FTuple dataFTuple3 = null;
				for(FTuple data3: dataFTuples3){
					if(dataSrc3 == data3.getAtom(0)){
						dataFTuple3 = data3;
					}				
				}
				Object dataDst3 =null;
				if(dataFTuple3 != null){
					dataDst3 = (Object) t.transform( dataFTuple3 );
				}
				if(dataDst3 != null){
				try {
					if (feature3.isMany()){
						((EList<EObject>)target.eGet(feature3)).add((EObject)dataDst3);
					}
					else
						target.eSet(feature3, dataDst3);		
				} catch (Throwable tr) {
					tr.printStackTrace();
				}	
				}
			}
		}

		EClass objectClass4 = target.eClass();
		EStructuralFeature feature4 = objectClass4.getEStructuralFeature("from");
				
		List<FTuple> linkFTuples4 = source.getInstance().getTuples("get_from_DataAssociation_to_DataAssociation_from");
		List<FTuple> dataFTuples4 = source.getInstance().getTuples("get_CatalogueCore"); 
		for(FTuple link4: linkFTuples4){
			if( link4.getAtom(0) == source.getAtom(0)){
				Object dataSrc4 = link4.getAtom(1);
				FTuple dataFTuple4 = null;
				for(FTuple data4: dataFTuples4){
					if(dataSrc4 == data4.getAtom(0)){
						dataFTuple4 = data4;
					}				
				}
				Object dataDst4 =null;
				if(dataFTuple4 != null){
					dataDst4 = (Object) t.transform( dataFTuple4 );
				}
				if(dataDst4 != null){
				try {
					if (feature4.isMany()){
						((EList<EObject>)target.eGet(feature4)).add((EObject)dataDst4);
					}
					else
						target.eSet(feature4, dataDst4);		
				} catch (Throwable tr) {
					tr.printStackTrace();
				}	
				}
			}
		}

		EClass objectClass5 = target.eClass();
		EStructuralFeature feature5 = objectClass5.getEStructuralFeature("name");
				
		List<FTuple> linkFTuples5 = source.getInstance().getTuples("get_name_CatalogueCore_to_CatalogueCore_name");
		List<FTuple> dataFTuples5 = source.getInstance().getTuples("get_CatalogueCore_name"); 
		for(FTuple link5: linkFTuples5){
			if( link5.getAtom(0) == source.getAtom(0)){
				Object dataSrc5 = link5.getAtom(1);
				FTuple dataFTuple5 = null;
				for(FTuple data5: dataFTuples5){
					if(dataSrc5 == data5.getAtom(0)){
						dataFTuple5 = data5;
					}				
				}
				Object dataDst5 =null;
				if(dataFTuple5 != null){
					dataDst5 = (Object) t.transform( dataFTuple5 );
				}
				if(dataDst5 != null){
				try {
					if (feature5.isMany()){
						((EList<EObject>)target.eGet(feature5)).add((EObject)dataDst5);
					}
					else
						target.eSet(feature5, dataDst5);		
				} catch (Throwable tr) {
					tr.printStackTrace();
				}	
				}
			}
		}

		EClass objectClass6 = target.eClass();
		EStructuralFeature feature6 = objectClass6.getEStructuralFeature("inRoleName");
				
		List<FTuple> linkFTuples6 = source.getInstance().getTuples("get_inRoleName_DataAssociation_to_DataAssociation_inRoleName");
		List<FTuple> dataFTuples6 = source.getInstance().getTuples("get_DataAssociation_inRoleName"); 
		for(FTuple link6: linkFTuples6){
			if( link6.getAtom(0) == source.getAtom(0)){
				Object dataSrc6 = link6.getAtom(1);
				FTuple dataFTuple6 = null;
				for(FTuple data6: dataFTuples6){
					if(dataSrc6 == data6.getAtom(0)){
						dataFTuple6 = data6;
					}				
				}
				Object dataDst6 =null;
				if(dataFTuple6 != null){
					dataDst6 = (Object) t.transform( dataFTuple6 );
				}
				if(dataDst6 != null){
				try {
					if (feature6.isMany()){
						((EList<EObject>)target.eGet(feature6)).add((EObject)dataDst6);
					}
					else
						target.eSet(feature6, dataDst6);		
				} catch (Throwable tr) {
					tr.printStackTrace();
				}	
				}
			}
		}

		EClass objectClass7 = target.eClass();
		EStructuralFeature feature7 = objectClass7.getEStructuralFeature("outRoleName");
				
		List<FTuple> linkFTuples7 = source.getInstance().getTuples("get_outRoleName_DataAssociation_to_DataAssociation_outRoleName");
		List<FTuple> dataFTuples7 = source.getInstance().getTuples("get_DataAssociation_outRoleName"); 
		for(FTuple link7: linkFTuples7){
			if( link7.getAtom(0) == source.getAtom(0)){
				Object dataSrc7 = link7.getAtom(1);
				FTuple dataFTuple7 = null;
				for(FTuple data7: dataFTuples7){
					if(dataSrc7 == data7.getAtom(0)){
						dataFTuple7 = data7;
					}				
				}
				Object dataDst7 =null;
				if(dataFTuple7 != null){
					dataDst7 = (Object) t.transform( dataFTuple7 );
				}
				if(dataDst7 != null){
				try {
					if (feature7.isMany()){
						((EList<EObject>)target.eGet(feature7)).add((EObject)dataDst7);
					}
					else
						target.eSet(feature7, dataDst7);		
				} catch (Throwable tr) {
					tr.printStackTrace();
				}	
				}
			}
		}

		EClass objectClass8 = target.eClass();
		EStructuralFeature feature8 = objectClass8.getEStructuralFeature("notesThat");
				
		List<FTuple> linkFTuples8 = source.getInstance().getTuples("get_notesThat_CatalogueCore_to_CatalogueCore_notesThat");
		List<FTuple> dataFTuples8 = source.getInstance().getTuples("get_DataAnnotation"); 
		for(FTuple link8: linkFTuples8){
			if( link8.getAtom(0) == source.getAtom(0)){
				Object dataSrc8 = link8.getAtom(1);
				FTuple dataFTuple8 = null;
				for(FTuple data8: dataFTuples8){
					if(dataSrc8 == data8.getAtom(0)){
						dataFTuple8 = data8;
					}				
				}
				Object dataDst8 =null;
				if(dataFTuple8 != null){
					dataDst8 = (Object) t.transform( dataFTuple8 );
				}
				if(dataDst8 != null){
				try {
					if (feature8.isMany()){
						((EList<EObject>)target.eGet(feature8)).add((EObject)dataDst8);
					}
					else
						target.eSet(feature8, dataDst8);		
				} catch (Throwable tr) {
					tr.printStackTrace();
				}	
				}
			}
		}

		EClass objectClass9 = target.eClass();
		EStructuralFeature feature9 = objectClass9.getEStructuralFeature("clones");
				
		List<FTuple> linkFTuples9 = source.getInstance().getTuples("get_clones_DataConcept_to_DataConcept_clones");
		List<FTuple> dataFTuples9 = source.getInstance().getTuples("get_DataConcept"); 
		for(FTuple link9: linkFTuples9){
			if( link9.getAtom(0) == source.getAtom(0)){
				Object dataSrc9 = link9.getAtom(1);
				FTuple dataFTuple9 = null;
				for(FTuple data9: dataFTuples9){
					if(dataSrc9 == data9.getAtom(0)){
						dataFTuple9 = data9;
					}				
				}
				Object dataDst9 =null;
				if(dataFTuple9 != null){
					dataDst9 = (Object) t.transform( dataFTuple9 );
				}
				if(dataDst9 != null){
				try {
					if (feature9.isMany()){
						((EList<EObject>)target.eGet(feature9)).add((EObject)dataDst9);
					}
					else
						target.eSet(feature9, dataDst9);		
				} catch (Throwable tr) {
					tr.printStackTrace();
				}	
				}
			}
		}

	}

}
