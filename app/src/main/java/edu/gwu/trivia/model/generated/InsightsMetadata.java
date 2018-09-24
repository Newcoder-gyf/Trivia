package edu.gwu.trivia.model.generated;

import javax.annotation.Generated;
import com.squareup.moshi.Json;

@Generated("com.robohorse.robopojogenerator")
public class InsightsMetadata{

	@Json(name = "recipeSourcesCount")
	private int recipeSourcesCount;

	@Json(name = "pagesIncludingCount")
	private int pagesIncludingCount;

	@Json(name = "availableSizesCount")
	private int availableSizesCount;

	@Json(name = "bestRepresentativeQuery")
	private BestRepresentativeQuery bestRepresentativeQuery;

	public void setRecipeSourcesCount(int recipeSourcesCount){
		this.recipeSourcesCount = recipeSourcesCount;
	}

	public int getRecipeSourcesCount(){
		return recipeSourcesCount;
	}

	public void setPagesIncludingCount(int pagesIncludingCount){
		this.pagesIncludingCount = pagesIncludingCount;
	}

	public int getPagesIncludingCount(){
		return pagesIncludingCount;
	}

	public void setAvailableSizesCount(int availableSizesCount){
		this.availableSizesCount = availableSizesCount;
	}

	public int getAvailableSizesCount(){
		return availableSizesCount;
	}

	public void setBestRepresentativeQuery(BestRepresentativeQuery bestRepresentativeQuery){
		this.bestRepresentativeQuery = bestRepresentativeQuery;
	}

	public BestRepresentativeQuery getBestRepresentativeQuery(){
		return bestRepresentativeQuery;
	}

	@Override
 	public String toString(){
		return 
			"InsightsMetadata{" + 
			"recipeSourcesCount = '" + recipeSourcesCount + '\'' + 
			",pagesIncludingCount = '" + pagesIncludingCount + '\'' + 
			",availableSizesCount = '" + availableSizesCount + '\'' + 
			",bestRepresentativeQuery = '" + bestRepresentativeQuery + '\'' + 
			"}";
		}
}