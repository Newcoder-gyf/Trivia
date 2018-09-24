package edu.gwu.trivia.model.generated;

import javax.annotation.Generated;
import com.squareup.moshi.Json;

@Generated("com.robohorse.robopojogenerator")
public class ValueItem{

	@Json(name = "insightsMetadata")
	private InsightsMetadata insightsMetadata;

	@Json(name = "hostPageUrl")
	private String hostPageUrl;

	@Json(name = "thumbnail")
	private Thumbnail thumbnail;

	@Json(name = "imageId")
	private String imageId;

	@Json(name = "accentColor")
	private String accentColor;

	@Json(name = "imageInsightsToken")
	private String imageInsightsToken;

	@Json(name = "webSearchUrl")
	private String webSearchUrl;

	@Json(name = "datePublished")
	private String datePublished;

	@Json(name = "hostPageDisplayUrl")
	private String hostPageDisplayUrl;

	@Json(name = "contentUrl")
	private String contentUrl;

	@Json(name = "contentSize")
	private String contentSize;

	@Json(name = "name")
	private String name;

	@Json(name = "width")
	private int width;

	@Json(name = "encodingFormat")
	private String encodingFormat;

	@Json(name = "thumbnailUrl")
	private String thumbnailUrl;

	@Json(name = "height")
	private int height;

	@Json(name = "creativeCommons")
	private String creativeCommons;

	public void setInsightsMetadata(InsightsMetadata insightsMetadata){
		this.insightsMetadata = insightsMetadata;
	}

	public InsightsMetadata getInsightsMetadata(){
		return insightsMetadata;
	}

	public void setHostPageUrl(String hostPageUrl){
		this.hostPageUrl = hostPageUrl;
	}

	public String getHostPageUrl(){
		return hostPageUrl;
	}

	public void setThumbnail(Thumbnail thumbnail){
		this.thumbnail = thumbnail;
	}

	public Thumbnail getThumbnail(){
		return thumbnail;
	}

	public void setImageId(String imageId){
		this.imageId = imageId;
	}

	public String getImageId(){
		return imageId;
	}

	public void setAccentColor(String accentColor){
		this.accentColor = accentColor;
	}

	public String getAccentColor(){
		return accentColor;
	}

	public void setImageInsightsToken(String imageInsightsToken){
		this.imageInsightsToken = imageInsightsToken;
	}

	public String getImageInsightsToken(){
		return imageInsightsToken;
	}

	public void setWebSearchUrl(String webSearchUrl){
		this.webSearchUrl = webSearchUrl;
	}

	public String getWebSearchUrl(){
		return webSearchUrl;
	}

	public void setDatePublished(String datePublished){
		this.datePublished = datePublished;
	}

	public String getDatePublished(){
		return datePublished;
	}

	public void setHostPageDisplayUrl(String hostPageDisplayUrl){
		this.hostPageDisplayUrl = hostPageDisplayUrl;
	}

	public String getHostPageDisplayUrl(){
		return hostPageDisplayUrl;
	}

	public void setContentUrl(String contentUrl){
		this.contentUrl = contentUrl;
	}

	public String getContentUrl(){
		return contentUrl;
	}

	public void setContentSize(String contentSize){
		this.contentSize = contentSize;
	}

	public String getContentSize(){
		return contentSize;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setEncodingFormat(String encodingFormat){
		this.encodingFormat = encodingFormat;
	}

	public String getEncodingFormat(){
		return encodingFormat;
	}

	public void setThumbnailUrl(String thumbnailUrl){
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getThumbnailUrl(){
		return thumbnailUrl;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	public void setCreativeCommons(String creativeCommons){
		this.creativeCommons = creativeCommons;
	}

	public String getCreativeCommons(){
		return creativeCommons;
	}

	@Override
 	public String toString(){
		return 
			"ValueItem{" + 
			"insightsMetadata = '" + insightsMetadata + '\'' + 
			",hostPageUrl = '" + hostPageUrl + '\'' + 
			",thumbnail = '" + thumbnail + '\'' + 
			",imageId = '" + imageId + '\'' + 
			",accentColor = '" + accentColor + '\'' + 
			",imageInsightsToken = '" + imageInsightsToken + '\'' + 
			",webSearchUrl = '" + webSearchUrl + '\'' + 
			",datePublished = '" + datePublished + '\'' + 
			",hostPageDisplayUrl = '" + hostPageDisplayUrl + '\'' + 
			",contentUrl = '" + contentUrl + '\'' + 
			",contentSize = '" + contentSize + '\'' + 
			",name = '" + name + '\'' + 
			",width = '" + width + '\'' + 
			",encodingFormat = '" + encodingFormat + '\'' + 
			",thumbnailUrl = '" + thumbnailUrl + '\'' + 
			",height = '" + height + '\'' + 
			",creativeCommons = '" + creativeCommons + '\'' + 
			"}";
		}
}