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
import com.fortify.ssc.restclient.model.ApiResultCloudWorker;
import com.fortify.ssc.restclient.model.ApiResultListCloudWorker;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloudWorkerControllerApi {
    private ApiClient apiClient;

    public CloudWorkerControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CloudWorkerControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listCloudWorker
     * @param fields Output fields (optional)
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param q A search-spec of full text search query (see fulltextsearch parameter) (optional)
     * @param fulltextsearch If &#39;true&#39;, interpret &#39;q&#39; parameter as full text search query, defaults to &#39;false&#39; (optional, default to false)
     * @param orderby Fields to order by (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listCloudWorkerCall(String fields, Integer start, Integer limit, String q, Boolean fulltextsearch, String orderby, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/cloudworkers";

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
        if (fulltextsearch != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fulltextsearch", fulltextsearch));
        if (orderby != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("orderby", orderby));

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
    private com.squareup.okhttp.Call listCloudWorkerValidateBeforeCall(String fields, Integer start, Integer limit, String q, Boolean fulltextsearch, String orderby, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listCloudWorkerCall(fields, start, limit, q, fulltextsearch, orderby, progressListener, progressRequestListener);
        return call;

    }

    /**
     * list
     * 
     * @param fields Output fields (optional)
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param q A search-spec of full text search query (see fulltextsearch parameter) (optional)
     * @param fulltextsearch If &#39;true&#39;, interpret &#39;q&#39; parameter as full text search query, defaults to &#39;false&#39; (optional, default to false)
     * @param orderby Fields to order by (optional)
     * @return ApiResultListCloudWorker
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultListCloudWorker listCloudWorker(String fields, Integer start, Integer limit, String q, Boolean fulltextsearch, String orderby) throws ApiException {
        ApiResponse<ApiResultListCloudWorker> resp = listCloudWorkerWithHttpInfo(fields, start, limit, q, fulltextsearch, orderby);
        return resp.getData();
    }

    /**
     * list
     * 
     * @param fields Output fields (optional)
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param q A search-spec of full text search query (see fulltextsearch parameter) (optional)
     * @param fulltextsearch If &#39;true&#39;, interpret &#39;q&#39; parameter as full text search query, defaults to &#39;false&#39; (optional, default to false)
     * @param orderby Fields to order by (optional)
     * @return ApiResponse&lt;ApiResultListCloudWorker&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultListCloudWorker> listCloudWorkerWithHttpInfo(String fields, Integer start, Integer limit, String q, Boolean fulltextsearch, String orderby) throws ApiException {
        com.squareup.okhttp.Call call = listCloudWorkerValidateBeforeCall(fields, start, limit, q, fulltextsearch, orderby, null, null);
        Type localVarReturnType = new TypeToken<ApiResultListCloudWorker>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * list (asynchronously)
     * 
     * @param fields Output fields (optional)
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param q A search-spec of full text search query (see fulltextsearch parameter) (optional)
     * @param fulltextsearch If &#39;true&#39;, interpret &#39;q&#39; parameter as full text search query, defaults to &#39;false&#39; (optional, default to false)
     * @param orderby Fields to order by (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listCloudWorkerAsync(String fields, Integer start, Integer limit, String q, Boolean fulltextsearch, String orderby, final ApiCallback<ApiResultListCloudWorker> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listCloudWorkerValidateBeforeCall(fields, start, limit, q, fulltextsearch, orderby, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultListCloudWorker>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for readCloudWorker
     * @param uuid uuid (required)
     * @param fields Output fields (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readCloudWorkerCall(String uuid, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/cloudworkers/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));

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
    private com.squareup.okhttp.Call readCloudWorkerValidateBeforeCall(String uuid, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling readCloudWorker(Async)");
        }
        

        com.squareup.okhttp.Call call = readCloudWorkerCall(uuid, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * read
     * 
     * @param uuid uuid (required)
     * @param fields Output fields (optional)
     * @return ApiResultCloudWorker
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultCloudWorker readCloudWorker(String uuid, String fields) throws ApiException {
        ApiResponse<ApiResultCloudWorker> resp = readCloudWorkerWithHttpInfo(uuid, fields);
        return resp.getData();
    }

    /**
     * read
     * 
     * @param uuid uuid (required)
     * @param fields Output fields (optional)
     * @return ApiResponse&lt;ApiResultCloudWorker&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultCloudWorker> readCloudWorkerWithHttpInfo(String uuid, String fields) throws ApiException {
        com.squareup.okhttp.Call call = readCloudWorkerValidateBeforeCall(uuid, fields, null, null);
        Type localVarReturnType = new TypeToken<ApiResultCloudWorker>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * read (asynchronously)
     * 
     * @param uuid uuid (required)
     * @param fields Output fields (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readCloudWorkerAsync(String uuid, String fields, final ApiCallback<ApiResultCloudWorker> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readCloudWorkerValidateBeforeCall(uuid, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultCloudWorker>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}