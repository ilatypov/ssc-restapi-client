/*
 * Fortify Software Security Center API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1:18.20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.fortify.ssc.restclient.api;

import com.fortify.ssc.restclient.ApiCallback;
import com.fortify.ssc.restclient.ApiClient;
import com.fortify.ssc.restclient.ApiException;
import com.fortify.ssc.restclient.ApiResponse;
import com.fortify.ssc.restclient.Configuration;
import com.fortify.ssc.restclient.Pair;
import com.fortify.ssc.restclient.ProgressRequestBody;
import com.fortify.ssc.restclient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.fortify.ssc.restclient.model.ApiResult;
import com.fortify.ssc.restclient.model.ApiResultCustomTag;
import com.fortify.ssc.restclient.model.ApiResultListCustomTag;
import com.fortify.ssc.restclient.model.CustomTag;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomTagOfProjectVersionControllerApi {
    private ApiClient apiClient;

    public CustomTagOfProjectVersionControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomTagOfProjectVersionControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createCustomTagOfProjectVersion
     * @param parentId parentId (required)
     * @param resource resource (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createCustomTagOfProjectVersionCall(Long parentId, CustomTag resource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = resource;

        // create path and map variables
        String localVarPath = "/projectVersions/{parentId}/customTags"
            .replaceAll("\\{" + "parentId" + "\\}", apiClient.escapeString(parentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "FortifyToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createCustomTagOfProjectVersionValidateBeforeCall(Long parentId, CustomTag resource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'parentId' is set
        if (parentId == null) {
            throw new ApiException("Missing the required parameter 'parentId' when calling createCustomTagOfProjectVersion(Async)");
        }
        
        // verify the required parameter 'resource' is set
        if (resource == null) {
            throw new ApiException("Missing the required parameter 'resource' when calling createCustomTagOfProjectVersion(Async)");
        }
        

        com.squareup.okhttp.Call call = createCustomTagOfProjectVersionCall(parentId, resource, progressListener, progressRequestListener);
        return call;

    }

    /**
     * create
     * 
     * @param parentId parentId (required)
     * @param resource resource (required)
     * @return ApiResultCustomTag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultCustomTag createCustomTagOfProjectVersion(Long parentId, CustomTag resource) throws ApiException {
        ApiResponse<ApiResultCustomTag> resp = createCustomTagOfProjectVersionWithHttpInfo(parentId, resource);
        return resp.getData();
    }

    /**
     * create
     * 
     * @param parentId parentId (required)
     * @param resource resource (required)
     * @return ApiResponse&lt;ApiResultCustomTag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultCustomTag> createCustomTagOfProjectVersionWithHttpInfo(Long parentId, CustomTag resource) throws ApiException {
        com.squareup.okhttp.Call call = createCustomTagOfProjectVersionValidateBeforeCall(parentId, resource, null, null);
        Type localVarReturnType = new TypeToken<ApiResultCustomTag>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * create (asynchronously)
     * 
     * @param parentId parentId (required)
     * @param resource resource (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createCustomTagOfProjectVersionAsync(Long parentId, CustomTag resource, final ApiCallback<ApiResultCustomTag> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createCustomTagOfProjectVersionValidateBeforeCall(parentId, resource, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultCustomTag>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listCustomTagOfProjectVersion
     * @param parentId parentId (required)
     * @param fields Output fields (optional)
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param q A search query (optional)
     * @param orderby Fields to order by (optional)
     * @param includeall includeall (optional, default to false)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listCustomTagOfProjectVersionCall(Long parentId, String fields, Integer start, Integer limit, String q, String orderby, Boolean includeall, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/projectVersions/{parentId}/customTags"
            .replaceAll("\\{" + "parentId" + "\\}", apiClient.escapeString(parentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("q", q));
        if (orderby != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("orderby", orderby));
        if (includeall != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("includeall", includeall));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "FortifyToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listCustomTagOfProjectVersionValidateBeforeCall(Long parentId, String fields, Integer start, Integer limit, String q, String orderby, Boolean includeall, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'parentId' is set
        if (parentId == null) {
            throw new ApiException("Missing the required parameter 'parentId' when calling listCustomTagOfProjectVersion(Async)");
        }
        

        com.squareup.okhttp.Call call = listCustomTagOfProjectVersionCall(parentId, fields, start, limit, q, orderby, includeall, progressListener, progressRequestListener);
        return call;

    }

    /**
     * list
     * 
     * @param parentId parentId (required)
     * @param fields Output fields (optional)
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param q A search query (optional)
     * @param orderby Fields to order by (optional)
     * @param includeall includeall (optional, default to false)
     * @return ApiResultListCustomTag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultListCustomTag listCustomTagOfProjectVersion(Long parentId, String fields, Integer start, Integer limit, String q, String orderby, Boolean includeall) throws ApiException {
        ApiResponse<ApiResultListCustomTag> resp = listCustomTagOfProjectVersionWithHttpInfo(parentId, fields, start, limit, q, orderby, includeall);
        return resp.getData();
    }

    /**
     * list
     * 
     * @param parentId parentId (required)
     * @param fields Output fields (optional)
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param q A search query (optional)
     * @param orderby Fields to order by (optional)
     * @param includeall includeall (optional, default to false)
     * @return ApiResponse&lt;ApiResultListCustomTag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultListCustomTag> listCustomTagOfProjectVersionWithHttpInfo(Long parentId, String fields, Integer start, Integer limit, String q, String orderby, Boolean includeall) throws ApiException {
        com.squareup.okhttp.Call call = listCustomTagOfProjectVersionValidateBeforeCall(parentId, fields, start, limit, q, orderby, includeall, null, null);
        Type localVarReturnType = new TypeToken<ApiResultListCustomTag>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * list (asynchronously)
     * 
     * @param parentId parentId (required)
     * @param fields Output fields (optional)
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param q A search query (optional)
     * @param orderby Fields to order by (optional)
     * @param includeall includeall (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listCustomTagOfProjectVersionAsync(Long parentId, String fields, Integer start, Integer limit, String q, String orderby, Boolean includeall, final ApiCallback<ApiResultListCustomTag> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listCustomTagOfProjectVersionValidateBeforeCall(parentId, fields, start, limit, q, orderby, includeall, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultListCustomTag>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateCollectionCustomTagOfProjectVersion
     * @param parentId parentId (required)
     * @param data data (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCollectionCustomTagOfProjectVersionCall(Long parentId, List<CustomTag> data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;

        // create path and map variables
        String localVarPath = "/projectVersions/{parentId}/customTags"
            .replaceAll("\\{" + "parentId" + "\\}", apiClient.escapeString(parentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "FortifyToken" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateCollectionCustomTagOfProjectVersionValidateBeforeCall(Long parentId, List<CustomTag> data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'parentId' is set
        if (parentId == null) {
            throw new ApiException("Missing the required parameter 'parentId' when calling updateCollectionCustomTagOfProjectVersion(Async)");
        }
        
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling updateCollectionCustomTagOfProjectVersion(Async)");
        }
        

        com.squareup.okhttp.Call call = updateCollectionCustomTagOfProjectVersionCall(parentId, data, progressListener, progressRequestListener);
        return call;

    }

    /**
     * updateCollection
     * 
     * @param parentId parentId (required)
     * @param data data (required)
     * @return ApiResultListCustomTag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultListCustomTag updateCollectionCustomTagOfProjectVersion(Long parentId, List<CustomTag> data) throws ApiException {
        ApiResponse<ApiResultListCustomTag> resp = updateCollectionCustomTagOfProjectVersionWithHttpInfo(parentId, data);
        return resp.getData();
    }

    /**
     * updateCollection
     * 
     * @param parentId parentId (required)
     * @param data data (required)
     * @return ApiResponse&lt;ApiResultListCustomTag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultListCustomTag> updateCollectionCustomTagOfProjectVersionWithHttpInfo(Long parentId, List<CustomTag> data) throws ApiException {
        com.squareup.okhttp.Call call = updateCollectionCustomTagOfProjectVersionValidateBeforeCall(parentId, data, null, null);
        Type localVarReturnType = new TypeToken<ApiResultListCustomTag>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * updateCollection (asynchronously)
     * 
     * @param parentId parentId (required)
     * @param data data (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCollectionCustomTagOfProjectVersionAsync(Long parentId, List<CustomTag> data, final ApiCallback<ApiResultListCustomTag> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateCollectionCustomTagOfProjectVersionValidateBeforeCall(parentId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultListCustomTag>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateCustomTagOfProjectVersion
     * @param parentId parentId (required)
     * @param id id (required)
     * @param data data (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCustomTagOfProjectVersionCall(Long parentId, Long id, CustomTag data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;

        // create path and map variables
        String localVarPath = "/projectVersions/{parentId}/customTags/{id}"
            .replaceAll("\\{" + "parentId" + "\\}", apiClient.escapeString(parentId.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "FortifyToken" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateCustomTagOfProjectVersionValidateBeforeCall(Long parentId, Long id, CustomTag data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'parentId' is set
        if (parentId == null) {
            throw new ApiException("Missing the required parameter 'parentId' when calling updateCustomTagOfProjectVersion(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateCustomTagOfProjectVersion(Async)");
        }
        
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling updateCustomTagOfProjectVersion(Async)");
        }
        

        com.squareup.okhttp.Call call = updateCustomTagOfProjectVersionCall(parentId, id, data, progressListener, progressRequestListener);
        return call;

    }

    /**
     * update
     * 
     * @param parentId parentId (required)
     * @param id id (required)
     * @param data data (required)
     * @return ApiResultCustomTag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultCustomTag updateCustomTagOfProjectVersion(Long parentId, Long id, CustomTag data) throws ApiException {
        ApiResponse<ApiResultCustomTag> resp = updateCustomTagOfProjectVersionWithHttpInfo(parentId, id, data);
        return resp.getData();
    }

    /**
     * update
     * 
     * @param parentId parentId (required)
     * @param id id (required)
     * @param data data (required)
     * @return ApiResponse&lt;ApiResultCustomTag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultCustomTag> updateCustomTagOfProjectVersionWithHttpInfo(Long parentId, Long id, CustomTag data) throws ApiException {
        com.squareup.okhttp.Call call = updateCustomTagOfProjectVersionValidateBeforeCall(parentId, id, data, null, null);
        Type localVarReturnType = new TypeToken<ApiResultCustomTag>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * update (asynchronously)
     * 
     * @param parentId parentId (required)
     * @param id id (required)
     * @param data data (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCustomTagOfProjectVersionAsync(Long parentId, Long id, CustomTag data, final ApiCallback<ApiResultCustomTag> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateCustomTagOfProjectVersionValidateBeforeCall(parentId, id, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultCustomTag>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
