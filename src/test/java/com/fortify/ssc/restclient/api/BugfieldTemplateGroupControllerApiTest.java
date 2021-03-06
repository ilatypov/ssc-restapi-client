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
import com.fortify.ssc.restclient.model.ApiResultBugfieldTemplateGroupDto;
import com.fortify.ssc.restclient.model.ApiResultListBugfieldTemplateGroupDto;
import com.fortify.ssc.restclient.model.ApiResultVoid;
import com.fortify.ssc.restclient.model.BugfieldTemplateGroupDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BugfieldTemplateGroupControllerApi
 */
@Ignore
public class BugfieldTemplateGroupControllerApiTest {

    private final BugfieldTemplateGroupControllerApi api = new BugfieldTemplateGroupControllerApi();

    
    /**
     * create
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBugfieldTemplateGroupTest() throws ApiException {
        BugfieldTemplateGroupDto data = null;
        ApiResultBugfieldTemplateGroupDto response = api.createBugfieldTemplateGroup(data);

        // TODO: test validations
    }
    
    /**
     * delete
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBugfieldTemplateGroupTest() throws ApiException {
        Long id = null;
        ApiResultVoid response = api.deleteBugfieldTemplateGroup(id);

        // TODO: test validations
    }
    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listBugfieldTemplateGroupTest() throws ApiException {
        String fields = null;
        ApiResultListBugfieldTemplateGroupDto response = api.listBugfieldTemplateGroup(fields);

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
    public void multiDeleteBugfieldTemplateGroupTest() throws ApiException {
        String ids = null;
        ApiResultVoid response = api.multiDeleteBugfieldTemplateGroup(ids);

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
    public void readBugfieldTemplateGroupTest() throws ApiException {
        Long id = null;
        String fields = null;
        ApiResultBugfieldTemplateGroupDto response = api.readBugfieldTemplateGroup(id, fields);

        // TODO: test validations
    }
    
    /**
     * update
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBugfieldTemplateGroupTest() throws ApiException {
        Long id = null;
        BugfieldTemplateGroupDto resource = null;
        ApiResultBugfieldTemplateGroupDto response = api.updateBugfieldTemplateGroup(id, resource);

        // TODO: test validations
    }
    
}
