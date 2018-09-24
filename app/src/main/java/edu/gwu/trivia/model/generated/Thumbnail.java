package edu.gwu.trivia.model.generated;

import javax.annotation.Generated;
import com.squareup.moshi.Json;

@Generated("com.robohorse.robopojogenerator")
public class Thumbnail{

	@Json(name = "width")
	private int width;

	@Json(name = "height")
	private int height;

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"Thumbnail{" + 
			"width = '" + width + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}