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
import com.fortify.ssc.restclient.model.ApiResultListRole;
import com.fortify.ssc.restclient.model.ApiResultRole;
import com.fortify.ssc.restclient.model.ApiResultVoid;
import com.fortify.ssc.restclient.model.Role;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoleControllerApi {
    private ApiClient apiClient;

    public RoleControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RoleControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createRole
     * @param resource resource (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createRoleCall(Role resource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = resource;

        // create path and map variables
        String localVarPath = "/roles";

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
    private com.squareup.okhttp.Call createRoleValidateBeforeCall(Role resource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'resource' is set
        if (resource == null) {
            throw new ApiException("Missing the required parameter 'resource' when calling createRole(Async)");
        }
        

        com.squareup.okhttp.Call call = createRoleCall(resource, progressListener, progressRequestListener);
        return call;

    }

    /**
     * create
     * 
     * @param resource resource (required)
     * @return ApiResultRole
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultRole createRole(Role resource) throws ApiException {
        ApiResponse<ApiResultRole> resp = createRoleWithHttpInfo(resource);
        return resp.getData();
    }

    /**
     * create
     * 
     * @param resource resource (required)
     * @return ApiResponse&lt;ApiResultRole&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultRole> createRoleWithHttpInfo(Role resource) throws ApiException {
        com.squareup.okhttp.Call call = createRoleValidateBeforeCall(resource, null, null);
        Type localVarReturnType = new TypeToken<ApiResultRole>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * create (asynchronously)
     * 
     * @param resource resource (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createRoleAsync(Role resource, final ApiCallback<ApiResultRole> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createRoleValidateBeforeCall(resource, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultRole>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteRole
     * @param id id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteRoleCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/roles/{id}"
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteRoleValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteRole(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteRoleCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * delete
     * 
     * @param id id (required)
     * @return ApiResultVoid
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultVoid deleteRole(String id) throws ApiException {
        ApiResponse<ApiResultVoid> resp = deleteRoleWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * delete
     * 
     * @param id id (required)
     * @return ApiResponse&lt;ApiResultVoid&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultVoid> deleteRoleWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteRoleValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<ApiResultVoid>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * delete (asynchronously)
     * 
     * @param id id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteRoleAsync(String id, final ApiCallback<ApiResultVoid> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteRoleValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultVoid>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listRole
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param q A search query (optional)
     * @param orderby Fields to order by (optional)
     * @param fields Output fields (optional)
     * @param excludeuseronly excludeuseronly (optional, default to false)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listRoleCall(Integer start, Integer limit, String q, String orderby, String fields, Boolean excludeuseronly, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/roles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("q", q));
        if (orderby != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("orderby", orderby));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));
        if (excludeuseronly != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("excludeuseronly", excludeuseronly));

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
    private com.squareup.okhttp.Call listRoleValidateBeforeCall(Integer start, Integer limit, String q, String orderby, String fields, Boolean excludeuseronly, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listRoleCall(start, limit, q, orderby, fields, excludeuseronly, progressListener, progressRequestListener);
        return call;

    }

    /**
     * list
     * 
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param q A search query (optional)
     * @param orderby Fields to order by (optional)
     * @param fields Output fields (optional)
     * @param excludeuseronly excludeuseronly (optional, default to false)
     * @return ApiResultListRole
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultListRole listRole(Integer start, Integer limit, String q, String orderby, String fields, Boolean excludeuseronly) throws ApiException {
        ApiResponse<ApiResultListRole> resp = listRoleWithHttpInfo(start, limit, q, orderby, fields, excludeuseronly);
        return resp.getData();
    }

    /**
     * list
     * 
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param q A search query (optional)
     * @param orderby Fields to order by (optional)
     * @param fields Output fields (optional)
     * @param excludeuseronly excludeuseronly (optional, default to false)
     * @return ApiResponse&lt;ApiResultListRole&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultListRole> listRoleWithHttpInfo(Integer start, Integer limit, String q, String orderby, String fields, Boolean excludeuseronly) throws ApiException {
        com.squareup.okhttp.Call call = listRoleValidateBeforeCall(start, limit, q, orderby, fields, excludeuseronly, null, null);
        Type localVarReturnType = new TypeToken<ApiResultListRole>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * list (asynchronously)
     * 
     * @param start A start offset in object listing (optional, default to 0)
     * @param limit A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied (optional, default to 200)
     * @param q A search query (optional)
     * @param orderby Fields to order by (optional)
     * @param fields Output fields (optional)
     * @param excludeuseronly excludeuseronly (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listRoleAsync(Integer start, Integer limit, String q, String orderby, String fields, Boolean excludeuseronly, final ApiCallback<ApiResultListRole> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listRoleValidateBeforeCall(start, limit, q, orderby, fields, excludeuseronly, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultListRole>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for multiDeleteRole
     * @param ids A comma-separated list of resource identifiers (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call multiDeleteRoleCall(String ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/roles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ids", ids));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call multiDeleteRoleValidateBeforeCall(String ids, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException("Missing the required parameter 'ids' when calling multiDeleteRole(Async)");
        }
        

        com.squareup.okhttp.Call call = multiDeleteRoleCall(ids, progressListener, progressRequestListener);
        return call;

    }

    /**
     * multiDelete
     * 
     * @param ids A comma-separated list of resource identifiers (required)
     * @return ApiResultVoid
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultVoid multiDeleteRole(String ids) throws ApiException {
        ApiResponse<ApiResultVoid> resp = multiDeleteRoleWithHttpInfo(ids);
        return resp.getData();
    }

    /**
     * multiDelete
     * 
     * @param ids A comma-separated list of resource identifiers (required)
     * @return ApiResponse&lt;ApiResultVoid&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultVoid> multiDeleteRoleWithHttpInfo(String ids) throws ApiException {
        com.squareup.okhttp.Call call = multiDeleteRoleValidateBeforeCall(ids, null, null);
        Type localVarReturnType = new TypeToken<ApiResultVoid>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * multiDelete (asynchronously)
     * 
     * @param ids A comma-separated list of resource identifiers (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call multiDeleteRoleAsync(String ids, final ApiCallback<ApiResultVoid> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = multiDeleteRoleValidateBeforeCall(ids, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultVoid>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for readRole
     * @param id id (required)
     * @param fields Output fields (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readRoleCall(String id, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/roles/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
    private com.squareup.okhttp.Call readRoleValidateBeforeCall(String id, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling readRole(Async)");
        }
        

        com.squareup.okhttp.Call call = readRoleCall(id, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * read
     * 
     * @param id id (required)
     * @param fields Output fields (optional)
     * @return ApiResultRole
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultRole readRole(String id, String fields) throws ApiException {
        ApiResponse<ApiResultRole> resp = readRoleWithHttpInfo(id, fields);
        return resp.getData();
    }

    /**
     * read
     * 
     * @param id id (required)
     * @param fields Output fields (optional)
     * @return ApiResponse&lt;ApiResultRole&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultRole> readRoleWithHttpInfo(String id, String fields) throws ApiException {
        com.squareup.okhttp.Call call = readRoleValidateBeforeCall(id, fields, null, null);
        Type localVarReturnType = new TypeToken<ApiResultRole>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * read (asynchronously)
     * 
     * @param id id (required)
     * @param fields Output fields (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readRoleAsync(String id, String fields, final ApiCallback<ApiResultRole> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readRoleValidateBeforeCall(id, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultRole>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateRole
     * @param id id (required)
     * @param resource resource (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateRoleCall(String id, Role resource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = resource;

        // create path and map variables
        String localVarPath = "/roles/{id}"
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
    private com.squareup.okhttp.Call updateRoleValidateBeforeCall(String id, Role resource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateRole(Async)");
        }
        
        // verify the required parameter 'resource' is set
        if (resource == null) {
            throw new ApiException("Missing the required parameter 'resource' when calling updateRole(Async)");
        }
        

        com.squareup.okhttp.Call call = updateRoleCall(id, resource, progressListener, progressRequestListener);
        return call;

    }

    /**
     * update
     * 
     * @param id id (required)
     * @param resource resource (required)
     * @return ApiResultRole
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResultRole updateRole(String id, Role resource) throws ApiException {
        ApiResponse<ApiResultRole> resp = updateRoleWithHttpInfo(id, resource);
        return resp.getData();
    }

    /**
     * update
     * 
     * @param id id (required)
     * @param resource resource (required)
     * @return ApiResponse&lt;ApiResultRole&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResultRole> updateRoleWithHttpInfo(String id, Role resource) throws ApiException {
        com.squareup.okhttp.Call call = updateRoleValidateBeforeCall(id, resource, null, null);
        Type localVarReturnType = new TypeToken<ApiResultRole>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * update (asynchronously)
     * 
     * @param id id (required)
     * @param resource resource (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateRoleAsync(String id, Role resource, final ApiCallback<ApiResultRole> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateRoleValidateBeforeCall(id, resource, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResultRole>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}