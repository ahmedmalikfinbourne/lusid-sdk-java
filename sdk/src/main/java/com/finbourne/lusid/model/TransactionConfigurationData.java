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


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.lusid.model.PerpetualProperty;
import com.finbourne.lusid.model.TransactionConfigurationMovementData;
import com.finbourne.lusid.model.TransactionConfigurationTypeAlias;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TransactionConfigurationData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionConfigurationData {
  public static final String SERIALIZED_NAME_ALIASES = "aliases";
  @SerializedName(SERIALIZED_NAME_ALIASES)
  private List<TransactionConfigurationTypeAlias> aliases = new ArrayList<>();

  public static final String SERIALIZED_NAME_MOVEMENTS = "movements";
  @SerializedName(SERIALIZED_NAME_MOVEMENTS)
  private List<TransactionConfigurationMovementData> movements = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, PerpetualProperty> properties = null;


  public TransactionConfigurationData aliases(List<TransactionConfigurationTypeAlias> aliases) {
    this.aliases = aliases; 
    return this;
  }

  public TransactionConfigurationData addAliasesItem(TransactionConfigurationTypeAlias aliasesItem) {
   
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * List of transaction codes that map to this specific transaction model
   * @return aliases
  **/
  @ApiModelProperty(required = true, value = "List of transaction codes that map to this specific transaction model")
  public List<TransactionConfigurationTypeAlias> getAliases() {
    return aliases;
  }

  public void setAliases(List<TransactionConfigurationTypeAlias> aliases) {
    this.aliases = aliases;
  }


  public TransactionConfigurationData movements(List<TransactionConfigurationMovementData> movements) {
    this.movements = movements; 
    return this;
  }

  public TransactionConfigurationData addMovementsItem(TransactionConfigurationMovementData movementsItem) {
   
    this.movements.add(movementsItem);
    return this;
  }

   /**
   * Movement data for the transaction code
   * @return movements
  **/
  @ApiModelProperty(required = true, value = "Movement data for the transaction code")
  public List<TransactionConfigurationMovementData> getMovements() {
    return movements;
  }

  public void setMovements(List<TransactionConfigurationMovementData> movements) {
    this.movements = movements;
  }


  public TransactionConfigurationData properties(Map<String, PerpetualProperty> properties) {
    this.properties = properties; 
    return this;
  }

  public TransactionConfigurationData putPropertiesItem(String key, PerpetualProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Properties attached to the underlying holding.
   * @return properties
  **/
  @ApiModelProperty(value = "Properties attached to the underlying holding.")
  public Map<String, PerpetualProperty> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, PerpetualProperty> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionConfigurationData {\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    movements: ").append(toIndentedString(movements)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
