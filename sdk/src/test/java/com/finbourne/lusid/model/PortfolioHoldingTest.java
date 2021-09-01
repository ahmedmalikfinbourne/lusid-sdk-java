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


package com.finbourne.lusid.model;

import com.finbourne.lusid.model.CurrencyAndAmount;
import com.finbourne.lusid.model.PerpetualProperty;
import com.finbourne.lusid.model.Property;
import com.finbourne.lusid.model.Transaction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for PortfolioHolding
 */
public class PortfolioHoldingTest {
    private final PortfolioHolding model = new PortfolioHolding();

    /**
     * Model tests for PortfolioHolding
     */
    @Test
    public void testPortfolioHolding() {
        // TODO: test PortfolioHolding
    }

    /**
     * Test the property 'instrumentUid'
     */
    @Test
    public void instrumentUidTest() {
        // TODO: test instrumentUid
    }

    /**
     * Test the property 'subHoldingKeys'
     */
    @Test
    public void subHoldingKeysTest() {
        // TODO: test subHoldingKeys
    }

    /**
     * Test the property 'properties'
     */
    @Test
    public void propertiesTest() {
        // TODO: test properties
    }

    /**
     * Test the property 'holdingType'
     */
    @Test
    public void holdingTypeTest() {
        // TODO: test holdingType
    }

    /**
     * Test the property 'units'
     */
    @Test
    public void unitsTest() {
        // TODO: test units
    }

    /**
     * Test the property 'settledUnits'
     */
    @Test
    public void settledUnitsTest() {
        // TODO: test settledUnits
    }

    /**
     * Test the property 'cost'
     */
    @Test
    public void costTest() {
        // TODO: test cost
    }

    /**
     * Test the property 'costPortfolioCcy'
     */
    @Test
    public void costPortfolioCcyTest() {
        // TODO: test costPortfolioCcy
    }

    /**
     * Test the property 'transaction'
     */
    @Test
    public void transactionTest() {
        // TODO: test transaction
    }

    /**
     * Test the property 'currency'
     */
    @Test
    public void currencyTest() {
        // TODO: test currency
    }

}
