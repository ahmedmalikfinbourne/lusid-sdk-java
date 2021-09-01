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
import com.finbourne.lusid.model.Allocation;
import com.finbourne.lusid.model.AllocationSetRequest;
import com.finbourne.lusid.model.DeletedEntityResponse;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.PagedResourceListOfAllocation;
import com.finbourne.lusid.model.ResourceListOfAllocation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AllocationsApi
 */
@Ignore
public class AllocationsApiTest {

    private final AllocationsApi api = new AllocationsApi();

    
    /**
     * [EARLY ACCESS] Delete allocation
     *
     * Delete an allocation. Deletion will be valid from the allocation&#39;s creation datetime.  This means that the allocation will no longer exist at any effective datetime from the asAt datetime of deletion.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAllocationTest() throws ApiException {
        String scope = null;
        String code = null;
        DeletedEntityResponse response = api.deleteAllocation(scope, code);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Get Allocation
     *
     * Fetch an Allocation matching the provided identifier
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllocationTest() throws ApiException {
        String scope = null;
        String code = null;
        OffsetDateTime asAt = null;
        List<String> propertyKeys = null;
        Allocation response = api.getAllocation(scope, code, asAt, propertyKeys);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] List Allocations
     *
     * Fetch the last pre-AsAt date version of each allocation in scope (does not fetch the entire history).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAllocationsTest() throws ApiException {
        OffsetDateTime asAt = null;
        String page = null;
        List<String> sortBy = null;
        Integer start = null;
        Integer limit = null;
        String filter = null;
        List<String> propertyKeys = null;
        PagedResourceListOfAllocation response = api.listAllocations(asAt, page, sortBy, start, limit, filter, propertyKeys);

        // TODO: test validations
    }
    
    /**
     * [EARLY ACCESS] Upsert Allocations
     *
     * Upsert; update existing allocations with given ids, or create new allocations otherwise.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void upsertAllocationsTest() throws ApiException {
        AllocationSetRequest allocationSetRequest = null;
        ResourceListOfAllocation response = api.upsertAllocations(allocationSetRequest);

        // TODO: test validations
    }
    
}
