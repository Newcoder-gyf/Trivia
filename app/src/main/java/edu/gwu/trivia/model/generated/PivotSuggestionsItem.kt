package edu.gwu.trivia.model.generated

import javax.annotation.Generated
import com.squareup.moshi.Json

@Generated("com.robohorse.robopojogenerator")
data class PivotSuggestionsItem(

	@Json(name="pivot")
	val pivot: String? = null,

	@Json(name="suggestions")
	val suggestions: List<SuggestionsItem?>? = null
)