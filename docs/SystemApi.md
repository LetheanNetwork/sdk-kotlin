# SystemApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getHealth**](SystemApi.md#getHealth) | **GET** health | Health check |



Health check

Returns server health status

### Example
```kotlin
// Import classes:
//import ai.lthn.sdk.*
//import ai.lthn.sdk.infrastructure.*
//import ai.lthn.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SystemApi::class.java)

val result : GetHealth200Response = webService.getHealth()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetHealth200Response**](GetHealth200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

