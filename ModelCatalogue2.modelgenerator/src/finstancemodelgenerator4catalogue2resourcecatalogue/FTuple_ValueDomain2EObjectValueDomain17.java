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


public class FTuple_ValueDomain2EObjectValueDomain17 implements Rule<FTuple,EObject>{

	public boolean check(FTuple source){
		//check that there are no sub rules that convert the element
		//check the FTuple is a tuple of the get_ValueDomain relation 
		return source.instanceOf( ((ModelGenerator4Catalogue)source.getInstance().getMetaModel()).get_ValueDomain() );
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
		EClass metaClass = (EClass) metaModel.getEObject( "//ValueDomain" );

		//get the Efactory of the EPackage of the EObject
		EFactory factory = metaClass.getEPackage().getEFactoryInstance();

		//create the result
		EObject result = factory.create(metaClass);

		return result;
	}

	public void setProperties(EObject target, FTuple source, Transformer t){
		EClass objectClass1 = target.eClass();
		EStructuralFeature feature1 = objectClass1.getEStructuralFeature("name");
				
		List<FTuple> linkFTuples1 = source.getInstance().getTuples("get_name_CatalogueCore_to_CatalogueCore_name");
		List<FTuple> dataFTuples1 = source.getInstance().getTuples("get_CatalogueCore_name"); 
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
		EStructuralFeature feature2 = objectClass2.getEStructuralFeature("notesThat");
				
		List<FTuple> linkFTuples2 = source.getInstance().getTuples("get_notesThat_CatalogueCore_to_CatalogueCore_notesThat");
		List<FTuple> dataFTuples2 = source.getInstance().getTuples("get_DataAnnotation"); 
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
		EStructuralFeature feature3 = objectClass3.getEStructuralFeature("clones");
				
		List<FTuple> linkFTuples3 = source.getInstance().getTuples("get_clones_DataConcept_to_DataConcept_clones");
		List<FTuple> dataFTuples3 = source.getInstance().getTuples("get_DataConcept"); 
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
		EStructuralFeature feature4 = objectClass4.getEStructuralFeature("conceptualDomain");
				
		List<FTuple> linkFTuples4 = source.getInstance().getTuples("get_conceptualDomain_ValueDomain_to_ValueDomain_conceptualDomain");
		List<FTuple> dataFTuples4 = source.getInstance().getTuples("get_DataConcept"); 
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

	}

}
