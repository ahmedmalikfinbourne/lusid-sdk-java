/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3445
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.api;

import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.model.CreateCutLabelDefinitionRequest;
import com.finbourne.lusid.model.CutLabelDefinition;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.PagedResourceListOfCutLabelDefinition;
import com.finbourne.lusid.model.UpdateCutLabelDefinitionRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CutLabelDefinitionsApi
 */
@Ignore
public class CutLabelDefinitionsApiTest {

    private final CutLabelDefinitionsApi api = new CutLabelDefinitionsApi();

    
    /**
     * [EARLY ACCESS] Create a Cut Label
     *
     * Create a Cut Label valid in all scopes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCutLabelDefinitionTest() throws ApiException {
        CreateCutLabelDefinitionRequest createCutLabelDefinitionRequest = null;
        CutLabelDefinition response = api.createCutLabelDefinition(createCutLabelDefinitionRequest);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Delete a Cut Label
     *
     * Delete a specified cut label
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCutLabelDefinitionTest() throws ApiException {
        String code = null;
        OffsetDateTime response = api.deleteCutLabelDefinition(code);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Get a Cut Label
     *
     * Get a specified cut label at a given time
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCutLabelDefinitionTest() throws ApiException {
        String code = null;
        OffsetDateTime asAt = null;
        CutLabelDefinition response = api.getCutLabelDefinition(code, asAt);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] List Existing Cut Labels
     *
     * List all the Cut Label Definitions that are valid at the given AsAt time
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCutLabelDefinitionsTest() throws ApiException {
        OffsetDateTime asAt = null;
        List<String> sortBy = null;
        Integer start = null;
        Integer limit = null;
        String filter = null;
        String page = null;
        PagedResourceListOfCutLabelDefinition response = api.listCutLabelDefinitions(asAt, sortBy, start, limit, filter, page);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Update a Cut Label
     *
     * Update a specified cut label
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCutLabelDefinitionTest() throws ApiException {
        String code = null;
        UpdateCutLabelDefinitionRequest updateCutLabelDefinitionRequest = null;
        CutLabelDefinition response = api.updateCutLabelDefinition(code, updateCutLabelDefinitionRequest);

        // TODO: test validations
    }
    
}
