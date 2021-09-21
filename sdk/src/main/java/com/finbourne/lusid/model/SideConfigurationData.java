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
import com.finbourne.lusid.model.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Configuration needed to define a side. Sides are referenced by Label. Beyond that, other properties  can be used to reference either transaction fields, or transaction properties.
 */
@ApiModel(description = "Configuration needed to define a side. Sides are referenced by Label. Beyond that, other properties  can be used to reference either transaction fields, or transaction properties.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SideConfigurationData {
  public static final String SERIALIZED_NAME_SIDE = "side";
  @SerializedName(SERIALIZED_NAME_SIDE)
  private String side;

  public static final String SERIALIZED_NAME_SECURITY = "security";
  @SerializedName(SERIALIZED_NAME_SECURITY)
  private String security;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private String rate;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private String units;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public SideConfigurationData side(String side) {
    this.side = side; 
    return this;
  }

   /**
   * The side&#39;s label.
   * @return side
  **/
  @ApiModelProperty(required = true, value = "The side's label.")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }


  public SideConfigurationData security(String security) {
    this.security = security; 
    return this;
  }

   /**
   * The security, or instrument.
   * @return security
  **/
  @ApiModelProperty(required = true, value = "The security, or instrument.")
  public String getSecurity() {
    return security;
  }

  public void setSecurity(String security) {
    this.security = security;
  }


  public SideConfigurationData currency(String currency) {
    this.currency = currency; 
    return this;
  }

   /**
   * The currency.
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "The currency.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public SideConfigurationData rate(String rate) {
    this.rate = rate; 
    return this;
  }

   /**
   * The rate.
   * @return rate
  **/
  @ApiModelProperty(required = true, value = "The rate.")
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }


  public SideConfigurationData units(String units) {
    this.units = units; 
    return this;
  }

   /**
   * The units.
   * @return units
  **/
  @ApiModelProperty(required = true, value = "The units.")
  public String getUnits() {
    return units;
  }

  public void setUnits(String units) {
    this.units = units;
  }


  public SideConfigurationData amount(String amount) {
    this.amount = amount; 
    return this;
  }

   /**
   * The amount.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount.")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  public SideConfigurationData links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public SideConfigurationData addLinksItem(Link linksItem) {
   
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Collection of links.
   * @return links
  **/
  @ApiModelProperty(value = "Collection of links.")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
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
    sb.append("class SideConfigurationData {\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
