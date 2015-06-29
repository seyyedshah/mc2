package finstancemodelgenerator4catalogue2resourcecatalogue;

//import statements
import fur.FTuple;
import java.lang.String;

import sitra.Rule;
import sitra.Transformer;

import modelgenerator4catalogue.ModelGenerator4Catalogue;

public class FTuple_CatalogueCore_name2Stringname25 implements Rule<FTuple,String>{

	public boolean check(FTuple source){
		//check that there are no sub rules that convert the element
		//check the FTuple is a tuple of the get_CatalogueCore_name relation 
		return source.instanceOf( ((ModelGenerator4Catalogue)source.getInstance().getMetaModel()).get_CatalogueCore_name() );
	}

	public String build(FTuple source, Transformer t){
		//create the result
		//create an Object (String) based on the given FTuple
		return source.toString();
	}

	public void setProperties(String target, FTuple source, Transformer t){
	}

}
