package edu.gwu.trivia.model.generated

import javax.annotation.Generated
import com.squareup.moshi.Json

@Generated("com.robohorse.robopojogenerator")
data class InsightsMetadata(

	@Json(name="recipeSourcesCount")
	val recipeSourcesCount: Int? = null,

	@Json(name="pagesIncludingCount")
	val pagesIncludingCount: Int? = null,

	@Json(name="availableSizesCount")
	val availableSizesCount: Int? = null,

	@Json(name="bestRepresentativeQuery")
	val bestRepresentativeQuery: BestRepresentativeQuery? = null
)