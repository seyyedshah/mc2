package finstancemodelgenerator4catalogue2resourcecatalogue;

//import statements
import fur.FTuple;
import java.lang.Integer;

import sitra.Rule;
import sitra.Transformer;

import modelgenerator4catalogue.ModelGenerator4Catalogue;

public class FTuple_EnumLiteral_value2Integervalue24 implements Rule<FTuple,Integer>{

	public boolean check(FTuple source){
		//check that there are no sub rules that convert the element
		//check the FTuple is a tuple of the get_EnumLiteral_value relation 
		return source.instanceOf( ((ModelGenerator4Catalogue)source.getInstance().getMetaModel()).get_EnumLiteral_value() );
	}

	public Integer build(FTuple source, Transformer t){
		//create the result
		//create an Object (Integer) based on the given FTuple
		return new Integer(source.toInteger());
	}

	public void setProperties(Integer target, FTuple source, Transformer t){
	}

}
