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

import com.fortify.ssc.restclient.ApiException;
import com.fortify.ssc.restclient.model.ApiResult;
import com.fortify.ssc.restclient.model.ApiResultAuthenticationEntity;
import com.fortify.ssc.restclient.model.ApiResultListAuthenticationEntity;
import com.fortify.ssc.restclient.model.AuthenticationEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthEntityOfProjectVersionControllerApi
 */
@Ignore
public class AuthEntityOfProjectVersionControllerApiTest {

    private final AuthEntityOfProjectVersionControllerApi api = new AuthEntityOfProjectVersionControllerApi();

    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAuthEntityOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        String fields = null;
        String embed = null;
        Boolean extractusersfromgroups = null;
        Boolean includeuniversalaccessentities = null;
        String entityname = null;
        ApiResultListAuthenticationEntity response = api.listAuthEntityOfProjectVersion(parentId, fields, embed, extractusersfromgroups, includeuniversalaccessentities, entityname);

        // TODO: test validations
    }
    
    /**
     * read
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAuthEntityOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        Long id = null;
        String fields = null;
        String embed = null;
        ApiResultAuthenticationEntity response = api.readAuthEntityOfProjectVersion(parentId, id, fields, embed);

        // TODO: test validations
    }
    
    /**
     * updateCollection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCollectionAuthEntityOfProjectVersionTest() throws ApiException {
        Long parentId = null;
        List<AuthenticationEntity> data = null;
        ApiResultListAuthenticationEntity response = api.updateCollectionAuthEntityOfProjectVersion(parentId, data);

        // TODO: test validations
    }
    
}
