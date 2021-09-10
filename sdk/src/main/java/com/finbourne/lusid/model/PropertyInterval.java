/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3473
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.lusid.model.DateRange;
import com.finbourne.lusid.model.PropertyValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PropertyInterval
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PropertyInterval {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private PropertyValue value;

  public static final String SERIALIZED_NAME_EFFECTIVE_RANGE = "effectiveRange";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_RANGE)
  private DateRange effectiveRange;

  public static final String SERIALIZED_NAME_AS_AT_RANGE = "asAtRange";
  @SerializedName(SERIALIZED_NAME_AS_AT_RANGE)
  private DateRange asAtRange;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;


  public PropertyInterval value(PropertyValue value) {
    this.value = value; 
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "")
  public PropertyValue getValue() {
    return value;
  }

  public void setValue(PropertyValue value) {
    this.value = value;
  }


  public PropertyInterval effectiveRange(DateRange effectiveRange) {
    this.effectiveRange = effectiveRange; 
    return this;
  }

   /**
   * Get effectiveRange
   * @return effectiveRange
  **/
  @ApiModelProperty(required = true, value = "")
  public DateRange getEffectiveRange() {
    return effectiveRange;
  }

  public void setEffectiveRange(DateRange effectiveRange) {
    this.effectiveRange = effectiveRange;
  }


  public PropertyInterval asAtRange(DateRange asAtRange) {
    this.asAtRange = asAtRange; 
    return this;
  }

   /**
   * Get asAtRange
   * @return asAtRange
  **/
  @ApiModelProperty(required = true, value = "")
  public DateRange getAsAtRange() {
    return asAtRange;
  }

  public void setAsAtRange(DateRange asAtRange) {
    this.asAtRange = asAtRange;
  }


  public PropertyInterval status(String status) {
    this.status = status; 
    return this;
  }

   /**
   * Indicates whether the value is part of the prevailing effective date timeline for the requested asAt date, or whether it has been superseded by correctional activity
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the value is part of the prevailing effective date timeline for the requested asAt date, or whether it has been superseded by correctional activity")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
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
    sb.append("class PropertyInterval {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    effectiveRange: ").append(toIndentedString(effectiveRange)).append("\n");
    sb.append("    asAtRange: ").append(toIndentedString(asAtRange)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
