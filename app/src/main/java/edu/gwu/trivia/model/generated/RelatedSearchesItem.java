package edu.gwu.trivia.model.generated;

import javax.annotation.Generated;
import com.squareup.moshi.Json;

@Generated("com.robohorse.robopojogenerator")
public class RelatedSearchesItem{

	@Json(name = "displayText")
	private String displayText;

	@Json(name = "searchLink")
	private String searchLink;

	@Json(name = "thumbnail")
	private Thumbnail thumbnail;

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

	public void setSearchLink(String searchLink){
		this.searchLink = searchLink;
	}

	public String getSearchLink(){
		return searchLink;
	}

	public void setThumbnail(Thumbnail thumbnail){
		this.thumbnail = thumbnail;
	}

	public Thumbnail getThumbnail(){
		return thumbnail;
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
			"RelatedSearchesItem{" + 
			"displayText = '" + displayText + '\'' + 
			",searchLink = '" + searchLink + '\'' + 
			",thumbnail = '" + thumbnail + '\'' + 
			",webSearchUrl = '" + webSearchUrl + '\'' + 
			",text = '" + text + '\'' + 
			"}";
		}
}