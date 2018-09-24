package edu.gwu.trivia.model.generated;

import java.util.List;
import javax.annotation.Generated;
import com.squareup.moshi.Json;

@Generated("com.robohorse.robopojogenerator")
public class BIngResponse{

	@Json(name = "pivotSuggestions")
	private List<PivotSuggestionsItem> pivotSuggestions;

	@Json(name = "relatedSearches")
	private List<RelatedSearchesItem> relatedSearches;

	@Json(name = "readLink")
	private String readLink;

	@Json(name = "totalEstimatedMatches")
	private int totalEstimatedMatches;

	@Json(name = "_type")
	private String type;

	@Json(name = "webSearchUrl")
	private String webSearchUrl;

	@Json(name = "instrumentation")
	private Instrumentation instrumentation;

	@Json(name = "queryExpansions")
	private List<QueryExpansionsItem> queryExpansions;

	@Json(name = "nextOffset")
	private int nextOffset;

	@Json(name = "value")
	private List<ValueItem> value;

	public void setPivotSuggestions(List<PivotSuggestionsItem> pivotSuggestions){
		this.pivotSuggestions = pivotSuggestions;
	}

	public List<PivotSuggestionsItem> getPivotSuggestions(){
		return pivotSuggestions;
	}

	public void setRelatedSearches(List<RelatedSearchesItem> relatedSearches){
		this.relatedSearches = relatedSearches;
	}

	public List<RelatedSearchesItem> getRelatedSearches(){
		return relatedSearches;
	}

	public void setReadLink(String readLink){
		this.readLink = readLink;
	}

	public String getReadLink(){
		return readLink;
	}

	public void setTotalEstimatedMatches(int totalEstimatedMatches){
		this.totalEstimatedMatches = totalEstimatedMatches;
	}

	public int getTotalEstimatedMatches(){
		return totalEstimatedMatches;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setWebSearchUrl(String webSearchUrl){
		this.webSearchUrl = webSearchUrl;
	}

	public String getWebSearchUrl(){
		return webSearchUrl;
	}

	public void setInstrumentation(Instrumentation instrumentation){
		this.instrumentation = instrumentation;
	}

	public Instrumentation getInstrumentation(){
		return instrumentation;
	}

	public void setQueryExpansions(List<QueryExpansionsItem> queryExpansions){
		this.queryExpansions = queryExpansions;
	}

	public List<QueryExpansionsItem> getQueryExpansions(){
		return queryExpansions;
	}

	public void setNextOffset(int nextOffset){
		this.nextOffset = nextOffset;
	}

	public int getNextOffset(){
		return nextOffset;
	}

	public void setValue(List<ValueItem> value){
		this.value = value;
	}

	public List<ValueItem> getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"BIngResponse{" + 
			"pivotSuggestions = '" + pivotSuggestions + '\'' + 
			",relatedSearches = '" + relatedSearches + '\'' + 
			",readLink = '" + readLink + '\'' + 
			",totalEstimatedMatches = '" + totalEstimatedMatches + '\'' + 
			",_type = '" + type + '\'' + 
			",webSearchUrl = '" + webSearchUrl + '\'' + 
			",instrumentation = '" + instrumentation + '\'' + 
			",queryExpansions = '" + queryExpansions + '\'' + 
			",nextOffset = '" + nextOffset + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}