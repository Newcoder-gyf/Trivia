package edu.gwu.trivia.model.generated;

import java.util.List;
import javax.annotation.Generated;
import com.squareup.moshi.Json;

@Generated("com.robohorse.robopojogenerator")
public class PivotSuggestionsItem{

	@Json(name = "pivot")
	private String pivot;

	@Json(name = "suggestions")
	private List<SuggestionsItem> suggestions;

	public void setPivot(String pivot){
		this.pivot = pivot;
	}

	public String getPivot(){
		return pivot;
	}

	public void setSuggestions(List<SuggestionsItem> suggestions){
		this.suggestions = suggestions;
	}

	public List<SuggestionsItem> getSuggestions(){
		return suggestions;
	}

	@Override
 	public String toString(){
		return 
			"PivotSuggestionsItem{" + 
			"pivot = '" + pivot + '\'' + 
			",suggestions = '" + suggestions + '\'' + 
			"}";
		}
}