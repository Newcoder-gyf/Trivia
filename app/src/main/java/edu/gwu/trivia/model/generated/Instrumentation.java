package edu.gwu.trivia.model.generated;

import javax.annotation.Generated;
import com.squareup.moshi.Json;

@Generated("com.robohorse.robopojogenerator")
public class Instrumentation{

	@Json(name = "_type")
	private String type;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"Instrumentation{" + 
			"_type = '" + type + '\'' + 
			"}";
		}
}