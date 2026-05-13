package ai.lthn.sdk.apis

import ai.lthn.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

import ai.lthn.sdk.models.GetHealth200Response
import ai.lthn.sdk.models.GetHealth429Response

interface SystemApi {
    /**
     * GET health
     * Health check
     * Returns server health status
     * Responses:
     *  - 200: Server is healthy
     *  - 429: Too many requests
     *  - 500: Internal server error
     *  - 504: Gateway timeout
     *
     * @return [Call]<[GetHealth200Response]>
     */
    @GET("health")
    fun getHealth(): Call<GetHealth200Response>

}
