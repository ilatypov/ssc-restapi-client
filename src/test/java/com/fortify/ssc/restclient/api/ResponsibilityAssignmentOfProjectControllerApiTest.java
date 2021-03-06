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
import com.fortify.ssc.restclient.model.ApiResultListResponsibilityAssignment;
import com.fortify.ssc.restclient.model.ApiResultResponsibilityAssignment;
import com.fortify.ssc.restclient.model.ResponsibilityAssignment;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResponsibilityAssignmentOfProjectControllerApi
 */
@Ignore
public class ResponsibilityAssignmentOfProjectControllerApiTest {

    private final ResponsibilityAssignmentOfProjectControllerApi api = new ResponsibilityAssignmentOfProjectControllerApi();

    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listResponsibilityAssignmentOfProjectTest() throws ApiException {
        Long parentId = null;
        String fields = null;
        Integer start = null;
        Integer limit = null;
        String q = null;
        ApiResultListResponsibilityAssignment response = api.listResponsibilityAssignmentOfProject(parentId, fields, start, limit, q);

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
    public void readResponsibilityAssignmentOfProjectTest() throws ApiException {
        Long parentId = null;
        String guid = null;
        String fields = null;
        ApiResultResponsibilityAssignment response = api.readResponsibilityAssignmentOfProject(parentId, guid, fields);

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
    public void updateCollectionResponsibilityAssignmentOfProjectTest() throws ApiException {
        Long parentId = null;
        List<ResponsibilityAssignment> data = null;
        ApiResultListResponsibilityAssignment response = api.updateCollectionResponsibilityAssignmentOfProject(parentId, data);

        // TODO: test validations
    }
    
}
