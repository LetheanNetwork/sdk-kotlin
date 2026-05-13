package ai.lthn.sdk.apis

import ai.lthn.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

import ai.lthn.sdk.models.GetHealth429Response
import ai.lthn.sdk.models.GetV1RunnerModels200Response
import ai.lthn.sdk.models.PostV1RunnerChat200Response
import ai.lthn.sdk.models.PostV1RunnerChatRequest
import ai.lthn.sdk.models.PostV1RunnerGenerateRequest

interface RunnerApi {
    /**
     * GET v1/runner/models
     * List configured runner model routes
     * 
     * Responses:
     *  - 200: Successful response
     *  - 400: Bad request
     *  - 401: Unauthorised
     *  - 403: Forbidden
     *  - 429: Too many requests
     *  - 500: Internal server error
     *  - 504: Gateway timeout
     *
     * @return [Call]<[GetV1RunnerModels200Response]>
     */
    @GET("v1/runner/models")
    fun getV1RunnerModels(): Call<GetV1RunnerModels200Response>

    /**
     * POST v1/runner/chat
     * Multi-turn chat completion
     * 
     * Responses:
     *  - 200: Successful response
     *  - 400: Bad request
     *  - 401: Unauthorised
     *  - 403: Forbidden
     *  - 429: Too many requests
     *  - 500: Internal server error
     *  - 504: Gateway timeout
     *
     * @param postV1RunnerChatRequest 
     * @return [Call]<[PostV1RunnerChat200Response]>
     */
    @POST("v1/runner/chat")
    fun postV1RunnerChat(@Body postV1RunnerChatRequest: PostV1RunnerChatRequest): Call<PostV1RunnerChat200Response>

    /**
     * POST v1/runner/generate
     * Single-prompt generation
     * 
     * Responses:
     *  - 200: Successful response
     *  - 400: Bad request
     *  - 401: Unauthorised
     *  - 403: Forbidden
     *  - 429: Too many requests
     *  - 500: Internal server error
     *  - 504: Gateway timeout
     *
     * @param postV1RunnerGenerateRequest 
     * @return [Call]<[PostV1RunnerChat200Response]>
     */
    @POST("v1/runner/generate")
    fun postV1RunnerGenerate(@Body postV1RunnerGenerateRequest: PostV1RunnerGenerateRequest): Call<PostV1RunnerChat200Response>

}
