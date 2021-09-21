/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3515
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.api;

import com.finbourne.lusid.ApiCallback;
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.ApiResponse;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.Pair;
import com.finbourne.lusid.ProgressRequestBody;
import com.finbourne.lusid.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.TransactionConfigurationDataRequest;
import com.finbourne.lusid.model.TransactionSetConfigurationData;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemConfigurationApi {
    private ApiClient localVarApiClient;
    public SystemConfigurationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SystemConfigurationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createConfigurationTransactionType
     * @param transactionConfigurationDataRequest A transaction type definition. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createConfigurationTransactionTypeCall(TransactionConfigurationDataRequest transactionConfigurationDataRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = transactionConfigurationDataRequest;

        // create path and map variables
        String localVarPath = "/api/systemconfiguration/transactions/type";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.3515");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createConfigurationTransactionTypeValidateBeforeCall(TransactionConfigurationDataRequest transactionConfigurationDataRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createConfigurationTransactionTypeCall(transactionConfigurationDataRequest, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] Create transaction type
     * Create a new transaction type by specifying a definition and mappings to movements.
     * @param transactionConfigurationDataRequest A transaction type definition. (optional)
     * @return TransactionSetConfigurationData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public TransactionSetConfigurationData createConfigurationTransactionType(TransactionConfigurationDataRequest transactionConfigurationDataRequest) throws ApiException {
        ApiResponse<TransactionSetConfigurationData> localVarResp = createConfigurationTransactionTypeWithHttpInfo(transactionConfigurationDataRequest);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] Create transaction type
     * Create a new transaction type by specifying a definition and mappings to movements.
     * @param transactionConfigurationDataRequest A transaction type definition. (optional)
     * @return ApiResponse&lt;TransactionSetConfigurationData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TransactionSetConfigurationData> createConfigurationTransactionTypeWithHttpInfo(TransactionConfigurationDataRequest transactionConfigurationDataRequest) throws ApiException {
        okhttp3.Call localVarCall = createConfigurationTransactionTypeValidateBeforeCall(transactionConfigurationDataRequest, null);
        Type localVarReturnType = new TypeToken<TransactionSetConfigurationData>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] Create transaction type (asynchronously)
     * Create a new transaction type by specifying a definition and mappings to movements.
     * @param transactionConfigurationDataRequest A transaction type definition. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createConfigurationTransactionTypeAsync(TransactionConfigurationDataRequest transactionConfigurationDataRequest, final ApiCallback<TransactionSetConfigurationData> _callback) throws ApiException {
        okhttp3.Call localVarCall = createConfigurationTransactionTypeValidateBeforeCall(transactionConfigurationDataRequest, _callback);
        Type localVarReturnType = new TypeToken<TransactionSetConfigurationData>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listConfigurationTransactionTypes
     * @param asAt The asAt datetime at which to retrieve the transaction types. Defaults              to returning the latest versions if not specified. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listConfigurationTransactionTypesCall(OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/systemconfiguration/transactions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.3515");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listConfigurationTransactionTypesValidateBeforeCall(OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listConfigurationTransactionTypesCall(asAt, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] List transaction types
     * Get the list of current transaction types. For information on the default transaction types provided with  LUSID, see https://support.lusid.com/knowledgebase/article/KA-01873/.
     * @param asAt The asAt datetime at which to retrieve the transaction types. Defaults              to returning the latest versions if not specified. (optional)
     * @return TransactionSetConfigurationData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public TransactionSetConfigurationData listConfigurationTransactionTypes(OffsetDateTime asAt) throws ApiException {
        ApiResponse<TransactionSetConfigurationData> localVarResp = listConfigurationTransactionTypesWithHttpInfo(asAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] List transaction types
     * Get the list of current transaction types. For information on the default transaction types provided with  LUSID, see https://support.lusid.com/knowledgebase/article/KA-01873/.
     * @param asAt The asAt datetime at which to retrieve the transaction types. Defaults              to returning the latest versions if not specified. (optional)
     * @return ApiResponse&lt;TransactionSetConfigurationData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TransactionSetConfigurationData> listConfigurationTransactionTypesWithHttpInfo(OffsetDateTime asAt) throws ApiException {
        okhttp3.Call localVarCall = listConfigurationTransactionTypesValidateBeforeCall(asAt, null);
        Type localVarReturnType = new TypeToken<TransactionSetConfigurationData>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] List transaction types (asynchronously)
     * Get the list of current transaction types. For information on the default transaction types provided with  LUSID, see https://support.lusid.com/knowledgebase/article/KA-01873/.
     * @param asAt The asAt datetime at which to retrieve the transaction types. Defaults              to returning the latest versions if not specified. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listConfigurationTransactionTypesAsync(OffsetDateTime asAt, final ApiCallback<TransactionSetConfigurationData> _callback) throws ApiException {
        okhttp3.Call localVarCall = listConfigurationTransactionTypesValidateBeforeCall(asAt, _callback);
        Type localVarReturnType = new TypeToken<TransactionSetConfigurationData>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
