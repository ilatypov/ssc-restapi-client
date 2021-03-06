# AuditAssistantStatusOfProjectVersionControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAuditAssistantStatusOfProjectVersion**](AuditAssistantStatusOfProjectVersionControllerApi.md#listAuditAssistantStatusOfProjectVersion) | **GET** /projectVersions/{parentId}/auditAssistantStatus | list


<a name="listAuditAssistantStatusOfProjectVersion"></a>
# **listAuditAssistantStatusOfProjectVersion**
> ApiResultListAuditAssistantStatus listAuditAssistantStatusOfProjectVersion(parentId, fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AuditAssistantStatusOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AuditAssistantStatusOfProjectVersionControllerApi apiInstance = new AuditAssistantStatusOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListAuditAssistantStatus result = apiInstance.listAuditAssistantStatusOfProjectVersion(parentId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditAssistantStatusOfProjectVersionControllerApi#listAuditAssistantStatusOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListAuditAssistantStatus**](ApiResultListAuditAssistantStatus.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

