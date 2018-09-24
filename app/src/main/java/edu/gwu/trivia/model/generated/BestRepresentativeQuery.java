package edu.gwu.trivia.model.generated;

import javax.annotation.Generated;
import com.squareup.moshi.Json;

@Generated("com.robohorse.robopojogenerator")
public class BestRepresentativeQuery{

	@Json(name = "displayText")
	private String displayText;

	@Json(name = "webSearchUrl")
	private String webSearchUrl;

	@Json(name = "text")
	private String text;

	public void setDisplayText(String displayText){
		this.displayText = displayText;
	}

	public String getDisplayText(){
		return displayText;
	}

	public void setWebSearchUrl(String webSearchUrl){
		this.webSearchUrl = webSearchUrl;
	}

	public String getWebSearchUrl(){
		return webSearchUrl;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	@Override
 	public String toString(){
		return 
			"BestRepresentativeQuery{" + 
			"displayText = '" + displayText + '\'' + 
			",webSearchUrl = '" + webSearchUrl + '\'' + 
			",text = '" + text + '\'' + 
			"}";
		}
}