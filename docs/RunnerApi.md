# RunnerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getV1RunnerModels**](RunnerApi.md#getV1RunnerModels) | **GET** v1/runner/models | List configured runner model routes |
| [**postV1RunnerChat**](RunnerApi.md#postV1RunnerChat) | **POST** v1/runner/chat | Multi-turn chat completion |
| [**postV1RunnerGenerate**](RunnerApi.md#postV1RunnerGenerate) | **POST** v1/runner/generate | Single-prompt generation |



List configured runner model routes



### Example
```kotlin
// Import classes:
//import ai.lthn.sdk.*
//import ai.lthn.sdk.infrastructure.*
//import ai.lthn.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(RunnerApi::class.java)

val result : GetV1RunnerModels200Response = webService.getV1RunnerModels()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetV1RunnerModels200Response**](GetV1RunnerModels200Response.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Multi-turn chat completion



### Example
```kotlin
// Import classes:
//import ai.lthn.sdk.*
//import ai.lthn.sdk.infrastructure.*
//import ai.lthn.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(RunnerApi::class.java)
val postV1RunnerChatRequest : PostV1RunnerChatRequest =  // PostV1RunnerChatRequest | 

val result : PostV1RunnerChat200Response = webService.postV1RunnerChat(postV1RunnerChatRequest)
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postV1RunnerChatRequest** | [**PostV1RunnerChatRequest**](PostV1RunnerChatRequest.md)|  | |

### Return type

[**PostV1RunnerChat200Response**](PostV1RunnerChat200Response.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Single-prompt generation



### Example
```kotlin
// Import classes:
//import ai.lthn.sdk.*
//import ai.lthn.sdk.infrastructure.*
//import ai.lthn.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(RunnerApi::class.java)
val postV1RunnerGenerateRequest : PostV1RunnerGenerateRequest =  // PostV1RunnerGenerateRequest | 

val result : PostV1RunnerChat200Response = webService.postV1RunnerGenerate(postV1RunnerGenerateRequest)
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postV1RunnerGenerateRequest** | [**PostV1RunnerGenerateRequest**](PostV1RunnerGenerateRequest.md)|  | |

### Return type

[**PostV1RunnerChat200Response**](PostV1RunnerChat200Response.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

