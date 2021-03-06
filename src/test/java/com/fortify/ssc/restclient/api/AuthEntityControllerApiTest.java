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
import com.fortify.ssc.restclient.model.ApiResultVoid;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthEntityControllerApi
 */
@Ignore
public class AuthEntityControllerApiTest {

    private final AuthEntityControllerApi api = new AuthEntityControllerApi();

    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAuthEntityTest() throws ApiException {
        String fields = null;
        Integer start = null;
        Integer limit = null;
        String q = null;
        Boolean fulltextsearch = null;
        String orderby = null;
        String embed = null;
        String entityname = null;
        String ldaptype = null;
        ApiResultListAuthenticationEntity response = api.listAuthEntity(fields, start, limit, q, fulltextsearch, orderby, embed, entityname, ldaptype);

        // TODO: test validations
    }
    
    /**
     * multiDelete
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void multiDeleteAuthEntityTest() throws ApiException {
        String ids = null;
        ApiResultVoid response = api.multiDeleteAuthEntity(ids);

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
    public void readAuthEntityTest() throws ApiException {
        Long id = null;
        String fields = null;
        String embed = null;
        ApiResultAuthenticationEntity response = api.readAuthEntity(id, fields, embed);

        // TODO: test validations
    }
    
}
