package edu.gwu.trivia.model.generated

import javax.annotation.Generated
import com.squareup.moshi.Json

@Generated("com.robohorse.robopojogenerator")
data class RelatedSearchesItem(

	@Json(name="displayText")
	val displayText: String? = null,

	@Json(name="searchLink")
	val searchLink: String? = null,

	@Json(name="thumbnail")
	val thumbnail: Thumbnail? = null,

	@Json(name="webSearchUrl")
	val webSearchUrl: String? = null,

	@Json(name="text")
	val text: String? = null
)